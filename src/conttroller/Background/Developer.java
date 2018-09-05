package conttroller.Background;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Dev_User;
import service.AppaDmin;

@Controller
public class Developer {	
	/**
	 * 跳转之登陆
	 * @return
	 */
	@RequestMapping("/dev/login")
	public String Page(){
		 
		return "devlogin";
	}
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
	 * 开发者登陆
	 * @return
	 */
	@RequestMapping(value="/dev/dologin")
	public String load(HttpServletRequest request,HttpServletResponse response,HttpSession Session){
		 String devCode=request.getParameter("devCode");  //获取账户
		 String devPassword=request.getParameter("devPassword");  //获取密码
		 System.out.println(devCode+"-"+devPassword);
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
	 * App开发
	 */
	@RequestMapping("dev/flatform/app/list")
	public String applist(){
		return "developer/appinfolist";	
		 
	}
}
