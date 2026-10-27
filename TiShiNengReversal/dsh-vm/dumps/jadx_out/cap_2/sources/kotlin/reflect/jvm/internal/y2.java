package kotlin.reflect.jvm.internal;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y2 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.z2 a;
    private final int b;
    private final kotlin.s c;

    public y2(kotlin.reflect.jvm.internal.z2 r1, int r2, kotlin.s r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r3 = this;
            kotlin.reflect.jvm.internal.z2 r0 = r3.a
            int r1 = r3.b
            kotlin.s r2 = r3.c
            java.lang.reflect.Type r0 = kotlin.reflect.jvm.internal.z2.g(r0, r1, r2)
            return r0
    }
}
