package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        @org.jetbrains.annotations.Nullable
        public x3.n c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        public /* bridge */ /* synthetic */ java.util.Collection e(kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                java.util.List r1 = r0.g(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
        @org.jetbrains.annotations.Nullable
        public x3.w f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.util.List<x3.r> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r2 = kotlin.collections.f0.J()
                return r2
        }
    }

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> a();

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @org.jetbrains.annotations.Nullable
    x3.n c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d();

    @org.jetbrains.annotations.NotNull
    java.util.Collection<x3.r> e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

    @org.jetbrains.annotations.Nullable
    x3.w f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);
}
