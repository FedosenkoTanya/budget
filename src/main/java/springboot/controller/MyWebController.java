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

        return "category";
    }

    @PostMapping("/category")
    public ModelAndView formsave(Category category){
        categoryList.save(category);
        System.out.println("!!!!!!!!!!!!!! " + categoryList.findAll());



        ModelAndView model = new ModelAndView("category");

//        model.addAttribute("listProduct", productList.findAll());
        model.addObject("listCategory", categoryList.findAll());

        return model;
    }

   // @GetMapping("/editform/{productId}")
   // public String editform(@PathVariable Long productId, Model model){
    //    System.out.println("Product id is : " + productId);
     //   Product product = productList.findMessage(productId);

     //   model.addAttribute("listProduct", product);


     //   return "editform";
   // }


}
