package lesson6;

    public class LoginPage extends Page implements PageInterface {

        private String username;
        private String password;


        public void populatedCredentials() {
            System.out.println(String.format("Credentials are populated; %s, %s", username, password));
        }

        public String getUserName() {
            return username;
        }



        public void setUserName(String userName) {
            this.username = userName;
        }


        public String getPassword() {
            return password;
        }


        public void setPassword(String password) {
            this.password = password;
        }



        public void getDeveloperName(){
            System.out.println("John");
    }
    }
