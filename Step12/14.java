int result = todolist.stream()
.isAfter(due)
.!isDone();