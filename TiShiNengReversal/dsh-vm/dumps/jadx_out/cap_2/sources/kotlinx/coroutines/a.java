package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a<T> extends kotlinx.coroutines.l2 implements kotlinx.coroutines.e2, kotlin.coroutines.e<T>, kotlinx.coroutines.r0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i c;

    public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            if (r2 == 0) goto L10
            kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r1.get(r2)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            r0.K0(r2)
        L10:
            kotlin.coroutines.i r1 = r1.plus(r0)
            r0.c = r1
            return
    }

    public static /* synthetic */ void w1() {
            return
    }

    @Override // kotlinx.coroutines.l2
    public final void J0(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.c
            kotlinx.coroutines.o0.b(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.l2
    @org.jetbrains.annotations.NotNull
    public java.lang.String W0() {
            r3 = this;
            kotlin.coroutines.i r0 = r3.c
            java.lang.String r0 = kotlinx.coroutines.l0.b(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = super.W0()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\":"
            r1.append(r0)
            java.lang.String r0 = super.W0()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // kotlinx.coroutines.l2
    protected final void e1(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto L10
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.d0) r2
            java.lang.Throwable r0 = r2.a
            boolean r2 = r2.a()
            r1.x1(r0, r2)
            return
        L10:
            r1.y1(r2)
            return
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.c
            return r0
    }

    @Override // kotlinx.coroutines.r0
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.c
            return r0
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.l2
    @org.jetbrains.annotations.NotNull
    protected java.lang.String m0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r2)
            r0.append(r1)
            java.lang.String r1 = " was cancelled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.coroutines.e
    public final void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r3 = kotlinx.coroutines.i0.d(r3, r0, r1, r0)
            java.lang.Object r3 = r2.U0(r3)
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.b
            if (r3 != r0) goto Lf
            return
        Lf:
            r2.v1(r3)
            return
    }

    protected void v1(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.e0(r1)
            return
    }

    protected void x1(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    protected void y1(T r1) {
            r0 = this;
            return
    }

    public final <R> void z1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.invoke(r3, r2, r0)
            return
    }
}
