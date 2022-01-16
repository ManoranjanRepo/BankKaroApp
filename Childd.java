class  Parentt
{
	int a =10;
	int b=20;
}
class Childd extends Parentt
{
	int a =20;
	int b =30;

	public void add(int a,int b){
		System.out.println(a+b);//3000
		System.out.println(this.a+this.b);//50
		System.out.println(super.a+super.b);//30
	}
	public static void main(String[] args){
		Childd c = new Childd();
		c.add(1000,2000);
	}

}
