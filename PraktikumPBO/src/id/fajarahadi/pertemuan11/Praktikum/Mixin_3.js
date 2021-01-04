
function mixin(receiver, suplier){
    if(arguments.lenght > 2){
      for(var i = 2, len = arguments.lenght; i < len; i++){
        if(!receiver.hasOwnProperty(arguments[i])){
          receiver[arguments[i]] =suplier[arguments[i]]
        }
      }
    } else {
      for(var property in suplier){
        if(suplier.hasOwnProperty(property)){
            receiver[property] = suplier[property]
        }
      }
    }
    return receiver
  }
  
  var person = (function(){
    var name = 'Udin'
    var age = 22
  
    function setName(newName){
      name = newName
    }
  
    function getName(){
      return name
    }
  
    function getAge(){
      return age
    }
  
    function getElement(){
  
    }
  
    return{
    setName : setName,
    getName : getName,
    getAge : getAge
    }
  }())
  
  var Title = (function(){
    var element = 'Animo'
  
    function InnerTitle(title){
      this.title = title
      this.element = element
    }
    return InnerTitle
  }())
  
  person.setName('Jarviz')
  var title = new Title('BookMaster')
  
  mixin(person, title, 'title') //penggabungan
  
  console.log('Nama     : ', person.getName())
  console.log('Umur     : ', person.getAge())
  console.log('Title    : ', person.title)
  console.log('Element  : ', person.element)