package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.vo.XmlResponse;

@Controller
public class HomeController2 {
	@RequestMapping("/")
	public String home() {
		return "redirect:/home.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/getXmlResp",produces={"application/xml"})
	public XmlResponse getXmlResp() {
		XmlResponse resp = new XmlResponse();
		resp.setCode("200");
		resp.setMessage("successful operation");
		return resp;
	}
}
