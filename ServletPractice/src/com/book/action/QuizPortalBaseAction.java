package com.book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class QuizPortalBaseAction {
public abstract String process(HttpServletRequest request, HttpServletResponse response)
    throws Exception;
}
