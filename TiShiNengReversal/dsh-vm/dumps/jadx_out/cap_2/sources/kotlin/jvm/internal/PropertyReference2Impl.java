package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class PropertyReference2Impl extends kotlin.jvm.internal.PropertyReference2 {
    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference2Impl(java.lang.Class r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public PropertyReference2Impl(kotlin.reflect.h r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = r2
            kotlin.jvm.internal.s r0 = (kotlin.jvm.internal.s) r0
            java.lang.Class r0 = r0.c()
            boolean r2 = r2 instanceof kotlin.reflect.d
            r2 = r2 ^ 1
            r1.<init>(r0, r3, r4, r2)
            return
    }

    @Override // kotlin.reflect.q
    public java.lang.Object get(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            kotlin.reflect.q$a r0 = r3.getGetter()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.Object r4 = r0.call(r1)
            return r4
    }
}
