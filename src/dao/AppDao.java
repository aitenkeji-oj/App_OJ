package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;

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
