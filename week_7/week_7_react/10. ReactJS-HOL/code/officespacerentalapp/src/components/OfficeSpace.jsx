import React from "react";

const OfficeSpace = () => {
  const itemName = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
  };

  const getRentColor = (rent) => {
    return rent <= 60000 ? "red" : "green";
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial", color: '#000000' }}>
      <h1>Office Space, at Affordable Range</h1>

      <img
        src="https://images.unsplash.com/photo-1573164713988-8665fc963095"
        width="400"
        height="250"
        alt="Office space"
        style={{ borderRadius: "8px", marginBottom: "20px" }}
      />

      <h2>Single Office Info</h2>
      <p>
        <strong>Name:</strong> {itemName.name}
      </p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: getRentColor(itemName.rent) }}>
          ₹{itemName.rent}
        </span>
      </p>
      <p>
        <strong>Address:</strong> {itemName.address}
      </p>
    </div>
  );
};

export default OfficeSpace;
