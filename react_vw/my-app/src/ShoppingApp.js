import { useState, createContext, useContext } from "react";


const ShoppingContext = createContext();

function ShoppingApp() {
   
    const [item,setItem] = useState("xyz");
    const [cartsize,setCartSize] = useState(1);
  
    return (
      <ShoppingContext.Provider value={{item,setItem,cartsize,setCartSize}}>
           <Catalogue/>
           <hr/>
           <Cart/>
      </ShoppingContext.Provider>
    );
  }

  function Catalogue() {

    const {setItem,cartsize} = useContext(ShoppingContext);
    const [selectedOption, setSelectedOption] = useState('');
 

    const handleChange = (event) => {
          console.log(event.target.value);
          setSelectedOption(event.target.value);
          setItem(event.target.value);
      };

return (
  <>
  <h3>Items currenlty in your cart:{cartsize} </h3>
  <h1>Catalogue!</h1>
  <h3>Browse and select items and add to cart for shoopping!</h3>
    <div>
        <h3>Welcome to SHOPPING APP!</h3>
        <select
            value={selectedOption}
            onChange={handleChange}
            style={{
                padding: '10px',
                fontSize: '14px',
                borderRadius: '5px',
                border: '1px solid #ccc',
                width: '150px'
            }}>

            <option value="">Select Shopping items</option>
            <option value="books">Books</option>
            <option value="watches">Watches</option>
            <option value="dress">Dress</option>
            <option value="laptop">Laptop</option>

        </select>
        <p>Selected option: {selectedOption}</p>
    </div>
    
    </>
    );
  }
  
  function Cart() {

    const {item,cartsize,setCartSize} = useContext(ShoppingContext);

    const removeItem = (item)=>{
      console.log('please write code to remove '+item+'from items array and reduce cartsize by 1');
      setCartSize(cartsize-1);
    }
       
    return (
      <>
      <h1>My Cart!</h1>
      <table>
        <thead>
          <tr>
            <th>item</th>
            <th>remove an item</th>
          </tr>
        </thead>
        <tbody>
            <tr>
                <td>{item}</td>
                <td><input type="button" value="remove item" onClick={()=>removeItem(item)} /></td>
             </tr>
        </tbody>
      </table>
       
       </>
    );
  }
  
   export default ShoppingApp;