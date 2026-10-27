package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaValueParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaValueParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaValueParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u implements x3.b0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.annotation.Annotation[] b;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String c;
    private final boolean d;

    public g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r2, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[] r3, @org.jetbrains.annotations.Nullable java.lang.String r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "reflectAnnotations"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.annotation.Annotation[] r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k.a(r0, r2)
            return r2
    }

    /* renamed from: b, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x3.a m25b(kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r1 = r0.b(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
            r1 = this;
            java.util.List r0 = r1.m26getAnnotations()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: getAnnotations, reason: collision with other method in class */
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g> m26getAnnotations() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.b
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k.b(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r1 = this;
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.d(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.a
            return r0
    }

    /* renamed from: getType, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x3.x m27getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.getType()
            return r0
    }

    public boolean s() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g0> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g0.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            boolean r2 = r3.a()
            if (r2 == 0) goto L1c
            java.lang.String r2 = "vararg "
            goto L1e
        L1c:
            java.lang.String r2 = ""
        L1e:
            r0.append(r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = r3.getName()
            r0.append(r2)
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r1 = r3.getType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
