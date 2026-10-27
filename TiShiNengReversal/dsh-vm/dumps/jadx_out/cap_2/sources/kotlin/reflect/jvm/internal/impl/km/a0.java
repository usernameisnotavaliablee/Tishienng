package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {
    public kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind a;
    public kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel b;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer c;

    @org.jetbrains.annotations.Nullable
    private java.lang.String d;
    public kotlin.reflect.jvm.internal.impl.km.z e;

    public a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer a() {
            r1 = this;
            java.lang.Integer r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r0 = r1.a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r0 = r1.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "level"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.z e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.z r0 = r1.e
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "version"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    public final void f(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public final void g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public final void h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void i(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.z r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KmVersionRequirement(kind="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = ", level="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.km.z r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            java.lang.Integer r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
