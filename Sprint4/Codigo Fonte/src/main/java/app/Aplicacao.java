package app;

import static spark.Spark.*;

import service.ProdutoService;
import service.UserService;


public class Aplicacao {
	
	private static ProdutoService produtoService = new ProdutoService();
	private static UserService userService = new UserService();
	
    public static void main(String[] args) {
        port(8080);
        
        staticFiles.location("/public");
        
        post("/user/insert", (request, response) -> userService.insert(request, response));
        get("/user/list/:orderby", (request, response) -> produtoService.getAll(request, response));
        
        
        
        
        post("/produto/insert", (request, response) -> produtoService.insert(request, response));
        
        //post("/produto/insert", (request, response) -> produtoService.insert(request, response));

       // get("/produto/:id", (request, response) -> produtoService.get(request, response));
        
        get("/produto/list/:orderby", (request, response) -> produtoService.getAll(request, response));

        //get("/produto/update/:id", (request, response) -> produtoService.getToUpdate(request, response));
        
        //post("/produto/update/:id", (request, response) -> produtoService.update(request, response));
           
       // get("/produto/delete/:id", (request, response) -> produtoService.delete(request, response));

             
    }
}