package com.ssm.mapper;
import com.ssm.bean.Process;
public interface ProcessMapper {
    /**
     * 测试枚举的查询
     * @param id
     * @return
     */
    Process selectProcess(Integer id);

    /**
     * 测试插入的枚举
     * @param process
     * @return
     */
    int insertProcess(Process process);
}
