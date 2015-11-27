package cn.hackcoder.action.base;

import cn.hackcoder.common.Result;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.ParameterizedType;


public class BaseAction<M> extends ActionSupport implements ModelDriven<M> {
    private static final long serialVersionUID = 1L;
    private static Logger logger = LoggerFactory.getLogger(BaseAction.class);

    protected M model;

    protected String msg;

    protected Result result;

    public BaseAction() {
        try {
            Class<M> m = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            this.model = m.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    protected String failResult(Object data) {
        this.result = Result.failResult(data);
        return SUCCESS;
    }

    protected String successResult(Object data) {
        this.result = Result.successResult(data);
        return SUCCESS;
    }

    protected String successResultWithoutData() {
        this.result = Result.successResultWithoutData();
        return SUCCESS;
    }

    protected String forceLogoutResult(Object data) {
        this.result = Result.forceLogoutResult(data);
        return SUCCESS;
    }

    protected String customizedMessageResult(Object data) {
        this.result = Result.customizedMessageResult(data);
        return SUCCESS;
    }

    public M getModel() {
        return model;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
