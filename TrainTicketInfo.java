package com.zou;

/**
 * @author AdminIstrator
 * @date 2020年4月12日
 */
public class TrainTicketInfo {

	public static void main(String[] args) {
		//火车名称
			String trainName = "G121列车";
		//发车时间
			String departureTime = "10.28";
		//到达时间
			String arrivalTime = "16.28";
		//始发站
			String departureStation = "北京南站";
		//终到站
			String arrivalStation = "无锡东站";
		//火车票价	
			double trainFare = 385.0;
		//座位号
			String seat = "08车10F号";
		//乘客姓名
			String passengerName = "邹清杨";
		 //乘客身份证
			String passengerID = "433127********7833";
		//pringln输出
			System.out.println("火车票信息");
			System.out.println("火车班次："+trainName);
			System.out.println("发车时间："+departureTime+"  "+"到达时间："+arrivalTime);
			System.out.println("始发站："+departureStation+"  "+"终点站"+arrivalStation);
			System.out.println("火车票价："+trainFare);
			System.out.println("座位号："+seat);
			System.out.println("乘客姓名："+passengerName);
			System.out.println("乘客身份证："+passengerID);
	}

}
