package hu.webuni.freesemesterbackend.ws.remote;


import javax.jws.WebService;

@WebService
public interface RemainingFreeSemesterIF {

    public int getRemainingSemester(int central_studentId);

}
