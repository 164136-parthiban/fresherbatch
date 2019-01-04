import TodoItem from "./todoitem";

interface TodoList 
{
    todoList:TodoItem[];
    addTodo(text:TodoItem);
    removeTodo(text:TodoItem);
    listTodo();
 
}

export default TodoList;