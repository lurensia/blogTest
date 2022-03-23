package site.metacoding.boardtbl.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.boardtbl.domain.post.BoardTbl;
import site.metacoding.boardtbl.service.BoardTblService;

@RequiredArgsConstructor
@Controller
public class BoardTblController {
    private final BoardTblService boardTblService;

    @GetMapping({ "/", "/{search}" })
    public String list(String search, Model model) {
        if (search == null) {
            search = "";
        }

        List<BoardTbl> boardTblEntity = boardTblService.검색(search);
        model.addAttribute("lists", boardTblEntity);
        return "/post/list";
    }
}
