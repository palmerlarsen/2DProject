package array.View;

import array.Controller.ArrayController;
import array.Model.MarshmallowCreature;

public class ArrayView
{

	
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
	
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col] );
			}
			System.out.println();
		}
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("foreach printing");
		for(String [] currentRow: currentArray)
		{
			for(String currentName : currentRow)
			{
				System.out.print(currentName + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col] );
			}
			System.out.println();
		}
	}
	
	public void printMonsterInformation(MarshmallowCreature [][] currentArray)
	{
		System.out.println("foreach printing");
		for(MarshmallowCreature [] currentRow : currentArray)
		{
			for(MarshmallowCreature currentMonster : currentRow)
			{
				System.out.print(currentMonster.getname() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col].getname() + "\t");
			}
			System.out.println();
		}
	}
	
}