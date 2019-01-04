import todointerface from "./todointerface";

var index=0;


class Todo implements todointerface{
    todo: string[]=new Array(0);

    addTodo(text: string)
    {
        this.todo.push(text);
        console.log("added item to todo list"+" "+this.todo.length);
    }

    removeTodo(id:number){
     
       this.todo.splice(id,1);
       console.log("removed item from todo list"+" "+this.todo.length);
    }

    listTodo(){
          for(index=0;index<this.todo.length;index++)
          {
           console.log(this.todo[index]);
          }
    }
    
}

let todos = new Todo();
todos.addTodo("hello world");
todos.addTodo("hello parthi");
todos.addTodo("hello roshan");
todos.addTodo("hello sunil");
todos.listTodo();
todos.removeTodo(2);
todos.listTodo();