/*
 *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  *Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class UserModel {
    private String username;
    private String password;
    
    public String getUsername(){
        return this.username;
    }
     public void setUsername(String param_username){
         this.username=param_username;
     }
     public String getPassword(){
         return this.password;
     }
     public void setPassword(String param_password){
         this.password=param_password;
     }

    @Override
    public String toString() {
        return "UserModel{" + "username=" + username + ", password=" + password + '}';
    }
     
    
}
