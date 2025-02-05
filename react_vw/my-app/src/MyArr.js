import { useState } from "react";

function MyArr(props)
{
  const [marks,setmarks] = useState([100,200,300]);

/*
  const chgarr = ()=>{
           setmarks(prev=>[...prev,400,500]);
        }
 */
  return(
    <>
      <ul>{marks.map((val,index)=><li key={index}>{val}</li>)} </ul>


      <input type="button" value="add marks" onClick={()=>setmarks(prev=>[...prev,400,500])} />

     {/*  <input type="button" value="add marks" onClick={chgarr} />  */}

      <input type="button" value="modify marks" onClick={()=>setmarks([10,20,30])} />

     
    
    </>
  );

}

export default MyArr;