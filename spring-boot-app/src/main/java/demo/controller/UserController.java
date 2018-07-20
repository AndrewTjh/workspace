package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.UserDao;
import demo.model.User;
import demo.vo.UserVo;

@RestController()
@RequestMapping("/user")
public class UserController {
//	@Autowired
//	UserService userService;
	
	@Autowired
	UserDao userDao;
    
	@PostMapping("add")
	public User add(User user) {
		return userDao.save(user);
	}
	
	@PutMapping("update")
	public User update(User user) {
//		User user = userDao.findOne(userVo.getId());
//		userVo.merge(user);
		return userDao.save(user);
	}
	
	@DeleteMapping("remove")
	public void remove(Long id) {
		userDao.delete(id);
	}
	
	@GetMapping("getOne")
	public User getOne(Long id) {
		return userDao.findOne(id);
	}
	
	@GetMapping("getAll")
	public List<User> getAll(User user) {
		return userDao.findAll();
	}
	
	@GetMapping("getByPage")
	public List<User> getByPage(User user) {
		return userDao.findAll();
	}
	
	@GetMapping("getByCriteria")
	public List<User> getByCriteria(User user) {
		return userDao.findAll();
	}
	
	@GetMapping("getByCriteriaPage")
	public List<User> getByCriteriaPage(User user) {
		return userDao.findAll();
	}
}
