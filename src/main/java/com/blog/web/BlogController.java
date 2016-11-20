package com.blog.web;

import com.blog.entity.Blog;
import com.blog.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yanjunwang on 16/10/11.
 */

@Controller
@RequestMapping("/blog")//url:/模块/资源/{id}/细分
public class BlogController {

    private final Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BlogService blogService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String list(Model model){

        //获取列表页
        List<Blog> list= blogService.getBlogList();
        model.addAttribute("list",list);
        //home.jsp+model=ModelAndView
        return "list";// /WEB-INFO/jsp/list.jsp
    }

    @RequestMapping(value="/manager")
    public String manager(Model model){

        return "manager";
    }

    @RequestMapping(value="/blogManager")
    public String blogManager(Model model){

        return "blogManager";
    }

    @RequestMapping(value="/home")
    public String home(Model model){

        return "home";
    }

    @RequestMapping(value="/addBlog")
    public String addBlog(Model model){

        return "addBlog";
    }
}
