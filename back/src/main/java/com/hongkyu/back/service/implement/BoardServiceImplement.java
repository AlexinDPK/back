package com.hongkyu.back.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hongkyu.back.dto.request.board.PostBoardRequestDto;
import com.hongkyu.back.dto.response.board.PostBoardResponseDto;
import com.hongkyu.back.entity.Board;
import com.hongkyu.back.entity.Image;
import com.hongkyu.back.repository.BoardRepository;
import com.hongkyu.back.repository.ImageRepository;
import com.hongkyu.back.repository.UserRepository;
import com.hongkyu.back.service.BoardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImplement implements BoardService {

    private final BoardRepository boardRepository;
    private final UserRepository userRepository;
    private final ImageRepository imageRepository;

    @Override
    public ResponseEntity<PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email) {
        try {

            Boolean existedEmail = userRepository.existsByEmail(email);
            if (!existedEmail)
                // return PostBoardResponseDto.notExistUser();
                return null;
            Board board = new Board(dto, email);
            boardRepository.save(board);

            int boardNumber = board.getBoardNumber();

            List<String> boardImageList = dto.getBoardImageList();
            List<Image> imageEntities = new ArrayList<>();

            for (String image : boardImageList) {
                Image imageEntity = new Image(boardNumber, image);
                imageEntities.add(imageEntity);
            }

            imageRepository.saveAll(imageEntities);

        } catch (Exception e) {
            e.printStackTrace();
            // return ResponseDto.databaseError();
            return null;
        }
        return PostBoardResponseDto.success();
    }

}
