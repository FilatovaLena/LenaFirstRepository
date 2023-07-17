package lesson6;

public class PagesMain {
    public static void main(String[] args) {

//    Page loginScreen = new Page("Login", 1, "www.legion.com/login");
//    loginScreen.pageId = 1;
//    loginScreen.pageName = "login";
//    loginScreen.URL = "www.legion.com/login";

//    loginScreen.openPage();
//    loginScreen.clickButton ("login");
//    loginScreen.closePage();
//
//    Page aboutScreen = new Page();
////    aboutScreen.setPageId(2);
//        System.out.println( aboutScreen.getPageId());
//
//    aboutScreen.setPageName("about");
//    aboutScreen.setURL("www.legion.com/about");
//
//    aboutScreen.openPage();
//    aboutScreen.clickButton ("exit");
//    aboutScreen.closePage();
//
//
//
//    LoginPage loginPage = new LoginPage();
//    loginPage.setPageName("Login");
//    loginPage.setURL("www.com");
//
//    loginPage.openPage();
//    loginPage.setUserName("Fil");
//    loginPage.setPassword("@336");
//    loginPage.populatedCredentials();

//        Page page = new Page();
//        page.getDeveloperName();

        LoginPage loginPage = new LoginPage();
        loginPage.getDeveloperName();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();

    }
}
