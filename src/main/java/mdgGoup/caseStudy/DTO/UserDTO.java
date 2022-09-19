package mdgGoup.caseStudy.DTO;


import mdgGoup.caseStudy.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private int id;
    private String name;
    private String password;

    private List<Product> products = new ArrayList<Product>();

    public UserDTO(){}

    public UserDTO(int id, String name, String password, List<Product> products) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> product) {
        this.products = product;
    }


}
