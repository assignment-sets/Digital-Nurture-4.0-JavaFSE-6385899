import './App.css';
import { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const [view, setView] = useState("book");
  const [showCourse, setShowCourse] = useState(false);

  const getButtonStyle = (isActive) => ({
    marginRight: "0.5rem",
    padding: "0.5rem 1rem",
    backgroundColor: isActive ? "#007bff" : "#f0f0f0",
    color: isActive ? "#fff" : "#000",
    border: "1px solid #ccc",
    borderRadius: "4px",
    cursor: isActive ? "default" : "pointer",
    opacity: isActive ? 0.7 : 1,
  });

  return (
    <div style={{ padding: "1rem", fontFamily: "Arial" }}>
      <h1>Blogger App</h1>

      <div style={{ marginBottom: "1rem" }}>
        <button
          style={getButtonStyle(view === "book")}
          onClick={() => setView("book")}
          disabled={view === "book"}
        >
          Show Book
        </button>
        <button
          style={getButtonStyle(view === "blog")}
          onClick={() => setView("blog")}
          disabled={view === "blog"}
        >
          Show Blog
        </button>
        <button
          style={getButtonStyle(showCourse)}
          onClick={() => setShowCourse(!showCourse)}
        >
          Toggle Course
        </button>
      </div>

      {/* optional. ternary rendering */}  
      {view === "book" ? <BookDetails /> : view === "blog" ? <BlogDetails /> : null}

      {/* 1. if/else rendering */}
      {/* {(() => {
        if (view === "book") return <BookDetails />;
        else if (view === "blog") return <BlogDetails />;
        else return null;
      })()} */}

      {/* 2. Logical && rendering */}
      {showCourse && <CourseDetails />}
    </div>
  );
}

export default App;
