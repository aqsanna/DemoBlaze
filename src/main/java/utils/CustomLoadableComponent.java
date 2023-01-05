package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class CustomLoadableComponent<T extends  CustomLoadableComponent<T>> {
    private WebDriver driver;

    private static final int LOAD_TIMEOUT = 30;
    private static final int REFRESH_RATE = 2;

    @SuppressWarnings("unchecked")
    public T get() throws IOException {
        try {
            isLoaded();
            return (T) this;
        } catch (Error | IOException e) {
            // This is the extra line of code
            System.out.println("Error encountered during page load: " + e.getMessage());
            load();
        }

        isLoaded();

        return (T) this;
    }

    protected abstract void load();

    protected abstract void isLoaded() throws Error, IOException;


}
