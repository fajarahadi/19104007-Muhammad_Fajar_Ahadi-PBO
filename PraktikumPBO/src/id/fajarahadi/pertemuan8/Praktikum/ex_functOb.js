var person = new Biodata('Fajar', 'Azawa', 2001)

console.log('Object dari person\t: ')
console.log(`Name\t: ${person.fullName()}`)
console.log(`Tahun\t: ${person.year}`)
console.log(`Umur\t: ${person.age()}`)

function Biodata(firstName, lastName, year){
  this.firstName = firstName
  this.lastName = lastName
  this.year = year
  this.fullName = function(){
    return(this.firstName + " " + this.lastName)
  }
  this.age = function(){
    return 2020 - this.year
  }
}