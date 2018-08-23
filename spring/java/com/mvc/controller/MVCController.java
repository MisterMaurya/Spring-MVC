
package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {
	@RequestMapping("/")
	public String getIndexPage() {
		return "index";

	}
}
