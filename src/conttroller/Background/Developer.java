package conttroller.Background;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entity.App_Category;
import entity.App_Info;
import entity.Data_Dictionary;
import entity.Dev_User;
import entity.PageApp;
import net.sf.json.JSONArray;
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
	    //用于分页加查询APP信息
		System.out.println("水水水水水水水");
		/**PageApp page=new PageApp();
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
	 
		request.setAttribute("appInfoList", list);
		request.setAttribute("pages", page);
 		 //查询一级下拉框
 		List<App_Category> list1=ad.select_parentid(null);
 		request.setAttribute("categoryLevel1List", list1);
		//查询app状态
 		List<Data_Dictionary> list2=ad.select_status();
 		request.setAttribute("statusList", list2);
 		//查询所属平台
 		List<Data_Dictionary> list3=ad.select_valueName();
 		List<App_Category> list4=ad.select_parentid(2);
 		
 		System.err.println("提示"+list4.size());
 		request.setAttribute("categoryLevel2List", list4);
 		request.setAttribute("flatFormList", list3);*/
		return "developer/appinfolist";		 
	}
    //使用ajax方式加载二级菜单
	@RequestMapping(value="list",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String select_parentId2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String queryCategoryLevel1=request.getParameter("pid"); //获取一级菜单值
		int i=Integer.valueOf(queryCategoryLevel1);
		List<App_Category> list=ad.select_parentid(i);
		return JSON.toJSONString(list);
	}
	
	/**
	 * 查询app详情
	 * @return
	 */
	@RequestMapping("dev/flatform/app/appview/58")
	public String select_details(@RequestParam(value="id",required=false) String id){
	
		return "developer/appinfoview";
	}
}
