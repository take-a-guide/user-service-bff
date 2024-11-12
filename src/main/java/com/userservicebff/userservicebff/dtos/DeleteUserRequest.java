package com.userservicebff.userservicebff.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    name = "delete_user_request",
    description = "Request containing all necessary data to delete a user"
)
public record DeleteUserRequest(

    @Schema(
        name = "cpf",
        nullable = false,
        description = "CPF of the user to be deleted"
    )
    @JsonProperty("cpf") String cpf
) {}