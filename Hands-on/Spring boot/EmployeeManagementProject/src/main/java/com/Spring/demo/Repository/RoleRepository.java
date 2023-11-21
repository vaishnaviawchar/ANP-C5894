package com.Spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{

}
