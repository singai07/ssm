package cn.hackcoder.action;


import cn.hackcoder.action.base.BaseAction;
import cn.hackcoder.common.Result;
import cn.hackcoder.domain.User;
import cn.hackcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by hackcoder on 15-11-27.
 */
@Controller
public class UserAction extends BaseAction<User> {

    @Autowired
    private UserService userService;

    public String list() {
        return successResult(userService.findAll());
    }

    public String add() {
        userService.add(model);
        return successResult(model);
    }

    public String delete() {
        userService.delete(model);
        return successResultWithoutData();
    }

    public String update() {
        userService.update(model);
        return successResult(model);
    }

    public String get() {
        return successResult(userService.get(model.getId()));
    }


}
