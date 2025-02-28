
class Order {
    constructor(customer,items) {
      this.orderId=null;
      this.customer = customer;
      this.items=items;

    }

    setOrderId(id)
    {
        this.orderId = id;
    }

    getOrderId()
    {
        return this.orderId;
    }

    setItems(items)
    {
        this.items = items;
    }

    getItems()
    {
        return this.items;
    }

   
    setCustomer(customer)
    {
        this.customer=customer;
    }

    getCustomer()
    {
        return this.customer;
    }

    
    tostring()
    {
       return JSON.stringify(this);
    }

  }

  export default Order;