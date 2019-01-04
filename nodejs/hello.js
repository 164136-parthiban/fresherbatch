var http = require('http');

http.createServer(function (req, res) 
{
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.end('Hello World!');
  res.end('Hello Parthi!');
  
}).listen(8081);