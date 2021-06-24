package sv.spring.mvc.jdbctemplate.prodstatcollector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import sv.spring.mvc.jdbctemplate.prodstatcollector.dao.ProductDAO;

@Controller
@ComponentScan("sv.spring.mvc.jdbctemplate.prodstatcollector")
@EnableWebMvc
@RequestMapping("/products")
public class ProductsController {

    private ProductDAO productDAO;

    @Autowired
    public ProductsController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping()
    public String showAllProducts(Model model) {
        model.addAttribute("products", productDAO.allProducts());
        return "products/index";
    }

    @GetMapping("/{id}")
    public String showProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productDAO.getProduct(id));
        return "products/product";
    }

}
