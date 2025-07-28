import React from "react";
import {Button, FlightDetails} from './getComponents'
function Guest({ setAuth }) {
  const handleLogin = () => {
    setAuth(true);
  };
  return (
    <div>
      <h1>Please Sign Up</h1>
      <FlightDetails />
      <Button handlerFn={handleLogin} label={"Login"} />
    </div>
  );
}

export default Guest;
