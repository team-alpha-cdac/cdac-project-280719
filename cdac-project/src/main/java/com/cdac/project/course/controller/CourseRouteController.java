package com.cdac.project.course.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.project.course.model.Batches;
import com.cdac.project.course.model.Faculty;
import com.cdac.project.course.service.AddBatchService;
import com.cdac.project.course.service.FacultyServiceImpl;

@Controller
public class CourseRouteController {

	private static final Logger logger = LoggerFactory.getLogger(CourseRouteController.class);
	
//admin login routes
	
    @Autowired
	private AddBatchService addBatchService;
    
	@Autowired
	private FacultyServiceImpl facultyService; 
	
    @RequestMapping("/cadmin")
    public String index() {
    	
    	logger.info("This is logger info::::::");
    	
        return "course/admin/dashboard/index";
    }


    
    @RequestMapping("/cadmin/batchCreation")
    public String batch_creation(Model model) {
    	
    	model.addAttribute("batches",new Batches());
        return "course/admin/dashboard/batchCreation";
    }
    
    
    //add Faculty 
    @RequestMapping("/cadmin/addFaculty")
    public String add_faculty(Model model) {
    	
    	model.addAttribute("faculty",new Faculty());
        return "course/admin/dashboard/addFaculty";
    }
    

	
	@RequestMapping(value="/SubmitAddBatch",method=RequestMethod.POST)
	public String submitApplication(Model model,@ModelAttribute("batches") @Valid Batches batches,BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors()) {
			return "course/admin/dashboard/batchCreation";
		}
		
		addBatchService.addBatch(batches);
		
		System.out.println("render data "+batches);
		
		model.addAttribute("batches", new  Batches());
		
		return "course/admin/dashboard/batchCreation";
	}
	

	
	
	@RequestMapping(value="/SubmitFaculty",method=RequestMethod.POST)
	public String submitApplication(Model model,@ModelAttribute Faculty faculty) {
	
		faculty.setApplicant_id(0);
		faculty.setIs_internal((short) 1);
		
		//TODO DB code
		facultyService.addFaculty(faculty);
		
		System.out.println(faculty);
		
		model.addAttribute("faculty", new Faculty());
		return "course/admin/dashboard/addFaculty";
	
		
	}
    
    
    
    //faculty login routes
    
    @RequestMapping("/faculty")
    public String indexfaculty() {
        return "course/faculty/dashboard/index";
    }
	
    @RequestMapping("/faculty/upload")
    public String docUpload() {
        return "course/faculty/dashboard/upload";
    }

    @RequestMapping("/faculty/recordsheet")
    public String getRecordSheet() {
        return "course/faculty/dashboard/update-sheet";
    }
    
    @RequestMapping("/faculty/show-recordsheet")
    public String showRecordSheet() {
        return "course/faculty/dashboard/show-sheet";
    }
    
    @RequestMapping("/faculty/uploadSubmit")
    public String docUploadSubmit() {
        return "course/faculty/dashboard/upload";
    }
    
    
	
    
	
}
