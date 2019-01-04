const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const routes = require('./api');
const mongoose= require('mongoose');

mongoose.connect('mongodb://localhost/shopping');
mongoose.Promise=global.Promise;

app.use(bodyParser.json());

app.use('/api',routes);

app.listen(process.env.port||4000, function()
{
console.log(' listening for requests');
});