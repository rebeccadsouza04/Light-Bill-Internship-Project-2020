package com.example.electricity;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LightBillController 
{

	  @GetMapping("/light-bill-json")
	  @ResponseBody
	  public LightBill displayBill(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) 
	  {       
		  LightBill bill = new LightBill();
		  
		  bill.setName(name);
		  bill.setBillAmount(3500);
		  bill.setBillNo(12345);
		  bill.setDate("16th June 2020");
		  
		  
	    return bill;
	
	 }
	  
	   @GetMapping("/light-bill-html")
	    public ModelAndView htmlView(Model model)
	  {    
		   LightBill bill = new LightBill();
			  
			  bill.setName("Ajinkya Kamath");
			  bill.setBillAmount(3500);
			  bill.setBillNo(12345);
			  bill.setDate("16th June 2020");
		   
	      
	        ModelAndView mav = new ModelAndView();
	        mav.addObject("bill", bill);
	        mav.setViewName("mybill");   
	        return mav;
	  }

  
}