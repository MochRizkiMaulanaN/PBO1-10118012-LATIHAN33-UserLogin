/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UserLogin {
    private static String usName;
    private static String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan Username Anda : ");
        usName=input.nextLine();
        System.out.println("Masukkan Password Anda : ");
        passWord=input.nextLine();
        
        User user=new User();
        user.pengecekanLogin(usName,passWord);
        
        
    }
    
}
