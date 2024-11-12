package com.userservicebff.userservicebff.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    name = "create_user_request",
    description = "Request containing all necessary data to create a user"
)
public record CreateUserRequest(

    @Schema(
        name = "cpf",
        nullable = false,
        description = "CPF of the user to be created"
    )
    @JsonProperty("cpf") String cpf,

    @Schema(
        name = "name",
        nullable = false,
        description = "Name of the user to be created"
    )
    @JsonProperty("name") String name,

    @Schema(
        name = "email",
        nullable = false,
        description = "Email of the user to be created"
    )
    @JsonProperty("email") String email,

    @Schema(
        name = "password",
        nullable = false,
        description = "Password of the user to be created"
    )
    @JsonProperty("password") String password,

    @Schema(
        name = "phone",
        nullable = false,
        description = "Phone of the user to be created"
    )
    @JsonProperty("phone") String phone,

    @Schema(
        name = "type",
        nullable = false,
        description = "Type of the user to be created"
    )
    @JsonProperty("type") Integer type
) {}