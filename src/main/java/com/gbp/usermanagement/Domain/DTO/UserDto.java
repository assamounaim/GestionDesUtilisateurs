package com.gbp.usermanagement.Domain.DTO;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String fullName;
    private String email;
}
