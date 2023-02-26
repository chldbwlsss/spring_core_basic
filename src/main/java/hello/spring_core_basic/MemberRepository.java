package hello.spring_core_basic;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);
}
