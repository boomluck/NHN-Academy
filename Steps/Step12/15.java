private void showSearchMenu() {
    System.out.println("=== 검색 메뉴 ===");
    System.out.println("1. 제목 검색");
    System.out.println("2. 구분별 조회");
    System.out.println("3. 중요도별 조회");
    System.out.println("4. 오늘 마감");
    System.out.println("5. 이번주 마감");
    System.out.println("6. 미완료만");
    System.out.println("0. 뒤로");
    System.out.print("선택 > ");

    String choice = reader.readLine();

    switch (choice) {
        case "1":
            System.out.print("검색어: ");
            String keyword = reader.readLine();
            // TODO: 제목으로 검색하는 메서드를 호출하세요
            List<Todo> results = service.contains(keyword); // searchByTitle()
            printSearchResult(results, "제목 검색");
            break;
        case "4":
            // TODO: 오늘 마감인 TODO를 조회하는 메서드를 호출하세요
            List<Todo> todayTodos = service.isDueToday(); // getDueToday()
            printSearchResult(todayTodos, "오늘 마감");
            break;
        case "6":
            // TODO: 완료 여부로 필터링하는 메서드를 호출하세요 (미완료 = false)
            List<Todo> incomplete = service.isDone(false); // filterByDone()
            printSearchResult(incomplete, "미완료");
            break;
        // ...
    }
}