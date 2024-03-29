package stud1;

public class student {
	int rollNo;
	String phoneNo;
	String address;

	void sam(int r, String p, String add) {
		System.out.println(r + " " + p + " " + add);
	}

	void john(int r, String p, String add) {
		System.out.println(r + " " + p + " " + add);
	}

	public static void main(String[] args) {
		student obj1 = new student();
		student obj2 = new student();
		// System.out.println("rollNo " + "phoneNo " + "address ");
		obj1.sam(001, "6378572788", "kota");
		obj1.john(002, "9678572788", "jaipur");

	}

}
