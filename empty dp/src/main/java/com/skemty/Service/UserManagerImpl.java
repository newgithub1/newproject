package com.skemty.Service;

import java.util.List;
import java.util.UUID;

import javax.persistence.Version;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.security.authentication.AuthenticationManager;

import com.skemty.dao.UserDAO;
import com.skemty.entity.AdminDetail;
import com.skemty.entity.Employee;
import com.skemty.entity.Student;
import com.skemty.entity.StudentDetail;
import com.skemty.entity.User;
import com.skemty.entity.WrkDetail;

/**
 * @author s6
 *
 */
/**
 * @author s6
 *
 */
public  class UserManagerImpl implements UserManager {

	@Autowired
	UserDAO userDao;


	// ******************************************************************************************
	@Autowired(required = false)
	AuthenticationManager authManager;
	private Logger LOG = Logger.getLogger(UserManager.class);
	Session session = null;
	private static HibernateTemplate ht;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.ht = new HibernateTemplate(sessionFactory);
		session = sessionFactory.openSession();
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String username) {
		User user = null;
		List<User> users = ht.find("FROM User u WHERE u.userName = ?", username);

		if (users != null && !users.isEmpty()) {
			user = users.get(0);
		}

		return user;
	}

	@Override
	public void saveDeatil(WrkDetail wrk, AdminDetail admin) {
		ht.save(wrk);
		ht.save(admin);
	}

	@Override
	public void saveDeatilMapping(Student std) {
	Long id=(Long) ht.save(std);
	Student st=ht.get(Student.class,id);
	StudentDetail stdt=ht.get(StudentDetail.class,id);
	}
	@Override
	public boolean checkMyRecords(String uname,String password){
		List<User> a=ht.find("from User where userName=? and password=?",uname,password);
		
		if(a!=null && a.size()>0){
			return true;
		}else{
			return false;
		}
		
	
			
	}
		
	@Override 
	 public boolean insertMyRecord(Long userId, String userName, String password, int otp){
	
		User u=new User();
		u.setUserId((userId));
		u.setUserName(userName);
		u.setPassword(password);
		u.setOtp((otp));
		ht.save(u);
		return false;
		
		
	}
	@Override
	public List<User> getMyAllRecords(){
		List<User> u=ht.find("from User");
		return u;
	}

	@Override
	public Student checkRecords(String nm_fk, String college) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Object> showMyAllRecord(){
		List<Object> o=session.createSQLQuery("select empid,empname,nm_fk,college from employee inner join student on (empname=nm_fk) where empsts=1 order by empid").list();
		return o;
	}

	public List<Student> getMyAllDatas1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> getMyAllRecord(){
		List<Student> s=ht.find("from Student");
		return s;
	}

	public Student getMyStudentRecord1(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student getMyStudentRecord(String name1){
		List<Student> stu=ht.find("from Student where name=?",name1);
		if(stu!=null && !stu.isEmpty()){
			return stu.get(0);
		}
		else{
			return null;
		}
		
		
	}


	public List<Employee> getAllEmployeeRecord1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> getAllEmployeeRecord(){
		List<Employee> e1=ht.find("from Employee");
		return e1;
	}



	public List<Student> saveAllDatas1(String name, String reg_No, String location, Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> saveAllDatas(String name, String reg_No, String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> saveAllDatas(String name, String reg_No, String location, Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}


	public Student getParticularRecord1(String name1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student getParticularRecord(String name2){
		List<Student> a=ht.find("from Student where name=?",name2);
		if(a!=null && !a.isEmpty()){
			return a.get(0);
		}else{
			return null;
		}
		
	}


	public List<Student> showAllMyRecords1() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Student> showAllMyRecords(){
		List<Student> st=ht.find("from Student");
		return st;
	}


	public List<Object> getObjectRecords1() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Object> getObjectRecords(){
		List<Object> o=session.createSQLQuery("select * from Student").list();
		return o;
	}
}
