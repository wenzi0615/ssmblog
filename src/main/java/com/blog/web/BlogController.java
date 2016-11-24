package com.blog.web;

import com.blog.entity.Blog;
import com.blog.enums.BlogActionStateEnum;
import com.blog.exception.DeleteException;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")//模块
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String list(Model model){
        //list.jsp + model = ModelAndView

        List<Blog> blogList=blogService.getBlogList();
        model.addAttribute("list", blogList);
        return "list"; // /WEB-INF/jsp/list.jsp

    }

    @RequestMapping(value="/{blogId}/article", method = RequestMethod.GET)
    public String detail(@PathVariable("blogId") Integer blogId, Model model){

        if(blogId==null)
            return "redirect:/blog/list";

        Blog blog=blogService.getBlogById(blogId);

        if(blog==null){
            return "forward:/blog/list";
        }

        model.addAttribute("blog", blog);
        return "article";

    }

//    @RequestMapping(value="/addBlog", method = RequestMethod.GET)
//    public String addBlog(){
//
//        return "addBlog";
//    }

    @RequestMapping(value="/add_submit", method = RequestMethod.POST)
    public String addSubmit(@RequestParam("title") String title,
                            @RequestParam("content") String content,
                            @RequestParam("cateId") Integer cateId){

        Blog blog=new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setCateId(cateId);
        String result=blogService.addBlog(blog);
        if(result.equals(BlogActionStateEnum.ADD_SUCCESS.getStateInfo()))
            return "redirect:/blog/success";
        else
            return "redirect:/blog/failure";
    }

    @RequestMapping(value="/{blogId}/delete", method = RequestMethod.GET)
    public String deleteBlog(@PathVariable("blogId") Integer blogId){

        try{
            String result=blogService.deleteBlog(blogId);
        }catch (DeleteException e) {
            return "redirect:/blog/failure";
        }
        return "redirect:/blog/success";
    }

    @RequestMapping(value="/{blogId}/modifyBlog", method = RequestMethod.GET)
    public String modifyBlog(@PathVariable("blogId") Integer blogId, Model model){

        if(blogId==null)
            return "redirect:/blog/list";

        Blog blog=blogService.getBlogById(blogId);

        if(blog==null){
            return "forward:/blog/list";
        }

        model.addAttribute("blog", blog);
        return "modifyBlog";
    }

    @RequestMapping(value="/modify_submit", method = RequestMethod.POST)
    public String modify_submit(@RequestParam("id") Integer id,
                                @RequestParam("title") String title,
                                @RequestParam("content") String content,
                                @RequestParam("cateId") Integer cateId){

        Blog blog=new Blog();
        blog.setId(id);
        blog.setTitle(title);
        blog.setContent(content);
        blog.setCateId(cateId);

        String result=blogService.modifyBlog(blog);
        if(result.equals(BlogActionStateEnum.MODIFY_SUCCESS.getStateInfo()))
            return "redirect:/blog/success";
        else
            return "redirect:/blog/failure";
    }

    @RequestMapping(value="/success", method = RequestMethod.GET)
    public String success(){

        return "success";
    }
}
