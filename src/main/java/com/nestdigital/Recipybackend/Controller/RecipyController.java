package com.nestdigital.Recipybackend.Controller;

import com.nestdigital.Recipybackend.Dao.RecipyDao;
import com.nestdigital.Recipybackend.Model.RecipyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipyController {

    @Autowired
    private RecipyDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String recipyadd(@RequestBody RecipyModel recipy)
    {
        System.out.println(recipy.toString());
        dao.save(recipy);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<RecipyModel> viewrecipy()
    {
        return (List<RecipyModel>)dao.findAll();
    }

}
