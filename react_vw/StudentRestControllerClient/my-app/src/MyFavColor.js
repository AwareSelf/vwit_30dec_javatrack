import { useState } from "react";

function MyFavColor({initcolor})
{

    const [color,setcolor] = useState(initcolor);

     const func =  ()=>{
         console.log('func is called...');
         setcolor("blue");
        
     }

    return(
        <>
           <p>My Favourite color is {color} </p>
           <input type="button" value="chngColor" onClick= {func} />
           
        </>
    );

}
export default MyFavColor;