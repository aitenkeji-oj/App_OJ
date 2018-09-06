package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.App_Category;
import entity.App_Info;
import entity.Data_Dictionary;
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
	
	/**
	 * ������-2018-09-05
	 * ��ѯһ��������
	 */
	public List<App_Category> select_parentid(@Param("parentId") Integer parentId);
	
	/**
	 * ������-2018-09-05
	 * ��ѯApp״̬
	 */
	public List<Data_Dictionary> select_status();
	
	/**
	 * ������-2018-09-05
	 * ��ѯ����ƽ̨
	 */
	public List<Data_Dictionary> select_valueName();
	
	/**
	 * ��ѯ�����˵�
	 */
	public List<App_Category> select_App_Category2(@Param("parentId")Integer parentId);
	

	/**
	 * ������-2018-09-06
	 * ��ѯ����
	 */
	public List<App_Info> select_details(@Param("id")int id);
 
}
