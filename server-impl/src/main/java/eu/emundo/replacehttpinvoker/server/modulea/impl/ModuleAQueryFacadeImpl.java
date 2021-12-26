package eu.emundo.replacehttpinvoker.server.modulea.impl;

import eu.emundo.replacehttpinvoker.server.modulea.api.ItemDto;
import eu.emundo.replacehttpinvoker.server.modulea.api.ModuleAQueryFacade;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ModuleAQueryFacadeImpl implements ModuleAQueryFacade {
    final List<ItemDto> entities;

    public ModuleAQueryFacadeImpl() {
        entities = Arrays.asList(new ItemDto("item1"), new ItemDto("item2"), new ItemDto("item3"));
    }


    @Override
    public List<ItemDto> findAll() {
        return entities;
    }

    @Override
    public ItemDto findOne(UUID uuid) {
        return entities.stream().filter(item -> Objects.equals(item.getId(), uuid)).findFirst().orElse(null);
    }

}
