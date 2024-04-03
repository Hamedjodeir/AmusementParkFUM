package Coins;

import javax.swing.ImageIcon;
    
    public class SpecialCoin {
    public final ImageIcon picture;
    private final String color;

    public SpecialCoin(String color, String imageURL) {
        this.color = color;
        this.picture = new ImageIcon(imageURL);
    }

    public String getColor() {
        return color;
    }
}
