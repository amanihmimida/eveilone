package tn.enig.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enig.model.User;
import tn.enig.repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
		
	}
	public List<User> listUser() {
	 return (List<User>) userRepository.findAll();
		
	}
	
	public Optional<User> getUserById(int idUser) {
		return userRepository.findById(idUser);
	}
	public void deleteUserById (int idUser) {
		 userRepository.deleteById(idUser);
	}
}
