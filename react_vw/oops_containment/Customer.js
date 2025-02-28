
class Customer {
    constructor(custName,custAddress,custPhoneno) {
      this.custId=null;
      this.custAddress = custAddress;
      this.custName = custName;
      this.custPhoneno = custPhoneno;
      this.orders=null;

    }

    setCustId(id)
    {
        this.custId = id;
    }

    getCustId()
    {
        return this.custId;
    }

    setCustName(name)
    {
        this.custName = name;
    }

    getCustName()
    {
        return this.custName;
    }

    setCustAddress(address)
    {
        this.custAddress = address;
    }

    getCustAddress()
    {
        this.custAddress;
    }

    setOrders(orders)
    {
        this.orders = orders;
    }

    getOrders()
    {
        this.orders;
    }

    tostring()
    {
       return JSON.stringify(this);
    }

  }

  export default Customer;