package life.majiang.community.community.controller;

import life.majiang.community.community.dto.NotificationDTO;
import life.majiang.community.community.enums.NotificationEnum;
import life.majiang.community.community.mapper.NotificationMapper;
import life.majiang.community.community.model.User;
import life.majiang.community.community.model.Users;
import life.majiang.community.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @GetMapping("/notification/{id}")
    public String profile(HttpServletRequest request,
                          @PathVariable(name = "id")Long id){
        Users users = (Users) request.getSession().getAttribute("users");
        if(users == null){
            return "redirect:/";
        }
        NotificationDTO notificationDTO = notificationService.read(id,users);
        if(NotificationEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
        ||NotificationEnum.REPLY_QUESTION.getType() == notificationDTO.getType()){
            return "redirect:/question/"+notificationDTO.getOuterId();
        }else {
            return "redirect:/";
        }
    }
}
















