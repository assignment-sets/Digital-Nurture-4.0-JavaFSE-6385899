import React from "react";

function Button({ handlerFn, label }) {
  return (
    <button
      onClick={handlerFn}
      style={{
        padding: "10px 20px",
        backgroundColor: "#007bff",
        color: "#fff",
        border: "none",
        borderRadius: "4px",
        cursor: "pointer",
      }}
    >
      {label}
    </button>
  );
}

export default Button;
