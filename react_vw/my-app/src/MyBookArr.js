import { useState } from "react";

function MyBookArr(props)
{
  const [bookarr,setbookarr] = useState(
                                         [
                                            {bkid:1,bkname:'Angular',bkprice:2000},
                                             {bkid:2,bkname:'React',bkprice:3000}
                                          ]
                                        );


   const addBook = ()=>{
       setbookarr(prevarr=>[...prevarr,{bkid:3,bkname:'Java',bkprice:4000}])
   }


return(
     <>
        <ul> 
            {
               bookarr.map((book)=><li key={book.bkid}>
                                           {book.bkid},{book.bkname},{book.bkprice}
                                   </li>
                           )
            } 
        </ul>
        <input type="button" value="add book" onClick={addBook} />
        <input type="button" value="add book1" onClick={()=> setbookarr(prevarr=>[...prevarr,
                                                                                    {bkid:4,bkname:'Java1',bkprice:5000}
                                                                                  ]
                                                                      )
                                                        } />

        {/*last two input tags are doing the same thing, just two diff ways to write same reactjs code  */}
     </>
  )
}
export default MyBookArr;