//the review underneath the picture
import React from "react"
import Women from "./images/image12.png"
import Star from "./images/Star1.png"
//__SECRET_INTERNALS_DO_NOT_USE_OR_YOU_WILL_BE_FIRED
export default function Card(){
    return(
        <div>
<img className = "card--women"src = {Women} alt = "" />


<div className = "card--stats">
<img src= {Star} clasName = "card--star"alt = "" />
                <span>5.0</span>
                <span className = "gray">(6) • </span>
                <span className = "gray">USA</span>
            </div>
            <p>Life Lessons with Katie Zaferes</p>
            <p><span className = "bold">From $136</span> / person</p>
        </div>
       
    )
}
