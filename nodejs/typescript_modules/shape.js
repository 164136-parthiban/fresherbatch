var pi = 3.14;
var Circle = /** @class */ (function () {
    function Circle() {
        this.radius = 2;
        this.color = "red";
    }
    Circle.prototype.area = function () {
        this.areaOfCircle = pi * this.radius * this.radius;
        return this.areaOfCircle;
    };
    Circle.prototype.toString = function () {
        console.log("Circle" + " " + this.area() + " " + this.color);
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle() {
        this.width = 2;
        this.height = 2;
        this.color = "blue";
    }
    Rectangle.prototype.area = function () {
        this.result = this.width * this.height;
        return this.result;
    };
    Rectangle.prototype.toString = function () {
        console.log("Rectangle" + " " + this.area() + " " + this.color);
    };
    return Rectangle;
}());
var circle = new Circle();
var rectangle = new Rectangle();
circle.toString();
rectangle.toString();
