package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.storage.d {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.n1> d;

    public c(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "checkCancelled"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "interruptedExceptionHandler"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.<init>(r0, r2, r3)
            return
    }

    public c(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.Lock r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.n1> r4) {
            r1 = this;
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "checkCancelled"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "interruptedExceptionHandler"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2)
            r1.c = r3
            r1.d = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
            r4 = this;
        L0:
            java.util.concurrent.locks.Lock r0 = r4.a()     // Catch: java.lang.InterruptedException -> L14
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L14
            r2 = 50
            boolean r0 = r0.tryLock(r2, r1)     // Catch: java.lang.InterruptedException -> L14
            if (r0 != 0) goto L16
            java.lang.Runnable r0 = r4.c     // Catch: java.lang.InterruptedException -> L14
            r0.run()     // Catch: java.lang.InterruptedException -> L14
            goto L0
        L14:
            r0 = move-exception
            goto L17
        L16:
            return
        L17:
            kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.n1> r1 = r4.d
            r1.invoke(r0)
            return
    }
}
