var person = {
    fullName : function(){
        return this.firstName + " " + this.lastName;
    }
}

var person1 = {
    firstName : "Muhammad",
    lastName : "Fajar"
}

var person2 ={
    firstName : "Fajar",
    lastName : "Ahadi"
}

console.log("Menggunakan method call untuk menampilkan objek person 2 : ")

console.log(person.fullName.call(person2));