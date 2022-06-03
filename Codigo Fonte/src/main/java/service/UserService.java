package service;

import spark.Request;
import spark.Response;
import java.io.File;
import java.util.Scanner;
import dao.UserDAO;
import model.User;

public class UserService {
	private UserDAO userDAO = new UserDAO();
	
	private String form;
	private final int FORM_INSERT = 1;
	
	private final int FORM_ORDERBY_DESCRICAO = 2;
	
	
	public UserService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new User(), FORM_ORDERBY_DESCRICAO);
	}

	
	public void makeForm(int tipo, User user, int orderBy) {

	}
	
	public Object insert(Request request, Response response) {
		String resp = "";
		
		String userName = request.queryParams("userName");
		String email = request.queryParams("email");
		String cpf = request.queryParams("cpf");
		String cellPhone = request.queryParams("cellPhone");
		String address = request.queryParams("address");
		String userPass = request.queryParams("userPass");

		User user = new User(0,userName,email,cpf,cellPhone,address,userPass);  
	    
	    if(userDAO.insert(user) == true) {
	        resp = "Presta atenção Diabo! Usuário cadastrado  (" + userName + ") inserido com sucesso!";
	        response.status(201); // 201 Created
		} else {
			resp = "Usúario (" + userName + ") não inserido na base de dados!";
			response.status(404); // 404 Not found
	   }
	        
	   
		 String redirectURL = "/user/list/1";
		     response.redirect(redirectURL, FORM_INSERT); 
	    
		 makeForm();
	    return form;
	    
	}

	
}