package vn.co.huypt.isba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.co.huypt.isba.entity.Blog;
import vn.co.huypt.isba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	List<Item> findByBlog(Blog blog, Pageable pageable);
	
}
