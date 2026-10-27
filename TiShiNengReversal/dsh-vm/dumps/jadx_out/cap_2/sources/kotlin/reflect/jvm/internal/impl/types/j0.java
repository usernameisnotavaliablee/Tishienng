package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {
    @org.jetbrains.annotations.Nullable
    public static final d4.g a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i2 r1, @org.jetbrains.annotations.NotNull d4.g r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "inlineClassType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            d4.g r1 = b(r1, r2, r0)
            return r1
    }

    private static final d4.g b(kotlin.reflect.jvm.internal.impl.types.i2 r3, d4.g r4, java.util.HashSet<d4.o> r5) {
            d4.o r0 = r3.W(r4)
            boolean r1 = r5.add(r0)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            d4.p r1 = r3.Q(r0)
            if (r1 == 0) goto L65
            d4.g r0 = r3.G0(r1)
            d4.g r5 = b(r3, r0, r5)
            if (r5 == 0) goto L64
            d4.o r1 = r3.W(r0)
            boolean r1 = r3.C(r1)
            if (r1 != 0) goto L36
            boolean r1 = r0 instanceof d4.i
            if (r1 == 0) goto L34
            r1 = r0
            d4.i r1 = (d4.i) r1
            boolean r1 = r3.u(r1)
            if (r1 == 0) goto L34
            goto L36
        L34:
            r1 = 0
            goto L37
        L36:
            r1 = 1
        L37:
            boolean r2 = r5 instanceof d4.i
            if (r2 == 0) goto L51
            r2 = r5
            d4.i r2 = (d4.i) r2
            boolean r2 = r3.u(r2)
            if (r2 == 0) goto L51
            boolean r2 = r3.i0(r4)
            if (r2 == 0) goto L51
            if (r1 == 0) goto L51
            d4.g r3 = r3.K(r0)
            return r3
        L51:
            boolean r0 = r3.i0(r5)
            if (r0 != 0) goto L63
            boolean r4 = r3.c0(r4)
            if (r4 != 0) goto L5e
            goto L63
        L5e:
            d4.g r3 = r3.K(r5)
            return r3
        L63:
            return r5
        L64:
            return r2
        L65:
            boolean r0 = r3.C(r0)
            if (r0 == 0) goto L9a
            d4.g r0 = r3.K0(r4)
            if (r0 != 0) goto L72
            return r2
        L72:
            d4.g r5 = b(r3, r0, r5)
            if (r5 != 0) goto L79
            return r2
        L79:
            boolean r0 = r3.i0(r4)
            if (r0 != 0) goto L80
            return r5
        L80:
            boolean r0 = r3.i0(r5)
            if (r0 == 0) goto L87
            goto L9a
        L87:
            boolean r0 = r5 instanceof d4.i
            if (r0 == 0) goto L95
            r0 = r5
            d4.i r0 = (d4.i) r0
            boolean r0 = r3.u(r0)
            if (r0 == 0) goto L95
            goto L9a
        L95:
            d4.g r3 = r3.K(r5)
            return r3
        L9a:
            return r4
    }
}
