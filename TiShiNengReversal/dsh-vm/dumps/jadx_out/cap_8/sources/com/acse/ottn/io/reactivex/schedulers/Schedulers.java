package com.acse.ottn.io.reactivex.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Schedulers {
    public Schedulers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static rx.h computation() {
            rx.h r0 = rx.schedulers.c.a()
            return r0
    }

    public static rx.h from(java.util.concurrent.Executor r0) {
            rx.h r0 = rx.schedulers.c.b(r0)
            return r0
    }

    public static rx.h immediate() {
            rx.h r0 = rx.schedulers.c.d()
            return r0
    }

    public static rx.h io() {
            rx.h r0 = rx.schedulers.c.e()
            return r0
    }

    public static rx.h newThread() {
            rx.h r0 = rx.schedulers.c.f()
            return r0
    }

    public static rx.h trampoline() {
            rx.h r0 = rx.schedulers.c.m()
            return r0
    }
}
