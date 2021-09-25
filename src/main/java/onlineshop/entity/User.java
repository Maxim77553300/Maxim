package onlineshop.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class User {

    private String name;
    private Integer phone;


    public User(String name, Integer phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
