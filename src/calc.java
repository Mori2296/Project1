class Calc
{
	int add()
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("sum is= "+sum);
	return sum;

}

int mul() 
{
	int a=2;
	int b=5;
	int product=a*b;
	System.out.println("product= " +product);
	return product;

}
int sub()
{
	int a=20;
	int b=40;
	int sub=a-b;
	System.out.println("value is= "+sub);
	return sub;
}
}
class TestCalc
{
	public static void main(String[] args) {
			Calc c=new Calc();
			int returnsum=c.add();
			int returnproduct=c.mul();
			int returnsub=c.sub();
			int sqadd= returnsum*returnsum;
			System.out.println("sqaure of added value="+sqadd);
			int sqsub= returnsub*returnsub;
			System.out.println("Square od subtracted value"+sqsub);
			int sqprod= returnproduct*returnproduct;
			System.out.println("Square of multiplied value"+sqprod);
	}
}