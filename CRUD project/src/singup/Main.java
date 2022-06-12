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
				System.out.println("1. 회원가입 2.회원탈퇴 3.회원리스트 4.회원 정보 수정 5.종료");
				System.out.println("-------------------------------------------------");
				System.out.println("실행하실 메뉴의 번호를 입력해주세요:");
				n= sc.nextInt();
				
				switch (n) {
					case 1: //회원가입
						System.out.println();
						System.out.println("회원의 정보를 입력해주세요");
						System.out.println("--------------------");
						System.out.println("이름:");
						String name =sc.next();
						System.out.println("아이디:");
						String id = sc.next();
						System.out.println("비밀번호 :");
						String pw = sc.next();
						users.add(new user(name, id, pw));
						System.out.println("회원가입이 되었습니다");
						break;
					
					case 2: //회원탈퇴
						System.out.println();
						System.out.println("탈퇴할 회원에 이름을 입력하세요.");
						System.out.println("========================");
						System.out.println("이름:");
						name = sc.next();
						for (int i= 0; i < users.size(); i++) {
							if (name.equals(users.get(i).getName())) {
								users.remove(i);
								System.out.println("삭제되었습니다!");
							}else
								System.out.println("회원이 존재하지 않습니다.");
						}
						break;
					
					case 3: //회원리스트
						break;
					
					case 4: //회원 정보 수정
						break;
						
					case 5: //종료
						flag = false;
						System.out.println("시스템이 종료되었습니다.");
						break;
					
					default:
						System.out.println("1~5 사이에 숫자만 입력해주세요.");
						break;
				}
			}
		}
}