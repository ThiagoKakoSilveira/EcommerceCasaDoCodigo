package br.com.casaDoCodigo.loja.managedBean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.casaDoCodigo.loja.daos.BookDAO;
import br.com.casaDoCodigo.loja.models.Book;

@Model
public class AdminBooksBean {
	private Book product = new Book();
	
	@Inject
	BookDAO bookDAO;
	
	public void save(){
		System.out.println("Precisamos salvar o livro");
		bookDAO.save(product);
	}

	//GETERS & SETERS
	public Book getProduct() {
		return product;
	}	

}
