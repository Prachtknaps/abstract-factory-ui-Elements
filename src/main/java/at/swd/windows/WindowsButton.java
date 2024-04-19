package at.swd.windows;

import at.swd.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a Windows button.");
    }
}
