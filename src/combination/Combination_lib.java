package combination;

public class Combination_lib {
	/*private int n;

	
	public Combination_lib(int n) {
		super();
		this.n = n;
	}*/

	public int getFactorial(int n) {
		int m = 1;
		for(int i = n; i > 0; i--) {
			m = m * i;
		}
		return m;
	}
	
}
