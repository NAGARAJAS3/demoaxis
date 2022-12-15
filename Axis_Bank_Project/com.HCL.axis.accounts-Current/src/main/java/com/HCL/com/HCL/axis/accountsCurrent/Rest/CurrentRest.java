package com.HCL.com.HCL.axis.accountsCurrent.Rest;

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

import com.HCL.com.HCL.axis.accountsCurrent.AxisCurrentEntity;
import com.HCL.com.HCL.axis.accountsCurrent.CurrentRepository;
//import com.hcl.axis.retail.current.account.entity.CurrentAccountEntity;


import Axis_Current_AccountModel.CurrentModelpojo;


@RestController
public class CurrentRest {
	
	
	static Map<Object,CurrentModelpojo> AccCur = new HashMap<Object,CurrentModelpojo>();
	
	static {
		CurrentModelpojo Current1 = new CurrentModelpojo();
		Current1.setAccount_number(100);
		Current1.setCompany_name("Hcl Technology");
		Current1.setEmail("hcltech@hcl.com");
		Current1.setPassword("Hcl@1223");
		Current1.setPancard("casp100");
		
		CurrentModelpojo Current2 = new CurrentModelpojo();
		Current2.setAccount_number(200);
		Current2.setCompany_name("Info Technology");
		Current2.setEmail("infotech@hcl.com");
		Current2.setPassword("info@1223");
		Current2.setPancard("casp200");
		
		CurrentModelpojo Current3 = new CurrentModelpojo();
		Current3.setAccount_number(300);
		Current3.setCompany_name("Tcs");
		Current3.setEmail("tcs@hcl.com");
		Current3.setPassword("tcs@1223");
		Current3.setPancard("casp300");
		
		AccCur.put(Current1.getAccount_number(), Current1);
		AccCur.put(Current2.getAccount_number(), Current2);
		AccCur.put(Current3.getAccount_number(), Current3);
		
		
	}
	@Autowired
	CurrentRepository CurrentRepositoryobj;
	
	@RequestMapping(value="/actuator/info",method=RequestMethod.GET)
	public ResponseEntity<Object> Currentshow(){
		
		List<AxisCurrentEntity> accountList= CurrentRepositoryobj.findAll();
		return new ResponseEntity<Object>(accountList,HttpStatus.OK);
	}
	
	@RequestMapping(value="retail/accounts/current/add",method=RequestMethod.POST)
	public ResponseEntity<Object> Currentpost(@RequestBody AxisCurrentEntity AxisCurrentEntityobj ){
		try {
			AxisCurrentEntity Acccurr1 = CurrentRepositoryobj.save(AxisCurrentEntityobj);
			return new ResponseEntity<Object>(Acccurr1,HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@RequestMapping(value="retail/accounts/current/edit/{accountNumber}" ,method=RequestMethod.PUT)
	public ResponseEntity<Object> updateCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber,@RequestBody AxisCurrentEntity currentAccObj){
		
		AxisCurrentEntity currentAccountEntity=CurrentRepositoryobj.getById(accountNumber);		
		currentAccountEntity.setCompany_name(currentAccObj.getCompany_name());
		currentAccountEntity.setEmail(currentAccObj.getEmail());
		currentAccountEntity.setPancard(currentAccObj.getPancard());
		currentAccountEntity.setPassword(currentAccObj.getPassword());
		CurrentRepositoryobj.save(currentAccountEntity);
		return new ResponseEntity<Object> (currentAccountEntity,HttpStatus.OK);
		
	}
	@RequestMapping(value="/retail/current-accounts/delete/{accountNumber}" ,method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteCurrentAccountDetails(@PathVariable("accountNumber") long accountNumber){
		CurrentRepositoryobj.deleteById(accountNumber);
		return new ResponseEntity<Object> ("Current Account details successfully deleted",HttpStatus.OK);

	}

}
