package com.hj.mybatistest.member;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MemberRepository {

    public void insert();
}
