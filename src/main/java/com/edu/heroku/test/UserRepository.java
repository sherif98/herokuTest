package com.edu.heroku.test;


import org.springframework.data.jpa.repository.JpaRepository;
//@Repository
//@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
}
