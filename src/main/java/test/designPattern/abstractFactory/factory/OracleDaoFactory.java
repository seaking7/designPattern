package test.designPattern.abstractFactory.factory;

import test.designPattern.abstractFactory.domain.product.dao.ProductDao;
import test.designPattern.abstractFactory.domain.product.dao.oracle.ProductOracleDao;
import test.designPattern.abstractFactory.domain.userinfo.dao.UserInfoDao;
import test.designPattern.abstractFactory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
