package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a;

    public h(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b.a(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r0 = r1.a
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.b.b(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
