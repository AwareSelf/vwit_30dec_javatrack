package jdbc.orderservice1.mainapp;

import jdbc.orderservice1.impl.OrderDaoJdbcImpl;
import jdbc.orderservice1.impl.OrderImplFactory;
import jdbc.orderservice1.intf.OrderDaoIntf;
import jdbc.orderservice1.model.Order;

import java.sql.SQLException;
import java.util.List;

public class JdbcApp {
    public static void main(String[] args) {
        Order o1 = new Order(1,"Pen",100);
        Order o2 = new Order(2,"Book",200);

        //use Factory design pattern for getting specific DAO implementation
        OrderDaoIntf intf = OrderImplFactory.getOrderImpl();


        //if you want to keep on adding orders till user wants then use do-while loop with do you wish continue option
        try {
            intf.addOrder(o1);

        } catch (SQLException e) {
           // throw new RuntimeException(e);
            System.out.println("Add Order is not successful for order with orderid="+o1.getOrderId());
        }

        try {
            intf.addOrder(o2);
        } catch (SQLException e) {
            System.out.println("Add Order is not successful for order with orderid="+o2.getOrderId());
        }


        try {
            List<Order> lst = intf.getAllOrders();
               lst.forEach((o)->System.out.println(o));
        } catch (SQLException e) {
          e.printStackTrace();
        }


    }
}
