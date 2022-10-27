package com.example.quartz.response;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/10/27
 * @description:
 */
public class Response {
    private String respCode;
    private String respMsg;
    private String respInfo;

    public Response() {
    }

    public Response(String respCode, String respMsg, String respInfo) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.respInfo = respInfo;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getRespInfo() {
        return respInfo;
    }

    public void setRespInfo(String respInfo) {
        this.respInfo = respInfo;
    }

    @Override
    public String toString() {
        return "Response{" +
                "respCode='" + respCode + '\'' +
                ", respMsg='" + respMsg + '\'' +
                ", respInfo='" + respInfo + '\'' +
                '}';
    }
}
