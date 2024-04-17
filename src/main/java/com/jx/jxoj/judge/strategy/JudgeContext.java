package com.jx.jxoj.judge.strategy;

import com.jx.jxoj.model.dto.question.JudgeCase;
import com.jx.jxoj.judge.codesandbox.model.JudgeInfo;
import com.jx.jxoj.model.entity.Question;
import com.jx.jxoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private String compileMessage;//编译信息

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
