package jp.learningdesing.javastudy;

public class BmiCalc {
/* BMI　（体格指数）を計算するプログラム
 * BMI ＝　体重 /　（身長　*　身長）
 * 体重　kg　身長　m
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 62;
		height = 171;
		
		height /= 100;
		//height = height / 100; の省略することが出来る！ 		
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
	}

}
