package week17;

public interface WebDriver {
    void get(String url);  // it is automatically public abstract
    void findElement(String locator);
    void quit();
    String getTitle();
}
