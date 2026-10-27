package c3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements a3.b {
    public static android.content.Context a;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void p() {
            com.tsn.chat.model.ChatModel r0 = new com.tsn.chat.model.ChatModel
            r0.<init>()
            java.lang.String r1 = com.tsn.chat.utils.a.c()
            r0.setCreateTime(r1)
            java.lang.String r1 = "47932"
            r0.setFromUserId(r1)
            java.lang.String r1 = "郭清枝"
            r0.setFromUserName(r1)
            java.lang.String r1 = "47932,39850,39858,40125,40209,40223,40232,40236,42127,41446,45897,44998,47297,47712,47719,47723,40231,40240,40341,40351,40356,40805,42034,42070,42114,42318,40559,47370,47415,43931,44735,44747,45315,46760,46764,47304,47305,47314,46769,46853,47022,47089"
            r0.setToUserId(r1)
            java.lang.String r1 = "wangmazi"
            r0.setToUserName(r1)
            java.lang.String r1 = "wgydx"
            r0.setSchoolId(r1)
            java.lang.String r1 = "as"
            r0.setMsg(r1)
            java.lang.String r1 = "638"
            r0.setGroupId(r1)
            java.lang.String r1 = "c5ef9a84-c3fc-4ca2-88f3-bb1affcc88e0"
            r0.setMessageId(r1)
            java.lang.String r1 = ""
            r0.setPhoto(r1)
            a3.b r1 = a3.a.a()
            r1.i(r0)
            return
    }

    @Override // a3.b
    public void a() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "schoolId"
            java.lang.String r2 = com.tsn.chat.utils.b.e
            r0.put(r1, r2)
            java.lang.String r1 = "userId"
            java.lang.String r2 = com.tsn.chat.utils.b.d
            r0.put(r1, r2)
            java.lang.String r1 = "hb"
            java.lang.String r2 = "chat"
            r0.put(r1, r2)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            byte[] r1 = r0.getBytes()
            int r1 = r1.length
            int r1 = r1 + 6
            com.tsn.chat.model.RequestMessage r2 = new com.tsn.chat.model.RequestMessage
            r3 = 2
            r2.<init>(r1, r3, r0)
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            com.tsn.chat.utils.c.a(r2)
        L36:
            return
    }

    @Override // a3.b
    public void b() {
            r0 = this;
            return
    }

    @Override // a3.b
    public void c(com.tsn.chat.model.ChatModel r1) {
            r0 = this;
            return
    }

    @Override // a3.b
    public int d(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r3.l()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            com.tsn.chat.utils.d r2 = new com.tsn.chat.utils.d
            int r7 = java.lang.Integer.parseInt(r7)
            r2.<init>(r6, r7, r0)
            r2.start()
            r0.await()     // Catch: java.lang.InterruptedException -> L19
            goto L1a
        L19:
        L1a:
            io.netty.channel.group.ChannelGroup r6 = com.tsn.chat.utils.b.a
            int r6 = r6.size()
            if (r6 != 0) goto L24
            r4 = 2
            return r4
        L24:
            com.tsn.chat.utils.b.d = r4
            com.tsn.chat.utils.b.e = r5
            a3.b r6 = a3.a.a()
            r6.o(r4, r5)
            return r1
    }

    @Override // a3.b
    public void e(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // a3.b
    public void f() {
            r0 = this;
            return
    }

    @Override // a3.b
    public void g(android.content.Context r1) {
            r0 = this;
            c3.a.a = r1
            return
    }

    @Override // a3.b
    public void h(com.tsn.chat.model.ChatModel r4) {
            r3 = this;
            java.lang.String r0 = "2"
            r4.setType(r0)
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            byte[] r0 = r4.getBytes()
            int r0 = r0.length
            int r0 = r0 + 6
            com.tsn.chat.model.RequestMessage r1 = new com.tsn.chat.model.RequestMessage
            r2 = 3
            r1.<init>(r0, r2, r4)
            io.netty.channel.group.ChannelGroup r4 = com.tsn.chat.utils.b.a
            int r4 = r4.size()
            if (r4 <= 0) goto L21
            com.tsn.chat.utils.c.a(r1)
        L21:
            return
    }

    @Override // a3.b
    public void i(com.tsn.chat.model.ChatModel r4) {
            r3 = this;
            java.lang.String r0 = "1"
            r4.setType(r0)
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            byte[] r0 = r4.getBytes()
            int r0 = r0.length
            int r0 = r0 + 6
            com.tsn.chat.model.RequestMessage r1 = new com.tsn.chat.model.RequestMessage
            r2 = 3
            r1.<init>(r0, r2, r4)
            io.netty.channel.group.ChannelGroup r4 = com.tsn.chat.utils.b.a
            int r4 = r4.size()
            if (r4 <= 0) goto L21
            com.tsn.chat.utils.c.a(r1)
        L21:
            return
    }

    @Override // a3.b
    public void j(com.tsn.chat.model.ChatModel r1) {
            r0 = this;
            return
    }

    @Override // a3.b
    public void k() {
            r0 = this;
            return
    }

    @Override // a3.b
    public void l() {
            r1 = this;
            java.lang.String r0 = ""
            com.tsn.chat.utils.b.d = r0
            com.tsn.chat.utils.b.e = r0
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            r0.close()
            return
    }

    @Override // a3.b
    public void m() {
            r0 = this;
            return
    }

    @Override // a3.b
    public void n() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "schoolId"
            java.lang.String r2 = com.tsn.chat.utils.b.e
            r0.put(r1, r2)
            java.lang.String r1 = "userId"
            java.lang.String r2 = com.tsn.chat.utils.b.d
            r0.put(r1, r2)
            java.lang.String r1 = "hb"
            java.lang.String r2 = "back"
            r0.put(r1, r2)
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            byte[] r1 = r0.getBytes()
            int r1 = r1.length
            int r1 = r1 + 6
            com.tsn.chat.model.RequestMessage r2 = new com.tsn.chat.model.RequestMessage
            r3 = 2
            r2.<init>(r1, r3, r0)
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            com.tsn.chat.utils.c.a(r2)
        L36:
            return
    }

    @Override // a3.b
    public void o(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "userId"
            r0.put(r1, r3)
            java.lang.String r3 = "schoolId"
            r0.put(r3, r4)
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r0)
            byte[] r4 = r3.getBytes()
            int r4 = r4.length
            int r4 = r4 + 6
            com.tsn.chat.model.RequestMessage r0 = new com.tsn.chat.model.RequestMessage
            r1 = 1
            r0.<init>(r4, r1, r3)
            io.netty.channel.group.ChannelGroup r3 = com.tsn.chat.utils.b.a
            int r3 = r3.size()
            if (r3 <= 0) goto L2b
            com.tsn.chat.utils.c.a(r0)
        L2b:
            return
    }
}
