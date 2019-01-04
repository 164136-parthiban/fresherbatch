const pi=3.14;

interface shape{
color:String;
area();
toString();
}

class Circle implements shape{
    
    radius:number=2;
    areaOfCircle:number;
    
    color="red";

    area() 
    {
    
     this.areaOfCircle=pi*this.radius*this.radius;
     return this.areaOfCircle;
    }

    toString(){
       console.log("Circle"+" "+this.area()+" "+this.color);
    }
}

class Rectangle implements shape{
    
    width:number=2;
    height:number=2;
    result:number;
    
    color="blue";

    area() 
    {
    
     this.result=this.width*this.height;
     return this.result;
    }

    toString(){
       console.log("Rectangle"+" "+this.area()+" "+this.color);
    }
}

let circle= new Circle();
let rectangle = new Rectangle();

circle.toString();
rectangle.toString();
