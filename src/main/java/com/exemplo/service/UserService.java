/**
 * 
 */
package com.exemplo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.exemplo.model.User;
import com.exemplo.repository.UserRepository;

/**
 * @author max
 *
 */
@Service
public class UserService {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
    private UserRepository userRepository;
	
	@Cacheable(value = "users")
    public List<User> getUsers() {
        LOG.info("Getting users.");
        return userRepository.findAll();
    }

	@Cacheable(value = "users", key = "#userId")
    public User getUser(String userId) {
        LOG.info("Getting user with ID {}.", userId);
        return userRepository.findOne(Long.valueOf(userId));
    }

	@CacheEvict(value = "users", allEntries=true)
    public User updatePersonByID(User user) {
    	LOG.info("Updating user with ID {}.", user.getId());
    	return userRepository.save(user);
    }

    @CacheEvict(value = "users", allEntries=true)
    public void deleteUserByID(Long userId) {
        LOG.info("deleting person with id {}", userId);
        userRepository.delete(userId);
    }
}
