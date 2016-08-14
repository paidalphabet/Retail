package com.rtms.spring.controller.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rtms.entity.product.Product;
import com.rtms.form.product.ProductDetailsForm;
import com.rtms.form.product.ProductDetailsTransformer;
import com.rtms.service.product.ProductService;
import com.rtms.spring.controller.BaseController;
import com.rtms.spring.redirection.constants.RedirectionConstants;
import com.rtms.util.HttpRequestUtil;

@Controller
public class ProductController extends BaseController{
	
	/**
	 * productID value to be fetched from the request
	 */
	private static final String productID = "productID";
	
	private static final String COUNT = "count";
	
	private static final String START_VALUE = "startValue";
	
	private static final Integer rowCnt = 10;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method = RequestMethod.GET)
	public ModelAndView getProductPage(final HttpServletRequest request, final HttpServletResponse response){
		final String productID = request.getParameter(this.productID);
		final String redirectionView = RedirectionConstants.PRODUCT_PAGE;
		ProductDetailsForm productDetailsForm = new ProductDetailsForm();
		if(!"0".equals(productID)){
			final Product product = productService.getProduct(Long.valueOf(productID));
			productDetailsForm = ProductDetailsTransformer.convertProductDetails(product);
		}
		ModelMap model = new ModelMap();
		model.addAttribute("command", productDetailsForm);
		return new ModelAndView(redirectionView, model);
	}

	@RequestMapping(value="/product",method = RequestMethod.POST)
	public ModelAndView saveProductPage(@ModelAttribute("command") ProductDetailsForm productDetailsForm, final HttpServletRequest request, final HttpServletResponse response){
		final long productID = productDetailsForm.getProductID();
		Product product = productService.getProduct(productID);
		product = ProductDetailsTransformer.convertToProductDetails(productDetailsForm,product);
		final String redirectionView = RedirectionConstants.PRODUCT_PAGE;
		product = productService.saveProduct(product);
		productDetailsForm.setProductID(product.getProductID());
		ModelMap model = new ModelMap();
		model.addAttribute("command", productDetailsForm);
		return new ModelAndView(redirectionView, model);
	}
	
	@RequestMapping(value = "products", method = RequestMethod.GET)
	public ModelAndView getProductList(final HttpServletRequest request, final HttpServletResponse response){
		final Integer startValue = HttpRequestUtil.getIntegerParameter(request, START_VALUE);
		final List<ProductDetailsForm> productsList = productService.getProducts(startValue, rowCnt);
		final Long productCount = productService.getProductCount();
		final ModelAndView model = new ModelAndView(RedirectionConstants.STORE);
		model.addObject("products", productsList);
		model.addObject("productCount", productCount);
		return model;
	}

}
