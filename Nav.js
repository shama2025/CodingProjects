//navbar for airbnb app on react
import React from "react"
import Airbnb from "./images/Airbnb.webp"
export default function Nav(){
    return(
        <div>
            <nav>
                <img className = "nav--logo" src = {Airbnb} alt = ""/>
            </nav>
        </div>
    )
}
