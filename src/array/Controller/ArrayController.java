package array.Controller;
import array.Model.MarshmallowCreature;
import array.View.ArrayView;

public class ArrayController
{

	private int [][] myNumbers;
	private String [][] myNames;
	private MarshmallowCreature [][] myMonster;
	
	
	public ArrayController()
	{
		myNumbers = new int [3][3];
		myNames = new String [4][4];
		myMonster = new MarshmallowCreature[2][2];
	
		fillNames();
		fillMonsters();
		fillNumbers();
	}
	
	private void fillMonsters()
	{
		myMonster[0][0] = new MarshmallowCreature();
		myMonster[0][1] = new MarshmallowCreature("Palmer", 5, 6, 7, 9);
		
		myMonster[1][0] = new MarshmallowCreature();
		myMonster[1][1] = new MarshmallowCreature("class monster", 0,1,2,3);
		
		
		
	}
	private void fillNames()
	{
		
		myNames[0][0] = "Palmer";
		myNames[0][1] = "Kamran";
		myNames[0][2] = "Michael";
		myNames[0][3] = "Jordan";
		myNames[1][0] = "Manuel";
		myNames[1][1] = "Bella";
		myNames[1][2] = "Ben";
		myNames[1][3] = "Katy";
		myNames[2][0] = "Jed";
		myNames[2][1] = "Derek";
		myNames[2][2] = "Landon";
		myNames[2][3] = "Chloe";
		myNames[3][0] = "Rachel";
		myNames[3][1] = "Elise";
		myNames[3][2] = "Cole";
		myNames[3][3] = "Dalton";
	}
	
	private void fillNumbers()
	{
		myNumbers[0][0] = 1;
		myNumbers[0][1] = 10;
		myNumbers[0][2] = 11;
		myNumbers[1][0] = 18;
		myNumbers[1][1] = 100;
		myNumbers[1][2] = 12;
		myNumbers[2][0] = 13;
		myNumbers[2][1] = 7;
		myNumbers[2][2] = 8;
		
	}
	public void start()
	
	{
		ArrayView myView = new ArrayView();
		myView.printMonsterInformation(myMonster);
		myView.printIntInformation(myNumbers);
		myView.printStringInformation(myNames);
		
		
	}

}
