package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c1<T> extends kotlinx.coroutines.internal.o0<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = null;

    @kotlin.jvm.Volatile
    @kotlin.jvm.JvmField
    private volatile int _decision;

    static {
            java.lang.Class<kotlinx.coroutines.c1> r0 = kotlinx.coroutines.c1.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.c1.e = r0
            return
    }

    public c1(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater B1() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.c1.e
            return r0
    }

    private final void C1(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            int r0 = r2.get(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r0)
            goto L0
    }

    private final boolean D1() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.c1.e
        L2:
            int r1 = r0.get(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            if (r1 != r3) goto Ld
            return r2
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.c1.e
            r4 = 2
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L2
            return r3
    }

    private final boolean E1() {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.c1.e
        L2:
            int r1 = r0.get(r4)
            r2 = 0
            if (r1 == 0) goto L15
            r0 = 2
            if (r1 != r0) goto Ld
            return r2
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.c1.e
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L2
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object A1() {
            r2 = this;
            boolean r0 = r2.E1()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            return r0
        Lb:
            java.lang.Object r0 = r2.H0()
            java.lang.Object r0 = kotlinx.coroutines.m2.h(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 != 0) goto L18
            return r0
        L18:
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            throw r0
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.l2
    protected void e0(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.v1(r1)
            return
    }

    @Override // kotlinx.coroutines.internal.o0, kotlinx.coroutines.a
    protected void v1(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.D1()
            if (r0 == 0) goto L7
            return
        L7:
            kotlin.coroutines.e<T> r0 = r3.d
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r0)
            kotlin.coroutines.e<T> r1 = r3.d
            java.lang.Object r4 = kotlinx.coroutines.i0.a(r4, r1)
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.m.e(r0, r4, r2, r1, r2)
            return
    }
}
