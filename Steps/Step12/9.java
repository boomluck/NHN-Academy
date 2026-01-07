public double getCompletionRate() {
    // TODO: 리스트가 비어있는지 확인하세요
    if (todoList.isEmpty()) {
        return 0.0;
    }

    // TODO: 완료된 항목의 개수를 구하세요
    int completed = filterByDone(true).size();
    // TODO: 전체 리스트 개수로 나누어 완료율 계산
    return (double) completed / todoList.size() * 100;
}