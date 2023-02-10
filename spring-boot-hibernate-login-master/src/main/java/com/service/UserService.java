package com.service;

import com.dto.ApiResponse;
import com.dto.LoginDto;
import com.dto.SignUpDto;

public interface UserService {

    ApiResponse signUp(SignUpDto signUpDto);

    ApiResponse login(LoginDto loginDto);
}
