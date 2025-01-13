package jdbc.orderservice1.impl;

import jdbc.orderservice1.intf.OrderDaoIntf;
import jdbc.orderservice1.model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoJdbcImpl implements OrderDaoIntf {
    public OrderDaoJdbcImpl() {

        //step 1 of jdbc
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //localhost:3306/mydb1?useSSL=false

    private Connection getConnection() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1?useSSL=false","root","namrata");
        if(con!=null) {
            System.out.println("db Connection is successful..");
        }
        else
        {
            System.out.println("db connection is not successful");
        }
        return con;
    }

    @Override
    public void addOrder(Order o) throws SQLException {

          try(Connection con = getConnection();)
          {
              if(con!=null)
              {
                  String s= "insert into myorder values(?,?,?)";
                  PreparedStatement ps = con.prepareStatement(s);

                  ps.setInt(1,o.getOrderId());
                  ps.setString(2,o.getOrderName());
                  ps.setInt(3,o.getOrderPrice());

                  int ct = ps.executeUpdate();
                  System.out.println("no of orders added:"+ct);

              }

          }
    }

    @Override
    public Order getOrder(int orderId) throws SQLException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() throws SQLException {

        try(Connection con = getConnection())
        {
            if(con!=null)
            {
                List<Order> lst = new ArrayList<>();
                String s = "select * from mydb1.myorder";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(s);
                while(rs.next())
                {
                    Order o = new Order();
                    o.setOrderId(rs.getInt(1));
                    o.setOrderName(rs.getString(2));
                    o.setOrderPrice(rs.getInt(3));

                    System.out.println("inside orderdaoimpl:"+o);
                    lst.add(o);
                }//end of while

                return lst;
            }

        }
        return List.of();
    }
}
