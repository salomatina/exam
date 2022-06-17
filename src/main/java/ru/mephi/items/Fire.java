package ru.mephi.items;

import java.time.LocalDateTime;

public class Fire {
    private final LocalDateTime created;

    public Fire() {
        created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
