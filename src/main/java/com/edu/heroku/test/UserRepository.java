package com.edu.heroku.test;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
}
