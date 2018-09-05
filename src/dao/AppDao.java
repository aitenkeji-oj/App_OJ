package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;

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
    
	/**
	 * ������-2018-09-05
	 * ��ѯ����App�б�ӷ�ҳ
	 */
	public List<App_Info> select_app(PageApp page);
	
	/**
	 * ������-2018-09-05
	 * ��ѯApp��¼��ҳ��
	 */
	public int Count_AppInfo();
}
