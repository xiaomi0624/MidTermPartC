
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    
      
    
    public static void main(String[] args) {
    
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        
        String name = in.nextLine();
        
        
        for (int i=0;i<UserProfile.genres.length;i++){
            System.out.println(i+":"+UserProfile.genre[i]);
         
        }  
        
        for( int i =0; i<4; i++){
            System.out.println("Enter the number of the genre: ");
            int numGenre = in.nextInt();
            
        }
                     
                   
        UserProfile stuPro = new UserProfile();
        
        System.out.println("your profile is created: "+stuPro);
                
    }
    
}
