/*
  by using setter and getter method we can archive encapsulation
*/
  class EncapsulationDemo1 
{
	
		private int a =10;
		private String s ="manu";

      //setter method
	  public void setA(int a){
		this.a=a;
	  }
	  //getter
	  public int getA(){
		return a;
	  }
	  //setter method
	  public void setS(String s){
		this.s=s;
	  }
	  //getter
	  public String getS(){
		return s;
	  }
   public static void main(String[] args) 
	{
      EncapsulationDemo1 demo = new EncapsulationDemo1();
	  System.out.println("===without encapsulation====");
     System.out.println(demo.a);
	  System.out.println(demo.s);
	  System.out.println("===with encapsulation====");
	  demo.setA(200);
	  demo.setS("dev2");
	  System.out.println(demo.a);
	  System.out.println(demo.s);
	}
}
