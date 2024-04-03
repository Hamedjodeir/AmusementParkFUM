package Coins;

import javax.swing.ImageIcon;

public class NormalCoin {
    public final ImageIcon picture;
    private final String color;

    public NormalCoin(String color, String imageURL) {
        this.color = color;
        this.picture = new ImageIcon(imageURL);
    }

    public String getColor() {
        return color;
    }
}
