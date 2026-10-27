package x3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final boolean a(x3.r r2) {
            java.util.List r2 = r2.g()
            java.lang.Object r2 = kotlin.collections.f0.p5(r2)
            x3.b0 r2 = (x3.b0) r2
            r0 = 0
            if (r2 == 0) goto L12
            x3.x r2 = r2.getType()
            goto L13
        L12:
            r2 = r0
        L13:
            boolean r1 = r2 instanceof x3.j
            if (r1 == 0) goto L1a
            r0 = r2
            x3.j r0 = (x3.j) r0
        L1a:
            r2 = 0
            if (r0 != 0) goto L1e
            return r2
        L1e:
            x3.i r0 = r0.n()
            boolean r1 = r0 instanceof x3.g
            if (r1 == 0) goto L3b
            x3.g r0 = (x3.g) r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.a()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L3b
            r2 = 1
        L3b:
            return r2
    }

    private static final boolean b(x3.r r3) {
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = a(r3)
            return r3
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.g()
            boolean r3 = r3.isEmpty()
            return r3
        L44:
            r3 = 0
            return r3
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull x3.q r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            x3.g r0 = r1.y()
            boolean r0 = r0.I()
            if (r0 == 0) goto L1d
            boolean r0 = r1 instanceof x3.r
            if (r0 == 0) goto L1d
            x3.r r1 = (x3.r) r1
            boolean r1 = b(r1)
            if (r1 == 0) goto L1d
            r1 = 1
            return r1
        L1d:
            r1 = 0
            return r1
    }
}
