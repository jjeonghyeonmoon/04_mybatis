package com.ohgiraffers.section03.remix.model.service;

import com.ohgiraffers.section03.remix.model.dao.MenuMapper;
import com.ohgiraffers.section03.remix.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section03.remix.common.Template.getSqlSession;


public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDTO> selectAllMenu() {

        // 1. SqlSession 생성
        SqlSession sqlSession = getSqlSession();

        // 2. Template 에 등록 한 Mapper 파일사용준비
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuList = menuMapper.selectAllMenu();

        // 3. 사용한 SqlSession 닫기
        sqlSession.close();

        return menuList;
    }
}
