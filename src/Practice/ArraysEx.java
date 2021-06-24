package Practice;

public class ArraysEx {

	public static void main(String[] args) {
		// Arrays Examples
		
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda" , "Honda","Mercides"};
		
		System.out.println(cars[5]);
		
		int[] number = {300,500, 600, 700, 800, 900};
		
		System.out.println(number[4] + number[5]+number[0]);
		
		String[]bikes = {"RoyalEnfield","SuzukiSumarai","KeneticActiva","HeroHonda"};
		System.out.println(bikes[2]);
		
		String[]bikes1 = {"RoyalEnfield","SuzukiSumarai","KeneticActiva","HeroHonda"};
		bikes1[0] ="RangerBicycle";
		System.out.println(bikes1[0]);
		
		String[] bikes2= {"RoyalEnfield","SuzukiSumarai","KeneticActiva","HeroHonda"};
		System.out.println(bikes2.length);
		
		String[] bikes3= {"RoyalEnfield","SuzukiSumarai","KeneticActiva","HeroHonda"};
		for (int i = 0; i < bikes3.length; i++) {
			  System.out.println(bikes3[i]);
		}
		
		String[] bikes4= {"RoyalEnfield","SuzukiSuzuki","KeneticActiva","HeroHonda"};
		for (String i : bikes4) {
			  System.out.println(i);
			}
		
		
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}, {8 , 9, 10} ,{11, 12 , 13, 14} };
		int x = myNumbers[3][0];
		System.out.println(x);
		
		int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers1.length; ++i) {
	      for(int j = 0; j < myNumbers1[i].length; ++j) {
	        System.out.println(myNumbers1[i][j]);
	      }
	    }
			
	}

}
