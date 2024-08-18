package array;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomPatternGenerator {

	public static void main(String[] args) {
		System.out.println(genRanNum());
		ran();

	}

	public static String genRanNum() {
		Random random = new Random();
		int ranNum = 100 + random.nextInt(999);
		return "SSC" + "-" + ranNum;
	}

	
	static void ran()
	{
		Set<String> ls=new HashSet<>();
		// creating dynamic Employee ID
        String empId = "SSC-";
        Random random = new Random();
        long randomNumber = 1000 + random.nextInt(999);
        empId = empId + randomNumber;
        ls.add(empId);
        System.out.println(ls);
	}
}
