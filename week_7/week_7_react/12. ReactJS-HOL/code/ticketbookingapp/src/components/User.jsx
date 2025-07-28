import React from "react";
import {Button, BookTickets} from './getComponents'

function User({ setAuth }) {
  const handleLogout = () => {
    setAuth(false);
  };
  return (
    <div>
      <h1>Welcome Back</h1>
      <BookTickets />
      <Button handlerFn={handleLogout} label={"Logout"} />
    </div>
  );
}

export default User;
