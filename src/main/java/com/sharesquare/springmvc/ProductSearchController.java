package com.sharesquare.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductSearchController {

	final Logger logger = LoggerFactory
			.getLogger(ProductSearchController.class);

	@RequestMapping(value = "/product/search", method = RequestMethod.GET)
	public void productSearch(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String keyword = request.getParameter("q");
		logger.info("-- Test productSearch called with '"
				+ StringUtils.stripToEmpty(keyword) + "'");
		String infoText = String.format(
				"Could not find any product matches '%s'", keyword);

		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		if ("Very Nice Shoes".equals(keyword)) {
			response.getWriter().write("{\"name\":\"Very Nice Shoes\"}");
		} else {
			response.getWriter().write("{\"infoText\":\"" + infoText + "\"}");
		}
	}

}
