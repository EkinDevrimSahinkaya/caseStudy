package mdgGoup.caseStudy.DTO;

import mdgGoup.caseStudy.Model.User;

public class ProductDTO {
    private int id;
    private User user;

    private String info;

    public ProductDTO(int id, User user, String info) {
        this.id = id;
        this.user = user;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
