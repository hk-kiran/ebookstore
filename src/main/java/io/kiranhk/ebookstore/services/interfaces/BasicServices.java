package io.kiranhk.ebookstore.services.interfaces;

import java.util.List;

public interface BasicServices<obj> {
    obj getById(Long id);

    obj createOrUpdate(obj object);

    obj delete(obj object);

    // <T> obj findBy(T selector);

    List<obj> getAll();

}
