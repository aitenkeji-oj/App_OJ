package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dao.AppDao;
import entity.Dev_User;

public interface AppaDmin {
    /**
     * ¿ª·¢ÕßµÇÂ½
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(String name,String pwd);

}
