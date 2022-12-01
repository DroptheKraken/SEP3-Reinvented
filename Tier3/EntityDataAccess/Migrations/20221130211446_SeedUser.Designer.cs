﻿// <auto-generated />
using EntityDataAccess;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace EntityDataAccess.Migrations
{
    [DbContext(typeof(DatabaseAccess))]
    [Migration("20221130211446_SeedUser")]
    partial class SeedUser
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder.HasAnnotation("ProductVersion", "6.0.9");

            modelBuilder.Entity("Domain.Models.User", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("INTEGER")
                        .HasColumnName("Id");

                    b.Property<string>("Email")
                        .HasColumnType("TEXT")
                        .HasColumnName("Email");

                    b.Property<string>("Password")
                        .HasColumnType("TEXT")
                        .HasColumnName("Password");

                    b.Property<string>("Role")
                        .HasColumnType("TEXT")
                        .HasColumnName("Role");

                    b.Property<string>("Username")
                        .HasColumnType("TEXT")
                        .HasColumnName("Username");

                    b.HasKey("Id");

                    b.ToTable("User");

                    b.HasData(
                        new
                        {
                            Id = 1,
                            Email = "alex@gmai.com",
                            Password = "1234",
                            Role = "Admin",
                            Username = "Alex"
                        });
                });
#pragma warning restore 612, 618
        }
    }
}
