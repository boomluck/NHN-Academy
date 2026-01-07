public List<Todo> searchByTitle(String keyword) {
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        // TODO: 제목에 keyword가 포함되어 있는지 확인하세요
        if (todo.getTitle().contains(keyword)) {
            // TODO: 결과 리스트에 todo를 추가하세요
            result.add(todo);
        }
    }

    return result;
}