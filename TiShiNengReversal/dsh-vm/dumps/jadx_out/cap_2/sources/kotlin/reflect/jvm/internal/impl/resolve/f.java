package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f implements kotlin.jvm.functions.Function2 {
    private final kotlin.reflect.jvm.internal.impl.descriptors.a a;
    private final kotlin.reflect.jvm.internal.impl.descriptors.a b;

    public f(kotlin.reflect.jvm.internal.impl.descriptors.a r1, kotlin.reflect.jvm.internal.impl.descriptors.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r4
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.g.d(r0, r1, r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}
