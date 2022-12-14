﻿


using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;


namespace WebApi.Controllers;



[ApiController]
[Route("api/[controller]")]
public class UserController : ControllerBase
{
    private readonly IUserLogic userLogic;
    public UserController(IUserLogic userLogic)
    {
        this.userLogic = userLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<User>> CreateAsync(UserCreationDto dto)
    {
        try
        {
            User user = await userLogic.CreateAsync(dto);
            return Created($"/users/{user.Id}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }



    [HttpGet]
    public async Task<ActionResult<User>> GetByIdAsync(User userId)
    {
        try
        {
            User user = await userLogic.GetByIdAsync(userId.Id);
            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet]
    [Route("users")]
    public async Task<List<User>> GetAllUsers()
    {
        IEnumerable<User> users = await userLogic.GetAllUsersAsync();
        return users.ToList();
    }
    
    
}