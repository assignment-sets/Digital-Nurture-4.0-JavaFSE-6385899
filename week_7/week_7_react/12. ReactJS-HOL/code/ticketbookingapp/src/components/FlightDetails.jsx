import React from "react";

function FlightDetails() {
  const flights = [
    { id: 1, from: "Delhi", to: "Mumbai", price: 4500 },
    { id: 2, from: "Bangalore", to: "Goa", price: 2800 },
    { id: 3, from: "Chennai", to: "Hyderabad", price: 3200 },
  ];

  return (
    <div>
      <h2>Available Flights</h2>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} → {flight.to} – ₹{flight.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightDetails;
