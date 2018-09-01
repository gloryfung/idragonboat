package cn.idragonboat.service;

import cn.idragonboat.vo.UserVO;


public interface UserService {
	
	public UserVO selectByPrimaryKey(Long id);
	
}
