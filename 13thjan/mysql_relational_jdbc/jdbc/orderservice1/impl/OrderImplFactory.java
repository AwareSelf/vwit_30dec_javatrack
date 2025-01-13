package jdbc.orderservice1.impl;

import jdbc.orderservice1.intf.OrderDaoIntf;

public class OrderImplFactory {


    public static OrderDaoIntf getOrderImpl()
    {
        return new OrderDaoJdbcImpl();
    }
}
