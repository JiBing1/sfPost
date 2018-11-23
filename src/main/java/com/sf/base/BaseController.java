package com.sf.base;

import java.util.Map;
import com.sf.util.ReturnFormat;

public abstract class BaseController {
    protected Map<String,Object> retContent(int status,Object data) {
        return ReturnFormat.retParam(status, data);
    }
}
