package site.metacoding.boardtbl.domain.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardTblRepository extends JpaRepository<BoardTbl, Integer> {

    @Query(value = "SELECT * FROM boardtbl WHERE title like %:search%", nativeQuery = true)
    List<BoardTbl> mSearch(@Param("search") String search);
}
