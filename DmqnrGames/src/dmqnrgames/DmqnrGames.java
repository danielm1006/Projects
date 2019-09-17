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
public class DmqnrGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game1 = new Game("Football Manager 2019", "Sports Interactive");
        game1.setPrice(49.99);
        game1.setCategory(Categories.SPORTS);
        
        Game game2 = new Game("The Witcher: Enhacned Edition Director's Cut", "CD PROJECT RED");
        game2.setPrice(9.99);
        game2.setCategory(Categories.RPG);
        game2.setDiscount(0.69);
        
        Game game3 = new Game();
        game3.setName("Mittelborg City of Mages");
        game3.setDeveloper("Armatur Games");
        game3.setPrice(14.99);
        game3.setCategory(Categories.STRATEGY);
        game3.setDiscount(0.9);
        
        //additional games
        
        Game game4 = new Game("Minecraft", "Mojang");
        game4.setPrice(20.99);
        game4.setCategory(Categories.INDIE);
        game4.setDiscount(.50);
        
        Game game5 = new Game();
        game5.setName("Cyberpunk 2077");
        game5.setDeveloper("CD Project Red");
        game5.setPrice(59.99);
        game5.setCategory(Categories.RPG);
        
        
        System.out.println("Game 1:");
        System.out.println("Name: " + game1.getName());
        System.out.println("Develper: " +  game1.getDeveloper());
        System.out.println("Price: " + game1.getPrice());
        System.out.println("Category: " + game1.getCategory());
        System.out.println("Version: " + game1.getVersion());
        
        System.out.println("\nGame 2:");
        System.out.println("Name: " + game2.getName());
        System.out.println("Develper: " +  game2.getDeveloper());
        System.out.println("Price: " + game2.getPrice());
        System.out.println("Category: " + game2.getCategory());
        System.out.println("Version: " + game2.getVersion());
        
        System.out.println("\nGame 3:");
        System.out.println("Name: " + game3.getName());
        System.out.println("Develper: " +  game3.getDeveloper());
        System.out.println("Price: " + game3.getPrice());
        System.out.println("Category: " + game3.getCategory());
        System.out.println("Version: " + game3.getVersion());
        
        System.out.println("\nGame 4:");
        System.out.println("Name: " + game4.getName());
        System.out.println("Develper: " +  game4.getDeveloper());
        System.out.println("Price: " + game4.getPrice());
        System.out.println("Category: " + game4.getCategory());
        System.out.println("Version: " + game4.getVersion());
        
        System.out.println("\nGame 5:");
        System.out.println("Name: " + game5.getName());
        System.out.println("Develper: " +  game5.getDeveloper());
        System.out.println("Price: " + game5.getPrice());
        System.out.println("Category: " + game5.getCategory());
        System.out.println("Version: " + game5.getVersion());
        
        
        System.out.println("\nNumber of Games: " + Game.numberOfGames);
        
    }
    
}
