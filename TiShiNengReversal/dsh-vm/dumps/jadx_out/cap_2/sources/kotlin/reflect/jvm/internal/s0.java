package kotlin.reflect.jvm.internal;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class s0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.types.t0 a;
    private final kotlin.reflect.jvm.internal.h0.b b;
    private final kotlin.reflect.jvm.internal.h0 c;

    public s0(kotlin.reflect.jvm.internal.impl.types.t0 r1, kotlin.reflect.jvm.internal.h0.b r2, kotlin.reflect.jvm.internal.h0 r3) {
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
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.a
            kotlin.reflect.jvm.internal.h0$b r1 = r3.b
            kotlin.reflect.jvm.internal.h0 r2 = r3.c
            java.lang.reflect.Type r0 = kotlin.reflect.jvm.internal.h0.b.o(r0, r1, r2)
            return r0
    }
}
