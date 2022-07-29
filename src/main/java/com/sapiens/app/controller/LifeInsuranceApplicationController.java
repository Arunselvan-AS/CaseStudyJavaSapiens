package com.sapiens.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapiens.app.entity.Policy;
import com.sapiens.app.service.PolicyService;

@Controller
public class LifeInsuranceApplicationController 
{
	@Autowired
	private PolicyService policyService;

	public LifeInsuranceApplicationController(PolicyService policyService) {
		super();
		this.policyService = policyService;
	}
	@GetMapping("/")
	public String loginPage()
	{
		return "login";
	}
	@PostMapping("/")
	public String loginRedirect(@RequestParam("username") String username,@RequestParam("password") String password,Model model)
	{
		if(username.equals("admin") && password.equals("admin"))
		{	model.addAttribute("policys", policyService.getAllPolicy());
			return "index";
		}
		else
		{
			Policy policy = new Policy();
			model.addAttribute("policy", policy);
			return "form";
		}
	}
	@GetMapping("/index")
	public String policyTable(Model model)
	{
		model.addAttribute("policys", policyService.getAllPolicy());
		return "index";
	}
	@PostMapping("/createpolicy")
	public String createPolicy(@ModelAttribute("policy") Policy policy)
	{
		policy.setPolicyStatus("Pending");
		policyService.savePolicy(policy);
		return "redirect:/";
	}
	@GetMapping("/policy/accept/{id}")
	public String acceptPolicy(@PathVariable Integer id,@ModelAttribute("policys") Policy policy)
	{
		Policy existingPolicy = policyService.getPolicyByID(id);
		existingPolicy.setPolicyStatus("Accepted");
		policyService.updatePolicy(existingPolicy);
		return "redirect:/index";
	}
	@GetMapping("/policy/reject/{id}")
	public String rejectPolicy(@PathVariable Integer id,@ModelAttribute("policys") Policy policy)
	{
		Policy existingPolicy = policyService.getPolicyByID(id);
		existingPolicy.setPolicyStatus("Rejected");
		policyService.updatePolicy(existingPolicy);
		return "redirect:/index";
	}
	
}
