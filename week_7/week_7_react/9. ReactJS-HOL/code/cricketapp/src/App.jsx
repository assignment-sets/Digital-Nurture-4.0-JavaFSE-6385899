import "./App.css";
import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";
import {useState} from 'react'

function App() {
  const [flag, setFlag] = useState(false);

  return (
    <div className="App">
      <label>
        <input
          type="checkbox" // Changed to checkbox
          checked={flag}
          onChange={() => setFlag(!flag)}
        />
        flag
      </label>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
