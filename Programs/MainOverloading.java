class MainOverloading
{
	public static void main(String[] args)
	{
		System.out.println("main with string[]");
	}
	public static void main(String args)
	{
		System.out.println("main with args");
	}
	public static void main()
	{
		System.out.println("main without args");
	}
}