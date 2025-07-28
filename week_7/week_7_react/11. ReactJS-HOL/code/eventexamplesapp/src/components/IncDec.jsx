import { useState } from "react";
import Button from "./Button.jsx";

function IncDec() {
  const [cnt, setCnt] = useState(0);

  const handleCntUpdate = (delta) => {
    const updatedCnt = cnt + delta;
    setCnt(updatedCnt);
  };

  const handleGreetMsg = (greeting) => {
    alert(greeting);
  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        gap: "1rem",
        padding: "1rem",
        fontFamily: "Arial",
      }}
    >
      <h2>{cnt}</h2>
      <Button
        handlerFn={() => {
          handleCntUpdate(1);
          handleGreetMsg("Hello Member");
        }}
        label={"Increment"}
      />
      <Button handlerFn={() => handleCntUpdate(-1)} label={"Decrement"} />
    </div>
  );
}

export default IncDec;
