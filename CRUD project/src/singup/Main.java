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
				System.out.println("1. ȸ������ 2.ȸ��Ż�� 3.ȸ������Ʈ 4.ȸ�� ���� ���� 5.ȸ�� �˻� 6.����");
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
						System.out.println();
						System.out.print("������ ���� �̸��� �Է��ϼ���.");
						name = sc.next();
						for (int i = 0; i < users.size(); i++) {
							if (name.equals(users.get(i).getName())) {

								System.out.print("�����Ͻ� �׸��� �����ϼ���. (1)�̸�     (2)����     (3)�̸���");
								n = sc.nextInt();
								System.out.println();

								switch (n) {
								case 1:
									System.out.print("�̸��� ���� �Է��ϼ���.");
									name = sc.next();
									users.get(i).setName(name);
									break;
								case 2:
									System.out.print("���̸� ���� �Է��ϼ���.");
									age = sc.next();
									users.get(i).setAge(age);
									break;
								case 3:
									System.out.print("�̸��ϸ� ���� �Է��ϼ���.");
									email = sc.next();
									users.get(i).setEmail(email);
									break;
								}
								System.out.println("�����Ǿ����ϴ�!");

							} else
								System.out.println("�߸��� �����Դϴ�.");
						}

						break;
						
					case 5://ȸ�� �˻�
						System.out.println("�˻��� �̸�:");
						name = sc.next();
						for (int i = 0; i < users.size(); i++) {
							if (name.equals(users.get(i).getName())) {
								System.out.println("ã���ô� ȸ���� �ֽ��ϴ�.");
								System.out.println(name);
							} 
							else {
								System.out.println("ã���ô� ȸ���� �������� �ʽ��ϴ�.");
							}
						}
						break;
						
					case 6: //����
						flag = false;
						System.out.println("�ý����� ����Ǿ����ϴ�.");
						break;
					
					default:
						System.out.println("1~6 ���̿� ���ڸ� �Է����ּ���.");
						break;
				}
			}
		}
}