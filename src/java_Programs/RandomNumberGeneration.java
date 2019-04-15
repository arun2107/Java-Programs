package java_Programs;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {

		Random ran=new Random();
		System.out.println(ran.nextInt(1000));
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextBoolean());
	}

}
