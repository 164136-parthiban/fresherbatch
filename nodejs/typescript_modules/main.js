"use strict";
exports.__esModule = true;
var index = 0;
var Todo = /** @class */ (function () {
    function Todo() {
        this.todo = new Array(0);
    }
    Todo.prototype.addTodo = function (text) {
        this.todo.push(text);
        console.log("added item to todo list" + " " + this.todo.length);
    };
    Todo.prototype.removeTodo = function (id) {
        this.todo.splice(id, 1);
        console.log("removed item from todo list" + " " + this.todo.length);
    };
    Todo.prototype.listTodo = function () {
        for (index = 0; index < this.todo.length; index++) {
            console.log(this.todo[index]);
        }
    };
    return Todo;
}());
var todos = new Todo();
todos.addTodo("hello world");
todos.addTodo("hello parthi");
todos.addTodo("hello roshan");
todos.addTodo("hello sunil");
todos.listTodo();
todos.removeTodo(2);
todos.listTodo();
