package com.nitdgp.database.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class tupleDatabaseService {
    @Autowired
    tupleDatabase mydb;

    public List<Tuple> readAll(){
        ArrayList<Tuple> arr=new ArrayList<>();
        mydb.findAll()
                .forEach(tuple -> arr.add(tuple));
        return arr;
    }

    public void create(int id,String name,int age,String mobile_no,String trade){
        mydb.save(new Tuple(id,name,age,mobile_no,trade));
    }
    public Tuple read(int id){
        return mydb.findById(id).get();
    }
    public void update(int id,String name,int age,String mobile_no,String trade){
        mydb.save(new Tuple(id,name,age,mobile_no,trade));
    }
    public void delete(int id){
        mydb.deleteById(id);
    }

}
