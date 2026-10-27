package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f implements kotlin.reflect.jvm.internal.impl.load.kotlin.x {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.a c = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader b;

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

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a(@org.jetbrains.annotations.NotNull java.lang.Class<?> r4) {
                r3 = this;
                java.lang.String r0 = "klass"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
                r1.b(r4, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r1 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.m()
                r2 = 0
                if (r0 != 0) goto L19
                return r2
            L19:
                r1.<init>(r4, r0, r2)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.c = r0
            return
    }

    private f(java.lang.Class<?> r1, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* synthetic */ f(java.lang.Class r1, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Class<?> a() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.b c() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.d r2, @org.jetbrains.annotations.Nullable byte[] r3) {
            r1 = this;
            java.lang.String r3 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
            java.lang.Class<?> r0 = r1.a
            r3.i(r0, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) r2
            java.lang.Class<?> r2 = r2.a
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    public void f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x.c r2, @org.jetbrains.annotations.Nullable byte[] r3) {
            r1 = this;
            java.lang.String r3 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.a
            java.lang.Class<?> r0 = r1.a
            r3.b(r0, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    @org.jetbrains.annotations.NotNull
    public java.lang.String getLocation() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<?> r1 = r8.a
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            java.lang.String r1 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            java.lang.String r1 = ".class"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.Class<?> r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
