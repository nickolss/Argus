package com.nickolss.argus_api.models;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class LogRequestDto{

    @NotBlank
    private String username;

    @NotBlank
    private String action;

    @NotNull
    private StatusEnum status;
}
