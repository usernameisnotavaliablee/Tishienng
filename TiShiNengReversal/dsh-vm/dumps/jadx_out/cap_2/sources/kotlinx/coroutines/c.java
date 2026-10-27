package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    @org.jetbrains.annotations.Nullable
    private static kotlinx.coroutines.b a;

    static {
            return
    }

    @kotlin.internal.InlineOnly
    private static final long a() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto Lb
            long r0 = r0.a()
            return r0
        Lb:
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlinx.coroutines.b b() {
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.a
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final long c() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto Lb
            long r0 = r0.b()
            return r0
        Lb:
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final void d(java.lang.Object r1, long r2) {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto Lc
            r0.c(r1, r2)
            kotlin.n1 r0 = kotlin.n1.a
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)
        L12:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void e() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto L9
            r0.d()
        L9:
            return
    }

    public static final void f(@org.jetbrains.annotations.Nullable kotlinx.coroutines.b r0) {
            kotlinx.coroutines.c.a = r0
            return
    }

    @kotlin.internal.InlineOnly
    private static final void g() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto L9
            r0.e()
        L9:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void h() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto L9
            r0.f()
        L9:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void i(java.lang.Thread r1) {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto Lc
            r0.g(r1)
            kotlin.n1 r0 = kotlin.n1.a
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L12:
            return
    }

    @kotlin.internal.InlineOnly
    private static final void j() {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto L9
            r0.h()
        L9:
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Runnable k(java.lang.Runnable r1) {
            kotlinx.coroutines.b r0 = b()
            if (r0 == 0) goto Le
            java.lang.Runnable r0 = r0.i(r1)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            return r1
    }
}
