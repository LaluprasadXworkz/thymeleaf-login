package com.xworkz.springJpaAuth.repo;

import com.xworkz.springJpaAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUserName(String username);

}
