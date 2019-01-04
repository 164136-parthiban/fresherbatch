db.addresses.find(
                     {"address.street" : 
                         { $exists : true } 
                     } 
                   );