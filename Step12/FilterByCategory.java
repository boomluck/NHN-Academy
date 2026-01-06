public List<Todo> filterByCategory(Category category) {
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        // TODO: enum 비교 연산자를 사용하세요
        if (todo.getCategory() == category) {
            result.add(todo);
        }
    }

    return result;
}