package ex9;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int value) {
	  if (value == 1){
	    return false;
	  }
	  for (int i = 2; i <= Math.sqrt(value); i++) {
	    if (value % i == 0) {
	      return false;
	    }
	  }
	  return true;
	}
}
