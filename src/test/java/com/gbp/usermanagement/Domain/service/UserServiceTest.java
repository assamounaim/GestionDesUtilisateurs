package com.gbp.usermanagement.Domain.service;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.gbp.usermanagement.donnee.repository.UserRepository;
import com.gbp.usermanagement.Domain.DTO.UserDto;
import com.gbp.usermanagement.Domain.DTO.UserResponse;
import com.gbp.usermanagement.Domain.service.Imp.UserServiceImp;
import com.gbp.usermanagement.Domain.service.Mapper.UserMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.gbp.usermanagement.UnitTest;
import com.gbp.usermanagement.donnee.model.User;

class UserServiceTest extends UnitTest {

    @Mock
    private UserRepository userRepo;
    
    private UserService userService;
    
    private UserDto userDto;
    private User user;
    
    @Override
	protected void setup() {
		userService = new UserServiceImp(userRepo);
		this.userDto = random.nextObject(UserDto.class);
		this.user = UserMapper.mapToEntity(userDto);
	}
    
    @Test
    public void testCreateUser()  {
    	when(userRepo.save(user)).thenReturn(user);  
    	UserDto secondUserDto = userService.createUser(userDto);
        assertNotNull(userRepo);
        assertNotNull(secondUserDto);
        Assertions.assertThat(userDto.getFullName()).isEqualTo(secondUserDto.getFullName());
        
    }

    @Test
    public void testGetAll()  {
    	List<User> users = new ArrayList<User>();
    	users.add(user);
    	PageImpl<User> pageUsers = new PageImpl<User>(users);
    	
        when(userRepo.findAll(Mockito.any(Pageable.class))).thenReturn(pageUsers);  
        UserResponse response = userService.getAllUsers(0, 10, "id", "asc");
        assertNotNull(response);
        Assertions.assertThat(response.getContent().size()).isEqualTo(1);
        Assertions.assertThat(response.getContent().get(0).getFullName()).isEqualTo(userDto.getFullName());
    }

	
}
