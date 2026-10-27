package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y implements kotlin.reflect.jvm.internal.impl.types.s1 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.y a = null;

    static {
            kotlin.reflect.jvm.internal.impl.types.y r0 = new kotlin.reflect.jvm.internal.impl.types.y
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.y.a = r0
            return
    }

    private y() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            r0 = this;
            java.lang.String r2 = "annotations"
            kotlin.jvm.internal.g0.p(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.types.t1$a r1 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.k()
            return r1
        L12:
            kotlin.reflect.jvm.internal.impl.types.t1$a r2 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t r3 = new kotlin.reflect.jvm.internal.impl.types.t
            r3.<init>(r1)
            java.util.List r1 = kotlin.collections.f0.l(r3)
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r2.j(r1)
            return r1
    }
}
