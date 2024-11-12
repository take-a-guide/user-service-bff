package com.userservicebff.userservicebff.dtos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
    name = "login_request",
    description = "Request containing all necessary data for user login"
)
public record LoginRequest(

    @Schema(
        name = "email",
        nullable = false,
        description = "Email of the user who wants to log in"
    )
    @JsonProperty("email") String email,

    @Schema(
        name = "password",
        nullable = false,
        description = "Password of the user who wants to log in"
    )
    @JsonProperty("password") String password
    
) {

    public ResponseEntity<String> validate() {

        if (email == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User email was not provided in the request");
        }

        if (password == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User password was not provided in the request");
        }

        return ResponseEntity.ok("Validation successful");
    }
}