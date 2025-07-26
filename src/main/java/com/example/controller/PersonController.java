package com.example.controller;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.Person;
import com.example.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("person", new Person());
		return "index";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("person") Person person,
	                   @RequestParam("text") String text,
	                   @RequestParam("image") MultipartFile image,
	                   @RequestParam("video") MultipartFile video) throws Exception {

	    // Convert 'text' to Clob
	    SerialClob clob = new SerialClob(text.toCharArray());
	    person.setDescription(clob);

	    if (!image.isEmpty()) {
	        SerialBlob imageBlob = new SerialBlob(image.getBytes());
	        person.setImage(imageBlob);
	    }

	    if (!video.isEmpty()) {
	        SerialBlob videoBlob = new SerialBlob(video.getBytes());
	        person.setVideo(videoBlob);
	    }

	    personService.save(person);
	    return "redirect:/list";
	}
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("people", personService.list());
		return "list";
	}
}
