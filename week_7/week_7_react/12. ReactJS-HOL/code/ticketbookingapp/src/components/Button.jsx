import React from "react";

function Button({ handlerFn, label }) {
  return (
    <div>
      <button onClick={handlerFn}>{label}</button>
    </div>
  );
}

export default Button;
