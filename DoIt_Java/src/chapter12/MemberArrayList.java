package chapter12;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberID();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println("¾øÀ½");
		return false;
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public void showAllMember() {
		for(Member m: arrayList) {
			System.out.println(m);
		}
		System.out.println("=-=");
	}

}
