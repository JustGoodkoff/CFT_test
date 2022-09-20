package com.example.cft_test;

import android.widget.Toast;

public class User {
    private String name, surname, date, password, confirmPassword;

    public User() {
        name = "";
        surname = "";
        date = "";
        password = "";
        confirmPassword = "";
    }

    public User(String name, String surname, String date, String password, String confirmPassword) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String checkValidateData(String name, String surname, String date, String password, String confirmPassword) {
        if (name.equals("") || surname.equals("") || password.equals("") || confirmPassword.equals("")) {
            return "Все поля должны быть заполнены!";
        } else if (!password.equals(confirmPassword)) {
            return "Пароли должны совпадать";
        } else if (name.length() < 2 || surname.length() < 2) {
            return "Длина имени и фамилии не должна быть менее 2 символов";
        }
        return "OK";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getconfirmPassword() {
        return confirmPassword;
    }

    public void setconfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
