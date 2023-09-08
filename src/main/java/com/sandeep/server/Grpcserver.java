package com.sandeep.server;

import com.sandeep.StudentRequest;
import com.sandeep.StudentResponse;
import com.sandeep.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;


@GRpcService
public class Grpcserver extends StudentServiceGrpc.StudentServiceImplBase {
    StudentResponse response = StudentResponse.newBuilder().setAge(10).setName("Anubhav").build();

    @Override
    public void getStudent(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

}
