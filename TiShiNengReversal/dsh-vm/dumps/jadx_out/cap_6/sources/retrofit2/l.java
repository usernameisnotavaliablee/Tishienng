package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class l {
    private final java.lang.reflect.Method a;
    private final java.util.List<?> b;

    l(java.lang.reflect.Method r1, java.util.List<?> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.b = r1
            return
    }

    public static retrofit2.l c(java.lang.reflect.Method r2, java.util.List<?> r3) {
            java.lang.String r0 = "method == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "arguments == null"
            java.util.Objects.requireNonNull(r3, r0)
            retrofit2.l r0 = new retrofit2.l
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.List<?> a() {
            r1 = this;
            java.util.List<?> r0 = r1.b
            return r0
    }

    public java.lang.reflect.Method b() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.reflect.Method r0 = r5.a
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.reflect.Method r1 = r5.a
            java.lang.String r1 = r1.getName()
            java.util.List<?> r2 = r5.b
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "%s.%s() %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            return r0
    }
}
