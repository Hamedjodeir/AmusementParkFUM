package Players;

import Coins.*;
import Cards.*;
import SlotMachines.*;
import java.util.LinkedList;

public class Player {

    // Methods for validation
    private static boolean onlyAlphabetsAndSpaces(String s) {
        int l=0; 
        int sp=0; 
        if (s == null) {
           return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
           if ((Character.isLetter(s.charAt(i)) == true)) {
              l++;
           }
           if(s.charAt(i) == ' ') {
              sp++;
           }
        }
        if(l==0)
           return false;
        else
           return true;
    }
    private static boolean onlyDigits(String str, int n) { 

        for (int i = 0; i < n; i++) { 

            if (str.charAt(i) < '0'
                || str.charAt(i) > '9') { 
                return false; 
            } 
        } 
        return true; 
    }

    private String name;
    private static int numberOfPlayers = 0;
    private final int number;
    public int score;
    public LinkedList<NormalCard> normalCards = new LinkedList<>();
    public LinkedList<NormalCard> normalCardsReserved = new LinkedList<>();
    public LinkedList<PrizeClawCard> prizeClawCards = new LinkedList<>();
    public LinkedList<NormalCoin> normalCoins = new LinkedList<>();
    public LinkedList<SpecialCoin> specialCoins = new LinkedList<>();
    public int goldenCoinsCount = 0;
    public int totalCardsReservedCount = 0;

    // number of coins & special coins

    public int greenCoins = 0;
    public int whiteCoins = 0;
    public int blackCoins = 0;
    public int blueCoins = 0;
    public int redCoins = 0;

    public int specialGreenCoins = 0;
    public int specialWhiteCoins = 0;
    public int specialBlackCoins = 0;
    public int specialBlueCoins = 0;
    public int specialRedCoins = 0;

    public Player (String name) {
        setName(name);
        numberOfPlayers++;
        number = numberOfPlayers;
    }

    // setter
    public void setName(String name) {
        if (onlyAlphabetsAndSpaces(name) == true) {
            this.name = name;
        }
        else {
            System.out.println("name is not Valid. name must only contain alphabets and spaces");
        }
    }
    
    // getters
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    
    // Methods

    public void calculateCoins() {
        for (int j = 0; j < normalCoins.size(); j++) {
            switch (normalCoins.get(j).getColor()) {
                case "green":
                    greenCoins++;
                    break;
                case "white":
                    whiteCoins++;
                    break;    
                case "black":
                    blackCoins++;
                    break;
                case "blue":
                    blueCoins++;
                    break;
                case "red":
                    redCoins++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < specialCoins.size(); i++) {
            switch (specialCoins.get(i).getColor()) {
                case "green":
                    specialGreenCoins++;
                    break;
                case "white":
                    specialWhiteCoins++;
                    break;    
                case "black":
                    specialBlackCoins++;
                    break;
                case "blue":
                    specialBlueCoins++;
                    break;
                case "red":
                    specialRedCoins++;
                    break;
                default:
                    break;
            }
        }
    }

    public void removeNormalCoin(String color) {
        for (int j = 0; j < normalCoins.size(); j++) {
            if (color.equals(normalCoins.get(j).getColor())) {
                normalCoins.remove(j);
                break;
            }
        }
    }
    
}


