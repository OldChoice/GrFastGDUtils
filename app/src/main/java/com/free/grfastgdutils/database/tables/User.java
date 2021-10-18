package com.free.grfastgdutils.database.tables;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private int age;
    private String msa;
    @Generated(hash = 840000286)
    public User(Long id, String name, int age, String msa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.msa = msa;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMsa() {
        return this.msa;
    }
    public void setMsa(String msa) {
        this.msa = msa;
    }

}
