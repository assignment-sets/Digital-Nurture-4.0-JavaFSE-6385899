import React from "react";

function BookTickets() {
  const handleSubmit = (e) => {
    e.preventDefault();
    // logic can be added ...
    alert("flight booked");
  };

  return (
    <div>
      <h2>Book Your Ticket</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>From: </label>
          <input type="text" placeholder="Enter origin city" />
        </div>
        <div>
          <label>To: </label>
          <input type="text" placeholder="Enter destination city" />
        </div>
        <div>
          <label>Date: </label>
          <input type="date" />
        </div>
        <button type="submit">Book</button>
      </form>
    </div>
  );
}

export default BookTickets;
