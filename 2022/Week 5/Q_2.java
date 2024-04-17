//Create a class B, which implements the interface GCD.
class B implements GCD {
    int num1,num2;
        
    //Create a method to calculate GCD
    public int findGCD(int num1, int num2){
		if(num1==0&& num2==0) {
			return -1;
		}
		else if(num2 == 0){
			return num1;
		}
		
		else {
			return findGCD(num2, num1%num2);
		}
        }
 }