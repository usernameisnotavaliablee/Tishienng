package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class k implements kotlin.reflect.jvm.internal.impl.util.f {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.k {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.k.a b = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.k$a r0 = new kotlin.reflect.jvm.internal.impl.util.k$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.k.a.b = r0
                return
        }

        private a() {
                r2 = this;
                java.lang.String r0 = "must be a member function"
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = r2.c0()
                if (r2 == 0) goto Ld
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.util.k {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.k.b b = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.k$b r0 = new kotlin.reflect.jvm.internal.impl.util.k$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.k.b.b = r0
                return
        }

        private b() {
                r2 = this;
                java.lang.String r0 = "must be a member or an extension function"
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r2.c0()
                if (r0 != 0) goto L14
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = r2.f0()
                if (r2 == 0) goto L12
                goto L14
            L12:
                r2 = 0
                return r2
            L14:
                r2 = 1
                return r2
        }
    }

    private k(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* synthetic */ k(java.lang.String r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.Nullable
    public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.util.f.a.a(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
