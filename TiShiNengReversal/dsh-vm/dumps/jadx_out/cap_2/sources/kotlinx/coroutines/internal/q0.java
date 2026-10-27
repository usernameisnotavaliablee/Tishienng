package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.p0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmInline
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q0<S extends kotlinx.coroutines.internal.p0<S>> {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object a;

    private /* synthetic */ q0(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.q0 a(java.lang.Object r1) {
            kotlinx.coroutines.internal.q0 r0 = new kotlinx.coroutines.internal.q0
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <S extends kotlinx.coroutines.internal.p0<S>> java.lang.Object b(@org.jetbrains.annotations.Nullable java.lang.Object r0) {
            return r0
    }

    public static boolean c(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.q0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.internal.q0 r3 = (kotlinx.coroutines.internal.q0) r3
            java.lang.Object r3 = r3.j()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static final boolean d(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    public static /* synthetic */ void e() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final S f(java.lang.Object r1) {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.f.a()
            if (r1 == r0) goto Le
            java.lang.String r0 = "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.internal.p0 r1 = (kotlinx.coroutines.internal.p0) r1
            return r1
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Does not contain segment"
            r1.<init>(r0)
            throw r1
    }

    public static int g(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.hashCode()
            return r0
    }

    public static final boolean h(java.lang.Object r1) {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.f.a()
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static java.lang.String i(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SegmentOrClosed(value="
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.a
            boolean r2 = c(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.a
            int r0 = g(r0)
            return r0
    }

    public final /* synthetic */ java.lang.Object j() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.a
            java.lang.String r0 = i(r0)
            return r0
    }
}
