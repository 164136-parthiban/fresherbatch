const express = require('express');
const app = express();
const router= express.Router();
const Ninja= require('./ninja');

router.get('/ninjas',function(req,res)
{
    res.send({type:'GET'});

});

router.post('/ninjas',function(req,res)
{
   console.log(req.body);
  
   Ninja.create(req.body).then(function(ninja){
    res.send(ninja);
   });
    
});

router.put('/ninjas/:id',function(req,res)
{
    res.send({type:'PUT'});

});

router.delete('/ninjas/:id',function(req,res)
{
   Ninja.findByIdAndRemove({_id:req.params.id}).then(function(ninja)
   {
       res.send(ninja);
   }) 
    

});

module.exports=router;

