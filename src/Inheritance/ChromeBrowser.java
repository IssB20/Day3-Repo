package Inheritance;

public class ChromeBrowser extends WebDriver {

    public ChromeBrowser(String URL, String browser){
        get(URL);
        close(browser);
    }

}

