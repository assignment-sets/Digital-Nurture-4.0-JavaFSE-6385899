import './App.css';
import {
  Guest,
  User
} from './components/getComponents.js'
import { useState } from 'react'

function App() {
  const [auth, setAuth] = useState(false);

  return (
    <div>
      {auth ? <User setAuth={setAuth} /> : <Guest setAuth={setAuth} />}
    </div>
  );
}

export default App;
