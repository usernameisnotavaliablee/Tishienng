package kotlin.reflect.jvm.internal.impl.descriptors;

import d4.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInlineClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/InlineClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z<Type extends d4.h> extends kotlin.reflect.jvm.internal.impl.descriptors.o1<Type> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f a;

    @org.jetbrains.annotations.NotNull
    private final Type b;

    public z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull Type r3) {
            r1 = this;
            java.lang.String r0 = "underlyingPropertyName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "underlyingType"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
    public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Type d() {
            r1 = this;
            Type extends d4.h r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InlineClassRepresentation(underlyingPropertyName="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", underlyingType="
            r0.append(r1)
            Type extends d4.h r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
