package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i implements java.util.concurrent.Executor {

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.i f2356c;
    public final rx.h a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f2357b;

    public i() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0.<init>(r1)
            r2.f2357b = r0
            rx.h r0 = com.acse.ottn.io.reactivex.schedulers.Schedulers.from(r2)
            r2.a = r0
            return
    }

    public static synchronized rx.h a() {
            java.lang.Class<com.acse.ottn.i> r0 = com.acse.ottn.i.class
            monitor-enter(r0)
            com.acse.ottn.i r1 = com.acse.ottn.i.f2356c     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.acse.ottn.i r1 = new com.acse.ottn.i     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.acse.ottn.i.f2356c = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L17
        L11:
            com.acse.ottn.i r1 = com.acse.ottn.i.f2356c     // Catch: java.lang.Throwable -> Lf
            rx.h r1 = r1.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(@com.acse.ottn.io.reactivex.annotations.NonNull java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.f2357b
            r0.post(r2)
            return
    }
}
