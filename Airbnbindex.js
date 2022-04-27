//calling all of the previous airbnb js files
import React from "react"
import ReactDOM from "react-dom/client"
import "./index.css"
import Nav from "./Nav.js"
import Hero from "./Hero.js"
import Card from "./Card.js"


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
<div>
  <Nav />
  <Hero />
  <Card />
</div>
);
