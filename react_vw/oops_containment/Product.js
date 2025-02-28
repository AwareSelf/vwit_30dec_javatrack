class Product
{
    constructor(items,prodname,noofcopies)
    {
        this.prodId=null;
        this.items=items;
        this.prodName=prodname;
        this.noOfCopies=noofcopies;
    }


    setItems(items)
    {
        this.items = items;
    }

    getItems()
    {
        return this.items;
    }
    getProdId()
    {
        return this.prodId;
    }

    toString()
    {
        return JSON.stringify(this);
    }

}

export default Product;