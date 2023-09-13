package com.pettalk.petsitter.controller;


import com.pettalk.argumentresolver.LoginMemberId;
import com.pettalk.member.entity.Member;
import com.pettalk.member.service.MemberService;
import com.pettalk.petsitter.dto.PetSitterDto;
import com.pettalk.petsitter.entity.PetSitter;
import com.pettalk.petsitter.mapper.PetSitterMapper;
import com.pettalk.petsitter.service.PetSitterService;
import com.pettalk.response.MultiResponseDto;
import com.pettalk.wcboard.entity.WcBoard;
import com.pettalk.wcboard.mapper.WcBoardMapper;
import com.pettalk.wcboard.repository.WcBoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*") //모든 출처와 헤더에 대해 허용된 상태이므로 나중에 고칠 것.
@Controller
@RequestMapping("/petsitter")
@RequiredArgsConstructor
@Validated
@Slf4j
public class PetSitterController {

    private final PetSitterMapper mapper;
    private final PetSitterService service;
    private final WcBoardRepository wcBoardRepository;
    private final WcBoardMapper wcBoardMapper;
    private final MemberService memberService;

//다른 패키지들과 합치기 전이므로 주석처리해둔 것들이 존재함.

    @PostMapping
    public ResponseEntity postPetSitter(@Valid @RequestBody PetSitterDto.PostDto postDto) {

        PetSitter petSitter = service.createPetSitter(mapper.postToPetSitter(postDto));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mapper.petSitterToResponse(petSitter));

    }

    @PatchMapping
    public ResponseEntity patchPetSitter(@LoginMemberId Long memberId,
                                         @Valid @RequestBody PetSitterDto.PatchDto patchDto) {

        Member member = memberService.findVerifyMember(memberId);
        Long petSitterId = member.getPetSitter().getPetSitterId();

        PetSitter petSitter = mapper.patchToPetSitter(patchDto);
        petSitter.setPetSitterId(petSitterId);

        PetSitter response = service.updatePetSitter(petSitter, memberId);

        return new ResponseEntity<>(mapper.petSitterToResponse(response), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getPetSitter(@LoginMemberId Long memberId) {

        Member member = memberService.findVerifyMember(memberId);
        Long petSitterId = member.getPetSitter().getPetSitterId();

        try{
        PetSitter petSitter = service.findPetSitter(petSitterId);
        return new ResponseEntity<>(mapper.petSitterToResponse(petSitter), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
        }
    }

//    @GetMapping("/{pet-sitter-id}/recent")
//    public  ResponseEntity getRecentWalkCare(@PathVariable("pet-sitter-id") @Positive Long petsitterId, @RequestParam @Positive int page, @RequestParam @Positive int size) {
//        PetSitter petSitter = service.findPetSitter(petsitterId);
//
//        Page<WcBoard> wcBoardPage = service.getRecentInfo(petSitter, page -1, size);
//        List<WcBoard> wcBoardList = wcBoardPage.getContent();
//
//        return new ResponseEntity<>(new MultiResponseDto<>(wcBoardMapper.wcBoardsResponseDtoToWcBoard(wcBoardList), wcBoardPage), HttpStatus.OK);
//        TODO: 워크케어보드의 닉네임, 시작, 끝나는 일자, 산책돌봄 태그
//
//    }
    @GetMapping("/recent")
    public  ResponseEntity getRecentWalkCare(@LoginMemberId Long memberId,
                                             @RequestParam @Positive int page,
                                             @RequestParam @Positive int size) {
        Member member = memberService.findVerifyMember(memberId);
        String memberImage = member.getProfileImage();
        PetSitter petSitter = member.getPetSitter();

        Page<WcBoard> wcBoardPage = service.getRecentInfo(petSitter, page -1, size);
        List<WcBoard> wcBoardList = wcBoardPage.getContent();

        List<PetSitterDto.multiResponse> response = mapper.wcBoardstoPetSitterMultiDto(wcBoardList);

        return new ResponseEntity<>(new MultiResponseDto<>(mapper.wcBoardstoPetSitterMultiDto(wcBoardList), wcBoardPage), HttpStatus.OK);
        //TODO: 워크케어보드의 클라이언트 이미지, 닉네임, 시작, 끝나는 일자, 산책돌봄 태그

    }
}
