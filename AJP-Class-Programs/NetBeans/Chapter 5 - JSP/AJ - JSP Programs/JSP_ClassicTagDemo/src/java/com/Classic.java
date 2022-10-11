package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class Classic extends TagSupport {
private int counter;
public int doStartTag() throws JspException {
    counter = 0;
    return EVAL_BODY_INCLUDE;
}
public int doAfterBody() throws JspException {
    while (counter < 3) {
        counter++;
        return EVAL_BODY_AGAIN;
    }
    return SKIP_BODY;
}  
}
