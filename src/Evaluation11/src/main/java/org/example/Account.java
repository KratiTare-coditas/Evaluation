package org.example;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountid;

    private String acctype;

    private int balance;
    private String status;


    private String company;
    @Temporal(TemporalType.DATE)
    private Date opendate;

    @ManyToMany

    private List<User> user;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Account()
    {

    }

    public Account(int accountid, String acctype, int balance, String status, Date opendate, List<User> user) {
        this.accountid = accountid;
        this.acctype = acctype;
        this.balance = balance;
        this.status = status;
        this.opendate = opendate;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", acctype='" + acctype + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                ", opendate=" + opendate +
               // ", user=" + user +
                '}';
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
