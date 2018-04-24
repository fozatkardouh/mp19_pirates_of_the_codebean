package at.refugeescode.mp19_pirates_of_the_codebean.view;

import at.refugeescode.mp19_pirates_of_the_codebean.model.Curse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/diary")
@RequiredArgsConstructor
public class DiaryController {

    private final Curse curse;

    @GetMapping
    @RolesAllowed("carina")
    String diary() {
        return "diary";
    }

    @ModelAttribute("curseLifted")
    public boolean isCurseLifted() {
        return curse.isCurseLifted();
    }

    @PostMapping
    @RolesAllowed("carina")
    String diaryChanger() {
        curse.setCurseLifted(true);
        return "redirect:/diary";
    }

}
