import Button from "./Button.jsx";

function ClickEvent() {
  const handleClick = () => {
    alert("I was clicked");
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
      <Button handlerFn={handleClick} label={"Click On Me"} />
    </div>
  );
}

export default ClickEvent;
