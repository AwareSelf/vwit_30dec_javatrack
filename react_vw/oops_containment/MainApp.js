import Customer from "./Customer.js";
import Order from "./Order.js";
import Product from "./Product.js";
import Item  from "./Item.js";


const c1 = new Customer("namrata","j504,army colony,nerul","9920366274");
console.log("customer c1 details:")
console.log(c1.tostring()); //console.log(JSON.stringify(c1))

console.log("order o1 details with customer c1 set in it, but items is not set yet..")
const o1 = new Order(c1);
console.log(o1.tostring());

const p1 = new Product(null,"laptop",3);
const item1 = new Item(p1.prodName,p1);

/*
console.log("single item item1 details:");
const item1string =  JSON.stringify(omitKeys(item1, ['product','order']));
*/


const item2 = new Item(p1.prodName,p1);
console.log("single item item2 details:");
console.log(item2);


const items = [];
items.push(item1);
items.push(item2);
console.log("items array details:");
console.log(JSON.stringify(items));

//p1.setItems(items);
o1.setItems(items);

console.log("\n\n order o1 details with customer c1 set in it, with ordered items array set in it..")
console.log(o1.tostring());

const orders = [];
orders.push(o1);

//setting order o1's customer to null before sending/printing customer 
// to avoid circular structure of json
o1.setCustomer(null); 
console.log("\n\n customer c1 details after setting orders array in it, \n currently orders array has one order o1")
c1.setOrders(orders);
console.log(c1.tostring());



