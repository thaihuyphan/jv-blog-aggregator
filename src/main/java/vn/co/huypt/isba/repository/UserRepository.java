package vn.co.huypt.isba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.co.huypt.isba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
