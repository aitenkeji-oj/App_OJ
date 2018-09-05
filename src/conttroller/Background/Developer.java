package conttroller.Background;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.App_Info;
import entity.Dev_User;
import entity.PageApp;
import service.AppaDmin;
 

@Controller
public class Developer {	
	/**
	 * service��
	 */
	@Autowired
	public AppaDmin ad;
	
	public AppaDmin getAd() {
		return ad;
	}

	public void setAd(AppaDmin ad) {
		this.ad = ad;
	}
	/**
	 * 跳转之登陆
	 * @return
	 */
	@RequestMapping("/dev/login")
	public String Page(){
		 
		return "devlogin";
	}
	
	/**
	 * 开发者登陆
	 * @return
	 */
	@RequestMapping(value="/dev/dologin")
	public String load(HttpServletRequest request,HttpServletResponse response,HttpSession Session){
		 String devCode=request.getParameter("devCode");  //获取账户
		 String devPassword=request.getParameter("devPassword");  //获取密码
	 
 		 Dev_User du1=ad.select_User(devCode, null);
 		 Dev_User du2=ad.select_User(devCode, devPassword);
 		 if(du1==null){
 			 request.setAttribute("error","账户不正确");
 			 return "devlogin";
 		 }
 		 if(du2==null){
 			 request.setAttribute("error","密码不正确!");
 			 return "devlogin";
 		 }
 			 Session.setAttribute("devUserSession", du2);
		     return "developer/main";

	}
	/**
	 * App开发查询数据加分页
	 */
	@RequestMapping("dev/flatform/app/list")
	public String applist(HttpServletRequest request,HttpServletResponse response){
	    PageApp page=new PageApp();
	    String pageIndex=request.getParameter("pageIndex");
	    if(pageIndex==""||pageIndex==null){
	    	pageIndex="1";
	    }
	    
	    page.setCurrent(Integer.valueOf(pageIndex)); //给予赋值
	    page.setCurrentPageNo(Integer.valueOf(pageIndex));//给页数赋值
		List<App_Info> list=ad.select_app(page);
		page.setTotalCount(ad.Count_AppInfo()); //查询当前总数据
		int i=ad.Count_AppInfo()%5==0?ad.Count_AppInfo()/5:(ad.Count_AppInfo()/5)+1;
		page.setTotalPageCount(i);
		System.out.println(page.getTotalPageCount());
		request.setAttribute("appInfoList", list);
		request.setAttribute("pages", page);
		return "developer/appinfolist";		 
	}
}
