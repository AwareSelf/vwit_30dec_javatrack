import { useState } from "react";

function Book2(props) {

  
    const [book,setbook] = useState({
                                     bookid:props.bookid,
                                     bookname:props.bookname,
                                     bookauth:props.bookauth
                                    });
   
  //when u want to update the entire object
    const changeBook = (newbkid,newbkname,newbkauth)=>{
        console.log('change book called');
        setbook({bookid:newbkid,bookname:newbkname,bookauth:newbkauth});
           
    }

    //when you want to update part of the object
    const changeBkname = (newbkname)=>{
        setbook(prevbook=>{
            return {...prevbook,bookname:newbkname}
            });
        }

  return (
    <div>
         <h3>Book Component: book details</h3>
         <h3>{book.bookid}</h3>
         <h3>{book.bookname}</h3>
         <h3>{book.bookauth}</h3>

         <input type="button" value="UpdateBook" onClick={()=>changeBook(2,"xxx","nama1")}/>

         <input type="button" value="UpdateBookName" onClick={()=>changeBkname("React a b c")}/>
        
    </div>
  );
}

export default Book2;
