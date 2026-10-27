package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> a;

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> r2) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.km.internal.extensions.f
            if (r0 == 0) goto L12
            kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> r0 = r1.a
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.f r2 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.f) r2
            kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> r2 = r2.a
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.d<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.e> r0 = r2.a
            java.lang.Class r0 = k3.a.e(r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
