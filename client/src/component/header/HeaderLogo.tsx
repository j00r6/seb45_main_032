import React from "react";
import petalkText from "../../asset/LogoAsset/petalk.png";
import { styled } from "styled-components";
import { Link } from "react-router-dom";

//로고 버튼 컴포넌트 클릭시 비로그인시 메인페이지로 이동 로그인시 리스트페이지로 이동
const HeaderLogo = () => {
  return (
    <LogoLink to={"/"}>
      <HeadLogo src={petalkText} alt="petTalk"></HeadLogo>
    </LogoLink>
  );
};

export default HeaderLogo;

export const LogoLink = styled(Link)`
  margin-left: 20px;
`;

export const HeadLogo = styled.img`
  height: 28px;
`;
