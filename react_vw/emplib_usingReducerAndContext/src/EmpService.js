//reducer function
const empdao = (state,action)=>{

    console.log('empdao function called..');
    console.log(state);

  

    switch(action.type)
    {
        case 'ADD':
            console.log('Add emp action called..');

         
            return [ ...state,action.newemp]
       


        case 'GETALL':
          
           console.log('GETALL emp action called..');
            console.log(state);
            return [...state]

        case 'DELETE':

        default:
            return state;

    }


}

export default empdao;
