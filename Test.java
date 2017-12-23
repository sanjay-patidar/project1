class Test
{
	public static void main(String[] args)
	{
	for(int i=0;i<=args.length;i++)
	{
	System.out.println(args[i]);
	}
	}
}

//javac Test.java
//java Test a b c  o/p-a b c RE:AIOOBE
//java Test a b    o/p-a b RE:AIOOBE
//java Test        o/p- RE:AIOOBE