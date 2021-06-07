package club.tacbin.sharding.controller;

import club.tacbin.sharding.mapper.Exam;
import club.tacbin.sharding.mapper.ExamCopy;
import club.tacbin.sharding.mapper.ExamCopyMapper;
import club.tacbin.sharding.mapper.ExamMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * sharding jdbc 控制器
 *
 * @author 01401951
 * @version 1.0
 * @date 2021-06-04 10:34
 */
@RestController
@RequestMapping("sharding")
public class ShardingController {
    @Resource
    private ExamMapper examMapper;

    @Resource
    private ExamCopyMapper examCopyMapper;

    @GetMapping("doInsert")
    public void insert(){
        System.out.println("insert starting..");
        String title = UUID.randomUUID().toString();

        ExamCopy examCopy = new ExamCopy();
        examCopy.setTitle(title);
//        examCopyMapper.insert(examCopy);

        for (int i = 0;i < 100;i++){
            Exam exam = new Exam();
            exam.setTitle(title);
            examMapper.insert(exam);
        }
    }
}
