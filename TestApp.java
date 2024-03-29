package caal1;

class calculator {
	int n1;
	int n2;

	calculator() {

	}

	void add(int n1, int n2) {
		System.out.println("addtion is = " + (n1 + n2));
	}

	void multiply(int n1, int n2) {
		System.out.println("multiply is = " + (n1 * n2));
	}

	void add(float n1, float n2) {
		System.out.println("addition is = " + (n1 + n2));
	}

	void multiply(float n1, float n2) {
		System.out.println("multiply is = " + (n1 * n2));
	}

	static void main(String[] args) {

	}

}

class TestApp extends calculator {
	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.add(10, 20);
		c1.add(1.5f, 1.5f);
	}
}
