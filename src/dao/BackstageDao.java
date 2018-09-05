package dao;

import org.apache.ibatis.annotations.Param;

import entity.Backend_User;

public interface BackstageDao {
    
	/**
	 * ºóÌ¨µÇÂ½²éÑ¯
	 */
	public Backend_User select_User(@Param("name") String name,@Param("pwd") String pwd);
	
	 
}
