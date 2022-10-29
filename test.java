import Table.java;

public class test {

	public static void main(String[] args) {
		Table t = new Table();
		t.insertColumnNames("name", "last_name");
		t.insertRow("Israel", "Israeli");
		System.out.println(t.getValue("name", 1));
	}

}