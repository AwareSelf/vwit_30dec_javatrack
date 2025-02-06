import { useState } from "react";

function MyFavColor1({initcolor})
{

    const [color,setcolor] = useState(initcolor);

    const changeColor = (col)=>{
        setcolor(col);
    }

    return(
        <>
           <p>My Favourite color is {color} </p>

           <input type="text" value={color} onChange={(e)=>setcolor(e.target.value)} />

           {/* above input element can be written in one more way as below */}
           <input type="text" value={color} onChange={e=>changeColor(e.target.value)}/>

                     
        </>
    );

}
export default MyFavColor1;