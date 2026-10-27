package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ReportLevel extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.a Companion = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel IGNORE = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel STRICT = null;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel WARN = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String description;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReportLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1310#2,2:21\n*S KotlinDebug\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n*L\n15#1:21,2\n*E\n"})
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
    }

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] r0 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[r0]
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel
            r1 = 0
            java.lang.String r2 = "ignore"
            java.lang.String r3 = "IGNORE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE = r0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel
            r1 = 1
            java.lang.String r2 = "warn"
            java.lang.String r3 = "WARN"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN = r0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel
            r1 = 2
            java.lang.String r2 = "strict"
            java.lang.String r3 = "STRICT"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT = r0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.$ENTRIES = r0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion = r0
            return
    }

    ReportLevel(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.description = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.ReportLevel valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] values() {
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public final boolean isIgnore() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            if (r1 != r0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isWarning() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN
            if (r1 != r0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
