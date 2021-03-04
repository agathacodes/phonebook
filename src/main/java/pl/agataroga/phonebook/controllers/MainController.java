package pl.agataroga.phonebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agataroga.phonebook.models.AddContactForm;
import pl.agataroga.phonebook.models.services.ContactService;

@Controller
public class MainController {

    @Autowired
    ContactService contactService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("addContactForm", new AddContactForm());
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public String index(@ModelAttribute AddContactForm addContactForm) {
        contactService.addContact(addContactForm);
        return "Dodano kontakt";
    }

}