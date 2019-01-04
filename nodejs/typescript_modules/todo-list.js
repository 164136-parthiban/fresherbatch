var index = 0;
var todo = new Array();
var TodoList = /** @class */ (function () {
    function TodoList() {
    }
    TodoList.prototype.addTodo = function (text) {
        todo.push(text);
        console.log("added item to todo list");
    };
    TodoList.prototype.removeTodo = function (id) {
        todo.splice(id, 1);
        console.log("removed item from todo list");
    };
    TodoList.prototype.listTodo = function () {
        for (index = 0; index < todo.length; index++) {
            console.log(todo[index]);
        }
    };
    return TodoList;
}());
var todos = new TodoList();
todos.addTodo("hello world");
todos.addTodo("hello parthi");
todos.addTodo("hello roshan");
todos.addTodo("hello sunil");
todos.listTodo();
todos.removeTodo(2);
todos.listTodo();
