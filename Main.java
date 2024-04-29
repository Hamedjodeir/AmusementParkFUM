import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

import Coins.*;
import Cards.*;
import SlotMachines.*;
import Players.Player;

public class Main {

	public static void main (String[] args) {
        

        Player player1 = new Player("Hamed");
        System.out.println(player1.getName());
        JFrame frame = new JFrame("Sina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1800, 1000);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        NormalCardToBuy card = new NormalCardToBuy(8, Color.RED, 5, Color.RED, 4, Color.black);
        NormalCardToBuy card2 = new NormalCardToBuy(1, Color.RED, 4, Color.RED, 4, Color.BLUE);
        NormalCardToBuy card3 = new NormalCardToBuy(2, Color.YELLOW, 9, Color.RED, 4, Color.YELLOW);
        NormalCardToBuy card4 = new NormalCardToBuy(4, Color.PINK, 2, Color.RED, 4, Color.WHITE);
        PrizeClawCard card5 = new PrizeClawCard(5, Color.RED, 3, Color.RED, 4);
        NormalCoin coin = new NormalCoin(Color.RED, 6);
        NormalCoin coin2 = new NormalCoin(Color.YELLOW, 6);
        NormalCoin coin3 = new NormalCoin(Color.PINK, 6);
        NormalCoin coin4 = new NormalCoin(Color.GRAY, 6);
        

        System.out.println(card.priceCoin1.numberOfCoins);

        

        panel.add(card.cardPanel);
        panel.add(card.getNormalCard().cardPanel);
        panel.add(card2.cardPanel);

        panel.add(card.getNormalCardToBuyFromReserve().cardPanel);

        panel.add(card4.cardPanel);

        panel.add(card5.cardPanel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
