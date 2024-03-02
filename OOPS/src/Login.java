

class User{
    int id;
    String userName;
    String password;

    public User(){

    }

    public User(int id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class UserBO{

    private static User[] getUser(){

        User [] user = new User[5];

        user[0] = new User(101,"John","bcde");
        user[1] = new User(102,"Sham","xyz");
        user[2] = new User(103,"Jocob","per%");
        user[3] = new User(104,"Rul","rlss");
        user[4] = new User(105,"Ketsu","ks");

        return user;
    }

    private String encryptPassword(String password){


       String pass = "";
       for(int i=0; i< password.length(); i++){
           pass += (char)(password.charAt(i)+1);
       }
        System.out.println(pass);
       return pass;
    }


    public boolean validate(String name, String pass){

        User [] user =  getUser();

        for(int i=0 ; i< user.length ; i++){

           String uName = user[i].getUserName();
           String pwd = user[i].getPassword();

           if(uName.equals(name) && pwd.equals(encryptPassword(pass))){
               return true;
           }
        }
       return false;

    }
}

public class Login {
    public static void main(String[] args) {

        UserBO ub = new UserBO();
        boolean valid = ub.validate("John","abc");

        if(valid){
            System.out.println("Login Successful");
        }else{
            System.out.println("Incorrect username or password");
        }
    }
}
