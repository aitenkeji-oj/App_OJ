package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dao.AppDao;
import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;

public interface AppaDmin {
    /**
     * �����ߵ�½
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(String name,String pwd);
	
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
