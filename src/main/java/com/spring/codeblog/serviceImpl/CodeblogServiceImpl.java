package com.spring.codeblog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService {
	
	@Autowired
	CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

	@Override
	public void delete(Post post) {
		codeblogRepository.delete(post);
	}

	@Override
	public Post update(long id) {
		Post post = codeblogRepository.findById(id).get();
		return codeblogRepository.save(post);
	}

}
