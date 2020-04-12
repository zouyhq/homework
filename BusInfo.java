package com.zou;

/**
 * @author Administrator
 * @date 2020年4月12日
 */
public class BusInfo {
	
	public static void main(String[] args) {
		//公交车牌号
			int busBrand = 106;
		//公交车所属公司
			String company = "苏州工业园区公共交通公司";
		//往返路线
			String busRoute ="唯亭便利中心东站——欧尚超市东站";
		//公交车票价
			double busFare = 2.00;
		//pringln输出
			System.out.println("公交车信息");
			System.out.println("公交车牌号："+busBrand);
			System.out.println("公交车所属公司："+company);
			System.out.println("往返路线"+busRoute);
			System.out.println("票价："+busFare);		
	}

}
