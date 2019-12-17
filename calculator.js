"use strict";

const x = document.getElementById("input-1");
const y = document.getElementById("input-2");
const resultElement = document.getElementById("answer");
const historyElement = document.getElementById("calc");

function getValue(arg) {
  return Number.parseFloat(arg.value);
}

function setResult(value) {
  return (resultElement.value = value);
}

function setHistory(x, y, operation, result) {
  let newP = document.createElement("p");
  newP.innerText = x + operation + y + " = " + result;
  historyElement.appendChild(newP);

  newP.addEventListener('click', (e) => {
      num1.value = x;
      num2.value = y;
      resultElement.value = 
  })
}

function plusFunc() {
  let result = getValue(x) + getValue(y);
  setResult(result);
  setHistory(getValue(x), getValue(y), " + ", result);
  return result;
}

function minusFunc() {
  let result = getValue(x) + getValue(y);
  setResult(result);
  setHistory(getValue(x), getValue(y), " - ", result);
  return result;
}

function multiplyFunc() {
  let result = getValue(x) + getValue(y);
  setResult(result);
  setHistory(getValue(x), getValue(y), " * ", result);
  return result;
}

function divsionFunc() {
  let result = getValue(x) + getValue(y);
  setResult(result);
  setHistory(getValue(x), getValue(y), " / ", result);
  return result;
}
