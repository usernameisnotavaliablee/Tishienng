package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.b.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.b.a a = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlin.s<kotlin.reflect.jvm.internal.impl.builtins.b> b = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.b$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.b$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.b.a.a = r0
                kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.PUBLICATION
                kotlin.reflect.jvm.internal.impl.builtins.a r1 = kotlin.reflect.jvm.internal.impl.builtins.a.a
                kotlin.s r0 = kotlin.t.b(r0, r1)
                kotlin.reflect.jvm.internal.impl.builtins.b.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static final kotlin.reflect.jvm.internal.impl.builtins.b a() {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.b> r0 = kotlin.reflect.jvm.internal.impl.builtins.b.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
                kotlin.jvm.internal.g0.m(r0)
                java.lang.Object r0 = kotlin.collections.f0.J2(r0)
                kotlin.reflect.jvm.internal.impl.builtins.b r0 = (kotlin.reflect.jvm.internal.impl.builtins.b) r0
                if (r0 == 0) goto L16
                return r0
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager"
                r0.<init>(r1)
                throw r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.b b() {
                kotlin.reflect.jvm.internal.impl.builtins.b r0 = a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.builtins.b c() {
                r1 = this;
                kotlin.s<kotlin.reflect.jvm.internal.impl.builtins.b> r0 = kotlin.reflect.jvm.internal.impl.builtins.b.a.b
                java.lang.Object r0 = r0.getValue()
                kotlin.reflect.jvm.internal.impl.builtins.b r0 = (kotlin.reflect.jvm.internal.impl.builtins.b) r0
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.b$a r0 = kotlin.reflect.jvm.internal.impl.builtins.b.a.a
            kotlin.reflect.jvm.internal.impl.builtins.b.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.m0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends q3.b> r3, @org.jetbrains.annotations.NotNull q3.c r4, @org.jetbrains.annotations.NotNull q3.a r5, boolean r6);
}
