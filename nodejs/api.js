const express = require('express');
const app = express();
const router= express.Router();


router.get('/',function(req,res)
{
    res.send('Hello World');

});




module.exports=router;

