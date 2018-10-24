package com.myself.VO;

import lombok.Data;

/**
 * Created by MySelf on 2018/10/24.
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
