package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ah {
    private java.lang.String a;
    private java.util.ArrayList<com.umeng.analytics.pro.ai> b;

    public ah(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            r1.a = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L19
            r1.a()
        L19:
            return
    }

    private void a() {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L31
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r0 = r1.split(r0)     // Catch: java.lang.Throwable -> L4b
            int r1 = r0.length     // Catch: java.lang.Throwable -> L4b
            r2 = 0
        L12:
            if (r2 >= r1) goto L4b
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L4b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L2e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList<com.umeng.analytics.pro.ai> r4 = r5.b     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2e
            com.umeng.analytics.pro.ai r4 = new com.umeng.analytics.pro.ai     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList<com.umeng.analytics.pro.ai> r3 = r5.b     // Catch: java.lang.Throwable -> L4b
            r3.add(r4)     // Catch: java.lang.Throwable -> L4b
        L2e:
            int r2 = r2 + 1
            goto L12
        L31:
            java.lang.String r0 = r5.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L4b
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList<com.umeng.analytics.pro.ai> r1 = r5.b     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            com.umeng.analytics.pro.ai r1 = new com.umeng.analytics.pro.ai     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList<com.umeng.analytics.pro.ai> r0 = r5.b     // Catch: java.lang.Throwable -> L4b
            r0.add(r1)     // Catch: java.lang.Throwable -> L4b
        L4b:
            return
    }

    public boolean a(int r5) {
            r4 = this;
            r0 = 0
            java.util.ArrayList<com.umeng.analytics.pro.ai> r1 = r4.b     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L21
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L21
            r2 = 0
        La:
            if (r2 >= r1) goto L21
            java.util.ArrayList<com.umeng.analytics.pro.ai> r3 = r4.b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L21
            com.umeng.analytics.pro.ai r3 = (com.umeng.analytics.pro.ai) r3     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1e
            boolean r3 = r3.a(r5)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1e
            r5 = 1
            return r5
        L1e:
            int r2 = r2 + 1
            goto La
        L21:
            return r0
    }
}
