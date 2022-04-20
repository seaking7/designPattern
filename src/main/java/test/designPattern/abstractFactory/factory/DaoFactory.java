package test.designPattern.abstractFactory.factory;

import test.designPattern.abstractFactory.domain.product.dao.ProductDao;
import test.designPattern.abstractFactory.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {

    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
