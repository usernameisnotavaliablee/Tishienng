package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.d0.a d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.g0 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> b;
    private final boolean c;

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

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.ReportLevel a(kotlin.p r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
                kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = c(r0, r1)
                return r0
        }

        private static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel c(kotlin.p r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.a0.c(r2, r1)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.java.d0 b(@org.jetbrains.annotations.NotNull kotlin.p r4) {
                r3 = this;
                java.lang.String r0 = "kotlinVersion"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.d0
                kotlin.reflect.jvm.internal.impl.load.java.g0 r1 = kotlin.reflect.jvm.internal.impl.load.java.a0.a(r4)
                kotlin.reflect.jvm.internal.impl.load.java.c0 r2 = new kotlin.reflect.jvm.internal.impl.load.java.c0
                r2.<init>(r4)
                r0.<init>(r1, r2)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.d0$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.d0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.d0.d = r0
            return
    }

    public d0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.g0 r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.c, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r3) {
            r1 = this;
            java.lang.String r0 = "jsr305"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "getReportLevelForAnnotation"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            boolean r2 = r2.f()
            if (r2 != 0) goto L26
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.a0.d()
            java.lang.Object r2 = r3.invoke(r2)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            if (r2 != r3) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            r1.c = r2
            return
    }

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> b() {
            r1 = this;
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.g0 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.g0 r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JavaTypeEnhancementState(jsr305="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.g0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", getReportLevelForAnnotation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
