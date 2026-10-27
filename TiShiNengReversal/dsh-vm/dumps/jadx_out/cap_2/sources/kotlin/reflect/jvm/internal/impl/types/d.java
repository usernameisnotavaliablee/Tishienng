package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.d a = null;

    static {
            kotlin.reflect.jvm.internal.impl.types.d r0 = new kotlin.reflect.jvm.internal.impl.types.d
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.d.a = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean a(d4.r r9, d4.h r10, d4.h r11) {
            r8 = this;
            int r0 = r9.m0(r10)
            int r1 = r9.m0(r11)
            r2 = 0
            if (r0 != r1) goto L7a
            boolean r0 = r9.c0(r10)
            boolean r1 = r9.c0(r11)
            if (r0 != r1) goto L7a
            boolean r0 = r9.a0(r10)
            boolean r1 = r9.a0(r11)
            if (r0 != r1) goto L7a
            d4.o r0 = r9.g(r10)
            d4.o r1 = r9.g(r11)
            boolean r0 = r9.J(r0, r1)
            if (r0 != 0) goto L2e
            goto L7a
        L2e:
            boolean r0 = r9.j(r10, r11)
            r1 = 1
            if (r0 == 0) goto L36
            return r1
        L36:
            int r0 = r9.m0(r10)
            r3 = 0
        L3b:
            if (r3 >= r0) goto L79
            d4.l r4 = r9.I0(r10, r3)
            d4.l r5 = r9.I0(r11, r3)
            boolean r6 = r9.e(r4)
            boolean r7 = r9.e(r5)
            if (r6 == r7) goto L50
            return r2
        L50:
            boolean r6 = r9.e(r4)
            if (r6 != 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r6 = r9.G(r4)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r7 = r9.G(r5)
            if (r6 == r7) goto L61
            return r2
        L61:
            d4.g r4 = r9.getType(r4)
            kotlin.jvm.internal.g0.m(r4)
            d4.g r5 = r9.getType(r5)
            kotlin.jvm.internal.g0.m(r5)
            boolean r4 = r8.c(r9, r4, r5)
            if (r4 != 0) goto L76
            return r2
        L76:
            int r3 = r3 + 1
            goto L3b
        L79:
            return r1
        L7a:
            return r2
    }

    private final boolean c(d4.r r5, d4.g r6, d4.g r7) {
            r4 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            d4.h r1 = r5.a(r6)
            d4.h r2 = r5.a(r7)
            if (r1 == 0) goto L15
            if (r2 == 0) goto L15
            boolean r5 = r4.a(r5, r1, r2)
            return r5
        L15:
            d4.e r6 = r5.X(r6)
            d4.e r7 = r5.X(r7)
            r1 = 0
            if (r6 == 0) goto L3f
            if (r7 == 0) goto L3f
            d4.h r2 = r5.f(r6)
            d4.h r3 = r5.f(r7)
            boolean r2 = r4.a(r5, r2, r3)
            if (r2 == 0) goto L3f
            d4.h r6 = r5.d(r6)
            d4.h r7 = r5.d(r7)
            boolean r5 = r4.a(r5, r6, r7)
            if (r5 == 0) goto L3f
            return r0
        L3f:
            return r1
    }

    public final boolean b(@org.jetbrains.annotations.NotNull d4.r r2, @org.jetbrains.annotations.NotNull d4.g r3, @org.jetbrains.annotations.NotNull d4.g r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r2 = r1.c(r2, r3, r4)
            return r2
    }
}
