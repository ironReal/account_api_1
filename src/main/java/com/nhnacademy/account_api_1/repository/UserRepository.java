package com.nhnacademy.account_api_1.repository;

import com.nhnacademy.account_api_1.response.UserResponse;
import com.nhnacademy.account_api_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom{
    boolean existsByUserId(String userId);
}
