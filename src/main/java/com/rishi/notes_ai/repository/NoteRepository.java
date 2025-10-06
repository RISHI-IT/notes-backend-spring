package com.rishi.notes_ai.repository;

import com.rishi.notes_ai.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {

}
