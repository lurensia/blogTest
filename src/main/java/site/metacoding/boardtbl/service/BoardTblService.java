package site.metacoding.boardtbl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.boardtbl.domain.post.BoardTbl;
import site.metacoding.boardtbl.domain.post.BoardTblRepository;

@RequiredArgsConstructor
@Service
public class BoardTblService {
    private final BoardTblRepository postRepository;

    public List<BoardTbl> 검색(String search) {

        List<BoardTbl> boardTbls = postRepository.mSearch(search);

        return boardTbls;
    }
}
