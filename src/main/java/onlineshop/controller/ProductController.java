package onlineshop.controller;

import onlineshop.entity.Product;
import onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String findAllProducts(Model model){
        List<Product> allProduct = productService.findAllProduct();

        model.addAttribute("products",allProduct);

        return "products";

    }

    @PostMapping
    public String createNewBook(@Validated Product product,Model model){

        try {
            productService.addProduct(product);
            return "redirect:/products";
        } catch (Exception e) {
            model.addAttribute("error",e.getMessage());
            model.addAttribute("products",productService.findAllProduct());
            return "products";
        }


    }
    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


}
