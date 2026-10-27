package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;

        public a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.e()
                r0.append(r1)
                r1 = 58
                r0.append(r1)
                java.lang.String r1 = r2.d()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String d() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String e() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r5 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a) r5
                java.lang.String r1 = r4.a
                java.lang.String r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r5 = r5.b
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String b;

        public b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b c(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.a
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.b
            Lc:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r0 = r0.b(r1, r2)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @org.jetbrains.annotations.NotNull
        public java.lang.String a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.e()
                r0.append(r1)
                java.lang.String r1 = r2.d()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "desc"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b
                r0.<init>(r2, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String d() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String e() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r5 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b) r5
                java.lang.String r1 = r4.a
                java.lang.String r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r5 = r5.b
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ d(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String a();

    @org.jetbrains.annotations.NotNull
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
