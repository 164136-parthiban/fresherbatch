db.addresses.find(
                    {"address.coord" : 
                       {$type : 1}
                    }
                   );