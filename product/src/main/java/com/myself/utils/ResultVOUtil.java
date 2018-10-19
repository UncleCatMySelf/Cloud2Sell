package com.myself.utils;

import com.myself.vo.ResultVO;

/**
 * Created by MySelf on 2018/10/19.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}
