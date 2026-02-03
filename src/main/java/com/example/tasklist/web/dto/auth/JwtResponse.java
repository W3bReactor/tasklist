package com.example.tasklist.web.dto.auth;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Response from login")
public class JwtResponse {
    @Schema(description = "User id", example = "1")
    private Long id;

    @Schema(description = "User email", example = "johndoe@gmail.com")
    private String username;

    @Schema(
            description = "User access token",
            example = "eyJhbGciOiJIUzI1NiIsInR5cCI6Ikp"
                    + "XVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFt"
                    + "ZSI6IkpvaG4gRG9lIiwiYWRtaW4"
                    + "iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0."
                    + "KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30"
    )
    private String accessToken;

    @Schema(
            description = "User refresh token",
            example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiO"
                    + "iIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnR"
                    + "ydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsI"
                    + "DTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30"
    )
    private String refreshToken;
}
