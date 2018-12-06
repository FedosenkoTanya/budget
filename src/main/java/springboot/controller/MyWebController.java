package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import springboot.InMemoryMessageRepository;
import springboot.Category;

@Controller
public class MyWebController {
    InMemoryMessageRepository categoryList = new InMemoryMessageRepository();

    @GetMapping
    public String index(Model model){

        return "index";
    }

    @GetMapping ("/category")
    public String form(Model model){

        model.addAttribute("listCategory", categoryList.findAll());

        return "category";
    }
    @PostMapping("/category")
    public String formsave(Category category){
        categoryList.save(category);
        System.out.println("!!!!!!!!!!!!!! " + categoryList.findAll());

        return "redirect:/category";
    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        categoryList.delete(id);
        System.out.println("Уже удалили " + categoryList.findAll());

        return "redirect:/category";
    }







}
