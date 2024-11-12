package com.userservicebff.userservicebff.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(
    name = "user",
    description = "User Data Transfer Object"
)
public record UserDto(

    @Schema(
        name = "cpf",
        description = "User CPF"
    )
    @JsonProperty("cpf") String cpf,

    @Schema(
        name = "name",
        description = "User name"
    )
    @JsonProperty("name") String name,

    @Schema(
        name = "email",
        description = "User email"
    )
    @JsonProperty("email") String email,

    @Schema(
        name = "password",
        nullable = false,
        description = "User password"
    )
    @JsonProperty("password") String password,

    @Schema(
        name = "type",
        description = "User type (1: Hirer, 2: Guide, 3: Admin)"
    )
    @JsonProperty("type") int type,

    @Schema(
        name = "phone",
        description = "User phone number"
    )
    @JsonProperty("phone") String phone,

    @Schema(
        name = "deleted_at",
        description = "Date when the user was marked as deleted"
    )
    @JsonProperty("deleted_at") LocalDateTime deletedAt

) {}
