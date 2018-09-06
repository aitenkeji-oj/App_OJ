package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.App_Category;
import entity.App_Info;
import entity.Data_Dictionary;
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
	
	/**
	 * 蒋克文-2018-09-05
	 * 查询一二级分类
	 */
	public List<App_Category> select_parentid(@Param("parentId") Integer parentId);
	
	/**
	 * 蒋克文-2018-09-05
	 * 查询App状态
	 */
	public List<Data_Dictionary> select_status();
	
	/**
	 * 蒋克文-2018-09-05
	 * 查询所属平台
	 */
	public List<Data_Dictionary> select_valueName();
	
	/**
	 * 查询二级菜单
	 */
	public List<App_Category> select_App_Category2(@Param("parentId")Integer parentId);
	

	/**
	 * 蒋克文-2018-09-06
	 * 查询详情
	 */
	public List<App_Info> select_details(@Param("id")int id);
 
}
