// for문 방식
public List<Todo> filterByCategory_for(Category category) {
    List<Todo> result = new ArrayList<>();
    for (Todo todo : todoList) {
        if (todo.getCategory() == category) {
            result.add(todo);
        }
    }
    return result;
}

// Stream 방식으로 변환
public List<Todo> filterByCategory_stream(Category category) {
    // TODO: 리스트를 스트림으로 변환하세요
    return todoList.stream()
        // TODO: 조건에 맞는 요소만 필터링하세요
        .filter(todo -> todo.getCategory() == category)
        // TODO: 결과를 리스트로 수집하세요
        .add(Collectors.toList()); // add -> collect
}