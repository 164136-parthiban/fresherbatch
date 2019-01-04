"use strict";
exports.__esModule = true;
var index = 0;
var TodoItem = /** @class */ (function () {
    function TodoItem(title, updatedAt) {
        this.status = true;
        this.title = title;
        this.updatedAt = updatedAt;
    }
    TodoItem.prototype.toggleStatus = function () {
        if (this.status == false) {
            this.status = true;
        }
        else {
            this.status = false;
        }
        console.log("\n" + this.status);
    };
    return TodoItem;
}());
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.todoList = new Array();
    }
    TodoList.prototype.addTodo = function (text) {
        this.todoList.push(text);
        console.log("added item to todo list" + " " + this.todoList.length);
    };
    TodoList.prototype.removeTodo = function (text) {
        for (index = 0; index < this.todoList.length; index++) {
            if (this.todoList[index] == text) {
                this.todoList.splice(index, 1);
            }
        }
        console.log("removed item from todo list");
    };
    TodoList.prototype.listTodo = function () {
        for (index = 0; index < this.todoList.length; index++) {
            console.log("\n" + this.todoList[index].title + "=>" + this.todoList[index].updatedAt);
        }
    };
    return TodoList;
}());
var item1 = new TodoItem("hello world", new Date());
var item2 = new TodoItem("hello parthi", new Date());
var item3 = new TodoItem("hello sunil", new Date());
var task = new TodoList();
item1.toggleStatus();
task.addTodo(item1);
item1.toggleStatus();
item2.toggleStatus();
task.addTodo(item2);
item2.toggleStatus();
item3.toggleStatus();
task.addTodo(item3);
item3.toggleStatus();
task.listTodo();
task.removeTodo(item1);
task.listTodo();
