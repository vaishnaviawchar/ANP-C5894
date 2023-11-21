package com.Spring.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Spring.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query(value = "SELECT * FROM User WHERE user_name = :Username", nativeQuery = true)
    List<User> findUsersByName(@Param("Username") String Username);


}
