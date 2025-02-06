
import { useState,useEffect } from "react";
import axios from "axios";

function StudentRestClient()
{
    const [studarr,setstudarr] = useState([]);
    const [student,setstudent]=useState({studid:'',name:'Radha',totalMarks:250});
 

    const baseurl = "http://localhost:8080/"
    useEffect(()=>{

        getAllStudents()

    },[]);


    const getAllStudents = ()=>{

      
        axios.get(baseurl+"all/studs").then((response)=>{

            console.log(response.data);
            /*
            let sarr = response.data;
        
        const studarr = sarr.map(s=>{
                let s1 = {studid:s.studid,name:s.name,totalMarks:s.totalMarks};
                return s1;
                  
            });
           
            setstudarr(studarr);
            */
             setstudarr(response.data);
        })

    }

    const addstud = (event)=>{
        event.preventDefault();
        console.log('student to be posted:'+student.name+","+student.totalMarks);

        //check if the student is present in studentarray, 
        // if not present then post/insert student to backend and frontend 
        //but if student is present then put/update student to backend and frontend both. 

        const flag = studarr.find(s=>s.studid===student.studid);
        if(flag)
        {
          axios.put(baseurl+"student/update/"+student.studid,student).then((response)=>{
            console.log(response.data);
          const updatedstudarr =  studarr.map(s=>{
                if(s.studid===student.studid)
                {
                    s.name = student.name;
                    s.totalMarks = student.totalMarks;
                    return s;
                }
                else
                {
                    return s;
                }
            })
               setstudarr(updatedstudarr);
          })
        }
        else
        {
          axios.post(baseurl+"student",student).then((response)=>{
           console.log(response.data);
           setstudarr(prev=>[...prev,response.data]);
            })
        }
    }

    const deleteStud = (studid)=>{
       axios.delete(baseurl+"delete/student/"+studid).then((response)=>{
            console.log(response.status);
            console.log(response.data);

           const deletedstudarr =  studarr.filter(s=>s.studid!==studid)
           setstudarr(deletedstudarr);
       })
    }


    const updateStud = (s)=>{

        setstudent(s);
    }

    const changeName = (n)=>{
        setstudent(prev=>{
                       return {...prev,name:n}
                   });
    }

    const changeTotalMarks = (mrks)=>{
        setstudent(prev=>{
                       return {...prev,totalMarks:mrks}
                   });
    }

    return(
        <>
        <form onSubmit={addstud}>

            <input name="studid" value={student.studid} readOnly disabled/>
            <input name="name" value={student.name} onChange={e=>changeName(e.target.value)} />
            <input name="total marks" value={student.totalMarks} onChange={e=>changeTotalMarks(e.target.value)} />
            <input type="submit" value="Add Student" />
        </form>
        
        <table>
         <thead>
            <tr><th>studid</th><th>studname</th><th>studmarks</th></tr>
         </thead>  
         <tbody>
               
          {studarr.map(s=><tr key={s.studid}>
                       <td>{s.studid}</td>
                       <td>{s.name}</td>
                       <td>{s.totalMarks}</td>
                       <td><input type="button" value="delete" onClick={()=>deleteStud(s.studid)}/></td>
                       <td><input type="button" value="update" onClick={()=>updateStud(s)}/></td>
                       </tr>)}
          </tbody>
          </table> 

 
        </>
    );


}
export default StudentRestClient;