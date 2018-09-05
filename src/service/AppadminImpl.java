package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.AppDao;
import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;
@Service("AppadminImpl")
public class AppadminImpl implements AppaDmin {

	@Autowired
	public AppDao ad;

	public AppDao getAd() {
		return ad;
	}

	public void setAd(AppDao ad) {
		this.ad = ad;
	}

	@Override
	public Dev_User select_User(String name,String pwd) {
		return ad.select_User(name, pwd);
	}

	@Override
	public List<App_Info> select_app(PageApp page) {
		page.setCurrent((page.getCurrentPageNo()-1)*5); //¼ÆËãÒ³Êý
		return ad.select_app(page);
	}

	@Override
	public int Count_AppInfo() {	 
		return ad.Count_AppInfo();
	}
}
