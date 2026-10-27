package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    private static java.lang.ref.WeakReference<java.util.concurrent.Future<?>> a;

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            java.lang.ref.WeakReference<java.util.concurrent.Future<?>> r0 = com.umeng.socialize.a.h.a
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 == 0) goto L19
            boolean r1 = r0.isDone()
            if (r1 != 0) goto L19
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L19
            return
        L19:
            com.umeng.socialize.a.g r0 = new com.umeng.socialize.a.g
            r0.<init>()
            java.util.concurrent.Future r0 = com.umeng.socialize.a.j.a(r0)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.umeng.socialize.a.h.a = r1
            return
    }
}
