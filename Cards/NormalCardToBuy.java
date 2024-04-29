package Cards;
import java.awt.*;
import javax.swing.*;

import Coins.NormalCoin;
import Coins.SpecialCoin;

public class NormalCardToBuy {
    public JPanel cardPanel = new JPanel();
    public JPanel cardPanelEditor = new JPanel();
    public final NormalCoin priceCoin1;
    public final NormalCoin priceCoin2;
    public final SpecialCoin specialCoin;

    // Attributes
    public int level;
    public Color priceCoinColor1;
    public Color priceCoinColor2;
    public int priceCoinCount1;
    public int priceCoinCount2;
    public Color specialCoinColor;
    public NormalCardToBuy(int level, Color priceCoinColor1, int priceCoinCount1, Color priceCoinColor2, int priceCoinCount2, Color specialCoinColor)
    {
        setLevel(level);
        setPriceCoinColor1(priceCoinColor1);
        setPriceCoinColor2(priceCoinColor2);
        setPriceCoinCount1(priceCoinCount1);
        setPriceCoinCount2(priceCoinCount2);
        setSpecialCoinColor(specialCoinColor);
        priceCoin1 = new NormalCoin(priceCoinColor1, priceCoinCount1);
        priceCoin2 = new NormalCoin(priceCoinColor2, priceCoinCount2);
        specialCoin = new SpecialCoin(specialCoinColor, 1);
        // card Panel Editor
        cardPanelEditor.setLayout(new FlowLayout());
        cardPanelEditor.setPreferredSize(new Dimension(100, 170));
        cardPanelEditor.setMaximumSize(new Dimension(100, 170)); // Ensure the max size is respected
        cardPanelEditor.setBackground(Color.GREEN);
        
        // Card Panel
        cardPanel.setBackground(Color.BLACK);
        cardPanel.setMaximumSize(new Dimension(100, 170));
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
        filler2.setPreferredSize(new Dimension(90, 4));
        filler2.setMaximumSize(new Dimension(90,4)); // Ensure the max size is respected
        filler2.setBackground(Color.GREEN);

        JButton buyButton = new JButton("Buy");
        JButton reserveButton = new JButton("Resereve");

        JPanel filler3 = new JPanel();
        filler3.setPreferredSize(new Dimension(90, 7));
        filler3.setMaximumSize(new Dimension(90, 7)); // Ensure the max size is respected
        filler3.setBackground(Color.GREEN);

        JPanel filler4 = new JPanel();
        filler4.setPreferredSize(new Dimension(15, 15));
        filler4.setMaximumSize(new Dimension(100, 150)); // Ensure the max size is respected
        filler4.setBackground(Color.GREEN);

        cardPanelEditor.add(cardLevelLabel);
        cardPanelEditor.add(filler1);
        cardPanelEditor.add(specialCoin.coinPanel);
        
        cardPanelEditor.add(filler2);
        cardPanelEditor.add(buyButton);
        cardPanelEditor.add(reserveButton);
        cardPanelEditor.add(filler3);
        cardPanelEditor.add(priceCoin1.coinPanel);
        cardPanelEditor.add(priceCoin2.coinPanel);
        cardPanelEditor.add(filler4);
        cardPanel.add(cardPanelEditor);
        
    }

    // setters
    public void setLevel(int level) {
        this.level = level;
    }
    public void setPriceCoinColor1(Color priceCoinColor1) {
        this.priceCoinColor1 = priceCoinColor1;
    }
    public void setPriceCoinColor2(Color priceCoinColor2) {
        this.priceCoinColor2 = priceCoinColor2;
    }
    public void setPriceCoinCount1(int priceCoinCount1) {
        this.priceCoinCount1 = priceCoinCount1;
    }
    public void setPriceCoinCount2(int priceCoinCount2) {
        this.priceCoinCount2 = priceCoinCount2;
    }
    public void setSpecialCoinColor(Color specialCoinColor) {
        this.specialCoinColor = specialCoinColor;
    }
    // mehtods

    public NormalCard getNormalCard() {
        NormalCard normalCard = new NormalCard(this.level, this.priceCoinColor1, this.priceCoinCount1, this.priceCoinColor2, this.priceCoinCount2, this.specialCoinColor);
        return normalCard;
    }
    public NormalCardToBuyFromReserve getNormalCardToBuyFromReserve() {
        NormalCardToBuyFromReserve normalCard = new NormalCardToBuyFromReserve(this.level, this.priceCoinColor1, this.priceCoinCount1, this.priceCoinColor2, this.priceCoinCount2, this.specialCoinColor);
        return normalCard;
    }
}
