package com.jx.jxoj.judge;

import com.jx.jxoj.judge.codesandbox.model.JudgeInfo;
import com.jx.jxoj.judge.strategy.DefaultJudgeStrategy;
import com.jx.jxoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.jx.jxoj.judge.strategy.JudgeContext;
import com.jx.jxoj.judge.strategy.JudgeStrategy;
import com.jx.jxoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
