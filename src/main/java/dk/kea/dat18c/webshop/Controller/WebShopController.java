package dk.kea.dat18c.webshop.Controller;

import dk.kea.dat18c.webshop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Dette er controller for WebShop
@Controller
public class WebShopController {

    //Annoter product service
    @Autowired
    ProductService productService;
    @GetMapping("/")
    public String index(Model model)
    {
        //put noget i model
        model.addAttribute("products", productService.getAll());
        //return side, der skal vises
        return "index";
    }
}
