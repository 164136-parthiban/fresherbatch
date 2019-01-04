const express = require('express');
const app = express();
const router= express.Router();
const Shop= require('./shop');

router.get('/shopping',function(req,res)
{
    Shop.find({}).then(function(shopping){
        res.send(shopping);
});


});

router.post('/shopping',function(req,res)
{
   console.log(req.body);
  
   Shop.create(req.body).then(function(shop)
   {
    res.send(shop);
   });
    
});

router.put('/shopping/:id',function(req,res)
{
    Shop.findByIdAndUpdate({_id:req.params.id},req.body).then(function()
    {
        Shop.findOne({_id:req.params.id}).then(function(shop)
        {
            res.send(shop);
        });

    });

});

router.delete('/shopping/:id',function(req,res)
{
   Shop.findByIdAndRemove({_id:req.params.id}).then(function(shop)
   {
       res.send(shop);
   }) 
    

});

router.get('/shopping/:id',function(req,res)
{
   Shop.findOne({_id:req.params.id}).then(function(shop)
   {
       res.send(shop);
   }) 
    

});

module.exports=router;

