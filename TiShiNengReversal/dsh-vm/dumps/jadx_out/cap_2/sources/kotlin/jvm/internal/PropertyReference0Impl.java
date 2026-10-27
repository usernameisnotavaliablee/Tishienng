package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class PropertyReference0Impl extends kotlin.jvm.internal.PropertyReference0 {
    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference0Impl(java.lang.Class r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference0Impl(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PropertyReference0Impl(kotlin.reflect.h r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r0 = r7
            kotlin.jvm.internal.s r0 = (kotlin.jvm.internal.s) r0
            java.lang.Class r2 = r0.c()
            boolean r7 = r7 instanceof kotlin.reflect.d
            r5 = r7 ^ 1
            r0 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.reflect.o
    public java.lang.Object get() {
            r2 = this;
            kotlin.reflect.o$a r0 = r2.getGetter()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.call(r1)
            return r0
    }
}
