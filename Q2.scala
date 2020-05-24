import scala.math.pow
object Q2{
	def main(args:Array[String])
	{
		print("Enter radius: ");
		val r = scala.io.StdIn.readDouble();
		volume(r);
	}
	
	def volume(r:Double):Unit={
		val pi=3.418;
		val vol = (4/3)*pi*pow(r,3);
		print(f"Volume: ${vol}%.3f");
	}
}