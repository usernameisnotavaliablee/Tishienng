package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class o0 implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    public o0(kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            kotlin.reflect.jvm.internal.impl.name.c r2 = (kotlin.reflect.jvm.internal.impl.name.c) r2
            boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.p0.e(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
