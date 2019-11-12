package cn.codefreak.template.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDAO {
    void reduceAccountBalance(@Param("username") String username, @Param("balance") Integer balance);
    int getAccountBalance(String username);
}
