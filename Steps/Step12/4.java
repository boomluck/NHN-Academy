public void printCategoryStats() {
    System.out.println("=== 구분별 통계 ===");

    // TODO: enum의 모든 값을 가져오는 메서드를 호출하세요
    for (Category category : Category.values()) {
        List<Todo> filtered = filterByCategory(category);
        // TODO: 구분 이름과 필터링된 리스트의 개수를 출력하세요
        System.out.printf("%s: %d건%n",
            category.size(), // category.getDisplayName() 이라는 메서드가 정의되어 있나 봄
            filtered.size());
    }
}