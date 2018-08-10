 interface calculate
{
	 void areaR(int side, int Top_side);
	 void areaC(int side,int radius);
	}

 class Test1 implements calculate
 {
	 public void areaR(int side,int top_side) 
	 {
		 System.out.println("area of Rectangle: "+ side *top_side);
		//int area=side*top_side;
	 }

 
	 public void areaC(int side, int radius) 
	 {
		 System.out.println("Area of Circle is:" + side*radius*radius);
		 //int area= side *radius*radius;
	 }
 }
