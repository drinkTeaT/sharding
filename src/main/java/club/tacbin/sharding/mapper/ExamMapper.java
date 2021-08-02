/* Copyright © 2020 SF and/or its affiliates. All rights reserved. */
package club.tacbin.sharding.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 01401951
 * @version 1.0
 * @date 2021-06-04 10:36
 */
@Mapper
public interface ExamMapper extends BaseMapper<Exam> {
    List<Exam> customQuery();
}