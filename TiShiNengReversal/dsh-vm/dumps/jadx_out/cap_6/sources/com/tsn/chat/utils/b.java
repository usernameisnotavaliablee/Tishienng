package com.tsn.chat.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public static io.netty.channel.group.ChannelGroup a;
    public static java.lang.String b;
    public static java.lang.String c;
    public static java.lang.String d;
    public static java.lang.String e;
    public static java.lang.String f;
    public static java.lang.String g;
    public static java.lang.String h;
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<java.lang.Object>> i;
    public static java.util.Map<java.lang.String, java.lang.String> j;
    public static int k;

    static {
            io.netty.channel.group.DefaultChannelGroup r0 = new io.netty.channel.group.DefaultChannelGroup
            io.netty.util.concurrent.GlobalEventExecutor r1 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r0.<init>(r1)
            com.tsn.chat.utils.b.a = r0
            java.lang.String r0 = ""
            com.tsn.chat.utils.b.b = r0
            com.tsn.chat.utils.b.c = r0
            com.tsn.chat.utils.b.d = r0
            com.tsn.chat.utils.b.e = r0
            com.tsn.chat.utils.b.f = r0
            com.tsn.chat.utils.b.g = r0
            com.tsn.chat.utils.b.h = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.tsn.chat.utils.b.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tsn.chat.utils.b.j = r0
            r0 = 0
            com.tsn.chat.utils.b.k = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }
}
