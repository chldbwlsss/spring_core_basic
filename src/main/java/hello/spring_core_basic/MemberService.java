package hello.spring_core_basic;

public interface MemberService {

    void join(Member member);

    Member findMember(Long id);
}
