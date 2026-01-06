public List<Todo> search(String keyword, Category category, Boolean done) {
    List<Todo> result = new ArrayList<>();

    for (Todo todo : todoList) {
        // 제목 검색 (keyword가 null이거나 빈 문자열이면 스킵)
        // TODO: 문자열이 비어있는지 확인하는 메서드를 호출하세요
        if (keyword != null && !keyword.isEqual()) { // !keyword.isEmpty()를 사용
            if (!todo.getTitle().contains(keyword)) {
                // TODO: 반복문을 다음으로 넘기는 키워드를 사용하세요
                continue;
            }
        }

        // 구분 필터 (category가 null이면 스킵)
        // TODO: null이 아닌지 비교하는 연산자를 사용하세요
        if (category != null) {
            if (todo.getCategory() != category) {
                continue;
            }
        }

        // 완료 여부 필터
        if (done != null) {
            if (todo.isDone() != done) {
                continue;
            }
        }

        result.add(todo);
    }

    return result;
}