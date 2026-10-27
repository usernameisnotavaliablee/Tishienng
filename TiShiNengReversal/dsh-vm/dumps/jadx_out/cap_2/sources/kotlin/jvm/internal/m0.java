package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m0 implements kotlin.jvm.internal.s {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    public m0(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "moduleName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.jvm.internal.s
    @org.jetbrains.annotations.NotNull
    public java.lang.Class<?> c() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.jvm.internal.m0
            if (r0 == 0) goto L16
            java.lang.Class r0 = r1.c()
            kotlin.jvm.internal.m0 r2 = (kotlin.jvm.internal.m0) r2
            java.lang.Class r2 = r2.c()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.c()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.reflect.h
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.c<?>> o() {
            r1 = this;
            kotlin.jvm.KotlinReflectionNotSupportedError r0 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.c()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
