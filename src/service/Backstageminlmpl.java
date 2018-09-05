package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.BackstageDao;
import entity.Backend_User;

@Service("Backstageminlmpl")
public class Backstageminlmpl implements Backstagemin {
	@Autowired
	public BackstageDao bd;


	public BackstageDao getBd() {
		return bd;
	}

	public void setBd(BackstageDao bd) {
		this.bd = bd;
	}

	@Override
	public Backend_User select_User(String name, String pwd) {   
		return bd.select_User(name, pwd);
	}
   
}
