package kotlin.reflect.jvm.internal.calls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b implements kotlin.jvm.functions.Function0 {
    private final java.lang.Class a;
    private final java.util.Map b;

    public b(java.lang.Class r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r2 = this;
            java.lang.Class r0 = r2.a
            java.util.Map r1 = r2.b
            java.lang.String r0 = kotlin.reflect.jvm.internal.calls.e.d(r0, r1)
            return r0
    }
}
