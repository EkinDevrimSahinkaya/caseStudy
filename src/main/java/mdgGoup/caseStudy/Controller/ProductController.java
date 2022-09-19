package mdgGoup.caseStudy.Controller;


import mdgGoup.caseStudy.DTO.ProductDTO;
import mdgGoup.caseStudy.Model.Product;
import mdgGoup.caseStudy.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<ProductDTO> findAll(){ return productService.findAll(); }

    @GetMapping("/{product-id}")
    public ProductDTO getProductyById(@PathVariable("product-id") int id) {return productService.findById(id); }

    @DeleteMapping("/{product-id}")
    public void deleteById(@PathVariable("product-id") int id){ productService.deleteById(id); }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

}