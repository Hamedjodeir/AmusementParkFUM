import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

import Coins.*;
import Cards.*;
import SlotMachines.*;
import Players.*;

public class Main {
	public static void main (String[] args) {
        Player player1 = new Player("Hamed");
        System.out.println(player1.getName());
        JFrame frame = new JFrame("HAMED");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1800, 1000);
        

        NormalCard card = new NormalCard(2);
        frame.add(card.cardPanel);
        frame.setVisible(true);
    }
}
