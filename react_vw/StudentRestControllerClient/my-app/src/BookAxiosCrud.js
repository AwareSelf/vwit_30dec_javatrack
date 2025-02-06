import {useState,useEffect} from "react";
import axios from "axios";


function BookAxiosCrud()
{
   const [book,setbook] = useState({id:3,bkname:'Angular',bkprice:5000});
   const [bookarr,setbookarr] = useState([]);

   const baseurl ="http://localhost:5000/books";

   useEffect(()=>{

    getAllBooks();  //fetch all books from backend database/rest service

   },[]);


   const getAllBooks = ()=>{

    axios.get(baseurl).then((response)=>{
       console.log(response.data);
       setbookarr(response.data);
    })

   }


   const addBook = ()=>{
     //using http post call -> send book object to backend and insert it db
     console.log(book.id+","+book.bkname+","+book.bkprice+", post it backend");

     //same addBook method will either post/insert the book or put/update the book to the backend

     //if book is already found in booarrey then put/update it or else post/insert it to backend

     const flag = bookarr.find(b=>b.id===book.id)
     if(flag)
     {
         axios.put(baseurl+'/'+book.id,book).then((response)=>{
            console.log(response.data);
         const updatedbookarr =   bookarr.map(b=>{
                                                     if(b.id===book.id)
                                                    {
                                                        b.bkname = book.bkname;
                                                        b.bkprice = book.bkprice;
                                                        return b;
                                                    }
                                                    else
                                                    {   
                                                        return b;
                                                      }
                                                })
            setbookarr(updatedbookarr);

         })
     } 
     else
     {
         axios.post(baseurl,book).then((response)=>{
               console.log(response.data)
               setbookarr(prev=>[...prev,response.data]);
     
          })
     }

   }

   const delBook = (id)=>{

    axios.delete(baseurl+"/"+id).then((response)=>{

        console.log(response.data);
        const delb = response.data;

        const postdelarr = bookarr.filter(b=>b.id!==delb.id);
        setbookarr(postdelarr);

    })

   }

   const updateBook = (book)=>{
    setbook(book);

   }


   const changeBkid = (idd)=>{
    setbook(prev=>{
        return {...prev,id:idd}
    })
   }


   const changeBkname = (name)=>{
    setbook(prev=>{
        return {...prev,bkname:name}
    })
   }

   const changeBkprice = (price)=>{
    setbook(prev=>{
        return {...prev,bkprice:price}
    })
   }


   return(
    <>
       <input type="text" value={book.id} onChange={e=>changeBkid(e.target.value)} />
         <input type="text" value={book.bkname} onChange={e=>changeBkname(e.target.value)} />
         <input type="text" value={book.bkprice} onChange={e=>changeBkprice(e.target.value)} />

          <h3>{book.id},{book.bkname},{book.bkprice}</h3>

          <input type="button" value="add Book" onClick={addBook} />
      <table>
          <thead>
            <tr><th>bookid</th><th>bookname</th><th>bookprice</th></tr>
          </thead>
          <tbody>
            {   bookarr.map(book=>
                             <tr key={book.id}>
                                <td>{book.id}</td>
                                <td>{book.bkname}</td>
                                <td>{book.bkprice}</td>
                                <td><input type="button" value="delete" onClick={()=>delBook(book.id)} /> </td>
                                <td><input type="button" value="update" onClick={()=>updateBook(book)} /></td>
                             </tr>
                            )
            }
           </tbody> 
          </table>

    
    </>
   );
}

export default BookAxiosCrud;