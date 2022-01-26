package com.demo.gnotesapp.repository;

import com.demo.gnotesapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note,Long> {
}
