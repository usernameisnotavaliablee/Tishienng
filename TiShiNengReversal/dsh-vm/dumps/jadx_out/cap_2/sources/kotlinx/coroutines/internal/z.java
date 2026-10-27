package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class z<E> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _cur;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur"
            java.lang.Class<kotlinx.coroutines.internal.z> r2 = kotlinx.coroutines.internal.z.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.z.a = r0
            return
    }

    public z(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.internal.a0 r0 = new kotlinx.coroutines.internal.a0
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    private final void f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    public final boolean a(@org.jetbrains.annotations.NotNull E r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
            int r2 = r1.a(r5)
            r3 = 1
            if (r2 == 0) goto L21
            if (r2 == r3) goto L17
            r1 = 2
            if (r2 == r1) goto L15
            goto L2
        L15:
            r5 = 0
            return r5
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.z.a
            kotlinx.coroutines.internal.a0 r3 = r1.m()
            androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            goto L2
        L21:
            return r3
    }

    public final void b() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
            boolean r2 = r1.d()
            if (r2 == 0) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.z.a
            kotlinx.coroutines.internal.a0 r3 = r1.m()
            androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            goto L2
    }

    public final int c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            int r0 = r0.f()
            return r0
    }

    public final boolean d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            boolean r0 = r0.g()
            return r0
    }

    public final boolean e() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            boolean r0 = r0.h()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <R> java.util.List<R> g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, ? extends R> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.a0 r0 = (kotlinx.coroutines.internal.a0) r0
            java.util.List r2 = r0.k(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final E h() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.z.a
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.a0 r1 = (kotlinx.coroutines.internal.a0) r1
            java.lang.Object r2 = r1.n()
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.internal.a0.t
            if (r2 == r3) goto L11
            return r2
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.z.a
            kotlinx.coroutines.internal.a0 r3 = r1.m()
            androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            goto L2
    }
}
