package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.b0.a d = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.b0 e = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.p b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel c;

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
        public final kotlin.reflect.jvm.internal.impl.load.java.b0 a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.java.b0 r0 = kotlin.reflect.jvm.internal.impl.load.java.b0.a()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.b0$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.b0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.b0.d = r0
            kotlin.reflect.jvm.internal.impl.load.java.b0 r2 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.load.java.b0.e = r2
            return
    }

    public b0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2, @org.jetbrains.annotations.Nullable kotlin.p r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4) {
            r1 = this;
            java.lang.String r0 = "reportLevelBefore"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "reportLevelAfter"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public /* synthetic */ b0(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2, kotlin.p r3, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4, int r5, kotlin.jvm.internal.v r6) {
            r1 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            kotlin.p r3 = new kotlin.p
            r6 = 1
            r0 = 0
            r3.<init>(r6, r0)
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r2
        L10:
            r1.<init>(r2, r3, r4)
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.b0 a() {
            kotlin.reflect.jvm.internal.impl.load.java.b0 r0 = kotlin.reflect.jvm.internal.impl.load.java.b0.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.p d() {
            r1 = this;
            kotlin.p r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.b0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.load.java.b0 r5 = (kotlin.reflect.jvm.internal.impl.load.java.b0) r5
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            kotlin.p r1 = r4.b
            kotlin.p r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.c
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r5 = r5.c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.p r1 = r2.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JavaNullabilityAnnotationsStatus(reportLevelBefore="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", sinceVersion="
            r0.append(r1)
            kotlin.p r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", reportLevelAfter="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
