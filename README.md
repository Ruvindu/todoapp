# todoapp
todoapp developed using Spring boot rest APIs.

![todo app er](https://github.com/Ruvindu/todoapp/blob/main/er.png?raw=true)

<hr>

<h6>Rest endpoints<h6>
  
<b>POST<b>

<b>Create category</b><br>
<i>http://localhost:8080/api/v1/createcate</i>
<pre>
{
      "catId":1,
      "catName": "College/School"
}
</pre>
 
<br>
  
<b>Create todo</b><br>
<i>http://localhost:8080/api/v1/createtodo</i>
<pre>
{
    "title":"Create reseach presentation",
    "description": "Write last slide",
    "important": 1,
    "status": 0,
    "remind_at": "2022-06-30T05:34:50",
    "todoCategory": {
        "catId":1
    }
}
</pre>
  
<br>
  
<b>GET<b>
  
<b>Get category</b><br>
<i>http://localhost:8080/api/v1/getcates</i>

<br>
  
<b>Get todos</b><br>
<i>http://localhost:8080/api/v1/gettodos</i>
  
<br>
  
<b>Get important todos</b><br>
<i>http://localhost:8080/api/v1/getimportants</i>
 
  
<br>
  
<b>Get todos cat wise</b><br>
<i>http://localhost:8080/api/v1/gettodosbycat/3</i>
  
<b>PUT<b>
  
<b>Update todo</b><br>
<i>http://localhost:8080/api/v1/updatetodo</i>
<pre>
{   
     "todoId":1,
    "title": "Go to Shopping",
    "description": "",
    "remind": 1,
    "important": 0,
    "status": 0,
    "remind_at": "2022-06-25T05:34:50.00",
    "todoCategory": {
        "catId":3
    }
}
</pre>
  
<br>
  
<b>Update todo as important</b><br>
<i>http://localhost:8080/api/v1/updateimportant</i>
<pre>
{
    "todo_id":1,
    "important": true
}
</pre>
  
<br>
  
<b>Update todo status</b><br>
<i>http://localhost:8080/api/v1/updatestatus</i>
<pre>
{
    "todo_id":1,
    "status": -1
}
</pre>
  
