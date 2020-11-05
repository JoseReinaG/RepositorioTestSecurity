package com.cjgmj.testSecurityException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cjgmj.testSecurityException.entity.UserEntity;

import com.cjgmj.testSecurityException.service.IUserService;
import com.cjgmj.testSecurityException.TestSecurityExceptionApplication;


@SpringBootTest(classes = TestSecurityExceptionApplication.class)
class TestSecurityExceptionApplicationTests {

	@Autowired
	private IUserService userService;

	@Test
	public void TestListarUsuarios() {
		
	//	List<UserEntity> listaUsuarios = new ArrayList();
				
	//	listaUsuarios=userService.findAll();
	//	assertNull(listaUsuarios);
		
		
	}
	

	
}
