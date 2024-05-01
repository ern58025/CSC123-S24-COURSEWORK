import java.util.HashMap;
import java.util.Map;

public class MembershipRegistry {
    private Map<Integer, Member> members;

    public MembershipRegistry() {
        members = new HashMap<>();
    }

    public void addMember(Member member) {
        members.put(member.getMembershipNumber(), member);
    }

    public Member findMember(int membershipNumber) {
        return members.get(membershipNumber);
    }
}