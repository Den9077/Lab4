
package ca.sait.services;

import ca.servlets.models.User;

/**
 *Service provider for accont
 * @author Kyumin
 */
public class AccountService {
    public AccountService() {
        
    }
    
   
    
    public User login(String username, String password){
//        if(username == null)
//            return null;
        
        if ("abe".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        } else if ("barb".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
            
        }
}
 