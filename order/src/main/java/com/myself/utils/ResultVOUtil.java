package com.myself.utils;

import com.myself.VO.ResultVO;

/**
 * Created by MySelf on 2018/10/24.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

}
