package HRSystem;
import java.util.Scanner;
public class CompanySystem {

	public static void main(String[] args) {
		while(true) {
			System.out.println("* * * * 歡迎進入公司系統 * * * *\r\n"
					+ "1 ) 登入\r\n"
					+ "2 ) 註冊\r\n"
					+ "0 ) 離開\r\n"
					+ "請輸入您的選擇 [ 1 , 2 , 0 ] :");
			Scanner scanner=new Scanner(System.in);
			int choose=scanner.nextInt();
			switch(choose){
			case 0:
				System.exit(0);
			case 1:
				System.out.print("\n請輸入工號 ( 部門一號碼 )：");
				String EmployeeID=scanner.next();
				System.out.println("\n輸入密碼 :");
				String Inputpassword=scanner.next();
				MemberService.login(EmployeeID, Inputpassword);
				
				
				break;
			case 2:
				System.out.print("請輸入姓名：");
				String name=scanner.next();
				System.out.print("\n謂輸入密碼：");
				String password=scanner.next();
				System.out.print("\n1 ) 資訊部門\r\n"
						+ "2 ) 人力資源\r\n"
						+ "3 ) 行銷部門\r\n"
						+ "請選擇部門：");
				String inputDepartment=scanner.next(),department;
				switch(inputDepartment) {
				case "1":
					department="IT";
					break;
				case "2":
					department="HR";
					break;
				case "3":
					department="MA";
					break;
				default:
					System.out.println("輸入錯誤");
					continue;
				}
				System.out.println("否為管理人員 [Y/n]?");
				String inputAdministrator=scanner.next(),administrator;
				if(inputAdministrator.equals("Y")||inputAdministrator.equals("y"))administrator="1";
				else if(inputAdministrator.equals("N")||inputAdministrator.equals("n"))administrator="0";
				else {
					System.out.println("輸入錯誤");
					continue;
				}
				GeneralStaff.general(name, password,department,administrator);
				
				//System.out.println(name+" "+password);//debug	
			}
			
		}

	}

}
