/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskJava1;

/**
 *
 * @author aryap
 */
public class Main {
    public static void main(String[] args) {
        // Initiate Biodata Class
        Biodata bio = new Biodata();
        
        // Recall Full Name
        bio.getFullName();
        System.out.println("Full Name : " + bio.getFullName());
        
        // Recall Birthplace
        bio.getBirthPlace();
        System.out.println("Birthplace : " + bio.getBirthPlace());
        
        // Recall Birthdate
        bio.getBirthDate();
        System.out.println("Birthdate : " + bio.getBirthDate());
        
        // Recall Hobby
        bio.getHobby();
        System.out.println("Hobby : " + bio.getHobby());
        
        // Recall Zodiac
        bio.getZodiac();
        System.out.println("Zodiac : " + bio.getZodiac());
        
        // Recall Favorite Food
        bio.getFavoriteFood();
        System.out.println("Favorite Food : " + bio.getFavoriteFood());
        
        // Recall Dream Job
        bio.getDreamJob();
        System.out.println("Dream Job : " + bio.getDreamJob());
    }
}
