package com.sharesquare.springmvc;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductSearchController {
	@RequestMapping(value = "/product/search", method = RequestMethod.GET)
	public void productSearch(Locale locale, Model model,
			HttpServletResponse response) throws IOException {

		response.setContentType(MediaType.APPLICATION_JSON_VALUE);

		response.getWriter().write("{\"name\":\"Very Nice Shoes\"}");
	}
}
