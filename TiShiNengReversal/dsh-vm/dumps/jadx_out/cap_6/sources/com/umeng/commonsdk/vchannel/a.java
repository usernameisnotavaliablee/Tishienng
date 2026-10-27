package com.umeng.commonsdk.vchannel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public static java.lang.String a = "https://pslog.umeng.com";
    public static java.lang.String b = "https://pslog.umeng.com/";
    public static java.lang.String c = "explog";
    public static final java.lang.String d = "analytics";
    public static final java.lang.String e = "ekv";
    public static final java.lang.String f = "id";
    public static final java.lang.String g = "ts";
    public static final java.lang.String h = "ds";
    public static final java.lang.String i = "pn";
    public static java.lang.String j = "";

    static {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SUB"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "%0"
            r2.append(r3)
            int r0 = r0.length()
            int r0 = 32 - r0
            r2.append(r0)
            java.lang.String r0 = "d"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.umeng.commonsdk.vchannel.a.j = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }
}
