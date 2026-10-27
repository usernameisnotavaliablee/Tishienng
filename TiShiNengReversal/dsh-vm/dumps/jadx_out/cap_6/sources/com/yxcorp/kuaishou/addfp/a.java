package com.yxcorp.kuaishou.addfp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class a implements java.lang.Runnable {
    final /* synthetic */ com.yxcorp.kuaishou.addfp.KWEGIDDFP a;

    a(com.yxcorp.kuaishou.addfp.KWEGIDDFP r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = r3.a     // Catch: java.lang.Throwable -> L48
            android.content.Context r0 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$100(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L15
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = r3.a     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.ResponseDfpCallback r0 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$200(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "parameter error"
            r2 = -3
            r0.onFailed(r2, r1)     // Catch: java.lang.Throwable -> L48
            return
        L15:
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = r3.a     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$100(r0)     // Catch: java.lang.Throwable -> L48
            int r0 = com.yxcorp.kuaishou.addfp.android.b.e.c     // Catch: java.lang.Throwable -> L48
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L48
            r1 = 28
            if (r0 < r1) goto L25
            com.yxcorp.kuaishou.addfp.android.b.e.a()     // Catch: java.lang.Throwable -> L48
        L25:
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = r3.a     // Catch: java.lang.Throwable -> L48
            android.content.Context r1 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$100(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$302(r0, r1)     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.android.a.c r0 = com.yxcorp.kuaishou.addfp.android.a.c.c()     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r1 = r3.a     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$300(r1)     // Catch: java.lang.Throwable -> L48
            r0.b(r1)     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r0 = r3.a     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.ResponseDfpCallback r1 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$200(r0)     // Catch: java.lang.Throwable -> L48
            com.yxcorp.kuaishou.addfp.KWEGIDDFP.access$400(r0, r1)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }
}
