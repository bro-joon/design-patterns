package com.boksil2.decorator;


public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        System.out.println(commentService);
        if(enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        System.out.println(commentService);
        if(enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        System.out.println(commentService);
        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지....");
        client.writeComment("http://whiteship.me");

    }

}
