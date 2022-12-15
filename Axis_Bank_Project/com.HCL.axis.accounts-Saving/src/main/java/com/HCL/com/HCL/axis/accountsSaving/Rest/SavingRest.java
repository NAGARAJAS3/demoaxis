package com.HCL.com.HCL.axis.accountsSaving.Rest;

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


//import com.HCL.com.HCL.axis.accountsSalary.SalaryReposatory;
//import com.HCL.com.HCL.axis.accountsSalary.Salary_Entity;
import com.HCL.com.HCL.axis.accountsSaving.AxisSavingRespository;
import com.HCL.com.HCL.axis.accountsSaving.SavingEntity;

import Axis_SavingModel.AxisSavingModel;


@RestController
public class SavingRest {
static Map<Object,AxisSavingModel> AccCur = new HashMap<Object,AxisSavingModel>();
	
	static {
		AxisSavingModel Savin1 = new AxisSavingModel();
		Savin1.setAccount_number(2001);
		Savin1.setHoldername("Sudheer1");
		Savin1.setEmail("Sidheer1@gmail.com");
		Savin1.setPassword("Sudheer1@123");
		Savin1.setPancard("sud111");

		AxisSavingModel Savin2 = new AxisSavingModel();
		Savin2.setAccount_number(2001);
		Savin2.setHoldername("Sudheer1");
		Savin2.setEmail("Sidheer1@gmail.com");
		Savin2.setPassword("Sudheer1@123");
		Savin2.setPancard("sud111");

		
		AxisSavingModel Savin3 = new AxisSavingModel();
		Savin3.setAccount_number(2001);
		Savin3.setHoldername("Sudheer1");
		Savin3.setEmail("Sidheer1@gmail.com");
		Savin3.setPassword("Sudheer1@123");
		Savin3.setPancard("sud111");


		AccCur.put(Savin1.getAccount_number(), Savin1);
		AccCur.put(Savin2.getAccount_number(), Savin2);
		AccCur.put(Savin3.getAccount_number(), Savin3);
		
		
	}
	@Autowired
	AxisSavingRespository AxisSavingRespositoryobj;
	
	@RequestMapping(value="/actuator/info", method=RequestMethod.GET)
	public ResponseEntity<Object> SavGet(){
		List<SavingEntity> accountList= AxisSavingRespositoryobj.findAll();

		return new ResponseEntity<Object>(accountList,HttpStatus.OK);

	}



	@RequestMapping(value="/retail/Saving/add",method=RequestMethod.POST)
	public ResponseEntity<Object> SallPost(@RequestBody SavingEntity  SavingEntityobj){
		try {
			SavingEntity Savenobj = AxisSavingRespositoryobj.save(SavingEntityobj);
			return new ResponseEntity<Object>(Savenobj, HttpStatus.OK);

		}catch(Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}


	}
	
	@RequestMapping(value="retail/accounts/current/edit/{accountNumber}" ,method=RequestMethod.PUT)
	public ResponseEntity<Object> updateCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber,@RequestBody SavingEntity currentAccObj){
		
		SavingEntity currentAccountEntity=AxisSavingRespositoryobj.getById(accountNumber);		
		currentAccountEntity.setCompany_name(currentAccObj.getCompany_name());
		currentAccountEntity.setEmail(currentAccObj.getEmail());
		currentAccountEntity.setPancard(currentAccObj.getPancard());
		currentAccountEntity.setPassword(currentAccObj.getPassword());
		AxisSavingRespositoryobj.save(currentAccountEntity);
		return new ResponseEntity<Object> (currentAccountEntity,HttpStatus.OK);
		
	}
	@RequestMapping(value="/retail/current-accounts/delete/{accountNumber}" ,method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber){
		AxisSavingRespositoryobj.deleteById(accountNumber);
		return new ResponseEntity<Object> ("Current Account details successfully deleted",HttpStatus.OK);

	}

}
