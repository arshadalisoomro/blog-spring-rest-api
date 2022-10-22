package pk.inlab.web.app.blog.controller.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GenericController<E, T> {
    E save(E entity);

    List<E> save(List<E> entities);

    void deleteById(T id);

    Optional<E> findById(T id);

    List<E> findAll();

    Page<E> findAll(Pageable pageable);

    E update(E entity, Long id);
}