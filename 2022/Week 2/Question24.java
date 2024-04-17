// This is the class Answer
class Answer{
	// This is the default constructor of the class Answer
	Answer(){
		System.out.println("You got nothing.");
	}
	// This is a parameterized constructor of the class Answer
	Answer(int marks, String type){
		//The 'this()' referene variable is able to call the default constructor of the class.
		this();		
		//Print marks and type of the question
		System.out.println("You got "+marks+" for an "+ type);
	}
}
