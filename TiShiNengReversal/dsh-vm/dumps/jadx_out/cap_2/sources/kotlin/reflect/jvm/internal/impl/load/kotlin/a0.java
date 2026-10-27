package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.a0.a b = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r3 = 35
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r4 = 0
                r0.<init>(r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d r2) {
                r1 = this;
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b
                if (r0 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r2 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b) r2
                java.lang.String r0 = r2.e()
                java.lang.String r2 = r2.d()
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r1.d(r0, r2)
                return r2
            L18:
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a
                if (r0 == 0) goto L2b
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r2 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a) r2
                java.lang.String r0 = r2.e()
                java.lang.String r2 = r2.d()
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r1.a(r0, r2)
                return r2
            L2b:
                kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                r2.<init>()
                throw r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature r3) {
                r1 = this;
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r3.getName()
                java.lang.String r0 = r2.getString(r0)
                int r3 = r3.getDesc()
                java.lang.String r2 = r2.getString(r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r1.d(r0, r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 d(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r4 = 0
                r0.<init>(r3, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3, int r4) {
                r2 = this;
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r3.a()
                r1.append(r3)
                r3 = 64
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r4 = 0
                r0.<init>(r3, r4)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b = r0
            return
    }

    private a0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* synthetic */ a0(java.lang.String r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r4 = (kotlin.reflect.jvm.internal.impl.load.kotlin.a0) r4
            java.lang.String r1 = r3.a
            java.lang.String r4 = r4.a
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MemberSignature(signature="
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
