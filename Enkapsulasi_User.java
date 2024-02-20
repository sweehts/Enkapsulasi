
package enkapsulasi_user;

public class Enkapsulasi_User {

    
    public static void main(String[] args) {
        User safira =  new User("pcr wonu","wonuu");
        
        safira.setUsername("hhyy wonu");
        safira.setPassword("wonuu");
        safira.setId(1);
        safira.setStatus(false);
        
        System.out.println("Username: "+safira.getUsername());
        System.out.println("Password: "+safira.getPassword());
        System.out.println("Id: "+safira.getId());
        System.out.println("Status: "+safira.getStatus());
        
        
    }
    
}
