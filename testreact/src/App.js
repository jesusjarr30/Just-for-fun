import logo from './logo.svg';
import './App.css';
import React,{useState, useEffect} from 'react';

function App() {

  const [counter, setCounter] = useState(0);
  const [name, setName] = useState(["hello","world"])

  useEffect(() => {

    setCounter(counter+1); 
    
    return () => {
      console.log('Cleanup');
    }
  },[])

  return (
    <div className="App">
      <h1>{counter} </h1>

      <button onClick={() => setCounter(counter+1)}>+</button>

      
    </div>
  );
}

export default App;
