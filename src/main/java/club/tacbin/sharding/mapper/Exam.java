package club.tacbin.sharding.mapper;

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
@TableName("t_exam")
@Getter
@Setter
public class Exam {
    @TableId("ID")
    private Long id;

    @TableField("TITLE")
    private String title;

    @TableField("ANSWER")
    private String answer;
}
