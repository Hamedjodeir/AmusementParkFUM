package Coins;

import java.awt.*;
import javax.swing.*;
import shapes.CirclePanel;

public class NormalCoin {
    public int numberOfCoins = 0;
    private final Color color;
    public JPanel coinPanel = new JPanel(new BorderLayout());
    public JPanel coinPanelEditor = new JPanel();

    public NormalCoin(Color color, int numberOfCoins) {
        this.color = color;
        this.numberOfCoins = numberOfCoins;
        coinPanelEditor.setLayout(null);
        coinPanelEditor.setPreferredSize(new Dimension(30, 30));
        coinPanelEditor.setMaximumSize(new Dimension(30, 30)); // Ensure the max size is respected
        coinPanelEditor.setBackground(color);

        coinPanel.setBackground(Color.BLUE);
        coinPanel.setMaximumSize(new Dimension(30, 30));

        JLabel coinNumberLabel = new JLabel();
        coinNumberLabel.setText(String.valueOf (numberOfCoins));
        coinNumberLabel.setBounds(0, 0, 20, 20);
        
        coinNumberLabel.setLocation(9, 5);   
        coinNumberLabel.setFont(new Font("Dialog", Font.BOLD, 20));


        coinPanelEditor.add(coinNumberLabel);
        coinPanel.add(coinPanelEditor, BorderLayout.CENTER);
    }

    public String getColor() {
        return String.valueOf(color);
    }
}
