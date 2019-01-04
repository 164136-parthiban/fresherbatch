const express = require('express');
const app = express();
const routes = require('./api');


app.use(routes);

app.listen(process.env.port||4000, function()
{
console.log(' listening for requests');
});