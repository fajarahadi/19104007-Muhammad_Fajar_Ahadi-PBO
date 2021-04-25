function myFunction(a, b, c){
    console.log("Hello, My Name is ", a);
    console.log("I'm ", b, " years old");
    console.log("I like ", c);
}

console.log("\nOutput contoh 1")
myFunction("Fajar Ahadi", 18, "Gaming");

function myFunction2(arg1, arg2){
    this.firstName = arg1;
    this.lastName = arg2;
}

var x = new myFunction2("Japar", "Ahadi");

console.log("\nOutput contoh 2")

console.log(x.firstName);