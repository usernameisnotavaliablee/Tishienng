package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g2 extends kotlinx.coroutines.l2 implements kotlinx.coroutines.b0 {
    private final boolean c;

    public g2(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.K0(r2)
            boolean r2 = r1.v1()
            r1.c = r2
            return
    }

    private final boolean v1() {
            r4 = this;
            kotlinx.coroutines.v r0 = r4.G0()
            boolean r1 = r0 instanceof kotlinx.coroutines.w
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            kotlinx.coroutines.l2 r0 = r0.A()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.A0()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            kotlinx.coroutines.v r0 = r0.G0()
            boolean r3 = r0 instanceof kotlinx.coroutines.w
            if (r3 == 0) goto L2a
            kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            kotlinx.coroutines.l2 r0 = r0.A()
            if (r0 != 0) goto L17
        L33:
            return r1
    }

    @Override // kotlinx.coroutines.l2
    public boolean A0() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // kotlinx.coroutines.l2
    public boolean D0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.b0
    public boolean c(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.d0 r0 = new kotlinx.coroutines.d0
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            boolean r5 = r4.T0(r0)
            return r5
    }

    @Override // kotlinx.coroutines.b0
    public boolean complete() {
            r1 = this;
            kotlin.n1 r0 = kotlin.n1.a
            boolean r0 = r1.T0(r0)
            return r0
    }
}
