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
 
<br><br>
  
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
