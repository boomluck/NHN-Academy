public List<Todo> filterByDueDateRange(LocalDate from, LocalDate to) {
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        LocalDate dueDate = todo.getDueDate();

        // from <= dueDate <= to 조건을 만족하려면?
        // TODO: dueDate가 from 이전인지, to 이후인지 확인하는 메서드를 사용하세요
        if (!dueDate.isBefore(from) && !dueDate.isAfter(to)) {
            result.add(todo);
        }
    }

    return result;
}