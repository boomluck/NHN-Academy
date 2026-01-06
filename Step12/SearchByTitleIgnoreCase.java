public List<Todo> searchByTitleIgnoreCase(String keyword) {
    List<Todo> result = new ArrayList<>();
    // TODO: keyword를 소문자로 변환하세요
    String lowerKeyword = keyword.toLowerCase();

    for (Todo todo : todoList) {
        // TODO: 제목을 소문자로 변환 후 lowerKeyword 포함 여부 확인
        if (todo.getTitle().toLowerCase().contains(lowerKeyword)) {
            result.add(todo);
        }
    }

    return result;
}