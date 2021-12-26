package eu.emundo.replacehttpinvoker.server.modulea.api;

import java.io.Serializable;
import java.util.UUID;

public class ItemDto implements Serializable {
    private UUID id;
    private String name;

    public ItemDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public ItemDto(String name) {
        this(UUID.randomUUID(), name);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
