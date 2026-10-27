package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m1 implements kotlinx.coroutines.y1 {
    private final boolean a;

    public m1(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.y1
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.q2 a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.y1
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Empty{"
            r0.append(r1)
            boolean r1 = r2.isActive()
            if (r1 == 0) goto L13
            java.lang.String r1 = "Active"
            goto L15
        L13:
            java.lang.String r1 = "New"
        L15:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
