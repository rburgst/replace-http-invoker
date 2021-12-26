package eu.emundo.replacehttpinvoker.server.modulea.api;

import java.util.List;
import java.util.UUID;

public interface ModuleAQueryFacade {
    List<ItemDto> findAll();

    ItemDto findOne(UUID uuid);
}
