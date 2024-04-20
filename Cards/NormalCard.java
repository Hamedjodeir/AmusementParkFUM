package Cards;
import java.awt.*;
import javax.swing.*;

import Coins.NormalCoin;
import Coins.SpecialCoin;

public class NormalCard {
    public JPanel cardPanel = new JPanel();
    public JPanel cardPanelEditor = new JPanel();
    public final NormalCoin priceCoin1;
    public final NormalCoin priceCoin2;
    public final SpecialCoin specialCoin;
    public NormalCard(int level, Color priceCoinColor1, int priceCoinCount1, Color priceCoinColor2, int priceCoinCount2, Color specialCoinColor)
    {
        priceCoin1 = new NormalCoin(priceCoinColor1, priceCoinCount1);
        priceCoin2 = new NormalCoin(priceCoinColor2, priceCoinCount2);
        specialCoin = new SpecialCoin(specialCoinColor, 1);
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
        
        


        // nwe
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
        cardPanelEditor.add(filler1);
        cardPanelEditor.add(specialCoin.coinPanel);
        cardPanelEditor.add(filler2);
        cardPanelEditor.add(priceCoin1.coinPanel);
        cardPanelEditor.add(priceCoin2.coinPanel);
        cardPanelEditor.add(filler3);
        cardPanel.add(cardPanelEditor);
        
    }

}
