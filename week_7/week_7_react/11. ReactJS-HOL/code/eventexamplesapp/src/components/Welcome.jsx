import React from "react";
import Button from "./Button";

function Welcome() {
  const handleClick = (welcomeTxt) => {
    alert(welcomeTxt);
  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        padding: "1rem",
        fontFamily: "Arial",
      }}
    >
      <Button handlerFn={() => handleClick("Welcome user")} label={"Welcome"} />
    </div>
  );
}

export default Welcome;
