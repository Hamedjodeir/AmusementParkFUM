package Cards;
import java.awt.*;
import javax.swing.*;

import Coins.NormalCoin;
import Coins.SpecialCoin;

public class PrizeClawCard {
    public JPanel cardPanel = new JPanel();
    public JPanel cardPanelEditor = new JPanel();
    public final NormalCoin priceCoin1;
    public final NormalCoin priceCoin2;
    
    public PrizeClawCard(int level, Color priceCoinColor1, int priceCoinCount1, Color priceCoinColor2, int priceCoinCount2)
    {
        priceCoin1 = new NormalCoin(priceCoinColor1, priceCoinCount1);
        priceCoin2 = new NormalCoin(priceCoinColor2, priceCoinCount2);
        
        // card Panel Editor
        cardPanelEditor.setLayout(new FlowLayout());
        cardPanelEditor.setPreferredSize(new Dimension(100, 150));
        cardPanelEditor.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        cardPanelEditor.setBackground(Color.GREEN);
        
        // Card Panel
        cardPanel.setBackground(Color.BLACK);
        cardPanel.setMaximumSize(new Dimension(100, 150));
        cardPanelEditor.setBorder(BorderFactory.createLineBorder(Color.black));

        // Level Lable
        JLabel cardLevelLabel = new JLabel();
        cardLevelLabel.setText(String.valueOf(level));
        cardLevelLabel.setBounds(0, 0, 30, 30);
        cardLevelLabel.setLocation(6, 6);   
        cardLevelLabel.setFont(new Font("Dialog", Font.BOLD, 27));

        JLabel cardLevelLabel2 = new JLabel();
        cardLevelLabel2.setText(String.valueOf(6));
        cardLevelLabel2.setBounds(0, 0, 30, 30);
        cardLevelLabel2.setLocation(6, 6);   
        cardLevelLabel2.setFont(new Font("Dialog", Font.BOLD, 27));
        
        // prize label
        JLabel prizeLabe2 = new JLabel();
        prizeLabe2.setText(" PRIZE");
        prizeLabe2.setBounds(0, 0, 10, 10);  
        prizeLabe2.setFont(new Font("Dialog", Font.BOLD, 20));


        // fillers
        JPanel filler1 = new JPanel();
        filler1.setPreferredSize(new Dimension(27, 25));
        filler1.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        filler1.setBackground(Color.GREEN);
        
        JPanel filler2 = new JPanel();
        filler2.setPreferredSize(new Dimension(90, 55));
        filler2.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        filler2.setBackground(Color.GREEN);

        JPanel filler3 = new JPanel();
        filler3.setPreferredSize(new Dimension(15, 15));
        filler3.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        filler3.setBackground(Color.GREEN);

        cardPanelEditor.add(cardLevelLabel);
        cardPanelEditor.add(prizeLabe2);
        
        cardPanelEditor.add(filler2);
        cardPanelEditor.add(priceCoin1.coinPanel);
        cardPanelEditor.add(priceCoin2.coinPanel);
        cardPanelEditor.add(filler3);
        cardPanel.add(cardPanelEditor);
        
    }

}
