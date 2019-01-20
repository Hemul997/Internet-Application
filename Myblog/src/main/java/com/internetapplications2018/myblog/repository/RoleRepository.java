package com.internetapplications2018.myblog.repository;

import com.internetapplications2018.myblog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(@Param("role") String role);
}
