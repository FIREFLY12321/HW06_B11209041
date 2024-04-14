package HRSystem;

public class MemberService {
	public static boolean login(String departmentAndID,String inputPassword) {
		//String[] str1=departmentAndID.split("-");
		String department=departmentAndID.split("-")[0],ID=departmentAndID.split("-")[1];
		System.out.println(department+" "+ID);
		int Index=Integer.parseInt(ID)-1;
		System.out.println("Index:"+ID);
		
		for(int i=0;i<GeneralStaff.data.length;i+=5) {
			if(GeneralStaff.data[i+2].equals(department)&&
					GeneralStaff.data[i+4].equals(String.valueOf(Integer.parseInt(ID)))) {
				if(GeneralStaff.data[i+1].equals(inputPassword)){
					String outputID="";
					for(int j=0;j<=5-ID.length();j++) {
						outputID+="0";
					}
					outputID+=ID;
					System.out.printf("姓名：%s\n部門：%s\n工號：%s\n",GeneralStaff.data[i],
							GeneralStaff.data[i+2],outputID);
					
					return true;
				}
				else {
					System.out.println("密碼錯誤");
					return false;
				}
				
				
			}
		}
		System.out.println("查無此員工");
		return false;
		
		/*
		if(GeneralStaff.data[4*Index+1].equals(inputPassword)) {
			System.out.printf("姓名：%s\n部門：%s\n工號：%s\n",GeneralStaff.data[Index*4],
					GeneralStaff.data[4*Index+2],ID);
			return true;
		}
		else if()*/
		
			
			//return false;
		
		
	}
}
