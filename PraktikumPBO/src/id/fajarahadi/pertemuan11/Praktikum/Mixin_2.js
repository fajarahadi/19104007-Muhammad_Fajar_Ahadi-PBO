// semisal ada property yang sama, propert yang asli tidak berubah

function mixin(receiver, suplier){
    for(var property in suplier){
      if(!receiver.hasOwnProperty(property)){
        receiver[property] = suplier[property]
      }
    }
    return receiver
  }
  
  var person = (function(){
    var name = 'Udin'
    var age = 22
    var element = 'Api'
  
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
    getAge : getAge,
    element : element
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
  var title = new Title('GrandMaster')
  
  mixin(person, title) //penggabungan
  
  console.log('Nama     : ', person.getName())
  console.log('Umur     : ', person.getAge())
  console.log('Title    : ', person.title)
  console.log('Element  : ', person.element)