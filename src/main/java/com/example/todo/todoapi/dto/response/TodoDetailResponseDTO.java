package com.example.todo.todoapi.dto.response;

import com.example.todo.todoapi.entity.Todo;
import lombok.*;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDetailResponseDTO { // 클라이언트 단에게 전달하기 위한 용도로 사용 될 DTO

    private String id;
    private String title;
    private boolean done;

    public TodoDetailResponseDTO(Todo todo) {
        this.id = todo.getTodoId();
        this.title = todo.getTitle();
        this.done = todo.isDone();
    }
}
