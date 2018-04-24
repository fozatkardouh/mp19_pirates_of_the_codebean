package at.refugeescode.mp19_pirates_of_the_codebean.view;

import at.refugeescode.mp19_pirates_of_the_codebean.model.Curse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final Curse curse;

    @GetMapping
    @RolesAllowed("jacksparrow")
    String home() {
        return "home";
    }

    @ModelAttribute("curseLifted")
    public boolean isCurseLifted() {
        return curse.isCurseLifted();
    }

}
