package com.boksil2.decorator;

public class DefaultCommentService implements CommentService{
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
