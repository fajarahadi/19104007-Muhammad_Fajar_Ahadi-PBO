function reflect(value) {
    return value
}

console.log(reflect('Halo'));
console.log(reflect('Hari ini hari ke ', 2));
console.log('Panjang argument : ',reflect.length);

reflect = function() {
    return arguments[1];
}

console.log(reflect('Halo'));
console.log(reflect('Hari ini hari ke ', 2));
console.log('Panjang argument : ',reflect.length);