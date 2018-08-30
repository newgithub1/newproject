package com.skemty.web;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skemty.Service.UserManager;
import com.skemty.entity.AdminDetail;
import com.skemty.entity.Student;
import com.skemty.entity.StudentDetail;
import com.skemty.entity.User;
import com.skemty.entity.WrkDetail;
import com.skemty.util.MailManager;

/**
 * @author s6
 *
 */
/**
 * @author s6
 *
 */
@Controller
public class UserController {
	private Logger LOG = Logger.getLogger(UserManager.class);
	@Autowired
	UserManager userManager;
	@Autowired
	AjaxController ajaxController;

	@Autowired
	MailManager mailManager;

	@Autowired
	AdminController adminController;

	@Autowired(required = false)
	AuthenticationManager authManager;

	@Autowired
	private HttpSession session;

/*	@RequestMapping(value = "homePage.mm",method={RequestMethod.POST,RequestMethod.GET})
	public void doHomePage() {

	}
	@RequestMapping(value = "logincredentials.mm",method={RequestMethod.POST,RequestMethod.GET})
	public void dologincredentials() {

	}*/
	@RequestMapping(value = "/homePage.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doHomePage(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
		
	}
	@RequestMapping(value = "/logincredentials.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void dologincredentials(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "name", required = false) String username, 
			@RequestParam(value = "email", required = false) String useremail, 
			HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		System.out.println("hi");
	}
	@RequestMapping(value = "/login.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void dologin(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc, HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		
	}
	@RequestMapping(value = "/loginValidation.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public String doLoginValidation(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "uname", required = false) String uname,
			@RequestParam(value = "password", required = false) String password, HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		boolean a=userManager.checkMyRecords(uname,password);
		System.out.println("hi");
				if(a==true){
					return "redirect:homePage.mm";
				}else{
					return "redirect:login.mm";
				}
	}
	@RequestMapping(value = "/register.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doregister(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc, HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		List<User> u=userManager.getMyAllRecords();
		model.addAttribute("es",u);
		System.out.println("priya");
		
	}
	@RequestMapping(value = "/registerForm.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public String doregisterform(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "userId", required = false) Long userId,
			@RequestParam(value = "userName", required = false) String userName,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "otp", required = false) int otp,
			HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		boolean a=userManager.insertMyRecord(userId,userName,password,otp);
		model.addAttribute("dp", a);
		
		System.out.println("hi");
		return "redirect:register.mm";
		
		
	}
	@RequestMapping(value = "/myform.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void domyform(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "nm_fk", required = false) String nm_fk,
			@RequestParam(value = "college", required = false) String college,
			HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		Student s=userManager.checkRecords(nm_fk,college);
		model.addAttribute("as",s);
		System.out.println("WELCOME");
	}
	@RequestMapping(value = "/innerjoin.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doinnerjoin(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc, HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		List<Object> o=userManager.showMyAllRecord();
		model.addAttribute("dp",o);
		System.out.println("hi");
	}
	
	@RequestMapping(value = "/myRecords.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void domyRecords(ModelMap model, HttpServletRequest request,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
		
	}
	@RequestMapping(value = "/myproject.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doMyProject(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
		
	
	}
	@RequestMapping(value = "/firstTask.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void dofirstTask(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
		
	
	}
	
	@RequestMapping(value = "/newOne.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void donewOneTask(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
		
	}
	
	@RequestMapping(value = "/listTask.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void dolistTask(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
}
@RequestMapping(value = "/allTask.mm", method = { RequestMethod.GET, RequestMethod.POST })
	public void doallTask(ModelMap model, HttpServletRequest request,
			@RequestParam(value = "loc", required = false) String loc,
			 HttpSession session)
			throws UnknownHostException, ParseException, SocketException {
	
		System.out.println("welcome");
}


}
	

