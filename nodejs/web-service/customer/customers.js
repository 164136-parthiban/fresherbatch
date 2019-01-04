const express = require('express');
const app = express();
const bodyParser = require("body-parser");


app.use(bodyParser.json());

const mongoose = require('mongoose');
require("./Customer");
const Customer = mongoose.model("Customer");

 mongoose.connect("mongodb://localhost/Customer",{ useNewUrlParser: true },()=>{
     console.log("its working");
 });

app.get('/Customer/:id',function(req,res)
{
   
    Customer.findById(req.params.id).then((customer)=>{
          if(customer)
          {
              res.json(customer);
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

app.get("/Customer",(req,res)=>{
    Customer.find().then((customers)=>
{
    res.json(customers);
}).catch(err=>
    {
        if(err)
        {
            throw err;
        }
    });
});

app.post("/Customer",(req,res)=>{
    var newCustomer = {
        name:req.body.name,
        age:req.body.age,
        address:req.body.address
    }

    var customer = new Customer(newCustomer)

    customer.save();
    console.log(req.body);
    res.send("new customer created in db")
});

app.delete('/Customer/:id',(req,res)=>{
    Customer.findByIdAndRemove(req.params.id).then(()=>{
      res.send("Customer is deleted");
  }).catch(err=>{
      if(err){
          throw err;
      }
  });
});

app.listen(4545);