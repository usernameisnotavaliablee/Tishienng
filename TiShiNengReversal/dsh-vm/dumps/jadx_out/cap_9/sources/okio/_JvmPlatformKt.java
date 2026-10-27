package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class _JvmPlatformKt {
    public _JvmPlatformKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] asUtf8ToByteArray(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.charset.Charset r0 = kotlin.text.e.b
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.locks.ReentrantLock newLock() {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toUtf8String(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.e.b
            r0.<init>(r2, r1)
            return r0
    }

    public static final <T> T withLock(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.ReentrantLock r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
