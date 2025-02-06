
import { useEffect,useState } from "react";
function Timer() {
    const [count, setCount] = useState(0);

    /*
    if you remove the empty bracket given as sec arg, useEffect() will run at the start when app loads first time
    as well as on every render of Timer component so you will see count incrementing continuously.
    because every render will call useEffect and call callback which will set the count again trigerring a another
    re-render */
    /*
    but if you pass empty array as sec arg as below, useEffect() will run only once when Timer component loads/renders
    for the first time.After that for next renders useEffect() will not be called again.
    so you will count incrementing only once from 0 to 1 and then remaining stable at 1.
    First time it renders,UseEffect gets called and set count in timer function will change count value from 0 to 1.As Timer's count state changes
    Timer component will be re-rendered showing count value as 1. But it won't trigger useEffect again.
    so count stays at value 1.
    */
  
    useEffect(() => {
      setTimeout(() => {
        setCount((count) => count + 1);
      }, 1000);
    },[]); 
    return (
           <h1>I've rendered {count} times!</h1>);
  }
  export default Timer;