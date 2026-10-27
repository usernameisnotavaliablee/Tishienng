package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] b = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i a;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.class
            java.lang.String r2 = "annotations"
            java.lang.String r3 = "getAnnotations()Ljava/util/List;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.b = r1
            return
    }

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.a = r2
            return
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.a
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b.b
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
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
            java.util.List r0 = r1.a()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r1 = this;
            java.util.List r0 = r1.a()
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
