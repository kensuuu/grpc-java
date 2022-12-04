package com.kensuuu.user;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class UserServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(6565)
                .addService(new UserServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .build();

        server.start();

        server.awaitTermination();
    }

    static class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
        @Override
        public void getUser(GetUserRequest request, StreamObserver<User> observer) {
            var user = User.newBuilder()
                    .setUserName("Kensuuu")
                    .setEmail("*******@gmail.com")
                    .setPhone("090********")
                    .setBirthDate("1995-11-28")
                    .setGender(Gender.MALE)
                    .build();
            observer.onNext(user);
            observer.onCompleted();
        }
    }
}
