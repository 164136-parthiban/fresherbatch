const mongoose = require('mongoose');
const schema = mongoose.Schema;

const shopSchema= new schema({
    name:{
        type:String,
        required:[true,'Name field is required']
    },
    price:{
        type:String
    },
    available:{
        type:Boolean,
        default:false
    }

});

const Shop = mongoose.model('shop',shopSchema);


module.exports=Shop;