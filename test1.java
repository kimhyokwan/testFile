package javaProject;

public class test1 {

	public static double hkMinus(Double inputValue){
      return - inputValue;
	}
	
	public static double hkRound(Double inputValue, int sequence){
		double multiValue = Math.pow(10,sequence);
      double result = Math.round(inputValue*multiValue)/multiValue;
      return result;
	}
	public static void main(String[] args){
		double test = 22.5244;
		double test2 = hkRound(test,2);
		System.out.println(test2);  //println("hello");
	}

}
