package hu.webuni.freesemesterbackend.ws.service;


import hu.webuni.freesemesterbackend.ws.remote.RemainingFreeSemesterIF;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RemainingFreeSemesterService implements RemainingFreeSemesterIF {


    public int getRemainingSemester(int central_studentId){
        System.out.println("WS hívódott.....");
        return new Random().nextInt(10) ;
    }



}
