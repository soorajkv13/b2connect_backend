package com.matrix.learnspring.interfaces;

import com.matrix.learnspring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
