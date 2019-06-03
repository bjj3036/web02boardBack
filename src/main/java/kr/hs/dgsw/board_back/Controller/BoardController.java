package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.PostService;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    PostService postService;

    @GetMapping(value = "/api/board")
    public List posts() {
        return this.postService.findAll();
    }

    @GetMapping(value = "/api/board/findById/{id}")
    public Post findBoardById(@PathVariable Long id) {
        return this.postService.findById(id);
    }

    @GetMapping(value = "/api/board/findByUserId/{userId}")
    public List find(@PathVariable Long userId) {
        return this.postService.findByUserId(userId);
    }

    @PostMapping(value = "/api/board/add")
    public Long addBoard(@RequestBody Post post) {
        return this.postService.add(post);
    }

    @DeleteMapping(value = "/api/board/delete/{id}")
    public int deleteBoard(@PathVariable Long id) {
        return this.postService.deleteById(id);
    }

    @PutMapping(value = "/api/board/modify")
    public int modifyBoard(@RequestBody Post post) {
        return this.postService.modify(post);
    }

}
