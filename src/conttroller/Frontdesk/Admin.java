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
	 * ��ת��̨��¼ҳ��
	 * @return
	 */
	@RequestMapping("/manager/login")
	public String Page(){
		return "backendlogin";
	}
	
	
	
	/**
	 * service��
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
	 * ��̨��½
	 * @return
	 */
	@RequestMapping(value="/manager/dologin")
	public String load(HttpServletRequest request,HttpServletResponse response,HttpSession Session){
		 String devCode=request.getParameter("userCode");  //�˻�
		 String devPassword=request.getParameter("userPassword");  //����
		 System.out.println(devCode+"-"+devPassword);
		 Backend_User user1=bd.select_User(devCode, null);
		 Backend_User user2=bd.select_User(devCode, devPassword);
		 if(user1==null){
			 request.setAttribute("error","�˻�����ȷ");
 			 return "backendlogin";
		 }
         if(user2==null){
        	 request.setAttribute("error","���벻��ȷ");
 			 return "backendlogin";
		 }
         Session.setAttribute("userSession", user2);
		 return "backend/main";   
	}
}
