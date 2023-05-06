package com.wisdom.repository;

import com.wisdom.model.User;
import com.wisdom.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
