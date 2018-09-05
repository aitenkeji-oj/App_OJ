package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dao.AppDao;
import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;

public interface AppaDmin {
    /**
     * 开发者登陆
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(String name,String pwd);
	
	/**
	 * 蒋克文-2018-09-05
	 * 查询所有App列表加分页
	 */
	public List<App_Info> select_app(PageApp page);
	
	
	/**
	 * 蒋克文-2018-09-05
	 * 查询App记录总页数
	 */
	public int Count_AppInfo();

}
