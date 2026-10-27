package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.a$a, reason: collision with other inner class name */
    public static final class C0061a implements kotlin.reflect.jvm.internal.impl.renderer.a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.renderer.a.C0061a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.renderer.a$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.a$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.renderer.a.C0061a.a = r0
                return
        }

        private C0061a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @org.jetbrains.annotations.NotNull
        public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r3) {
                r1 = this;
                java.lang.String r0 = "classifier"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "renderer"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                java.lang.String r0 = "getName(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                r0 = 0
                java.lang.String r2 = r3.S(r2, r0)
                return r2
            L1f:
                kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
                java.lang.String r0 = "getFqName(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                java.lang.String r2 = r3.R(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.reflect.jvm.internal.impl.renderer.a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.renderer.a.b a = null;

        static {
                kotlin.reflect.jvm.internal.impl.renderer.a$b r0 = new kotlin.reflect.jvm.internal.impl.renderer.a$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.renderer.a.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @org.jetbrains.annotations.NotNull
        public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r3) {
                r1 = this;
                java.lang.String r0 = "classifier"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "renderer"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                java.lang.String r0 = "getName(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                r0 = 0
                java.lang.String r2 = r3.S(r2, r0)
                return r2
            L1f:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L24:
                kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
                r3.add(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r0 != 0) goto L24
                java.util.List r2 = kotlin.collections.f0.d1(r3)
                java.lang.String r2 = kotlin.reflect.jvm.internal.impl.renderer.a0.c(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements kotlin.reflect.jvm.internal.impl.renderer.a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.renderer.a.c a = null;

        static {
                kotlin.reflect.jvm.internal.impl.renderer.a$c r0 = new kotlin.reflect.jvm.internal.impl.renderer.a$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.renderer.a.c.a = r0
                return
        }

        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        private final java.lang.String b(kotlin.reflect.jvm.internal.impl.descriptors.f r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
                java.lang.String r1 = "getName(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.String r0 = kotlin.reflect.jvm.internal.impl.renderer.a0.b(r0)
                boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r1 == 0) goto L12
                return r0
            L12:
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r3.b()
                java.lang.String r1 = "getContainingDeclaration(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                java.lang.String r3 = r2.c(r3)
                if (r3 == 0) goto L3e
                java.lang.String r1 = ""
                boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
                if (r1 != 0) goto L3e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r3 = 46
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = r1.toString()
                return r3
            L3e:
                return r0
        }

        private final java.lang.String c(kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r0 == 0) goto Lb
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r2
                java.lang.String r2 = r1.b(r2)
                return r2
            Lb:
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
                if (r0 == 0) goto L1e
                kotlin.reflect.jvm.internal.impl.descriptors.l0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r2
                kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
                kotlin.reflect.jvm.internal.impl.name.d r2 = r2.i()
                java.lang.String r2 = kotlin.reflect.jvm.internal.impl.renderer.a0.a(r2)
                return r2
            L1e:
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.a
        @org.jetbrains.annotations.NotNull
        public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r3) {
                r1 = this;
                java.lang.String r0 = "classifier"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "renderer"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r2 = r1.b(r2)
                return r2
        }
    }

    @org.jetbrains.annotations.NotNull
    java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r2);
}
