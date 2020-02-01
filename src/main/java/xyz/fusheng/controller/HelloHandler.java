package xyz.fusheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.fusheng.entity.Student;
import xyz.fusheng.repository.StudentRepository;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        studentRepository.deletebyId(id);
        return "redirect:/hello/index";
    }

    @PostMapping("/save")
    public String save(Student student){
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }

    @PostMapping("/update")
    public String update(Student student){
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student",studentRepository.findById(id));
        return modelAndView;
    }
}
