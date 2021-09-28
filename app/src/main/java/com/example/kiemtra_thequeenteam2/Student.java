package com.example.kiemtra_thequeenteam2;

import java.io.Serializable;

public class Student  implements Serializable {
    private int Pic;
    private String id;
    private String name;
    private String phone;

    public Student() {
    }
    public Student(int pic, String id, String name, String phone) {
        Pic = pic;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
