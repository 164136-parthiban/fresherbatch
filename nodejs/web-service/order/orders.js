const express = require('express');
const app = express();
const bodyParser = require("body-parser");
const axios = require("axios");

app.use(bodyParser.json());

const mongoose = require('mongoose');
require("./Order");
const Order = mongoose.model("Order");

 mongoose.connect("mongodb://localhost/Order",{ useNewUrlParser: true },()=>{
     console.log("its working");
 });

 app.post("/order",(req,res)=>{
    var newOrder = {
        CustomerID:mongoose.Types.ObjectId(req.body.CustomerID),
        BookID:mongoose.Types.ObjectId(req.body.BookID),
        initialDate:req.body.initialDate,
        deliveryDate:req.body.deliveryDate
    }

    var order = new Order(newOrder)

    order.save();
    console.log(req.body);
    res.send("new order created in db")
 });

 app.get("/order",(req,res)=>{
    Order.find().then((orders)=>
{
    res.json(orders);
}).catch(err=>
    {
        if(err)
        {
            throw err;
        }
    });
});

app.get('/order/:id',function(req,res)
{
   
    Order.findById(req.params.id).then((order)=>{
          if(order)
          {
             axios.get("http://localhost:4545/customer/"+order.CustomerID).then((response)=>{
                 var orderObject = {customerName:response.data.name, bookTitle:""};
                 
                 axios.get("http://localhost:3535/Book/"+order.BookID).then((response)=>{
                      orderObject.bookTitle=response.data.title;
                      res.json(orderObject);
                })
             });
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




 app.listen(8585);