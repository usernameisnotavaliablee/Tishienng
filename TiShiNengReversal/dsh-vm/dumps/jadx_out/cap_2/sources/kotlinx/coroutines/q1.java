package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q1 {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.n1 a() {
            kotlinx.coroutines.h r0 = new kotlinx.coroutines.h
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.<init>(r1)
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @kotlin.PublishedApi
    @kotlinx.coroutines.DelicateCoroutinesApi
    public static final boolean b(@org.jetbrains.annotations.NotNull java.lang.Thread r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r1
            boolean r1 = r1.p()
            return r1
    }

    public static final void c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r0) {
            r0.invoke()
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final long d() {
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.a()
            if (r0 == 0) goto Ld
            long r0 = r0.J()
            return r0
        Ld:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @kotlin.PublishedApi
    @kotlinx.coroutines.DelicateCoroutinesApi
    public static final long e() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            if (r1 == 0) goto Lf
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r0
            long r0 = r0.t()
            return r0
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected CoroutineScheduler.Worker, but got "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }
}
