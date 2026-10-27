package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Void b() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No methods should be called on this descriptor. Only its presence matters"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r1 = this;
            r1.b()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a.a(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r1 = this;
            r1.b()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            r1.b()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[EnhancedType]"
            return r0
    }
}
