import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public List<Todo> getDueThisWeek() {
    LocalDate today = LocalDate.now();
    // TODO: 이번주 월요일을 구하세요 (오늘이 월요일이면 오늘)
    LocalDate startOfWeek = today.with(
        TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); // 전혀 몰랐음
    // TODO: 이번주 일요일을 구하세요 (오늘이 일요일이면 오늘)
    LocalDate endOfWeek = today.with(
        TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); // 전혀 몰랐음

    return filterByDueDateRange(startOfWeek, endOfWeek);
}