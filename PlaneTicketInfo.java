package com.zou;

/**
 * @author Administrator
 * @date 2020年4月12日
 */
public class PlaneTicketInfo {

	public static void main(String[] args) {
		//航班号
			String FLT = "HX 497";
		//登机日期
			String date = "19MAY";
		//登机口
			String gate = "DO5";
		//登机时间
			String BDT = "07:40";
		//座位号
			String seat = "14A";
		//乘客姓名	
			String passengerName = "ZOUQINGYANG";
			
		//println输出	
			System.out.println("机票信息");
			System.out.println("航班号："+FLT);
			System.out.println("登机日期："+date);
			System.out.println("登机口："+gate);
			System.out.println("登机时间："+BDT);
			System.out.println("座位号："+seat);
			System.out.println("乘客姓名："+passengerName);

	}

}