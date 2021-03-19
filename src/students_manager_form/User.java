package students_manager_form;

import java.util.Scanner;
import java.io.Serializable;

public class User implements Serializable {
    private String name, address;
    private int age;
    
    public User(String name, int age, String address ){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    public void Display(){
        System.out.print(name + "\t\t" + age + "\t" + address + "\t\t");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    
    

    public String toString() {
        return "name=" + name + ", address=" + address + ", age=" + age;
    }
    
    
}
