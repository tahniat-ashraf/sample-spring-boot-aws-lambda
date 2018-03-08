package com.priyam.lambdaHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by dni_tahniat on 3/8/2018.
 */
public class LambdaMethodHandler implements RequestHandler<MyRequest,MyResponse>{

//    @Override
//    public MyResponse handleRequest(MyRequest input, Context context) {
//
//        String name=input.getName();
//        int id=input.getId();
//        MyResponse myResponse=new MyResponse();
//
//        if(name.compareTo("x")==0 && id==1){
//            myResponse.setStatusCode("0000");
//            return myResponse;
//        }else{
//            myResponse.setStatusCode("9999");
//        }
//        return myResponse;
//    }


    @Override
    public MyResponse handleRequest(MyRequest myRequest, Context context) {
        String name=myRequest.getName();
        int id=myRequest.getId();
        MyResponse myResponse=new MyResponse();

        if(name.compareTo("x")==0 && id==1){
            myResponse.setStatusCode("0000");
            return myResponse;
        }else{
            myResponse.setStatusCode("9999");
        }
        return myResponse;
    }
}
