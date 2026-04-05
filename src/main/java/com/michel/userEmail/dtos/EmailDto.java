package com.michel.userEmail.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class EmailDto {
    private UUID userId;
    private String emailTo;
    private String subjecto;
    private String text;
}
