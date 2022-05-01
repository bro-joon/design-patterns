package com.boksil2.decorator;

public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    public void addComment(String comment) {
        System.out.println(1);
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("....", "");
    }
}
