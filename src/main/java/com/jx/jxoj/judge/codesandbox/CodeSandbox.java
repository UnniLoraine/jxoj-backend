package com.jx.jxoj.judge.codesandbox;

import com.jx.jxoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.jx.jxoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码   增强日志功能
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
