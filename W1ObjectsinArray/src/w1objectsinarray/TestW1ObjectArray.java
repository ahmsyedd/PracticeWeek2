/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w1objectsinarray;

/**
 *
 * @author syedd
 */
public class TestW1ObjectArray {

    /**
     * @param args the command line arguments
     * some changes
     */
    public static void main(String[] args) 
    {
        //Array of Object of Student class
        Student[] list = new Student[3];   
        Student s1 = new Student();
        s1.setName("Syed");
        s1.setAge(22);
        Student s2 = new Student();
        s2.setName("Dawood");
        s2.setAge(20);
        
        //save objects of array
        list[0] = s1;
        list[1] = s2;
        System.out.println(list[0] +" "+ list[1]);
        System.out.println(list[0].getName() +" "+ list[1].getAge());
    }
    
}
