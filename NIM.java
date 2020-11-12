/* Author: Sanya Sharma
 * Last Modified: November 11, 2020 7:15pm
 * File Name: NIM
 * Purpose of the program: To play the game NIM with 2 player.   
 */

import java.util.Random;
import java.util.Scanner;
public class NIM {
	
	public static int[]setup(){//This method sets up four random piles of sticks(from 4 to 8) in an array of length 4. 
		System.out.println("Welcome to the game of NIM!! This game requires 2 players.\n----------------------------------------------------------");//Printing out introductions.
		System.out.println("This game is very simple to play.\n1. Each player gets turn to pick sticks from pile 1-4.The player to pick the last stick from the last pile loses.\n----------------------------------------------------------\n ");//Printing the instructions of the game. 
		int[]pile2= new int[4];//create an array to storage 4 integer values.
		Random r = new Random();
		for(int c=0;c<pile2.length;c++) {//An for loop to give each index of the array pile an random value from 4 to 8.
			pile2[c]=r.nextInt(5)+4 ;
		}
		return pile2; //Return the array to main 
	}
	public static void Display(int[]P) {//This method displays the number of sticks left in each pile. 
		for(int y=0;y<P.length;y++) {//Display the number of sticks in each pile as the players remove sticks . 
			System.out.print("Pile "+(y+1)+" = "+P[y]+"\t");
			}
	}

