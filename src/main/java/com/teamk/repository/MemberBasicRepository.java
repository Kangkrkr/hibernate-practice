package com.teamk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teamk.domain.Member;

@Repository
public interface MemberBasicRepository extends CrudRepository<Member, Long>{}
