package javaBasic01;
class Main{
	public static void main(String[] args) {
		//�������� �������
		Box box =new Box();
		
        //������� ���������
        Lolipop lolipop1 = new Lolipop("�����", 150, 90, "�������");
        Lolipop lolipop2 = new Lolipop("�������", 75, 70, "�������");
        Lolipop lolipop3 = new Lolipop("��������", 100, 100, "������");
        Lolipop lolipop4 = new Lolipop("��������", 120, 80, "�������");
        Lolipop lolipop5 = new Lolipop("����-���", 85, 90, "����������");
        Cookie cookie1 = new Cookie("�����", 250, 120, "���������� ������");
        Cookie cookie2 = new Cookie("�����", 100, 90, "������");
        Cookie cookie3 = new Cookie("M&Ms", 90, 80, "M&Ms");
        Cookie cookie4 = new Cookie("�������", 80, 120, "��������� �������");
        Cookie cookie5 = new Cookie("��������", 130, 80, "������");
 
        //���������� ��������� � �������
        box.add(lolipop1);
        box.add(lolipop2);
        box.add(lolipop3);
        box.add(lolipop4);
        box.add(lolipop5);
        box.add(cookie1);
        box.add(cookie2);
        box.add(cookie3);
        box.add(cookie4);
        box.add(cookie5);
        
        //����� ����������� �������
        box.getInsides();
        
        //������� ����� �������?
        box.getWeight();
        
        //������� ����� �������?
        box.getCost();
        
        //������ �� ������� �������� ��� �������� 5
        box.removeSweet(5);

        //������ �� ������� ��������� ���������� �������� 
        box.removeSweetLast();
        
        //������ �� ������� ��������� ���������� ��������
        box.getInsides();

        //����� ����� - 1200�, ���� ��������������� ���� �������
        System.out.println("��������� ������� ������ - " + box.getCost());
        box.getRidOfCost(1200);
        
        //�������� ���������
        box.getInsides();
        
        //����� ��������� �� 200 �����, ���� ��������������� ���� �������
        System.out.println("��� ������� ������ - " + box.getWeight());
        box.getRidOfWeight(200);
     

        //�������� ���������
        box.getInsides();
	}
}

