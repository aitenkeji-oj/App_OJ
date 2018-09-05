package service;

import org.apache.ibatis.annotations.Param;

import entity.Backend_User;

public interface Backstagemin {
	/**
	 * ºóÌ¨µÇÂ½²éÑ¯
	 */
	public Backend_User select_User(String name,String pwd);
}
