const mongoose = require ("mongoose");

//Creating a model which is a reference for collection

mongoose.model("Book",{
    //title,author,numberPages,publsher

    title : {
        type : String,
        require : true
    },
    author : {
        type : String,
        require : true
    },
    numberPages : {
        type : Number,
        require : false
    },
    publisher : {
        type : String,
        require : false
    }


})