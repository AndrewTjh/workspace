package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.UserDao;
import demo.model.User;

//@RestController()
//@RequestMapping("/user")
public class UserController {
//	@Autowired
//	UserService userService;
	
	@Autowired
	UserDao userDao;
    
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
    	return null;
    }
}
