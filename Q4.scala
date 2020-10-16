object Q4{
  
  def main(args: Array[String]){
  	var m=260.0f;
    var y=3850.0f;
    m = m + y/17600;
    var km = m*1.6009;
    var m = km*10000;
    
    println(km);
  }
}

