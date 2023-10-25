package Management.Model;

import java.util.ArrayList;
import java.util.Date;

public  abstract class Person {
    private String id;
    private String email;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String username;
    private String password;
    private String phoneNumber;
    private String typePerson;

    public Person(String id, String email, String name, Date dateOfBirth, String gender, String username, String password, String phoneNumber, String typePerson) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.typePerson = typePerson;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", typePerson='" + typePerson + '\'' +
                '}';
    }
    public ArrayList add(){
        return null;
    }
    public ArrayList remove(){
        return null;
    }
    public Customer edit(Object other){
        return null;
    }
    public ArrayList find(){
        return null;
    }
    public String login(String email,String password){
        return null;
    }
    public Object signIn(){
        return null;
    }

    public ArrayList getAll(){
        return null;
    }

    public Object getById(String id){
        return null;
    }


}


