package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class o implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.name.f a;

    public o(kotlin.reflect.jvm.internal.impl.name.f r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r2
            java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.t.j(r0, r2)
            return r2
    }
}
