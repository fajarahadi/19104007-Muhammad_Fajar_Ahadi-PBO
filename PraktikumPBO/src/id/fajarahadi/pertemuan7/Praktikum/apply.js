var person = {
    fullName : function(birth, city){
        return this.firstName + " " + this.lastName + ", " + birth + ", " + city;
    }
};

var person1 = {
    firstName : "Fajar",
    lastName : "Ahadi"
};


console.log(person.fullName.apply(person1, ["Maret", "Bandung"]));