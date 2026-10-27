package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqNameToMatch"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e.a
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r1 = r0.a(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b.b(r0, r1)
            return r1
    }
}
