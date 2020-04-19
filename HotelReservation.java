package com.zou;

/**
 * 宾馆订房
 * @author zqy
 * @date 2020年4月18日
 */
public class HotelReservation {
	
	public static void main(String[] args) {
		//顾客提供信息：1）宾馆名；2）房型；3）是否会员。
		String custHotelName ="格林豪泰苏州漕湖工业园智选酒店";
		String custRoomType = "高级大床房";
		boolean member = false;
		
		//宾馆信息
		String [] hotelName = new String [3];
		hotelName[0]="格林豪泰苏州火车站南广场拙政园商务酒店";
		hotelName[1]="格雅苏州工业园区金鸡湖东方之门酒店";
		hotelName[2]="格林豪泰苏州漕湖工业园智选酒店";
		String [] address = new String [3];
		address[0] = "江苏省苏州市姑苏区人民路2156号";
		address[1] = "江苏省苏州工业园区星海街169号";
		address[2] = "江苏省苏州市相城区黄畦路3号";
		
		
		//订单信息
		String orderHotelName =null;
		String orderAddress =null;
		String orderRoomType = custRoomType;
		int orderPrice=0;
		int orderVoucher = 0;
		//匹配酒店
		if (custHotelName.equals(hotelName[0])) {
			boolean flag1 = false;
			String [] roomType ={"大床房","标间","豪华双床房"};
			for (int i = 0; i < roomType.length; i++) {
				if (custRoomType.equals(roomType[i])) {
					flag1=true;
				}
			}
			if (flag1) {
				orderHotelName =hotelName[0];
				orderAddress = address[0];
				hotel1(member,orderPrice,orderVoucher,orderRoomType);
				orderPrice = hotel1(member, orderPrice, orderVoucher, orderRoomType);
				//输出订单信息
				System.out.println("*************订单信息******************");
				System.out.println();
				System.out.println("酒店名:"+orderHotelName);
				System.out.println("酒店地址:"+orderAddress);
				System.out.println("房间类型:"+orderRoomType);
				System.out.println("价格:"+orderPrice);
			}
			else {
				System.out.println("该酒店无此房间类型");
			}
		}
		else if (custHotelName.equals(hotelName[1])) {
			boolean flag2 = false;
			String [] roomType ={"豪华双床房"};
			for (int i = 0; i < roomType.length; i++) {
				if (custRoomType.equals(roomType[i])) {
					flag2 = true;
				}
			}
			if (flag2) {
				orderHotelName =hotelName[1];
				orderAddress = address[1];
				hotel2(member,orderPrice,orderVoucher,orderRoomType);
				orderPrice = hotel2(member, orderPrice, orderVoucher, orderRoomType);
				//输出订单信息
				System.out.println("*************订单信息******************");
				System.out.println();
				System.out.println("酒店名:"+orderHotelName);
				System.out.println("酒店地址:"+orderAddress);
				System.out.println("房间类型:"+orderRoomType);
				System.out.println("价格:"+orderPrice);
			}
			else {
				System.out.println("该酒店无此房间类型");
			}
		}
		else if (custHotelName.equals(hotelName[2])) {
			boolean flag3 = false;
			String [] roomType ={"高级大床房"};
			for (int i = 0; i < roomType.length; i++) {
				if (custRoomType.equals(roomType[i])) {
					flag3 = true;
				}
			}
			if (flag3) {
				orderHotelName =hotelName[2];
				orderAddress = address[2];
				hotel3(member,orderPrice,orderVoucher,orderRoomType);
				orderPrice = hotel3(member, orderPrice, orderVoucher, orderRoomType);
				//输出订单信息
				System.out.println("*************订单信息******************");
				System.out.println();
				System.out.println("酒店名:"+orderHotelName);
				System.out.println("酒店地址:"+orderAddress);
				System.out.println("房间类型:"+orderRoomType);
				System.out.println("价格:"+orderPrice);
			}
			else {
				System.out.println("该酒店无此房间类型");
			}
		}
	}
	//酒店1方法
	public static int hotel1(boolean member,int orderPrice,int orderVoucher,String orderRoomType) {
		int[] marketPrice ={189,169,209};
		int[] memberPrice={161,149,190};
		String [] roomType ={"大床房","标间","豪华双床房"};
		int[] voucher ={20,10,30};
		if (member) {
			for (int i = 0; i < roomType.length; i++) {
				if(orderRoomType.equals(roomType[i])){
				    orderPrice = memberPrice[i]-voucher[i];
				}
			}
		}
		else{
			for (int j = 0; j < roomType.length; j++) {
				if(orderRoomType.equals(roomType[j])){
				    orderPrice = marketPrice[j]-voucher[j];
				}    
			}	
		}
		return orderPrice;
	}
	//酒店2方法
	public static int hotel2(boolean member,int orderPrice,int orderVoucher,String orderRoomType) {
		int[] marketPrice ={399};
		int[] memberPrice={339};
		String [] roomType ={"豪华双床房"};
		int[] voucher ={20};
		if (member) {
			for (int i = 0; i < roomType.length; i++) {
				if(orderRoomType.equals(roomType[i])){
				    orderPrice = memberPrice[i]-voucher[i];
				}
			}
		}
		else {
			for (int j = 0; j < roomType.length; j++) {
				if(orderRoomType.equals(roomType[j])){
				    orderPrice = marketPrice[j]-voucher[j];
				}
			}	
		}
		return orderPrice;
	}
    
    //酒店3方法
	public static int hotel3(boolean member,int orderPrice,int orderVoucher,String orderRoomType) {
		int[] marketPrice ={189};
		int[] memberPrice={161};
		String [] roomType ={"高级大床房"};
		int[] voucher ={10};
		if (member) {
			for (int i = 0; i < roomType.length; i++) {
				if(orderRoomType.equals(roomType[i])){
				    orderPrice = memberPrice[i]-voucher[i];
				}
			}
		}
		else {
			for (int j = 0; j < roomType.length; j++) {
				if(orderRoomType.equals(roomType[j])){
				    orderPrice = marketPrice[j]-voucher[j];
				}
			}	
		}
		return orderPrice;
	}
    
    

}
