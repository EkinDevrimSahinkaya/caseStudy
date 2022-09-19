package mdgGoup.caseStudy.Service;


import mdgGoup.caseStudy.Model.Product;
import mdgGoup.caseStudy.Model.User;
import mdgGoup.caseStudy.Repository.ProductRepository;
import mdgGoup.caseStudy.Repository.UserRepository;
import mdgGoup.caseStudy.DTO.ProductDTO;
import mdgGoup.caseStudy.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;
    private ProductDTO productDTO;


    public Product save(Product product){ return productRepository.save(product); }

    public List<ProductDTO> findAll(){
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOS = new ArrayList<ProductDTO>();
        for (Product product: products) {
            productDTOS.add(new ProductDTO(product.getId(),product.getUser(),product.getInfo()));
        }
        return productDTOS;
    }

    public ProductDTO findById(int id){
        Product product = productRepository.findById(id);
        ProductDTO productDTO = new ProductDTO(product.getId(),product.getUser(),product.getInfo());
        return  productDTO;
    }

    public void deleteById(int id){ productRepository.deleteById(id); }


    public ProductDTO saveUser(int productId, int userId){
        User user = userRepository.findById(userId);
        Product product = productRepository.findById(productId);
        product.setUser(user);
        productRepository.save(product);
        ProductDTO productDTO = new ProductDTO(product.getId(),product.getUser(),product.getInfo());

        List<Product> list = new ArrayList<>();
        list.addAll(user.getProducts());
        list.add(product);
        user.setProducts(list);
        userRepository.save(user);

        return  productDTO;
    }


}