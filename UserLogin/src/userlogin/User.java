/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;

/**
 *
 * @author LENOVO
 */
public class User {
    private final String username="Rizki Adam";
    private final String password="terbaikselalu";
    private boolean StatusAkun;
    
    private boolean cekAkun(String parUsername,String parPassword){
        if(parUsername.equals(username) && parPassword.equals(password)){
            StatusAkun=true;
        }else{
            StatusAkun=false;
        }
        return StatusAkun;
    }
    
    private void hasilLogin(boolean Status,String parUsername){
        Status=StatusAkun;
        if(Status == true){
            System.out.println("***** "+parUsername+"*****");
            System.out.println("Selamat Datang di Aplikasi Ini");
        }else{
            System.out.println("oops,Username atau Password anda Salah");
        }
    }
    
    public void pengecekanLogin(String parUsername,String parPassword){
        cekAkun(parUsername,parPassword);
        hasilLogin(StatusAkun,parUsername);
    }
    
}
