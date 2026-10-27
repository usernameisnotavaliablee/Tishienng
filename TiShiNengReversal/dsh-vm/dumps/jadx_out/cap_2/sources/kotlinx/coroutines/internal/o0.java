package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class o0<T> extends kotlinx.coroutines.a<T> implements kotlin.coroutines.jvm.internal.c {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<T> d;

    public o0(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.d = r3
            return
    }

    @Override // kotlinx.coroutines.l2
    protected final boolean N0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.l2
    protected void e0(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.e<T> r0 = r3.d
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r0)
            kotlin.coroutines.e<T> r1 = r3.d
            java.lang.Object r4 = kotlinx.coroutines.i0.a(r4, r1)
            r1 = 0
            r2 = 2
            kotlinx.coroutines.internal.m.e(r0, r4, r1, r2, r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.d
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.c
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public final java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.a
    protected void v1(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.e<T> r0 = r1.d
            java.lang.Object r2 = kotlinx.coroutines.i0.a(r2, r0)
            r0.resumeWith(r2)
            return
    }
}
