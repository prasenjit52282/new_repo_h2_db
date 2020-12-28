package com.nitdgp.database.Controllers;

import com.nitdgp.database.DataBase.Tuple;
import com.nitdgp.database.DataBase.tupleDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin
@RestController
public class BaseController {
    @Autowired
    tupleDatabaseService database;

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView page=new ModelAndView();
        page.setViewName("index.html");
        return page; //returning index.html
    }

    @RequestMapping(value = "/create/",params = {"id","name","age","mobile_no","trade"},method = RequestMethod.POST)
    public String create(@RequestParam(value="id") int id,
                         @RequestParam(value="name") String name,
                         @RequestParam(value = "age") int age,
                         @RequestParam(value = "mobile_no") String mobile_no,
                         @RequestParam(value = "trade") String trade){
        database.create(id,name,age,mobile_no,trade);
        return "Insertion Successful";
    }

    @RequestMapping(value = "/read/",params = {"id"})
    public Tuple read(@RequestParam(value = "id") int id){
        return database.read(id);
    }
    @RequestMapping(value = "/readAll/")
    public List<Tuple> readAll(){
        return database.readAll();
    }
    @RequestMapping(value = "/update/",params = {"id","name","age","mobile_no","trade"},method = RequestMethod.PUT)
    public String update(@RequestParam(value="id") int id,
                         @RequestParam(value="name") String name,
                         @RequestParam(value = "age") int age,
                         @RequestParam(value = "mobile_no") String mobile_no,
                         @RequestParam(value = "trade") String trade){
        database.update(id,name,age,mobile_no,trade);
        return "Update Successful";
    }
    @RequestMapping(value = "/delete/",params = {"id"},method = RequestMethod.DELETE)
    public String delete(@RequestParam(value = "id") int id){
        database.delete(id);
        return "Deletion Successful";
    }
}
