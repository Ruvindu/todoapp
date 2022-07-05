# todoapp
todoapp developed using Spring boot rest APIs.

![todo app er](https://github.com/Ruvindu/todoapp/blob/main/er.png?raw=true)

<hr>

<h6>Rest endpoints<h6>
  
<b>POST</b>

<span>Create category</span><br>
<i>http://localhost:8080/api/v1/createcate</i>
<pre>
{
      "catId":1,
      "catName": "College/School"
}
</pre>
 
<br>
  
<span>Create todo</span><br>
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
  
<b>GET</b>
  
<span>Get category</span><br>
<i>http://localhost:8080/api/v1/getcates</i>

<br>
  
<span>Get todos</span><br>
<i>http://localhost:8080/api/v1/gettodos</i>
  
<br>
  
<span>Get important todos</b><br>
<i>http://localhost:8080/api/v1/getimportants</i>
 
  
<br>
  
<span>Get todos cat wise</span><br>
<i>http://localhost:8080/api/v1/gettodosbycat/3</i>
  
<b>PUT</b>
  
<span>Update todo</span><br>
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
  
<span>Update todo as important</span><br>
<i>http://localhost:8080/api/v1/updateimportant</i>
<pre>
{
    "todo_id":1,
    "important": true
}
</pre>
  
<br>
  
<span>Update todo status</span><br>
<i>http://localhost:8080/api/v1/updatestatus</i>
<pre>
{
    "todo_id":1,
    "status": -1
}
</pre>
  
