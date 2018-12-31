//Load express
    const express = require("express");
    const app = express();

// Load Body Parser -> it is used to recieve data from request like forms or usually from postman
const bodyParser = require("body-parser");   

//To be able to recieve json data we will write this statement
app.use(bodyParser.json());

// Load mongoose
const mongoose = require("mongoose");

require("./Book")
const Book = mongoose.model("Book");

//Connect mongoose
mongoose.connect("mongodb://AshnaSharma:Prince17@dbh36.mlab.com:27367/booksservice", () => {
    console.log("Our Database is connected");
});



//Creating a get route      
app.get('/', (req,res) => {

    res.send("This is our books service");
}) 

//Create the functionality
app.post("/book",(req,res) => {
    //This is the created functionality
console.log(req.body)

    var newBook = {
        title: req.body.title,
        author: req.body.author,
        numberPages: req.body.numberPages,
        publisher: req.body.publisher

    }

    //with this line we create a new book with the above mentioned attributes.
    var book = new Book(newBook)
    book.save().then(() => {
        console.log("New Book created")
    }).catch((err) => {
        if(err){
            throw err;
        }
    }) 

    res.send("A new book created with success!! ");
})


//Open the express server
app.listen(4545, () => {

    console.log("Up and running!! --This is our books service");
})    


