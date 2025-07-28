import "./App.css";
import CurrencyConv from "./components/CurrencyConv";
import IncDec from "./components/IncDec";
import Welcome from "./components/Welcome";
import ClickEvent from "./components/ClickEvent";

function App() {
  return (
    <div>
      <IncDec />
      <Welcome />
      <ClickEvent />
      <CurrencyConv />
    </div>
  );
}

export default App;
