package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Dev_User;

/**
 * �ӿ�
 * @author Administrator
 *
 */
public interface AppDao {
     /**
     * ������2018-09-04
     * �û���½
     * @param name
     * @return
     */
	public Dev_User select_User(@Param("name") String name,@Param("pwd") String pwd);
 
	
	
}
