package at.refugeescode.mp15piratesofthecodebean.view;

import at.refugeescode.mp15piratesofthecodebean.controller.PiratesController;
import at.refugeescode.mp15piratesofthecodebean.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private PiratesController piratesController;

    public HomeController(PiratesController piratesController) {
        this.piratesController = piratesController;
    }

    @ModelAttribute("result")
    Result result() {
        return piratesController.getResult();
    }

    @GetMapping
    String page() {
        return "home";
    }

    @PostMapping("/choose/{number}")
    String choose(@PathVariable Integer number){
        piratesController.next(number);
        return "redirect:/";
    }
}
