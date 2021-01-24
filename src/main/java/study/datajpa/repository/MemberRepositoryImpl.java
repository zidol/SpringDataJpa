package study.datajpa.repository;

import lombok.RequiredArgsConstructor;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor    //MemberRepository 와 이름 맞추고 + Impl 붙여야함   //시용자 정의 쿼리는 인터페이스 상속
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final EntityManager em;

//    @RequiredArgsConstructor 때문에 생략 가능
//    public MemberRepositoryImpl(EntityManager em) {
//        this.em = em;
//    }

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m")
                .getResultList();
    }
}
