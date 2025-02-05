import { useState } from "react";

function Book1(props) {

  
    const [bookid,setbookid] = useState(props.bookid);
    const [bookname,setbookname] = useState(props.bookname);
    const [bookauth,setbookauth] = useState(props.bookauth);

    const changeBook = (newbkid,newbkname,newbkauth)=>{

     //   console.log('change book called');
         alert('chnage Book called');
         setbookid(newbkid);
         setbookname(newbkname);
         setbookauth(newbkauth);
    }

  return (
    <div>
         <h3>Book Component: book details</h3>
         <h3>{bookid}</h3>
         <h3>{bookname}</h3>
         <h3>{bookauth}</h3>

        <input type="button" value="ok" onClick={()=>changeBook(2,"xxx","nama1")}/>
        
    </div>
  );
}

export default Book1;
