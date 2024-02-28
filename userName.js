function sayHello() {
  const userName = prompt("Enter your name:");

  if (userName) {
    alert("Hello, " + userName + "!");
  } else {
    alert("Hello, World!");
  }
}

sayHello();
