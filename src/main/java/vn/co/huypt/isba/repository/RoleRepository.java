package vn.co.huypt.isba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.co.huypt.isba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);
}
