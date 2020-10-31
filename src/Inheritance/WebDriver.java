package Inheritance;
/*
Browsers task:
    1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
    2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
    3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
    4. create a class called Opera browser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the get & close actions

 */
public class WebDriver {



    public void get(String URL){
        System.out.println("Opening the URL: "+URL+" in the default browser");
    }

    public void close(String browser){
        System.out.println("Close the "+ browser+" browser");
    }

}
