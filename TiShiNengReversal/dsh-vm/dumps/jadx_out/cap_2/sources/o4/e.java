package o4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final long a(java.time.Duration r5) {
            java.time.Duration r0 = o4.a.a()
            int r0 = o4.b.a(r5, r0)
            if (r0 > 0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.time.temporal.ChronoUnit r0 = o4.c.a()
            java.time.Duration r0 = o4.d.a(r0)
            int r0 = o4.b.a(r5, r0)
            if (r0 > 0) goto L1e
            r0 = 1
            return r0
        L1e:
            long r0 = j4.a.a(r5)
            r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L43
            long r0 = j4.a.a(r5)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3d
            int r0 = j4.b.a(r5)
            r1 = 807000000(0x3019d7c0, float:5.5967675E-10)
            if (r0 >= r1) goto L3d
            goto L43
        L3d:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L43:
            long r0 = androidx.work.a.a(r5)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull java.time.Duration r3) {
            long r0 = a(r3)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.a0(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.time.Duration r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            long r0 = a(r2)
            java.lang.Object r2 = kotlinx.coroutines.a1.b(r0, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto Lf
            return r2
        Lf:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public static final <R> void d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.c<? super R> r2, @org.jetbrains.annotations.NotNull java.time.Duration r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4) {
            long r0 = a(r3)
            kotlinx.coroutines.selects.b.a(r2, r0, r4)
            return
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull java.time.Duration r3) {
            long r0 = a(r3)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.B1(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object f(@org.jetbrains.annotations.NotNull java.time.Duration r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            long r0 = a(r2)
            java.lang.Object r2 = kotlinx.coroutines.n3.c(r0, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull java.time.Duration r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            long r0 = a(r2)
            java.lang.Object r2 = kotlinx.coroutines.n3.e(r0, r3, r4)
            return r2
    }
}
