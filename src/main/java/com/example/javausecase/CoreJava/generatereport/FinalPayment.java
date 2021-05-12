package com.example.javausecase.corejava.generatereport;

import java.util.logging.Logger;

public class FinalPayment {
	static Logger log = Logger.getLogger(FinalPayment.class.getName());
	
	Products p = new Products();
	Products prod = new Products();
	public void cocolapay() {
		log.info(" ");
		log.info("Order Summary");
	     log.info("=============");	    
	     p.cocorate();
	     log.info("Only Cash On Delivary Available");
	     log.info("Your Order Will be Delivered within a day");
	     log.info("No ReFund will be Allowed ");
		 log.info("HAPPY SHOPPING");
	}	
	public void pepsipay() {
		log.info(" ");
		log.info("Order Summary");
	     log.info("=============");	    
	     p.pepsirate();
	     log.info("Only Cash On Delivary Available");
	     log.info("Your Order Will be Delivered within a day");
	     log.info("No ReFund will be Allowed ");
		 log.info("HAPPY SHOPPING");
	}	
	public void tomatopay() {
		log.info(" ");
		log.info("Order Summary");
	    log.info("=============");	   
	    prod.tomatorate();	    
	    log.info("Your OrderWill be Delivered within a day");   
	    log.info("No ReFund will be Allowed ");
		log.info("HAPPY SHOPPING");
	}
	public void potatopay() {
		log.info(" ");
		log.info("Order Summary");
	    log.info("=============");	   
	    prod.potatorate();
	    log.info("Your Order Will be Delivered within a day");
	    log.info("No ReFund will be Allowed ");
		log.info("HAPPY SHOPPING");
	}
	public void ricepay() {
		log.info(" ");
		log.info("Order Summary");
	    log.info("=============");
	    prod.ricerate();
	    log.info("Your Order Will be Delivered within a day");
	    log.info("No ReFund will be Allowed ");
		log.info("HAPPY SHOPPING");
	}
	public void attapay() {
		log.info(" ");
		log.info("Order Summary");
	    log.info("=============");
	    prod.attarate();
	    log.info("Your Order Will be Delivered Next day");
}}
