package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z {
    private final int a;
    private final int b;
    private final int c;

    public z(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.km.z
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.km.z r5 = (kotlin.reflect.jvm.internal.impl.km.z) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r5 = r5.c
            if (r1 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.a
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
