"use strict";
function greeting() {
  const button = document.getElementById("my-button");
  if (button.innerText === "OFF") {
    button.innerText = "ON";
  } else {
    button.innerText = "OFF";
  }
}

function reset() {
  const button_2 = document.getElementById("my-button");
  button_2.innerText = "OFF";
  const newP = document.createElement("p");
  newP.innerText = new Date();
  document.getElementById("dates").appendChild(newP);
}
