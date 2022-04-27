//Text and picture for airbnb app
import React from "react"
import Photo from "./images/Group77.png"
export default function Hero(){
    return(
<div>
<section>
<img src = {Photo} alt = "" className = "hero--logo"/>
<h1 className = "hero--header">Online Experiences</h1>
<p className = "hero--words">Activities...</p>
</section>

</div>
    )
}
