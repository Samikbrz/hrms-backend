package backend.hrms.entities.concretes;

import backend.hrms.entities.abstracts.Model;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company implements Model {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private char telephone;

    @Column(name = "password")
    private String password;

    @Column(name = "password_again")
    private String passwordAgain;

    public Company(){}

    public Company(int id, String name, String webSite, String email, char telephone, String password, String passwordAgain) {
        this.id = id;
        this.name = name;
        this.webSite = webSite;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.passwordAgain = passwordAgain;
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

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getTelephone() {
        return telephone;
    }

    public void setTelephone(char telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }

}
