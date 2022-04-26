class Test
{

     public static void main(String...args)
       {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	System.out.println("Addition of  " + a  + " and " + b + " is " + (a+b));
	System.out.println("Subtraction of  " + a  + " and " + b + " is " + Math.abs((a-b)));
	System.out.println("Multiplication of  " + a  + " and " + b + " is " + (a*b))
;	System.out.println("Division of  " + a  + " and " + b + " is " + (a/b));
   
       }


}