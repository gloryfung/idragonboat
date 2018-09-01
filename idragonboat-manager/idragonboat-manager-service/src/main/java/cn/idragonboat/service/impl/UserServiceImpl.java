package cn.idragonboat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.idragonboat.dao.UserDao;
import cn.idragonboat.service.UserService;
import cn.idragonboat.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserVO selectByPrimaryKey(Long id) {
		
		if(null == id) {
			return null;
		}
		UserVO userVO = userDao.selectByPrimaryKey(id);
		return userVO;
	}

}
