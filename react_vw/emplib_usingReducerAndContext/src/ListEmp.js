import { reducerContext } from "./App";
import { useContext } from "react";

function ListEmp(props)
{

    const {emplst,empdispatch} = useContext(reducerContext);

    const listallemps = ()=>{

        empdispatch({type:'GETALL'});
    }

    let showemps;

    if(emplst && emplst.length>0)
    {
    showemps =   <div>
    Emp Array:
    <table>
    <thead>
        <tr>
        <td>{'empid'}</td>
        <td>{'empname'}</td>
        <td>{'empsal'}</td>
        </tr>
    </thead>
        <tbody>
    {
       emplst.map(e=><tr key={e.empid}>
               <td>{e.empid}</td>
               <td>{e.empname}</td>
               <td>{e.empsal}</td>
               </tr>)
    }
</tbody>
</table>
</div>
    }
    else
    {
        showemps = <div>
            <p>EmpLst is empty!</p>
        </div>
    }


  

    return(
        <>
          {showemps}
        <br/>
      
    </>


    );

}

export default ListEmp;