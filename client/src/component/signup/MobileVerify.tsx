import React from "react";
import styled from "styled-components";
import * as yup from "yup";
import { yupResolver } from "@hookform/resolvers/yup";
import { useForm } from "react-hook-form";
import axios from "axios";
import PhoneBtn from "../Button/PhoneBtn";
import global from "../../Data/global";

const api = process.env.REACT_APP_DB_HOST;

interface T {
  setPhoneNum: (phoneNum: string) => void;
}
type DataForm = {
  phone: string;
};

const schema = yup.object().shape({
  phone: yup.string().trim().required("전화번호 입력해주세요"),
});
//전화번호 전송 함수.

const MobileVerify = ({ setPhoneNum }: T) => {
  const { register, handleSubmit } = useForm({ resolver: yupResolver(schema) });

  const phoneHdr = async (phone: DataForm) => {
    try {
      const res = await axios.post(`${api}/sendSms`, phone);
      console.log(res.data);
      setPhoneNum(phone.phone);
    } catch (e) {
      console.log("에러낫으면 서버키값이 없을확률높음", e);
    }
  };

  return (
    <MVCtn>
      <MVForm onSubmit={handleSubmit(phoneHdr)}>
        <TextInput placeholder="전화번호를 입력하세요" {...register("phone")} />
        <PhoneBtn name={"인증"} />
      </MVForm>
      <Span>전화번호를 입력하세요</Span>
    </MVCtn>
  );
};

export default MobileVerify;

const MVCtn = styled.div`
  display: flex;
  flex-direction: column;
  width: 240px;
`;

const MVForm = styled.form`
  display: flex;
  flex-direction: row;
  width: 240px;
  margin-top: 20px;
`;

const TextInput = styled.input`
  height: 31px;
  width: 100%;
  border: 1px inset ${global.Gray[1].value};
  border-radius: 4px;
  padding-left: 10px;
  &:focus {
    outline: none;
  }
`;

const Span = styled.span`
  justify-content: flex-start;
  margin-top: 4px;
  color: ${global.Primary.value};
  font-size: 10px;
  margin-bottom: 6px;
`;
