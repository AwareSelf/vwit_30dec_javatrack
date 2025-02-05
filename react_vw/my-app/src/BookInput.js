import {useState} from "react";
import './BookInput.css';

function BookInput()
{
    const [book,setbook] = useState({bkid:1,bkname:'react',bkprice:5000})
    const [bookarr,setbookarr] = useState([]);
    const [addorupdate,setaddorupdate] = useState("add Book");

    const changeBkid = (id)=>{
        setbook(prev=>{
            return {...prev,bkid:id};
        })
    }

    const changeBkname = (name)=>{
        setbook(prev=>{
            return {...prev,bkname:name};
        })
    }

    const changeBkprice = (price)=>{
        setbook(prev=>{
            return {...prev,bkprice:price};
        })
    }

    const addOrUpdateBook = ()=>{
       
        const flag = bookarr.find(b=>b.bkid===book.bkid);

        if(!flag)
           setbookarr(prev=>[...prev,book]);
        else
           {
             const updatedbookarr =  bookarr.map(b=>{
                if(b.bkid===book.bkid)
                {
                   b.bkname = book.bkname;
                   b.bkprice = book.bkprice;
                   return b;
                }
                else
                {
                    return b;
                }
              });
              setbookarr(updatedbookarr);
           }
    }

    const delBook = (bkid)=>{

       const bookarr1 = bookarr.filter(b=>b.bkid!==bkid);
        setbookarr(bookarr1);

    }

    const updateBook = (book)=>{
        setbook(book);
        setaddorupdate("update book");
    }
    return(
        <>
         <input type="text" value={book.bkid} onChange={e=>changeBkid(e.target.value)} />
         <input type="text" value={book.bkname} onChange={e=>changeBkname(e.target.value)} />
         <input type="text" value={book.bkprice} onChange={e=>changeBkprice(e.target.value)} />

          <h3>{book.bkid},{book.bkname},{book.bkprice}</h3>

          <input type="button" value={addorupdate} onClick={addOrUpdateBook} />
          <hr/>
          <table>
          <thead>
            <tr><th>bookid</th><th>bookname</th><th>bookprice</th></tr>
          </thead>
          <tbody>
            {   bookarr.map(book=>
                             <tr key={book.bkid}>
                                <td>{book.bkid}</td>
                                <td>{book.bkname}</td>
                                <td>{book.bkprice}</td>
                                <td><input type="button" value="delete" onClick={()=>delBook(book.bkid)} /> </td>
                                <td><input type="button" value="update" onClick={()=>updateBook(book)} /></td>
                             </tr>
                            )
            }
           </tbody> 
          </table>
        </>
    );

}
export default BookInput;