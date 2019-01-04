/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vinicius
 */
public class User {
    
    private byte[] picture;
    
    public User(byte[]image )
    {
        this.picture=image;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public byte[] getImage(){
        return picture;
    }
}
