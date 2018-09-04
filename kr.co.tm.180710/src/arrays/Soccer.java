
package arrays;

public class Soccer implements Comparable {// 추상 메소드이므로 오버라이딩 할 필요가 있다.

	// 저장하고자 하는 항목
	private String teamName;
	private String member;
	private int memberNumber;
	private long worth;

	// 접근자 메소드
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public long getWorth() {
		return worth;
	}

	public void setWorth(long worth) {
		this.worth = worth;
	}

	// 디버깅을 위한 작업
	@Override
	public String toString() {
		return "Soccer [teamName=" + teamName + ", member=" + member + ", memberNumber=" + memberNumber + ", worth="
				+ worth + "]";
	}

	@Override
	public int compareTo(Object o) {
		Soccer other = (Soccer) o;
		// return (int) (this.worth - other.worth); //내림차순
		// return (int) (other.worth - this.worth); //오름차순
		return this.member.compareTo(other.member); //문자
	}
}
