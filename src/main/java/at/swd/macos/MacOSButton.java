package at.swd.macos;

import at.swd.Button;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a MacOS button.");
    }
}
