package backend.hrms.entities.concretes;

import backend.hrms.entities.abstracts.Model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee implements Model {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tcno")
    private int tcno;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "password_again")
    private String password_again;

    @Column(name = "location_id")
    private int locationId;

    public Employee(){}

    public Employee(int id, String firstName, String lastName,
                    int tcno, String birthDate, String email,
                    String password, String password_again,
                    String department, int locationId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcno = tcno;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.password_again = password_again;
        this.department = department;
        this.locationId = locationId;
    }

    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_again() {
        return password_again;
    }

    public void setPassword_again(String password_again) {
        this.password_again = password_again;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

}
