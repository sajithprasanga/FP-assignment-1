object Q1{
	def main(args:Array[String])
	{
		
		print ("Enter the Celsius tempurature: ");
		var cel =scala.io.StdIn.readInt();
		val far = (cel*1.8000 + 32.00);
		
		println(f"Fahrenheit: ${far}%.2f");
		
	}
}