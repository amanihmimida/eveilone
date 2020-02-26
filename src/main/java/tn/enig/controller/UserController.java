package tn.enig.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.model.User;
import tn.enig.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/")
	public List<User> listuser(){
		return userService.listUser();
	}
	@GetMapping(path="/{id}")
	public Optional<User> getUserById(@PathVariable(value="id") int id) {
		return userService.getUserById(id);
	}
	@GetMapping(path="/by-mail/{mail}")
	public User getByMail(@PathVariable(value="mail") String mail) throws Exception {
		return userService.getByMail(mail);
	}
	
	@PostMapping(path="/")
	public void addUser(@RequestBody User u) {
		userService.save(u);
	}
	@PutMapping(path="/")
	public void editUser(User u) {
		userService.save(u);
	}
    
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable(value="id") int id) {
		userService.deleteUserById(id);
	}
}

