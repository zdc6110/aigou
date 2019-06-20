package cn.itsouece.util;

public class AjaxResult {
    private boolean success=true;
    //默认
    private String msg="登录成功";
    private Object data;

    public AjaxResult() {
    }

    public static void main(String[] args) {
        AjaxResult.me().setSuccess(false).setMsg("失败");
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }


    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }
}
