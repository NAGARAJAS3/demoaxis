package com.HCL.com.HCL.axis.accounts.Rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HCL.com.HCL.axis.accounts.AccountEntity;
import com.HCL.com.HCL.axis.accounts.AccountRepositary;
//import com.HCL.com.HCL.axis.accountsCurrent.AxisCurrentEntity;

import Axis_AccountModel.AccountModelpojo;

@RestController
public class AccountRest {
	
	
	static Map <Object,AccountModelpojo> Accmap4 = new HashMap<Object,AccountModelpojo>();
	static {
		AccountModelpojo Apobj1 = new AccountModelpojo();
		AccountModelpojo Apobj2 = new AccountModelpojo();
		AccountModelpojo Apobj3 = new AccountModelpojo(); 
		
		Apobj1.setAccount_number(10);
		Apobj1.setAccount_type("Saving Account");
		
		Apobj2.setAccount_number(11);
		Apobj2.setAccount_type("Current Account");
		
		Apobj3.setAccount_number(12);
		Apobj3.setAccount_type("Salary Account");
		
		Accmap4.put(Apobj1.getAccount_number(), Apobj1);
		Accmap4.put(Apobj2.getAccount_number(), Apobj2);
		Accmap4.put(Apobj3.getAccount_number(), Apobj3);
		
		
	}
	
	@Autowired
	AccountRepositary AccountRepositaryobj; 
	@RequestMapping(value="/actuator/info",method=RequestMethod.GET)
	public ResponseEntity<Object> Accountget(){
		List<AccountEntity> accountList1= AccountRepositaryobj.findAll();
		return new ResponseEntity<Object>(accountList1,HttpStatus.OK) ;
		
	}
	
	@RequestMapping(value="retail/accounts/add",method = RequestMethod.POST)
	public ResponseEntity<Object> Accountpost(@RequestBody AccountEntity  AccountEntityobj){
	
		try {
			 AccountEntity  Acen = AccountRepositaryobj.save(AccountEntityobj) ;
			 return new ResponseEntity<Object>(Acen,HttpStatus.OK);
			 
		}catch(Exception e) {
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	
   
}
