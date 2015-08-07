import java.util.HashMap;
import java.util.*;


public class HahsMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	myMap.put(3, "three");
	myMap.put(4, "four");
	myMap.put(7, "seven");
	myMap.put(5, "five");
	
	Scanner scan = new Scanner(System.in);
	String opted="Y";
	String value;
	
	while(opted.equalsIgnoreCase("Y")){
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		
		if (myMap.containsKey(num) == true){
			value = myMap.get(num);
			System.out.println("Response: you entered " + value);
		}else{
			System.out.println("Add key to map? y/n ");
			opted = scan.next();
			if(opted.equalsIgnoreCase("Y")){
				System.out.println("enter a value: ");
				value = scan.next();
				myMap.put(num,value);
			}else{
				System.out.println("Bbye");
				break;
			}
		}
		System.out.println("Do you wish to continue? y/n");
		opted = scan.next();
		}
	
	}

}
