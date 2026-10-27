package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class PropertyReference0 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.o {
    public PropertyReference0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public PropertyReference0(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference0(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
            r1 = this;
            kotlin.reflect.o r0 = kotlin.jvm.internal.o0.t(r1)
            return r0
    }

    @Override // kotlin.reflect.o
    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getDelegate() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.o r0 = (kotlin.reflect.o) r0
            java.lang.Object r0 = r0.getDelegate()
            return r0
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.n.c getGetter() {
            r1 = this;
            kotlin.reflect.o$a r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.o.a getGetter() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.o r0 = (kotlin.reflect.o) r0
            kotlin.reflect.o$a r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            return r0
    }
}
