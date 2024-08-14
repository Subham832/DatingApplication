package com.dating.app.service;

import com.dating.app.dto.MemberDTO;
import com.dating.app.model.Country;
import com.dating.app.model.Interest;
import com.dating.app.model.Member;
import com.dating.app.repository.CountryRepository;
import com.dating.app.repository.InterestRepository;
import com.dating.app.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private InterestRepository interestRepository;

    @Autowired
    private CountryRepository countryRepository;

    public Member registerMember(MemberDTO memberDTO) {
        Optional<Interest> interestOptional = interestRepository.findById(memberDTO.getInterest());
        Optional<Country> countryOptional = countryRepository.findById(memberDTO.getCountry());

        Interest interest = interestOptional.orElse(null);
        Country country = countryOptional.orElse(null);

        Member member = new Member();
        member.setFirstName(memberDTO.getFirstName());
        member.setLastName(memberDTO.getLastName());
        member.setGender(memberDTO.getGender());
        member.setAge(memberDTO.getAge());
        member.setMbrPlan(memberDTO.getMbrPlan());
        member.setMobNo(memberDTO.getMobNo());
        member.setInterest(interest != null ? interest.getName() : null);
        member.setCountry(country != null ? country.getName() : null);
        member.setCountryCode(country != null ? country.getCode() : null);

        return memberRepository.save(member);
    }
}
