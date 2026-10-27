package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.a c = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r9) {
                r8 = this;
                java.lang.String r0 = "classLoader"
                kotlin.jvm.internal.g0.p(r9, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g
                r2.<init>(r9)
                kotlin.reflect.jvm.internal.impl.load.kotlin.k$a r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.k.b
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r3 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g
                java.lang.Class<kotlin.n1> r0 = kotlin.n1.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.String r4 = "getClassLoader(...)"
                kotlin.jvm.internal.g0.o(r0, r4)
                r3.<init>(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d r4 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d
                r4.<init>(r9)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "runtime module for "
                r0.append(r5)
                r0.append(r9)
                java.lang.String r5 = r0.toString()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j r6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j.b
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l r7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.a
                kotlin.reflect.jvm.internal.impl.load.kotlin.k$a$a r9 = r1.a(r2, r3, r4, r5, r6, r7)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k
                kotlin.reflect.jvm.internal.impl.load.kotlin.k r1 = r9.a()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.a()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a r3 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a
                kotlin.reflect.jvm.internal.impl.load.kotlin.n r9 = r9.b()
                r3.<init>(r9, r2)
                r9 = 0
                r0.<init>(r1, r3, r9)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.c = r0
            return
    }

    private k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.q()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a r0 = r1.b
            return r0
    }
}
