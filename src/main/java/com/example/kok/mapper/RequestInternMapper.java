package com.example.kok.mapper;

import com.example.kok.dto.RequestInternDTO;
import com.example.kok.dto.RequestInternDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RequestInternMapper {
//    회원 아이디로 인턴 지원서 최근 3개 조회
    public List<RequestInternDTO> selectRequestInternById(Long id);
//    인턴 지원 내역 조회
    public List<RequestInternDTO> selectRequestInternByUserId(Long id,@Param("internId")Long internId);

    //    지원서 넣기
    public void insertRequest(RequestInternDTO requestInternDTO);

//    멤버별 지원서 조회
    public List<RequestInternDTO> selectRequestById(Long id);

//    지원서 개수 조회
    public int countRequest(RequestInternDTO requestInternDTO);

}
