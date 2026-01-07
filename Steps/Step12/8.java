public List<Todo> filterByDone(boolean done) {
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        // TODO: todo의 완료 여부를 확인하는 메서드를 호출하세요
        if (todo.isDone() == done) {
            result.add(todo);
        }
    }

    return result;
}