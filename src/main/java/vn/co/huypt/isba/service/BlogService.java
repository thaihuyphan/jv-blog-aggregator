package vn.co.huypt.isba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.co.huypt.isba.entity.Blog;
import vn.co.huypt.isba.entity.User;
import vn.co.huypt.isba.repository.BlogRepository;
import vn.co.huypt.isba.repository.UserRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Autowired
	private UserRepository userRepository;

	public void save(Blog blog, String name) {
		User user = userRepository.findByName(name);
		blog.setUser(user);
		blogRepository.save(blog);
	}
}
