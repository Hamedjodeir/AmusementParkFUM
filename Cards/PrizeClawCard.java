package Cards;

import java.awt.*;
import javax.swing.*;

public class PrizeClawCard {
    public JPanel cardPanel = new JPanel();
    public JPanel cardPanelEditor = new JPanel();
    public PrizeClawCard(int level)
    {
        
        cardPanelEditor.setLayout(null);
        cardPanelEditor.setPreferredSize(new Dimension(100, 150));
        cardPanelEditor.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        cardPanelEditor.setBackground(Color.GREEN);

        JLabel cardLevelLabel = new JLabel();
        cardLevelLabel.setText(String.valueOf(level));
        cardLevelLabel.setBounds(0, 0, 20, 20);
        cardLevelLabel.setLocation(7, 8);   
        cardLevelLabel.setFont(new Font("Dialog", Font.BOLD, 25));


        cardPanelEditor.add(cardLevelLabel);
        cardPanel.add(cardPanelEditor);
    }
}
