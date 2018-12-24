var events=require("events");
var emitter=new events.EventEmitter();

var uid="Ashna";
var password="ashu";

emitter.on("addUser", function(user,pass) {
console.log("Added user  "+user);
});

emitter.emit("addUser", uid, password);