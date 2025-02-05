import { useState } from "react";

function Book(props) {

  
    const [bookid,setbookid] = useState(props.bookid);
    const [bookname,setbookname] = useState(props.bookname);
    const [bookauth,setbookauth] = useState(props.bookauth);

    const changeBook = ()=>{

        console.log('change book called');
        setbookid(2);
        setbookname("xxx");
        setbookauth("namrata1");
    }

  return (
    <div>
         <h3>Book Component: book details</h3>
         <h3>{bookid}</h3>
         <h3>{bookname}</h3>
         <h3>{bookauth}</h3>

         <input type="button" value="ok" onClick={changeBook}/>
        
    </div>
  );
}

export default Book;
