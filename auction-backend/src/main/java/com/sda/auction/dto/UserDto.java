package com.sda.auction.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@EqualsAndHashCode
@Data
public class UserDto {

    private Integer id;

    @NotEmpty(message = "{error.user.firstName.notEmpty}")
    @Pattern(regexp = "[A-Za-z]+", message = "{error.user.firstName.regex}")
    private String firstName;

    @NotEmpty(message = "{error.user.lastName.notEmpty}")
    @Pattern(regexp = "[A-Za-z]+", message = "{error.user.lastName.regex}")
    private String lastName;

    @NotEmpty
    @Email(message = "{error.user.email.regex}")
    private String email;

    @NotEmpty
    @Pattern(regexp = "((.*)[A-Z]+(.*))", message = "{error.user.password.regex}")
    @Size(min = 6, message = "{error.user.password.size}")
    private String password;

    @NotEmpty
    @Pattern(regexp = "((.*)[A-Z]+(.*))", message = "{error.user.confirmPassword.regex}")
    @Size(min = 6, message = "{error.user.confirmPassword.size}")
    private String confirmPassword;

}
