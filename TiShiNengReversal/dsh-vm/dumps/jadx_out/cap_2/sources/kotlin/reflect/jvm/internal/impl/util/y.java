package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.util.z a;

    public y(kotlin.reflect.jvm.internal.impl.util.z r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.z r0 = r1.a
            java.lang.String r2 = (java.lang.String) r2
            int r2 = kotlin.reflect.jvm.internal.impl.util.z.a(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }
}
