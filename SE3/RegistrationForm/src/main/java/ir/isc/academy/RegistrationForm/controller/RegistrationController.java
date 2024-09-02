package ir.isc.academy.RegistrationForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Controller
public class RegistrationController {

    @GetMapping("/registerform")
    public String showRegisterForm(Model model) {
        model.addAttribute("firstName", "");
        model.addAttribute("lastName", "");
        model.addAttribute("dob", "");
        return "register";
    }

    @PostMapping("/result")
    public String showResult(@RequestParam String first_name,
                             @RequestParam String last_name,
                             @RequestParam String dob,
                             Model model) {
        String errorMessage = null;

        // Regex to check if the string contains only letters (a-z, A-Z)
        String namePattern = "^[a-zA-Z]+$";

        if (first_name == null || first_name.trim().isEmpty()) {
            errorMessage = "First Name is required.";
        } else if (!first_name.matches(namePattern)) {
            errorMessage = "First Name can only contain letters.";
        } else if (last_name == null || last_name.trim().isEmpty()) {
            errorMessage = "Last Name is required.";
        } else if (!last_name.matches(namePattern)) {
            errorMessage = "Last Name can only contain letters.";
        } else if (dob == null || dob.trim().isEmpty()) {
            errorMessage = "Date of Birth is required.";
        } else {
            // Validate date of birth
            try {
                LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate today = LocalDate.now();

                if (dateOfBirth.isAfter(today)) {
                    errorMessage = "Date of Birth cannot be in the future.";
                }
            } catch (DateTimeParseException e) {
                errorMessage = "Date of Birth must be in the format yyyy-MM-dd.";
            }
        }

        if (errorMessage != null) {
            model.addAttribute("errorMessage", errorMessage);
            model.addAttribute("firstName", first_name);
            model.addAttribute("lastName", last_name);
            model.addAttribute("dob", dob);
            return "register";  // Forward back to the form with error messages
        }

        model.addAttribute("firstName", first_name);
        model.addAttribute("lastName", last_name);
        model.addAttribute("dob", dob);
        return "result";  // Proceed to the result page
    }
}
