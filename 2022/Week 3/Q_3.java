//Create a derived class constructor which can call the one parametrized constructor of the base class
//Create a derived class constructor which can call the two parametrized constructor of the base class
//Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape

	double height;
	Test1(double length,double h) {

		super(length);
		height=h;
	}
	
	Test1(double length,double breadth,double h) {

		super(length,breadth);
		height=h;
	}

	double calculate()	{
		return length*breadth*height;
	}