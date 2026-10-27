package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class p2 extends kotlinx.coroutines.m0 {
    public p2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r1) {
            r0 = this;
            kotlinx.coroutines.internal.t.a(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.p2 t();

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.u()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L22:
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.Nullable
    protected final java.lang.String u() {
            r2 = this;
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            return r0
        L9:
            r1 = 0
            kotlinx.coroutines.p2 r0 = r0.t()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L11
        Lf:
            r0 = r1
        L11:
            if (r2 != r0) goto L16
            java.lang.String r0 = "Dispatchers.Main.immediate"
            return r0
        L16:
            return r1
    }
}
