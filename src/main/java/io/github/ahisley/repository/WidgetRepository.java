package io.github.ahisley.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.ahisley.domain.Widget;

public interface WidgetRepository extends JpaRepository<Widget,Long> {

}
