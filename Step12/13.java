int totalHours = todoList.stream()
    // TODO: 각 todo의 hours를 int로 변환하세요
    .mapToInt(Todo::getHours)
    // TODO: 합계를 계산하세요
    .sum();