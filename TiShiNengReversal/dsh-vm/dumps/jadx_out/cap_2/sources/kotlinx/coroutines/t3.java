package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t3 {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            kotlin.coroutines.i r0 = r4.getContext()
            kotlinx.coroutines.h2.z(r0)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.l
            if (r2 == 0) goto L12
            kotlinx.coroutines.internal.l r1 = (kotlinx.coroutines.internal.l) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L18
            kotlin.n1 r0 = kotlin.n1.a
            goto L49
        L18:
            kotlinx.coroutines.m0 r2 = r1.d
            boolean r2 = r2.isDispatchNeeded(r0)
            if (r2 == 0) goto L26
            kotlin.n1 r2 = kotlin.n1.a
            r1.m(r0, r2)
            goto L45
        L26:
            kotlinx.coroutines.s3 r2 = new kotlinx.coroutines.s3
            r2.<init>()
            kotlin.coroutines.i r0 = r0.plus(r2)
            kotlin.n1 r3 = kotlin.n1.a
            r1.m(r0, r3)
            boolean r0 = r2.a
            if (r0 == 0) goto L45
            boolean r0 = kotlinx.coroutines.internal.m.f(r1)
            if (r0 == 0) goto L43
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            goto L49
        L43:
            r0 = r3
            goto L49
        L45:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
        L49:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L52
            kotlin.coroutines.jvm.internal.e.c(r4)
        L52:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r4) goto L59
            return r0
        L59:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
