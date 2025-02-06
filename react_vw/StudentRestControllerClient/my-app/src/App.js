import './App.css';
import Book from './Book';
import MyFavColor from './MyFavColor';
import Book1 from './Book1';
import Book2 from './Book2';
import MyArr from './MyArr';
import MyBookArr from './MyBookArr';
import MyFavColor1 from './MyFavColor1';
import BookInput from './BookInput';
import Timer from './Timer';
import BookAxiosCrud from './BookAxiosCrud';
import StudentRestClient from './StudentRestClient';

function App() {

  const auth="namrata";

  return (
    <div>
      {/*
         <Book bookid="1" bookname="learnreact" bookauth={auth} />
         <hr/>
         <Book1 bookid="1" bookname="learnreact" bookauth={auth} />
         <hr/>
         <Book2 bookid="1" bookname="learnreact" bookauth={auth} />
         <hr/>
         <MyArr/>
         <hr/>
         <MyBookArr/>
         <hr/>
         <MyFavColor initcolor="red" bkgcolor="black" />
         <hr/>
         <MyFavColor1 initcolor="red" bkgcolor="black" />
         <hr/>
         <BookInput/>
         <hr/>
         <Timer/>
         <hr/>
         */}
         <BookAxiosCrud/>
         <hr/>
         <StudentRestClient/>
    </div>
  );
}

export default App;
