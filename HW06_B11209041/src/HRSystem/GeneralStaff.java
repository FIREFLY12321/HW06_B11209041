package HRSystem;
import java.util.Arrays;
public class GeneralStaff {
	public static String data[]= {};
	public static int employeeNumCounter=0,ITEmployeeCounter=0,HREmployeeCounter=0,MAEmployeeCounter=0;
	
	public static void general(String name, String password,String department,String isAdministrator) {
		data = Arrays.copyOf(data, data.length + 5);
		data[data.length - 5] = name; // Assign name to the second last element
		data[data.length-4]=password;// Assign name to the last element
		data[data.length-3]=department;
		data[data.length-2]=isAdministrator;
		switch(department) {
		case "IT":
			data[data.length-1]= ++ITEmployeeCounter+"";
			break;
		
		case "HR":
			data[data.length-1]= ++HREmployeeCounter+"";
			break;
		case "MA":
			data[data.length-1]= ++MAEmployeeCounter+"";
			break;
		
		}
		employeeNumCounter++;
		//data[data.length-1]=department;
		System.out.println("註冊成功");
	    System.out.println(Arrays.toString(data));
	}
}
