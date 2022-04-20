package test.designPattern.abstractFactory.factory;

import test.designPattern.abstractFactory.domain.product.dao.ProductDao;
import test.designPattern.abstractFactory.domain.product.dao.mysql.ProductMysqlDao;
import test.designPattern.abstractFactory.domain.userinfo.dao.UserInfoDao;
import test.designPattern.abstractFactory.domain.userinfo.dao.mysql.UserInfoMysqlDao;

public class MysqlDaoFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
