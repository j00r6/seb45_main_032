package com.pettalk.petsitter.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.pettalk.member.entity.Member;
import com.pettalk.wcboard.entity.WcBoard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PetSitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petSitterId;
    private String name;
    private String petSitterImage;
    private String introduce;
    private String nowJob;
    private boolean smoking;
    private String info;

    @ElementCollection
    private List<String> exAnimal;

    @JoinColumn(name = "member_id")
    @OneToOne
    private Member member;


    @OneToMany(mappedBy = "petSitter", cascade = CascadeType.ALL)
    private List<WcBoard> wcBoard;

    private LocalDateTime createdAt = LocalDateTime.now();

    //    @OneToMany(mappedBy = "petSitter")
    //    private List<ChatRoom> room = new ArrayList<>();

}
