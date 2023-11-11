package com.baidu.www.hexiaohei01.booth;

public class BoothTest {
    public static void main(String[] args) {
        Booth[] booths = new Booth[3];
        booths[0] = new Booth(33, "我的西瓜摊", 150, false);
        booths[1] = new Booth(22, "我的西瓜摊", 100, false);
        booths[2] = new Booth(11, "我的西瓜摊", 50, false);

        Booth.purchase(booths[0], 50);
        booths[0].purchase(booths[0], -1);
        booths[0].purchase(booths[0], 200);
        booths[1].restock(50);
        booths[1].restock(201);

        Booth.closeBooths(booths);
        booths[0].purchase(booths[0], 50);
        Booth.closeBooths(booths);
    }
}
