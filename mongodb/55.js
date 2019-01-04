db.addresses.find(
                   { name : 
                     { $regex : /^Mad/i, } 
                   },
                       {
                         "name":1,
                         "borough":1,
                         "address.coord":1,
                         "cuisine" :1
                        }
                   );