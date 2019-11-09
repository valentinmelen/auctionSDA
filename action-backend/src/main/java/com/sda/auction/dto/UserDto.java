package com.sda.auction.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data

public class UserDto {
    @NotEmpty(message = "Please insert your first name")
    @Pattern(regexp = "[A-Za-z]+", message = "Letters only!")//+ inseamna ca valideaza macar un caracter
    private String firstName;
    @NotEmpty(message = "Please insert your first name")
    @Pattern(regexp = "[A-Za-z]+", message = "Letters only!")
    private String lastName;
    @Email(message = "error.user.email.pattern")
    private String email;
    @Pattern(regexp = "((.*)[A-Z]+(.*))", message = "Password should contain at least one capital letter")
    @Size(min = 6, message = "Password must be at least & characters long")
    private String password;


}
