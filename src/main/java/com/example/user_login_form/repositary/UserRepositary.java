package com.example.user_login_form.repositary;

import com.example.user_login_form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<User, Integer> {
}
