package com.skemty.Service;

import java.util.List;
import java.util.UUID;





















import com.skemty.entity.AdminDetail;
import com.skemty.entity.Employee;
import com.skemty.entity.Student;
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
public interface UserManager {

	public User getUser();


	// ************************************************************************


	public User getUser(String username);


	public void saveDeatil(WrkDetail wrk, AdminDetail admin);


	public void saveDeatilMapping(Student std);


	public boolean checkMyRecords(String uname, String password);


	public boolean insertMyRecord(Long userId, String userName, String password, int otp);

	public List<User> getMyAllRecords();




	public Student checkRecords(String nm_fk, String college);


	public List<Object> showMyAllRecord();


	public List<Student> getMyAllRecord();


	public Student getMyStudentRecord(String name);


	public List<Employee> getAllEmployeeRecord();


	public List<Student> saveAllDatas(String name, String reg_No, String location);


	public List<Student> saveAllDatas(String name, String reg_No, String location, Boolean status);


	public Student getParticularRecord(String name1);





	public List<Student> showAllMyRecords();


	public List<Object> getObjectRecords();





	








	





	

}
