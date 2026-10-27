package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaRecordComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaRecordComponent.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaRecordComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y implements x3.w {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object a;

    public d0(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "recordComponent"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Member N() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.a
            java.lang.Object r1 = r2.a
            java.lang.reflect.Method r0 = r0.c(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            java.lang.String r1 = "Can't find `getAccessor` method"
            r0.<init>(r1)
            throw r0
    }

    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public x3.x getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a.a
            java.lang.Object r1 = r2.a
            java.lang.Class r0 = r0.d(r1)
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s r1 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s
            r1.<init>(r0)
            return r1
        L10:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            java.lang.String r1 = "Can't find `getType` method"
            r0.<init>(r1)
            throw r0
    }
}
