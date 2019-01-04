import todoItem from "./todoitem";
import todoList from "./todolist";


var index=0;

class TodoItem implements  todoItem{
  
    title: String; 
    status: boolean=true;
    updatedAt: Date;

    toggleStatus()
    {
       if(this.status==false)
       {
         this.status=true;
       }
       else
       {
        this.status=false; 
       }
       console.log("\n"+this.status);
    }
   
    constructor(title: String,updatedAt: Date)
    {
        this.title=title;
        this.updatedAt=updatedAt;
    }

}

class TodoList implements todoList
{
    
    todoList: todoItem[]= new Array();  
   
    addTodo(text: todoItem) 
    {
       this.todoList.push(text);
       console.log("added item to todo list"+" "+this.todoList.length);
       
    }

    removeTodo(text: todoItem) 
    {
        for(index=0;index<this.todoList.length;index++)
        {
            if(this.todoList[index] == text)
            {
                this.todoList.splice(index,1);
            }
        }
        console.log("removed item from todo list");
    }

    listTodo()
    {
        for(index=0;index<this.todoList.length;index++)
        {
            console.log("\n"+this.todoList[index].title+"=>"+this.todoList[index].updatedAt);
        }
    }

    
}

let item1= new TodoItem("hello world",new Date());
let item2= new TodoItem("hello parthi",new Date());
let item3= new TodoItem("hello sunil",new Date());
let task= new TodoList();

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