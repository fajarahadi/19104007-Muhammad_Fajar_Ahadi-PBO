var person = {
  firstName : 'Japar',
  lastName : 'Ahadi',
  year : 2001,
  fullName : function(){
    return(this.firstName + " " + this.lastName)
  },
  age : function(){
    return 2020 - this.year
  }
}

console.log('Object dari person\t: ')
console.log(`Name\t: ${person.fullName()}`)
console.log(`Tahun\t: ${person.year}`)
console.log(`Umur\t: ${person.age()}`)