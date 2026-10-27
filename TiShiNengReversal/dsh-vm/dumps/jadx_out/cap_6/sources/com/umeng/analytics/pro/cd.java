package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cd implements java.io.Serializable {
    private static java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.br>, java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd>> d;
    public final java.lang.String a;
    public final byte b;
    public final com.umeng.analytics.pro.ce c;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.analytics.pro.cd.d = r0
            return
    }

    public cd(java.lang.String r1, byte r2, com.umeng.analytics.pro.ce r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd> a(java.lang.Class<? extends com.umeng.analytics.pro.br> r5) {
            java.lang.String r0 = ", message: "
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.br>, java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd>> r1 = com.umeng.analytics.pro.cd.d
            boolean r1 = r1.containsKey(r5)
            if (r1 != 0) goto L5a
            r5.newInstance()     // Catch: java.lang.IllegalAccessException -> Le java.lang.InstantiationException -> L34
            goto L5a
        Le:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "IllegalAccessException for TBase class: "
            r3.append(r4)
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r1.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            throw r2
        L34:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "InstantiationException for TBase class: "
            r3.append(r4)
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r1.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            throw r2
        L5a:
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.br>, java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd>> r0 = com.umeng.analytics.pro.cd.d
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            return r5
    }

    public static void a(java.lang.Class<? extends com.umeng.analytics.pro.br> r1, java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd> r2) {
            java.util.Map<java.lang.Class<? extends com.umeng.analytics.pro.br>, java.util.Map<? extends com.umeng.analytics.pro.by, com.umeng.analytics.pro.cd>> r0 = com.umeng.analytics.pro.cd.d
            r0.put(r1, r2)
            return
    }
}
