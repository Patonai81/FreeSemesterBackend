package hu.webuni.freesemesterbackend.ws.service;

import hu.webuni.freesemesterbackend.ws.remote.RemainingFreeSemesterAsyncIF;
import org.apache.cxf.annotations.UseAsyncMethod;
import org.apache.cxf.jaxws.ServerAsyncResponse;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.xml.ws.AsyncHandler;
import java.util.Random;
import java.util.concurrent.Future;

@Service
public class RemainingFreeSemesterAsyncService implements RemainingFreeSemesterAsyncIF {


    @Override
    @UseAsyncMethod
    public int getRemainingSemester2(int central_studentId) {
        return 0;
    }

    @Async
    public Future<Integer> getRemainingSemester2Async(int central_studentId, AsyncHandler<Integer> asyncHandler) {

        System.out.println("Aszink hívódik");
        ServerAsyncResponse<Integer> serverAsyncResponse = new ServerAsyncResponse<>();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        serverAsyncResponse.set((new Random().nextInt(10)) );
        asyncHandler.handleResponse(serverAsyncResponse);
        return serverAsyncResponse;
    }



}
