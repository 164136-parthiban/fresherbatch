const express = require('express');
const app = express();

app.get('/year',function(req,res)
{
    var age=req.query.age;
    var date = new Date();
    var year = date.getFullYear();
    console.log(year-age);
    res.send({you_were_born_on :year-age});

});
app.listen(4000);
console.log('listening to port');
