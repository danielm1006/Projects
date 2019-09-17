/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmqnrgames;

/**
 *
 * @author dmqnr
 */
public class Game {
    private String name;
    private String developer;
    private double price;
    private Categories category;
    private int version;
    private double discount = 1.00;
    public static int numberOfGames;
    
    public Game(){
        this.name = "";
        this.developer = "";
        numberOfGames++;        
    }
    
    public Game(String name, String developer){
        this();
        this.name = name;
        this.developer = developer;
        version = 0;
    }
    
    public Game(String name, String developer, double price, Categories category){
        this(name, developer);
        this.price = price;
        this.category = category;
        version = 1;
    }
    
    public void setName(String name){
        this.name = name;
        version++;
    }
    
    public void setDeveloper(String developer){
        this.developer = developer;
        version++;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setCategory(Categories category){
        this.category = category;
        version++;
    }
    
    public void setDiscount(double discount){
        this.discount = discount;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDeveloper(){
        return developer;
    }
    
    public double getPrice(){
        return price * discount;
    }
    
    public Categories getCategory(){
        return category;
    }
    
    public int getVersion(){
        return version;
    }
}

