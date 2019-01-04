var index=0;
let todo=new Array();


class TodoList{
    addTodo(text: string)
    {
        todo.push(text);
        console.log("added item to todo list");
    }

    removeTodo(id:number){
     
       todo.splice(id,1);
       console.log("removed item from todo list");
    }

    listTodo(){
          for(index=0;index<todo.length;index++)
          {
           console.log(todo[index]);
          }
    }
}

let todos = new TodoList();
todos.addTodo("hello world");
todos.addTodo("hello parthi");
todos.addTodo("hello roshan");
todos.addTodo("hello sunil");
todos.listTodo();
todos.removeTodo(2);
todos.listTodo();