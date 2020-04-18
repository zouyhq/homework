package com.zou;

/**
 * 医院挂号
 * @author Administrator
 * @date 2020年4月18日
 */
public class Hospitalregister {
	
	public static void main(String[] args) {
		//允许挂号时间
		String [] registrationTime={"8:00","8:30","9:00","9:30","10:00","10:30","11:00",
				"14:00","14:30","15:00","15:30","16:00","16:30","17:0"};
		//已经挂号的时间,比如"9:30"
		String [] registeredTime = new String[registrationTime.length]; 
		registeredTime[0]="9:30";
		//病人挂号时间
		String [] registration={"9:30"};
		
		boolean flag1 = register(registrationTime,registeredTime,registration);
		System.out.println(flag1?"挂号不成功，此时间已有人挂号":"挂号成功，您的挂号时间为："+registration[0]);
	}
	
	public static boolean register(String [] registrationTime,String [] registeredTime,String [] registration) {
		boolean flag = false;
		for (int i = 0; i < registrationTime.length-1; i++) {
			if (registration[0].equals(registrationTime[i])) {
				for (int j = 0; j <registeredTime.length-1; j++) {
					if (registration[0].equals(registeredTime[j])) {
						flag = true;
					}
				}	
			}
		}
		return flag;
	}

}
