package test.designPattern.abstractFactory.domain.userinfo.dao;

import test.designPattern.abstractFactory.domain.product.Product;
import test.designPattern.abstractFactory.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertProduct(UserInfo userInfo);
    void updateProduct(UserInfo userInfo);
    void deleteProduct(UserInfo userInfo);
}
