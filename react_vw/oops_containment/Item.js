class Item
{
  constructor(itemName,product,order)
  {
    this.itemId=null;
    this.itemName = itemName;
    this.product=product;
    this.order=order;


  }

 

  tostring()
  {
    return JSON.stringify(this);
  
  }


}

export default Item;