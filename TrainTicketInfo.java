package com.zou;

/**
 * @author AdminIstrator
 * @date 2020��4��12��
 */
public class TrainTicketInfo {

	public static void main(String[] args) {
		//������
			String trainName = "G121�г�";
		//����ʱ��
			String departureTime = "10.28";
		//����ʱ��
			String arrivalTime = "16.28";
		//ʼ��վ
			String departureStation = "������վ";
		//�յ�վ
			String arrivalStation = "������վ";
		//��Ʊ��	
			double trainFare = 385.0;
		//��λ��
			String seat = "08��10F��";
		//�˿�����
			String passengerName = "������";
		 //�˿����֤
			String passengerID = "433127********7833";
		//pringln���
			System.out.println("��Ʊ��Ϣ");
			System.out.println("�𳵰�Σ�"+trainName);
			System.out.println("����ʱ�䣺"+departureTime+"  "+"����ʱ�䣺"+arrivalTime);
			System.out.println("ʼ��վ��"+departureStation+"  "+"�յ�վ"+arrivalStation);
			System.out.println("��Ʊ�ۣ�"+trainFare);
			System.out.println("��λ�ţ�"+seat);
			System.out.println("�˿�������"+passengerName);
			System.out.println("�˿����֤��"+passengerID);
	}

}
