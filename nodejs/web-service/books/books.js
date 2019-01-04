const express = require('express');
const app = express();
const bodyParser = require("body-parser");


app.use(bodyParser.json());

const mongoose = require('mongoose');
require("./Book");
const Book = mongoose.model("Book");

 mongoose.connect("mongodb://localhost/Book",{ useNewUrlParser: true },()=>{
     console.log("its working");
 });

app.get('/Book/:id',function(req,res)
{
   
    Book.findById(req.params.id).then((book)=>{
          if(book)
          {
              res.json(book);
          } 
          else
          {
              res.sendStatus(404);
          }

      }).catch(err=>{
     if(err){
         throw err;
        }
    });
});

app.get("/Book",(req,res)=>{
Book.find().then((books)=>
{
    res.json(books);
}).catch(err=>
    {
        if(err)
        {
            throw err;
        }
    });
});

app.post("/Book",(req,res)=>{
    var newBook = {
        title:req.body.title,
        author:req.body.author,
        numberPages:req.body.numberPages,
        publisher:req.body.publisher
    }

    var book = new Book(newBook)

    book.save();
    console.log(req.body);
    res.send("new book created in db")
});

app.delete('/Book/:id',(req,res)=>{
  Book.findByIdAndRemove(req.params.id).then(()=>{
      res.send("Book is deleted");
  }).catch(err=>{
      if(err){
          throw err;
      }
  });
});

app.listen(3535);
