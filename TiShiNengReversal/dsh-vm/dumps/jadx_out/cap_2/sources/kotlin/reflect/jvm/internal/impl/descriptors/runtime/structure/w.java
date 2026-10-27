package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class w extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y implements x3.n {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Field a;

    public w(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r2) {
            r1 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public boolean H() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.P()
            boolean r0 = r0.isEnumConstant()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y
    public /* bridge */ /* synthetic */ java.lang.reflect.Member N() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.P()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Field P() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 getType() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.lang.reflect.Field r1 = r3.P()
            java.lang.reflect.Type r1 = r1.getGenericType()
            java.lang.String r2 = "getGenericType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r0.a(r1)
            return r0
    }

    /* renamed from: getType, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x3.x m29getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.getType()
            return r0
    }

    public boolean x() {
            r1 = this;
            r0 = 0
            return r0
    }
}
