package Evaluation5;

import java.util.ArrayList;
import java.util.List;

public class MainUser {
    List<Integer> users=new ArrayList<>();
    String name,address,email,simtype;
    int balance,adharno;

    public MainUser(List<Integer> users, String name, String address, String email, String simtype, int balance, int adharno) {
        this.users = users;
        this.name = name;
        this.address = address;
        this.email = email;
        this.simtype = simtype;
        this.balance = balance;
        this.adharno = adharno;
    }
}
