package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l implements w3.b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements w3.a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u b;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r2) {
                r1 = this;
                java.lang.String r0 = "javaElement"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.b = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
                java.lang.String r1 = "NO_SOURCE_FILE"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        public /* bridge */ /* synthetic */ x3.l c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r0 = r1.d()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u d() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l$a> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.a.class
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r1 = r2.d()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.a = r0
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public w3.a a(@org.jetbrains.annotations.NotNull x3.l r2) {
            r1 = this;
            java.lang.String r0 = "javaElement"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l$a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) r2
            r0.<init>(r2)
            return r0
    }
}
