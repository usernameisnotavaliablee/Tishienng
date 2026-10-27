package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class CallableReference implements kotlin.reflect.c, java.io.Serializable {

    @kotlin.SinceKotlin(version = "1.1")
    public static final java.lang.Object NO_RECEIVER = null;

    @kotlin.SinceKotlin(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.String name;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.Class owner;

    @kotlin.SinceKotlin(version = "1.1")
    protected final java.lang.Object receiver;
    private transient kotlin.reflect.c reflected;

    @kotlin.SinceKotlin(version = "1.4")
    private final java.lang.String signature;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.SinceKotlin(version = "1.2")
    private static class a implements java.io.Serializable {
        private static final kotlin.jvm.internal.CallableReference.a a = null;

        static {
                kotlin.jvm.internal.CallableReference$a r0 = new kotlin.jvm.internal.CallableReference$a
                r0.<init>()
                kotlin.jvm.internal.CallableReference.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ kotlin.jvm.internal.CallableReference.a a() {
                kotlin.jvm.internal.CallableReference$a r0 = kotlin.jvm.internal.CallableReference.a.a
                return r0
        }

        private java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r1 = this;
                kotlin.jvm.internal.CallableReference$a r0 = kotlin.jvm.internal.CallableReference.a.a
                return r0
        }
    }

    static {
            kotlin.jvm.internal.CallableReference$a r0 = kotlin.jvm.internal.CallableReference.a.a()
            kotlin.jvm.internal.CallableReference.NO_RECEIVER = r0
            return
    }

    public CallableReference() {
            r1 = this;
            java.lang.Object r0 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1.<init>(r0)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    protected CallableReference(java.lang.Object r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    protected CallableReference(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.receiver = r1
            r0.owner = r2
            r0.name = r3
            r0.signature = r4
            r0.isTopLevel = r5
            return
    }

    @Override // kotlin.reflect.c
    public java.lang.Object call(java.lang.Object... r2) {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            java.lang.Object r2 = r0.call(r2)
            return r2
    }

    @Override // kotlin.reflect.c
    public java.lang.Object callBy(java.util.Map r2) {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            java.lang.Object r2 = r0.callBy(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.c compute() {
            r1 = this;
            kotlin.reflect.c r0 = r1.reflected
            if (r0 != 0) goto La
            kotlin.reflect.c r0 = r1.computeReflected()
            r1.reflected = r0
        La:
            return r0
    }

    protected abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getBoundReceiver() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            return r0
    }

    @Override // kotlin.reflect.c
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public kotlin.reflect.h getOwner() {
            r2 = this;
            java.lang.Class r0 = r2.owner
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r1 = r2.isTopLevel
            if (r1 == 0) goto Lf
            kotlin.reflect.h r0 = kotlin.jvm.internal.o0.g(r0)
            return r0
        Lf:
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            return r0
    }

    @Override // kotlin.reflect.c
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            java.util.List r0 = r0.getParameters()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    protected kotlin.reflect.c getReflected() {
            r1 = this;
            kotlin.reflect.c r0 = r1.compute()
            if (r0 == r1) goto L7
            return r0
        L7:
            kotlin.jvm.KotlinReflectionNotSupportedError r0 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.r getReturnType() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            kotlin.reflect.r r0 = r0.getReturnType()
            return r0
    }

    public java.lang.String getSignature() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public java.util.List<kotlin.reflect.s> getTypeParameters() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            java.util.List r0 = r0.getTypeParameters()
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public kotlin.reflect.KVisibility getVisibility() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            kotlin.reflect.KVisibility r0 = r0.getVisibility()
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isAbstract() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            boolean r0 = r0.isAbstract()
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isFinal() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            boolean r0 = r0.isFinal()
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isOpen() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // kotlin.reflect.c
    @kotlin.SinceKotlin(version = "1.3")
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.c r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }
}
