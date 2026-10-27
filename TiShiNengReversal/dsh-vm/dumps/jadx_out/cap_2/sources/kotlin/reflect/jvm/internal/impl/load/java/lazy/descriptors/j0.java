package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j0 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 a;
    private final x3.n b;
    private final kotlin.jvm.internal.Ref.ObjectRef c;

    public j0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r1, x3.n r2, kotlin.jvm.internal.Ref.ObjectRef r3) {
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
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0 = r3.a
            x3.n r1 = r3.b
            kotlin.jvm.internal.Ref$ObjectRef r2 = r3.c
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.l(r0, r1, r2)
            return r0
    }
}
