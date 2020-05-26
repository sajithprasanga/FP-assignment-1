import scala.math.pow
import scala.math.Pi
object Q2{
	def main(args:Array[String])
	{
		print("Enter radius: ");
		val r = scala.io.StdIn.readDouble();
		
		val vol = (4/3)*math.Pi*pow(r,3);
		print(f"Volume: ${vol}%.3f");
	}
}