/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaprotocolos;

/**
 *
 * @author vinicius
 */
class User {
    private int id;
    private String name, address, gender, knowledege, subject;
    private byte[] picture;
    
    public User(int id, String name, String address, String gender, String knowledege, String subject, byte[]image)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.knowledege=knowledege;
        this.subject=subject;
        this.picture=image;
    }
    public int getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public String getaddress() {
        return address;
    }
    public String getgender() {
        return gender;
    }
    public String getknowledege() {
        return knowledege;
    }
    public String getsubject() {
        return subject;
    }
    public byte[] getImage(){
        return picture;
    }    
}
