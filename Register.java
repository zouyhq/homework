/**
 * 
 */
package com.zou;

/**
 * 医院挂号
 * @author Administrator
 * @date 2020年4月15日
 */
public class Register {
	public static void main(String[] args) {
		int registerCount = 1;//挂号次数
		register(registerCount);
	}
    public static void register(int registerCount) {
    	switch (registerCount) {
		case 1:
			//System.err.println("挂号成功");
			//break;
		case 2:
			//System.err.println("挂号成功");
			//break;
		case 3:
			System.err.println("挂号成功");
			break;	
		default:
			if (registerCount>3) {
				System.err.println("您不能再挂号，已被列入黑名单");
			}
			break;
		}
    }
}
