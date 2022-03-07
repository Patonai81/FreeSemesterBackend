package hu.webuni.freesemesterbackend.ws.remote;


import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

@WebService
public interface RemainingFreeSemesterAsyncIF {
    @ResponseWrapper(localName = "getRemainingSemester2Response" , className = "java.lang.Integer")
    public int getRemainingSemester2(int central_studentId);

}
