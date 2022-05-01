package com.boksil2.decorator;

public class Client {

    private CommentService commentService;

    public Client (CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        System.out.println(comment);
        commentService.addComment(comment);
    }

}
