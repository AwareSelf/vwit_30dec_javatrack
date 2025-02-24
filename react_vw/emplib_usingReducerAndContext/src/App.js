import logo from './logo.svg';
import './App.css';
import empdao from './EmpService';
import AddEmp from './AddEmp';
import ListEmp from './ListEmp';
import { useState,useReducer,createContext } from "react";

const reducerContext = createContext();
export {reducerContext};


function App() {
/*
 const  [emparr,setEmparr] =useState([{empid:1,empname:'ram',empsal:5000},
  {empid:2,empname:'mita',empsal:3000}]);
*/
  const  [emparr,setEmparr] =useState([]);


  
  const [emplst,empdispatch] =  useReducer(empdao,emparr);


  return (
    <reducerContext.Provider value={{emplst,empdispatch}}>
     <AddEmp empid={101} empname={'Rita'} empsal={5000} />
     <hr/>
     <ListEmp/>
    </reducerContext.Provider>
  );
}

export default App;
