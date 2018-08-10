
public class Test {

	public int a,b,c;
	public int demo()
	{
		
	System.out.println("addtion is: ");
	return a+b;
	
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Test t1=new Test();
		Test t=t1;
		t.a=10;
		t.b=20;
		
	System.out.println("Addtion is:"+ t.demo());
		
	}

}
