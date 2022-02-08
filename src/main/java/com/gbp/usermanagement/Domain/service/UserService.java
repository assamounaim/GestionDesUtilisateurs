package com.gbp.usermanagement.Domain.service;

import com.gbp.usermanagement.Domain.DTO.UserDto;
import com.gbp.usermanagement.Domain.DTO.UserResponse;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir);
}
