package test.designPattern.abstractFactory.domain.userinfo.dao.mysql;

import test.designPattern.abstractFactory.domain.userinfo.UserInfo;
import test.designPattern.abstractFactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
    @Override
    public void insertProduct(UserInfo userInfo) {
        System.out.println("insert into Mysql userInfo : "+userInfo.getUserId());
    }

    @Override
    public void updateProduct(UserInfo userInfo) {
        System.out.println("updateProduct into Mysql userInfo : "+userInfo.getUserId());
    }

    @Override
    public void deleteProduct(UserInfo userInfo) {
        System.out.println("deleteProduct into Mysql userInfo : "+userInfo.getUserId());
    }
}
