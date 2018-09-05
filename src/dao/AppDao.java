package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Dev_User;

/**
 * 接口
 * @author Administrator
 *
 */
public interface AppDao {
     /**
     * 蒋克文2018-09-04
     * 用户登陆
     * @param name
     * @return
     */
	public Dev_User select_User(@Param("name") String name,@Param("pwd") String pwd);
 
	
	
}
