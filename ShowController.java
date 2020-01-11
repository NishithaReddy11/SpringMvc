package springmvc.controller;


import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Product;
 @Controller
public class ShowController {

	  @PostMapping("/show")
	//  public ModelAndView show(@ModelAttribute Product p)
	  public String show(Model m,HttpServletRequest req)
	 {
		  int productId=Integer.parseInt(req.getParameter("pid"));
		  String productName=req.getParameter("pname");
		  float price=Float.parseFloat(req.getParameter("price"));
		 // ModelAndView mv=new ModelAndView();
		  //Product p=new Product();
		  m.addAttribute("productId",productId);
		  m.addAttribute("productName",productName);
		  m.addAttribute("productPrice",price);
//		  mv.addObject("product",p);
		  return "show.jsp";
	 }
	  
	  
	@PostMapping("/hello")
	  public void hello(HttpServletRequest req,HttpServletResponse res) throws IOException

 {
	 res.getWriter().println("Hello world");
 }
}