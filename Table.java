public class Table
{
	private String Matrix[][];
	private int CurrentRow;
	
	private void insertColumnNames(String FirstCategory, String SecondCategory)
	{
		this.Matrix[0][0] = FirstCategory;
		this.Matrix[0][1] = SecondCategory;
		this.CurrentRow = 1;
	}
	
	private void insertRow(String FirstName, String LastName)
	{
		this.Matrix[CurrentRow][0] = FirstName;
		this.Matrix[CurrentRow][1] = LastName;
		this.CurrentRow++;
	}
	
	private String GetValue(String Category, int Row)
	{
		// If category is in row 0
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