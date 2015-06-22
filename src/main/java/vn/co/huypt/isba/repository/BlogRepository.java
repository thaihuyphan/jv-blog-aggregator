package vn.co.huypt.isba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.co.huypt.isba.entity.Blog;
import vn.co.huypt.isba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByUser(User user);
	
}
