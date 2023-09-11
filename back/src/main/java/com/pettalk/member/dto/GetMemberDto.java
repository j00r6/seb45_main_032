package com.pettalk.member.dto;

import com.pettalk.wcboard.dto.WcBoardDto;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
public class GetMemberDto {
    @NotBlank
    private String nickName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String profileImage;

    private List<WcBoardDto.Response> wcBoardDtoGet;

    private boolean checkPetSitter;

    public GetMemberDto(String nickName, String email, String phone, String profileImage, List<WcBoardDto.Response> wcBoardDtoGet , boolean checkPetSitter) {
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.wcBoardDtoGet = wcBoardDtoGet;
        this.checkPetSitter = checkPetSitter;
    }
}
