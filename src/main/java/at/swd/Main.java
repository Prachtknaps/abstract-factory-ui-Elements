package at.swd;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name");

        if (osName.toLowerCase().contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}