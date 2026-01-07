package Day_08;

import Day_07.Todo;

public class Problem_4 {

    public Todo findById(int id) {
        for (Todo todo : todoList) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        // TODO를 찾지 못한 경우
        // ___(1)___;

        throw new TodoNotFoundException(id);
    }
}
