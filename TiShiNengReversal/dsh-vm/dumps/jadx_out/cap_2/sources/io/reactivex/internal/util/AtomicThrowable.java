package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AtomicThrowable extends java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public AtomicThrowable() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean addThrowable(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r1)
            return r1
    }

    public boolean isTerminated() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.lang.Throwable terminate() {
            r1 = this;
            java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r1)
            return r0
    }
}
