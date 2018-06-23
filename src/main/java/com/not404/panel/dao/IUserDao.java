package com.not404.panel.dao;

import com.not404.panel.domain.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<UserDto,Long> {
    UserDto findUserDtoByEmail(String email);
}
