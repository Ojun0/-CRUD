package singup;

import java.util.*;

public class Main {

		public static void main(String[] args) {
			ArrayList<user> users = new ArrayList<user>();
			Scanner sc = new Scanner(System.in);
			int n = 0;
			
			Boolean flag = true;
			while (flag) {
				System.out.println("-------------------------------------------------");
				System.out.println("1. ȸ������ 2.ȸ��Ż�� 3.ȸ������Ʈ 4.ȸ�� ���� ���� 5.����");
				System.out.println("-------------------------------------------------");
				System.out.println("�����Ͻ� �޴��� ��ȣ�� �Է����ּ���:");
				n= sc.nextInt();
				
				switch (n) {
					case 1: //ȸ������
						System.out.println();
						System.out.println("ȸ���� ������ �Է����ּ���");
						System.out.println("--------------------");
						System.out.println("�̸�:");
						String name =sc.next();
						System.out.println("���̵�:");
						String id = sc.next();
						System.out.println("��й�ȣ:");
						String pw = sc.next();
						System.out.println("�̸���:");
						String email = sc.next();
						System.out.println("����:");
						String age = sc.next();
						users.add(new user(name, id, pw, email, age));
						System.out.println("ȸ�������� �Ǿ����ϴ�");
						break;
					
					case 2: //ȸ��Ż��
						System.out.println();
						System.out.println("Ż���� ȸ���� �̸��� �Է��ϼ���.");
						System.out.println("========================");
						System.out.println("�̸�:");
						name = sc.next();
						for (int i= 0; i < users.size(); i++) {
							if (name.equals(users.get(i).getName())) {
								users.remove(i);
								System.out.println("�����Ǿ����ϴ�!");
							}else
								System.out.println("ȸ���� �������� �ʽ��ϴ�.");
						}
						break;
					
					case 3: //ȸ������Ʈ
						System.out.println();
						for (user user : users)
							System.out.println(user);
						break;
					case 4: //ȸ�� ���� ����
						break;
						
					case 5: //����
						flag = false;
						System.out.println("�ý����� ����Ǿ����ϴ�.");
						break;
					
					default:
						System.out.println("1~5 ���̿� ���ڸ� �Է����ּ���.");
						break;
				}
			}
		}
}