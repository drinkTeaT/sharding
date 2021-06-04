package club.tacbin.sharding.mapper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 01401951
 * @version 1.0
 * @date 2021-06-04 10:36
 */
@TableName("t_exam_0_copy1")
@Getter
@Setter
public class ExamCopy {
    @TableId(value = "ID",type = IdType.AUTO)
    private Long id;

    @TableField("TITLE")
    private String title;

    @TableField("ANSWER")
    private String answer;
}
