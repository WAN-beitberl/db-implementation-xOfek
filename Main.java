import java.util.*;


public class Main {

	public static void main(String[] args) {
		Table t = new Table(3);
		t.insertColumnNames("name", "last_name");
		t.insertRow("Israel", "Israeli");
		System.out.println(t.getValue("name", 1));
	}

}

class Table
{
	private String[][] Matrix;
	private int CurrentRow;
	
	public Table(int NumOfPeople)
	{
		this.CurrentRow = 0;
		this.Matrix = new String[NumOfPeople + 1][2];
	}
	
	public void insertColumnNames(String FirstCategory, String SecondCategory)
	{
		this.Matrix[0][0] = FirstCategory;
		this.Matrix[0][1] = SecondCategory;
		this.CurrentRow = 1;
	}
	
	public void insertRow(String FirstName, String LastName)
	{
		this.Matrix[CurrentRow][0] = FirstName;
		this.Matrix[CurrentRow][1] = LastName;
		this.CurrentRow++;
	}
	
	public String getValue(String Category, int Row)
	{
		// If category is in column 0
		if(this.Matrix[0][0] == Category)
		{
			return this.Matrix[Row][0];
		}
		
		else
		{
			return this.Matrix[Row][1];
		}
	}
}
