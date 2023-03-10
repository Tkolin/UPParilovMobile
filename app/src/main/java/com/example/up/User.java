package com.example.up;

public class User {
    private Long id;
    private Integer number;
    private Integer image;
    private String firstName;
    private String lastName;
    private String adress;
    private String login;
    private String password;
    public User(Long id, Integer number, int  image, String firstName,
                String lastName,String adress,String login,String password){

        this.id = id;
        this.number = number;
        this.image = image;
        this.firstName = firstName;
        this.adress = adress;
        this.login = login;
        this.password = password;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String description) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
