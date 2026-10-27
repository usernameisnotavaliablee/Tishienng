package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m extends kotlin.jvm.internal.n0<boolean[]> {

    @org.jetbrains.annotations.NotNull
    private final boolean[] d;

    public m(int r1) {
            r0 = this;
            r0.<init>(r1)
            boolean[] r1 = new boolean[r1]
            r0.d = r1
            return
    }

    @Override // kotlin.jvm.internal.n0
    public /* bridge */ /* synthetic */ int c(boolean[] r1) {
            r0 = this;
            boolean[] r1 = (boolean[]) r1
            int r1 = r0.i(r1)
            return r1
    }

    public final void h(boolean r4) {
            r3 = this;
            boolean[] r0 = r3.d
            int r1 = r3.b()
            int r2 = r1 + 1
            r3.e(r2)
            r0[r1] = r4
            return
    }

    protected int i(@org.jetbrains.annotations.NotNull boolean[] r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r2 = r2.length
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final boolean[] j() {
            r2 = this;
            boolean[] r0 = r2.d
            int r1 = r2.f()
            boolean[] r1 = new boolean[r1]
            java.lang.Object r0 = r2.g(r0, r1)
            boolean[] r0 = (boolean[]) r0
            return r0
    }
}
