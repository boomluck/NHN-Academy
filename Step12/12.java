long completedCount = todoList.stream()
    // TODO: 완료된 항목만 필터링하세요
    .filter(todo -> todo.isDone())
    // TODO: 개수를 세는 메서드를 호출하세요
    .count();