package com.awei.cloud.service.service;

import com.awei.cloud.controller.response.BaseResponse;
import com.awei.cloud.service.Do.UserDo;
import com.awei.cloud.service.request.InsertUserBizRequest;

import java.util.*;

public interface UserService {

    BaseResponse insert(InsertUserBizRequest bizRequest);



}
