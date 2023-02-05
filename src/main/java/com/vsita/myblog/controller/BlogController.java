package com.vsita.myblog.controller;

import com.vsita.myblog.model.Blog;
import com.vsita.myblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("blogs", blogRepository.findAll());
        return "index";
    }

    @GetMapping("/showProfile")
    public String showBlog(Blog blog) {
        return "add-profile";
    }

    @PostMapping("/addProfile")
    public String addProfile(Blog blog, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-profile";
        }
        blogRepository.save(blog);
        return "redirect:/index";
    }

    @GetMapping("/aboutMe")
    public String showAboutMePage(Blog aboutMe){
        return "show-aboutMe";
    }


    @GetMapping("/edit/{id}")
    public String showUpdatedContent(@PathVariable("id") long id, Model model) {
        Blog blog = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("blog", blog);
        return "update-content";
    }

    @PostMapping("/update/{id}")
    public String updateContent(@PathVariable("id") long id, Blog blog, BindingResult result, Model model) {
        if (result.hasErrors()) {
            blog.setId(id);
            return "update-content";
        }

        blogRepository.save(blog);

        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteContent(@PathVariable("id") long id, Model model) {
        Blog content = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        blogRepository.delete(content);

        return "redirect:/index";
    }




}
