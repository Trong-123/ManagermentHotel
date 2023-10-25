package Management.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Customer extends Person {
    public Customer(String id, String email, String name, Date dateOfBirth, String gender, String username, String password, String phoneNumber, String typePerson) {
        super(id, email, name, dateOfBirth, gender, username, password, phoneNumber, typePerson);
    }

    public Customer() {
    }
    @Override
    public String login(String email, String password){
        // đọc file custom ra account ( email, password)
        // r check
        // return email
        return null;
    }
    @Override
    public ArrayList<Object> getAll(){
        // doc file Customer ra
        return null;
    }

    @Override
    public ArrayList<Customer> add(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Nhap so luong Khach hang: ");
        int n=reader.nextInt();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        for(Customer c: customers) {
            // code nhap vao c
            customers.add(c);
        }

        return customers ;
    }
    @Override
    public Customer getById(String id){
        // doc file ra
        // ghi vao ds
        // kiem ra id đó có nằm trong ds không
        // nếu có trả về Customer còn k trả về null
        return null;
    }
    public Customer edit(Customer customer){
        Customer customerTmp = new Customer().getById(customer.getId());
        if( customerTmp == null)
            return null;
        customerTmp.setName(customer.getName());
        return customerTmp;
    }
}
