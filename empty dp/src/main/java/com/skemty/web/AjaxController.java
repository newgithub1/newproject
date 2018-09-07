package com.skemty.web;

import java.util.List;
import java.util.logging.Logger;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import com.skemty.Service.UserManager;
import com.skemty.entity.Employee;
import com.skemty.entity.Student;
import com.skemty.util.MailManager;

/**
 * This class is a controller to handle the Ajax requests from the Admin UI. It
 * leverages Direct Web Remoting (DWR) to simplify the Ajax coding.
 * 
 * @param <shoppingCartItems>
 */

@Service
@RemoteProxy(name = "AjaxController")
public class AjaxController<shoppingCartItems> {
	private static final Logger logger = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	private UserManager userManager;



	@Autowired
	private MailManager mailManager;
	@Autowired(required = false)
	AuthenticationManager authManager;

@RemoteMethod
public List<Student> getMyAllRecord(){
	List<Student> s=userManager.getMyAllRecord();
	return s;
}

@RemoteMethod
public Student getMyStudentRecord(String name){
	Student s=userManager.getMyStudentRecord(name);
	return s;
	
}
@RemoteMethod
public List<Employee> getAllEmployeeRecord(){
	List<Employee> e=userManager.getAllEmployeeRecord();
	return e;
}
@RemoteMethod
public Student getParticularRecord(String name1){
	Student a=userManager.getParticularRecord(name1);
	return a;
}
@RemoteMethod
public List<Student> showAllMyRecords(){
	List<Student> st=userManager.showAllMyRecords();
	return st;
}
@RemoteMethod
public List<Student> showAllMyRecords2(){
	List<Student> st=userManager.showAllMyRecords();
	return st;
}
@RemoteMethod
public List<Object> getObjectRecords(){
	List<Object> ob=userManager.getObjectRecords();
	return ob;
}
}