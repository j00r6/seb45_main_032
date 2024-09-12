# PETALK
바쁜 현대인을 위한 반려동물 산책 및 돌봄 서비스


</br>

**배포 사이트**
[🦖 Live Demo](http://pettalk-bucket.s3-website.ap-northeast-2.amazonaws.com/)


<table>
  <tr>
    <td align="center"><b>테스트 시작 페이지</b></td>
    <td align="center"><b>테스트 페이지</b></td>
    <td align="center"><b>결과 페이지</b></td>
  </tr>
  <tr>
    <td align="center">
      <img src="https://github.com/udaeng8286/Portfolio/assets/130089426/78c93436-5050-49cc-b866-7ac13902d96e" alt="Start Page" width="300px"/>
    </td>
    <td align="center">
      <img src="https://github.com/udaeng8286/Portfolio/assets/130089426/ef79ea54-ef42-4f53-b2e8-5a19e4289212" alt="Test Page" width="300px"/>
    </td>
    <td align="center">
      <img src="https://github.com/udaeng8286/Portfolio/assets/130089426/0ed4e424-81a6-4b3c-af4c-32e1c3dc46a9" alt="Result Page" width="300px"/>
    </td>
  </tr>
</table>
</br>

## 프로젝트 개요

- **기간**: `2023.08.23` ~ `2023.09.22`
- **타입**: 팀 프로젝트 (front-end 3명, back-end 4명)
</br>

## 역할

### front-end

|최도현|송유정|김철기|
|:----:|:----:|:----:|
|[@Dohyun12259](https://github.com/Dohyun12259)|[@udaeng8286](https://github.com/udaeng8286)|[@gprsto](https://github.com/sebfe45kimck)|
|  - 서비스 소개 페이지 <br /> - 예약글 CRUD <br /> - 예약글 전체 조회 <br /> - 예약글 태그 필터 | - 마이페이지 <br /> - 펫시터 등록 및 수정 <br /> - 예약 내역 페이지 <br /> - 사용자의 산책 위치 | - Header,Nav 공동컴포넌트 <br /> - 예약글 상세 조회 <br /> - 회원가입/로그인/로그아웃 <br /> - 1:1 채팅방 |
<br>


### back-end
|장근호|전찬혁|황규형|박진수|
|:----:|:----:|:----:|:----:|
[@SEBBE45JGH](https://github.com/SEBBE45JGH)|[@gord10011](https://github.com/gord10011)|[@rbgud4226](https://github.com/rbgud4226)|[@j00r6](https://github.com/j00r6)|
|  - 펫시터 API <br /> - Exception 기능|  - 1:1 채팅 <br /> - AWS설계 및 환경 구축 | - 맴버 API <br /> - 회원가입/로그인/로그아웃 | - 메인 게시판 CRUD <br /> - 서비스 신청 로직 <br /> - 이동 경로 GPS 기능 |
</br>



## 주요 기능
- **메인 게시판 CRUD**: 산책 및 케어를 해줄 펫시터를 구하는 글 게시, 조회, 삭제, 수정 기능
- **서비스 신청 로직**: 작성된 클라이언트의 게시글에 자격이 등록된 펫시터가 신청을 하는 로직, 클라이언트 입장에서 신청한 펫시터의 정보 확인 가능
- **펫시터 등록 및 확인**: 펫시터 사용자는 펫시터 자격을 등록하고, 서비스 이용자는 펫시터의 정보를 확인할 수 있는 기능 
- **1:1 채팅 기능**: 클라이언트와 펫시터 매칭 후 1:1 채팅방에서 대화를 할 수 있는 기능
- **사용자 위치 확인**: 매칭된 펫시터와 반려동물의 현재의 위치를 1:1 채팅방에 표시된 지도에서 확인 할 수 있는 기능
</br>

**기능 설명 영상**
[👀 Description video](http://pettalk-bucket.s3-website.ap-northeast-2.amazonaws.com/)

**프로젝트 기능 ppt**
[🎏 45-Team-032](https://github.com/user-attachments/files/15524699/main_45team.pptx)


</br>

## 기술 스택
### front-end
  ![html](https://img.shields.io/badge/HTML-239120?style=flat&logo=html5&logoColor=white)
  ![css](https://img.shields.io/badge/CSS-239120?&style=flat&logo=css3&logoColor=white)
  ![ts](https://img.shields.io/badge/TypeScript-007ACC?style=flat&logo=typescript&logoColor=white)
  ![react](https://img.shields.io/badge/React-20232A?style=flat&logo=react&logoColor=61DAFB)<br>
  ![eslint](https://img.shields.io/badge/eslint-3A33D1?style=flat&logo=eslint&logoColor=white)
  ![styldcom](https://img.shields.io/badge/styled--components-DB7093?style=flat&logo=styled-components&logoColor=white)
  ![reactrouter](https://img.shields.io/badge/React_Router-CA4245?style=flat&logo=react-router&logoColor=white)
  ![redis](https://img.shields.io/badge/redis-%23DD0031.svg?&style=flat&logo=redis&logoColor=white)
  ![prettier](https://img.shields.io/badge/prettier-1A2C34?style=flat&logo=prettier&logoColor=F7BA3E)
  ![figma](https://img.shields.io/badge/Figma-F24E1E?style=flat&logo=figma&logoColor=white)


  ### back-end
  ![aws](https://img.shields.io/badge/Amazon_AWS-232F3E?style=flat&logo=amazon-aws&logoColor=white)
  ![gcp](https://img.shields.io/badge/Google_Cloud-4285F4?style=flat&logo=google-cloud&logoColor=white)<br>
  ![spring](https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white)
  ![boot](https://img.shields.io/badge/springboot-6DB33F?style=flat&logo=spring&logoColor=white)
  ![security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat&logo=Spring-Security&logoColor=white)
  ![java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
  ![mysql](https://img.shields.io/badge/MySQL-00000F?style=flat&logo=mysql&logoColor=white)
  ![redis](https://img.shields.io/badge/redis-%23DD0031.svg?&style=flat&logo=redis&logoColor=white)



