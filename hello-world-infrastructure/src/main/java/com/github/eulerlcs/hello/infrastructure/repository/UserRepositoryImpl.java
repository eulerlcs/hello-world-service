package com.github.eulerlcs.hello.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.eulerlcs.hello.domain.entity.User;
import com.github.eulerlcs.hello.domain.repository.UserRepository;
import com.github.eulerlcs.hello.infrastructure.repository.mapper.UserMapper;

@Service
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	UserMapper userMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public User selectOne(Integer id) {
		return userMapper.selectById(id);
	}

	@Override
	public List<User> selectAll() {
		return userMapper.selectList(null);
	}

	@Override
	public int add(User user) {
		return userMapper.insert(user);
	}
}