package cn.idragonboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.idragonboat.service.UserService;
import cn.idragonboat.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userSevicer;
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public UserVO getItemById(@PathVariable Long id) {
		UserVO userVO = userSevicer.selectByPrimaryKey(id);
		return userVO;
	}
	
	
}
