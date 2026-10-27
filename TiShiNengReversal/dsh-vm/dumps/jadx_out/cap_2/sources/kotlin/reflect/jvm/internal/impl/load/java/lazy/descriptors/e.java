package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f a;

    public e(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = r1.a
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.i(r0)
            return r0
    }
}
