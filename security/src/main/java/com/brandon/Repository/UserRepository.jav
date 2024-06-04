package com.brandon.Repository;


public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    
}