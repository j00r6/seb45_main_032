import React from "react";
import { styled } from "styled-components";
import global from "../../../Data/global";
interface RCVProps {
  input?: string;
  createAt?: string;
}

const RecieveChatDesign: React.FC<RCVProps> = ({ input, createAt }) => {
  return (
    <ChatCtn>
      <ChatDesign>
        <div style={{ overflowWrap: "break-word" }}>{input}</div>
      </ChatDesign>
      <TimeDesign>{createAt}</TimeDesign>
    </ChatCtn>
  );
};

export default RecieveChatDesign;

export const ChatCtn = styled.div`
  display: flex;
  align-items: end;
  flex-direction: column;
  margin-top: 8px;
  margin-bottom: 8px;
  margin-right: 20px;
`;

export const ChatDesign = styled.div`
  white-space: normal;
  flex-wrap: wrap;
  justify-content: center;
  text-align: center;
  border: 0px;
  background-color: ${global.Primary.value};
  border-radius: 16px 16px 0px 16px;
  max-width: 60%;
  font-size: 14px;
  padding: 12px 24px;
`;

export const TimeDesign = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  width: 58px;
  height: 21px;
  font-size: 12px;
  color: ${global.Gray[8].value};
  background-color: ${global.Gray[6].value};
  margin-top: 8px;
  border-radius: 7px;
`;
