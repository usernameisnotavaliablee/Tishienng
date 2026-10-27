package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.7")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FunInterfaceConstructorReference extends kotlin.jvm.internal.FunctionReference implements java.io.Serializable {
    private final java.lang.Class funInterface;

    public FunInterfaceConstructorReference(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.funInterface = r2
            return
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof kotlin.jvm.internal.FunInterfaceConstructorReference
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.jvm.internal.FunInterfaceConstructorReference r2 = (kotlin.jvm.internal.FunInterfaceConstructorReference) r2
            java.lang.Class r0 = r1.funInterface
            java.lang.Class r2 = r2.funInterface
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ kotlin.reflect.c getReflected() {
            r1 = this;
            kotlin.reflect.i r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.i getReflected() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Functional interface constructor does not support reflection"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.funInterface
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fun interface "
            r0.append(r1)
            java.lang.Class r1 = r2.funInterface
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
