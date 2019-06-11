package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List findAll();

    int deleteById(@Param("id") Long id);

    Long add(Post post);

    int modify(Post post);

    Post findById(@Param("id") Long id);

    List findByUserId(Long userId);

    int addWithHashMap(HashMap<String, Object> map);
}
