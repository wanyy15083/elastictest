package com.frotly.job.model;

public class TestUser {
    private Integer id;

    private String name;

    private String address;

    private Integer age;

    private String telephone;

    private Integer status;

    public TestUser() {
    }

    public TestUser(Integer id, String name, String address, Integer age, String telephone, Integer status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephone = telephone;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", status=" + status +
                '}';
    }
}