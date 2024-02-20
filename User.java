
package enkapsulasi_user;

public class User {
    private String username;
    private String password;
    private int id;
    private boolean status;//true : menikah, false : bm 
    
    public User(){
        System.out.println("Ini constructor");
    }
    public User(String a, String b){
        this.username = a;
        this.password = b;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setStatus(boolean status){
       this.status = status;
    }
    public boolean getStatus(){   
      return status;
        
   }
}
