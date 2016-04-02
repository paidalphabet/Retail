package com.rtms.spring.controller.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rtms.service.product.ProductService;
import com.rtms.spring.controller.BaseController;
import com.rtms.spring.redirection.constants.RedirectionConstants;

@Controller
public class ProductController extends BaseController{
	
	/**
	 * productID value to be fetched from the request
	 */
	private static final String productID = "productID";
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method = RequestMethod.GET)
	public ModelAndView getProductPage(final HttpServletRequest request, final HttpServletResponse response){
		final String productID = request.getParameter(this.productID);
		final String redirectionView = RedirectionConstants.PRODUCT_PAGE;
		if(!"0".equals(productID)){
			
		}
		return new ModelAndView(redirectionView);
	}
	
}
