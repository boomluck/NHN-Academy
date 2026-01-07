public List<Todo> getDueToday() {
    // TODO: 오늘 날짜를 가져오세요
    LocalDate today = LocalDate.now();
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        // TODO: 마감일이 오늘과 같은지 비교하세요
        if (todo.getDueDate().equals(today)) { // isEqual() 메서드 사용함
            result.add(todo);
        }
    }

    return result;
}