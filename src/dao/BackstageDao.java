package dao;

import org.apache.ibatis.annotations.Param;

import entity.Backend_User;

public interface BackstageDao {
    
	/**
	 * ��̨��½��ѯ
	 */
	public Backend_User select_User(@Param("name") String name,@Param("pwd") String pwd);
	
	 
}
