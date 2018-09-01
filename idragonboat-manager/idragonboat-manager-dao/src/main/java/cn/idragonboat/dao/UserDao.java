package cn.idragonboat.dao;

import cn.idragonboat.vo.UserVO;

public interface UserDao {
	
	public UserVO selectByPrimaryKey(Long id);
	
}
