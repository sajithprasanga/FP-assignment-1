object Q3{
	def main(args:Array[String]){
		cost(60);	
	}

	def cost(con:Int):Unit={
		var covpri = 24.95;
		var dis = 24.95-(24.95*0.4);
		if(con>50){
			var bala = (covpri*con)-(covpri*con*0.4)+(50*3)+((con-50)*0.75);
			println(f"Cost of copies: ${bala}%.2f");
			
		}else{
			var bala = (covpri*con)-(covpri*con*0.4)+(con*3.00);
			println(f"Cost of copies: ${bala}%.2f");
		}
	}
}