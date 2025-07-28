import { useState } from "react";
import Button from "./Button.jsx";

function CurrencyConv() {
  const [inr, setInr] = useState(0);
  const [eur, setEur] = useState(0);
  const conversion_rate = 0.0098;

  const handleSubmit = () => {
    const convertedCurr = (inr * conversion_rate).toFixed(2);
    setEur(Number(convertedCurr));
    alert(`converted amt in EUR is ${convertedCurr}`);
  };

  return (
    <div
      style={{
        textAlign: "center",
        display: "flex",
        flexDirection: "column",
        padding: "1rem",
        fontFamily: "Arial",
      }}
    >
      <h1>Currency Converter</h1>
      <form
        style={{
          display: "flex",
          flexDirection: "column",
          gap: "1rem",
          marginBottom: "1rem",
        }}
      >
        <label>Amount in INR: </label>
        <input type="number" onChange={(e) => setInr(e.target.value)} />

        <label>Currency in EUR: </label>
        <input type="number" value={eur} readOnly={true} />
      </form>

      <Button handlerFn={handleSubmit} label={"Submit"} />
    </div>
  );
}

export default CurrencyConv;
