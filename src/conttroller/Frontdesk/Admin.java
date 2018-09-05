package conttroller.Frontdesk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Backend_User;
import service.Backstagemin;

@Controller
public class Admin {
	/**
	 * 跳转后台登录页面
	 * @return
	 */
	@RequestMapping("/manager/login")
	public String Page(){
		return "backendlogin";
	}
	
	
	
	/**
	 * service层
	 */
	@Autowired
	public Backstagemin bd;
	public Backstagemin getBd() {
		return bd;
	}
	public void setBd(Backstagemin bd) {
		this.bd = bd;
	}
	/**
	 * 后台登陆
	 * @return
	 */
	@RequestMapping(value="/manager/dologin")
	public String load(HttpServletRequest request,HttpServletResponse response,HttpSession Session){
		 String devCode=request.getParameter("userCode");  //账户
		 String devPassword=request.getParameter("userPassword");  //密码
		 System.out.println(devCode+"-"+devPassword);
		 Backend_User user1=bd.select_User(devCode, null);
		 Backend_User user2=bd.select_User(devCode, devPassword);
		 if(user1==null){
			 request.setAttribute("error","账户不正确");
 			 return "backendlogin";
		 }
         if(user2==null){
        	 request.setAttribute("error","密码不正确");
 			 return "backendlogin";
		 }
         Session.setAttribute("userSession", user2);
		 return "backend/main";   
	}
}
