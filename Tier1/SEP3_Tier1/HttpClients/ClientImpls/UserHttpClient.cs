﻿using System.Data;
using System.Net.Http.Json;
using System.Text.Json;
using BlazorAppTier1.CLient;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.ClientImpls;

public class UserHttpClient : IUserInterface

{
    private readonly HttpClient client;

    public UserHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<User> Create(UserCreationDto dto)
    {
        User user = Connection.CreateUser(dto.UserName, dto.Password).Result;
      /*  HttpResponseMessage response = await client.PostAsJsonAsync("/user", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;*/
        return user;
    }

    public async Task<IEnumerable<User>> GetUsers(string? usernameContains = null)
    {
        string uri = "/user/users";
        if (!string.IsNullOrEmpty(usernameContains))
        {
            uri += $"?username={usernameContains}";
        }
        HttpResponseMessage response = await client.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            if (string.IsNullOrEmpty(result)) {
                throw new Exception("Request failed with empty response");
            }
            throw new Exception(result);
        }

        IEnumerable<User> users = JsonSerializer.Deserialize<IEnumerable<User>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }  
}