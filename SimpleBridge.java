/*Problem 3. Simple Bridge Game

Write a program to mimic a simple bridge game. 
Each of the four players plays a card. The trick is won by the highest trump, 
or if there were none played, the highest card of the led suit.

Below is a sample run:

Card from W: 5s
Card from N: 7s
Card from E: Ks
Card from S: 6d
The trump suit: d
Who leads?: W
S wins the trick.
Hints:
A card can be represented by a combination of rank and suit. For example, "9s"
means 9 of spades. There are 13 ranks in descending order, i.e., 'A','K','Q',
'J','T', and '9'-'2', and four suits, i.e., spades('s'), hearts('h'), diamonds('d'),
and clubs('c'). 
In a bridge game, there can be either a trump suit or no trump suit ('nt'). The trump
suit dominates other suits. For example, 'As' beats 'Ah' when spades is the trump suit.
If there is no trump suit, the led suit dominates the others. For example, '5h' beats
'As' if hearts is the led suit and there is no trump suit. 

Four players are represented by their seats, i.e., 'W', 'N', 'E', and 'S'.
Me and my project partner made this (she did input while I did the switch case and if statements)
*/
import java.util.Scanner;

public class TestBridge {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
		
		int [] win = new int[4];

        String[] player = new String[4];

        player[0] = "N";
        player[1] = "E";
        player[2] = "S";
        player[3] = "W";

        String[] card = new String[4];

        String leadPlayer = "";
        String trumpSuit = "";
        String leadCard = "";

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + player[i] + ", what card do you want to play?");
            card[i] = input.nextLine();
        }

        System.out.println("Is there a trump suit? Enter T for yes, or NT for no.");
        String trump = input.nextLine();

        if (isTrump(trump)) {
            System.out.println("What is the trump suit?");
            trumpSuit = input.nextLine();
        }
        else {
            System.out.println("Who is the leading player?");
            leadPlayer = input.nextLine();
            trumpSuit = "N/A";
        }

        for (int i = 0; i < 4; i++) {
            if (leadPlayer.equals(player[i])) {
                leadPlayer = player[i];
                leadCard = card[i];
            }
        }

        System.out.println("The leading player is " + leadPlayer);
        System.out.println("Leading player " + leadPlayer + " has card " + leadCard);
        System.out.println("The trump suit is " + trumpSuit);
//The manipulation part, gets the int value for cards

int num = 0;
for(int j = 0; j<card.length;j++){
	
	num = card[j].charAt(0);
	switch (num){//north player card
		case 'T' :  win[j] = (84-26) + card[j].charAt(1); 
		break;
		case 'J':  win[j]= (73-14) + card[j].charAt(1);
		break;
		case 'Q':  win[j] =(81-22) + card[j].charAt(1);
		break;
		case 'K':  win[j]= (75-14) + card[j].charAt(1);
		break;
		case 'A':  win[j] = (65-3) + card[j].charAt(1);
		break;
		default :  win[j] = card[j].charAt(0) + card[j].charAt(1);
		break;
}

}

//The decision aspect of the bridge game for Trump 
int max = 0;
int i = 0;
String winner = "";
if(isTrump(trump)){
	
for( i = 0; i<card.length; i++){ //trump decision maker
		if(win[i] > max && card[i].charAt(1) == trumpSuit.charAt(0)){
			max = win[i];
			winner = player[i];
		}
}
}
else{
	for( i = 0; i<card.length; i++){//if there is no trump decision maker
		if(win[i] > max && card[i].charAt(1) == leadCard.charAt(1)) {
			max = win[i];
			winner = player[i];
		}
}
}
System.out.println("Winner is: " + winner);


    }
	
    public static boolean isTrump(String trump) {
        
        String yesTrump = "T";
        String noTrump = "NT";

        if (trump.equals(yesTrump)) {
            return true;
        }
        else if (trump.equals(noTrump)) {
            return false;
        }
        return false;
    }
}