	public static void Player1turn(int[]P) {//This method receives an array of integer values.When the method Player1turn is called do the following:
		Scanner scan=new Scanner(System.in);
		System.out.println("\n\nPlayer 1: Pick a pile out of the 4 pile");//Prompt the player to pick a pile 
		int pileNo= scan.nextInt();//get the pile number
		int remove;//variable remove represents the number of sticks the player wants to remove from the pile. 
		boolean removeNocheck=true;//The variable removeNocheck represent the number of sticks that player wants o take out from the pile is possible.
		
		if(pileNo==1) {//if the first pile is picked:
			if(P[0]>0) {//if the number of sticks in the pile is greater than 0 do the following:
				System.out.println("How many stickes would you like to remove out of "+P[0]+" stickes?");//Prompt the user for how many sticks would they like to remove 
				remove=scan.nextInt();//get the number of sticks the player wants to remove
				removeNocheck=Check(P[0],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[0] and remove.
				if(removeNocheck=true) {
					P[0]=RemoveNumber(P[0],remove);//Call the method RemoveNumber and pass the values of P[0] and remove.
					}
					else {//if it's false:
					P[0]=-1;//make the value of this index -1.
					}
			}
			else {
				P[0]=-1;//if the pile is empty make it -1.
			}
		}

		else if (pileNo==2) {//if the second pile is picked:
			if(P[1]>0) {//if the number of sticks in the pile is greater than 0 do the following:
				System.out.println("How many stickes would you like to remove out of "+P[1]+" stickes?");//Prompt the user for how many sticks would they like to remove 
				remove=scan.nextInt();//get the number of sticks the player wants to remove
				removeNocheck=Check(P[1],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[1] and remove.
				if(removeNocheck=true) {
					P[1]=RemoveNumber(P[1],remove);//Call the method RemoveNumber and pass the values of P[1] and remove.
					}
					else {//if it's false:
					P[1]=-1;//make the value of this index -1.
					}
			}
			else {
				P[1]=-1;//if the pile is empty make it -1.
			}
		}
		else if(pileNo==3) {//if the third pile is picked:
			if(P[2]>0) {//if the number of sticks in the pile is greater than 0 do the following:
				System.out.println("How many stickes would you like to remove out of "+P[2]+" stickes?");//Prompt the user for how many sticks would they like to remove 
				remove=scan.nextInt();//get the number of sticks the player wants to remove
				removeNocheck=Check(P[2],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[2] and remove.
				if(removeNocheck=true) {
					P[2]=RemoveNumber(P[2],remove);//Call the method RemoveNumber and pass the values of P[2] and remove.
					}
					else {//if it's false:
					P[2]=-1;//make the value of this index -1.
					}
			}
			else {
				P[2]=-1;//if the pile is empty make it -1.
			}
		}
		else if(pileNo==4) {//if the fourth pile is picked:
			if(P[3]>0) {//if the number of sticks in the pile is greater than 0 do the following:
				System.out.println("How many stickes would you like to remove out of "+P[3]+" stickes?");//Prompt the user for how many sticks would they like to remove 
				remove=scan.nextInt();//get the number of sticks the player wants to remove
				removeNocheck=Check(P[3],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[3] and remove.
				if(removeNocheck=true) {
					P[3]=RemoveNumber(P[3],remove);//Call the method RemoveNumber and pass the values of P[3] and remove.
					}
					else {//if it's false:
					P[3]=-1;//make the value of this index -1.
					}
				}
				else {
					P[3]=-1;//if the pile is empty make it -1.
				}
			}
				
		else {
			System.out.println("Invaild Pile");//if the wrong pile number is types output Invalid Pile. 
			}
		}
			


public static void Player2turn(int[]P) {//This method receives an array of integer values.When the method Player2turn is called do the following:
	Scanner scan=new Scanner(System.in);
	System.out.println("\n\nPlayer 2: Pick a pile out of the 4 pile");//Prompt the player to pick a pile 
	int pileNo= scan.nextInt();//get the pile number
	int remove;//variable remove represents the number of sticks the player wants to remove from the pile. 
	boolean removeNocheck=true;//The variable removeNocheck represent the number of sticks that player wants to take out from the pile is possible.
	
	if(pileNo==1) {//if the first pile is picked:
		if(P[0]>0) {//if the number of sticks in the pile is greater than 0 do the following:
			System.out.println("How many stickes would you like to remove out of "+P[0]+" stickes?");//Prompt the user for how many sticks would they like to remove 
			remove=scan.nextInt();//get the number of sticks the player wants to remove
			removeNocheck=Check(P[0],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[0] and remove.
			if(removeNocheck=true) {
			P[0]=RemoveNumber(P[0],remove);//Call the method RemoveNumber and pass the values of P[0] and remove.
			}
			else {//if it's false:
			P[0]=-1;//make the value of this index -1.
			}
		}
		else {
			P[0]=-1;//if the pile is empty make it -1.
		}
	}

	else if (pileNo==2) {//if the second pile is picked:
		if(P[1]>0) {//if the number of sticks in the pile is greater than 0 do the following:
			System.out.println("How many stickes would you like to remove out of "+P[1]+" stickes?");//Prompt the user for how many sticks would they like to remove 
			remove=scan.nextInt();//get the number of sticks the player wants to remove
			removeNocheck=Check(P[1],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[1] and remove.
			if(removeNocheck=true) {
				P[1]=RemoveNumber(P[1],remove);//Call the method RemoveNumber and pass the values of P[1] and remove.
				}
				else {//if it's false:
				P[1]=-1;//make the value of this index -1.
				}
		}
		else {
			P[1]=-1;//if the pile is empty make it -1.
		}
	}
	else if(pileNo==3) {//if the third pile is picked:
		if(P[2]>0) {//if the number of sticks in the pile is greater than 0 do the following:
			System.out.println("How many stickes would you like to remove out of "+P[2]+" stickes?");//Prompt the user for how many sticks would they like to remove 
			remove=scan.nextInt();//get the number of sticks the player wants to remove
			removeNocheck=Check(P[2],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[2] and remove.
			if(removeNocheck=true) {
				P[0]=RemoveNumber(P[2],remove);//Call the method RemoveNumber and pass the values of P[2] and remove.
				}
				else {//if it's false:
				P[2]=-1;//make the value of this index -1.
				}
		}
		else {
			P[2]=-1;//if the pile is empty make it -1.
		}
}
		else if(pileNo==4) {//if the fourth pile is picked:
			if(P[3]>0) {//if the number of sticks in the pile is greater than 0 do the following:
				System.out.println("How many stickes would you like to remove out of "+P[3]+" stickes?");//Prompt the user for how many sticks would they like to remove 
				remove=scan.nextInt();//get the number of sticks the player wants to remove
				removeNocheck=Check(P[3],remove);//Check if it is possible to take out the number of sticks the player wants from the pile by calling the method check and passing it value of P[3] and remove.
				if(removeNocheck=true) {
					P[3]=RemoveNumber(P[3],remove);//Call the method RemoveNumber and pass the values of P[3] and remove.
					}
					else {//if it's false:
					P[3]=-1;//make the value of this index -1.
					}
			}
			else {
				P[3]=-1;//if the pile is empty make it -1.
			}
		}
			
	else {
		System.out.println("Invaild Pile");//if the wrong pile number is types output Invalid Pile. 
		}
	}

public static int RemoveNumber(int P,int S) {//This method removes number of sticks from pile chose by the player.It receives two integer values. 
	if((S<=P)&&(S>=0)) {//if the number of sticks the player wants to remove is less or equal to the total no of sticks and is greater than 0:
		P=P-S;//Remove it from the total number of sticks in that pile
	}
	else if((S>P)||(0>S)) {//if its greater than total number of sticks in the pile or less than 0 
		P=-1;//Make its value -1
	}
	return P;//return the value of P where then it get stored in the array. 
	
}

public static boolean Check(int P) {//This method checks if each value is filled or empty.It receives one integer value.
	boolean pile=true;
		if(P>0) {//if the number of sticks in the pile is greater than 0:
			pile=true;//its true
		}
		else if(P<=0){//if its 0 or less:
			pile=false;//its false
		}
		else {}
	return pile;//The value is than return and it's stores in an variable to track the status of each pile. 
}

public static boolean Check(int P, int S) {//This method checks if there are enough sticks t be removed from the chosen pile. It receives two integer values.
	boolean removeNocheck=true;//The variable removeNocheck represent the number of sticks that player wants o take out from the pile is possible.
	if(S<=P) {//if the number of sticks want to remove is less or equal to the total number present:
		removeNocheck=true;//It's possible
	}
	else if(S>P) {//if the number of sticks want to remove is greater than the total number present:
		removeNocheck=false;//It's not possible
	}
	else {}
	return removeNocheck;//The boolean value of removeNocheck is returned and then is evaluated to determine what will happen to the value of the specific index 
}

public static boolean DetermineLoser(int[]P) {//This method keeps track of when the game will end.
	boolean status = true;
	for(int c=0;c<P.length;c++) {//for loop to loop through the array status which tells us the status of each pile.
		if(P[c]<=0) {//if its 0 or less:
			status=false;//its false(empty)
		}
		else {//if it greater
			status=true;//it's not empty
		}
	}
	return status;//it returns the boolean value which is used to determine if the game should end or not. 
}

	public static void main(String[] args) {
		int round=0;//This variable keeps track of number of round of the game.
		boolean loser=false;//This variable keeps track of the loser. Once this is true the game will end and the loser will be output. 
		int[]pile=setup();//Call the method setup and store the integer value it returns.
		boolean[]pileStatus=new boolean[4];//Create an array of integer value of length 4. 
		
		while(loser==false) {//While the value of loser if false do the following:
		round=round+1;//Add one to round 
		System.out.println("Round "+round+"!!!!\n");//Output round
		Display(pile);//Display the number of sticks in each pile. 
		
		
		Player1turn(pile);//Pass the array pile to method player1turn
		pileStatus[0]=Check(pile[0]);//pass the values of each pile to check and receive it's boolean status which tells us if it's empty or not. 
		pileStatus[1]=Check(pile[1]);
		pileStatus[2]=Check(pile[2]);
		pileStatus[3]=Check(pile[3]);
		boolean status=DetermineLoser(pile);//Pass the array pile to determine if the player is a loser
		if((status==false)&&(pileStatus[0]==false)&&(pileStatus[1]==false)&&(pileStatus[2]==false)&&(pileStatus[3]==false)) {//If status and the status of all pile id false(means empty):
			loser=true;//loser became true and the while loop stops;
			System.out.println("Loser!!!!");
			}
		else {}//if not then continue with player2
		Display(pile);
		
		Player2turn(pile);
		pileStatus[0]=Check(pile[0]);
		pileStatus[1]=Check(pile[1]);
		pileStatus[2]=Check(pile[2]);
		pileStatus[3]=Check(pile[3]);	
		status=DetermineLoser(pile);
		if((status==false)&&(pileStatus[0]==false)&&(pileStatus[1]==false)&&(pileStatus[2]==false)&&(pileStatus[3]==false)) {
			loser=true;
			System.out.println("Loser!!!!");
			}
		else {}
		}
	}
}
