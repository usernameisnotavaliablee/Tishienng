package z3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class b {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final z3.d b;

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String a() {
            r1 = this;
            z3.d r0 = r1.b()
            java.lang.String r0 = r0.getDescription()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public z3.d b() {
            r1 = this;
            z3.d r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.a()
            int r1 = r0.length()
            if (r1 <= 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L26:
            java.lang.String r0 = r3.a
            return r0
    }
}
