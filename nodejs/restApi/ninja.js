const mongoose = require('mongoose');
const schema = mongoose.Schema;

const ninjaSchema= new schema({
    name:{
        type:String,
        required:[true,'Name field is required']
    },
    rank:{
        type:String
    },
    available:{
        type:Boolean,
        default:false
    }

});

const Ninja = mongoose.model('ninja',ninjaSchema);


module.exports=Ninja;