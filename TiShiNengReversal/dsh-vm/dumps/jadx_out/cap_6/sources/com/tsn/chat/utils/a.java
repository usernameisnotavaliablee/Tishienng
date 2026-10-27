package com.tsn.chat.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd"
            r1.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public static java.lang.String b() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMdd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String c() {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public static java.lang.String d() {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "HH:mm:ss"
            r1.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public static java.lang.String e() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMddHHmmssms"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static java.lang.String f() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy年MM月dd日"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static void g(java.lang.String[] r0) {
            java.io.PrintStream r0 = java.lang.System.out
            c()
            r0.getClass()
            return
    }
}
