package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g<T> extends kotlinx.coroutines.a<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Thread d;

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.n1 e;

    public g(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Thread r3, @org.jetbrains.annotations.Nullable kotlinx.coroutines.n1 r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.d = r3
            r1.e = r4
            return
    }

    public final T A1() {
            r6 = this;
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L9
            r0.d()
        L9:
            kotlinx.coroutines.n1 r0 = r6.e     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L16
            kotlinx.coroutines.n1.B(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L7b
        L16:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L6a
            kotlinx.coroutines.n1 r0 = r6.e     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            long r4 = r0.J()     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r0 = move-exception
            goto L73
        L27:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            boolean r0 = r6.isCompleted()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L45
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L3e
            r0.c(r6, r4)     // Catch: java.lang.Throwable -> L25
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L25
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 != 0) goto L16
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L25
            goto L16
        L45:
            kotlinx.coroutines.n1 r0 = r6.e     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L4c
            kotlinx.coroutines.n1.u(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
        L4c:
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L55
            r0.h()
        L55:
            java.lang.Object r0 = r6.H0()
            java.lang.Object r0 = kotlinx.coroutines.m2.h(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L64
            r3 = r0
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.d0) r3
        L64:
            if (r3 != 0) goto L67
            return r0
        L67:
            java.lang.Throwable r0 = r3.a
            throw r0
        L6a:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            r6.h0(r0)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L73:
            kotlinx.coroutines.n1 r4 = r6.e     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L7a
            kotlinx.coroutines.n1.u(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L14
        L7b:
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()
            if (r1 == 0) goto L84
            r1.h()
        L84:
            throw r0
    }

    @Override // kotlinx.coroutines.l2
    protected boolean N0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.l2
    protected void e0(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.d
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 != 0) goto L20
            java.lang.Thread r2 = r1.d
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L1a
            r0.g(r2)
            kotlin.n1 r0 = kotlin.n1.a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L20:
            return
    }
}
