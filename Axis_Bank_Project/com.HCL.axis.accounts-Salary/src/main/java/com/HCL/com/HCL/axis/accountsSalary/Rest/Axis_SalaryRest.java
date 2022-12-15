package com.HCL.com.HCL.axis.accountsSalary.Rest;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.HCL.com.HCL.axis.accountsSalary.SalaryReposatory;
import com.HCL.com.HCL.axis.accountsSalary.Salary_Entity;

import Axis_salaryModel.Salary_pojoclass;

@RestController
public class Axis_SalaryRest {

	static Map<Object,Salary_pojoclass> AccSal = new HashMap<Object,Salary_pojoclass>();
	static {
		Salary_pojoclass Salpojo1 = new Salary_pojoclass();
		Salpojo1.setAccount_number(2001);
		Salpojo1.setEmplyoee_name("Sudheer1");
		Salpojo1.setEmail("Sidheer1@gmail.com");
		Salpojo1.setPassword("Sudheer1@123");
		Salpojo1.setPancard("sud111");


		Salary_pojoclass Salpojo2 = new Salary_pojoclass();
		Salpojo2.setAccount_number(2002);
		Salpojo2.setEmplyoee_name("Sudheer2");
		Salpojo2.setEmail("Sidheer2@gmail.com");
		Salpojo2.setPassword("Sudheer21@123");
		Salpojo2.setPancard("sud222");

		Salary_pojoclass Salpojo3 = new Salary_pojoclass();
		Salpojo3.setAccount_number(2003);
		Salpojo3.setEmplyoee_name("Sudheer2");
		Salpojo3.setEmail("Sidheer2@gmail.com");
		Salpojo3.setPassword("Sudheer21@123");
		Salpojo3.setPancard("sud222");

		AccSal.put(Salpojo1.getAccount_number(), Salpojo1);
		AccSal.put(Salpojo2.getAccount_number(), Salpojo1);
		AccSal.put(Salpojo3.getAccount_number(), Salpojo1);

	}
	@Autowired
	SalaryReposatory SalaryReposatoryobj;
	
	@RequestMapping(value="/actuator/info", method=RequestMethod.GET)
	public ResponseEntity<Object> SalGet(){
		List<Salary_Entity> accountList= SalaryReposatoryobj.findAll();

		return new ResponseEntity<Object>(accountList,HttpStatus.OK);

	}



	@RequestMapping(value="/retail/Salary/add",method=RequestMethod.POST)
	public ResponseEntity<Object> SallPost(@RequestBody Salary_Entity  Salary_Entityobj){
		try {
			Salary_Entity Salenobj = SalaryReposatoryobj.save(Salary_Entityobj);
			return new ResponseEntity<Object>(Salenobj, HttpStatus.OK);

		}catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}


	}
	

	@RequestMapping(value="retail/accounts/current/edit/{accountNumber}" ,method=RequestMethod.PUT)
	public ResponseEntity<Object> updateCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber,@RequestBody Salary_Entity currentAccObj){
		
		Salary_Entity currentAccountEntity=SalaryReposatoryobj.getById(accountNumber);		
		currentAccountEntity.setEmplyoee_name(currentAccObj.getEmplyoee_name());
		currentAccountEntity.setEmail(currentAccObj.getEmail());
		currentAccountEntity.setPancard(currentAccObj.getPancard());
		currentAccountEntity.setPassword(currentAccObj.getPassword());
		SalaryReposatoryobj.save(currentAccountEntity);
		return new ResponseEntity<Object> (currentAccountEntity,HttpStatus.OK);
		
	}
	@RequestMapping(value="/retail/current-accounts/delete/{accountNumber}" ,method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber){
		SalaryReposatoryobj.deleteById(accountNumber);
		return new ResponseEntity<Object> ("Current Account details successfully deleted",HttpStatus.OK);

	}

	

}
