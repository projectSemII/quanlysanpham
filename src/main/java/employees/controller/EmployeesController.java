package employees.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import employees.model.Employees;
import employees.service.IEmployeesService;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private IEmployeesService employeesService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sf, true));
	}

	@GetMapping(value = { "", "/getListEmployees" })
	public String getListEmployees(Model model) {
		List<Employees> listEmployees = employeesService.findAll();
		model.addAttribute("listEmployees", listEmployees);
		return "home";
	}

	@GetMapping("/initInsertEmployees")
	public String initInsertEmployees(Model model) {
		model.addAttribute("employees", new Employees());
		return "insertEmployees";
	}

	@PostMapping("/initInsertEmployees")
	public String initInsertEmployees(@ModelAttribute("employees") Employees employees, Model model) {
		Employees e = employeesService.save(employees);
		if (e != null) {
			return "redirect:/employees";
		} else {
			return "insertEmployees";
		}
	}

	@GetMapping("/editEmployee/{emplId}")
	public String editEmployee(@PathVariable("emplId") Integer emplId, Model model) {
		model.addAttribute("employees", employeesService.getById(emplId));
		return "editEmployees";
	}

	
	 @PostMapping("/editEmployee/{emplId}") 
	 public String editEmployee(@ModelAttribute("employees")Employees employees,Model model,@PathVariable("emplId")Integer emplId) {
		 Employees e = employeesService.save(employees);
			if (e != null) {
				return "redirect:/employees";
			} else {
				return "editEmployees";
			}
	  }
	@GetMapping("/deleteEmployee/{emplId}")
	@ResponseBody
	public int deleteEmployee(@PathVariable("emplId")Integer emplId) {
		Employees employees = employeesService.getById(emplId);	
		try {
			employeesService.delete(employees);
		} catch (Exception e) {
			// TODO: handle exception
			return 400;
		}
		
		return 200;
	}

}
