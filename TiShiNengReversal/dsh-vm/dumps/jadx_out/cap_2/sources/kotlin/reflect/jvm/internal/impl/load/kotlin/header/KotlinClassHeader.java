package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class KotlinClassHeader {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c b;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] c;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] d;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] e;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String f;
    private final int g;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String h;

    @org.jetbrains.annotations.Nullable
    private final byte[] i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,75:1\n8704#2,2:76\n8964#2,4:78\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:76,2\n34#1:78,4\n*E\n"})
    public enum Kind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind CLASS = null;

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.a Companion = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind FILE_FACADE = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind MULTIFILE_CLASS = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind MULTIFILE_CLASS_PART = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind SYNTHETIC_CLASS = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind UNKNOWN = null;

        @org.jetbrains.annotations.NotNull
        private static final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind> entryById = null;
        private final int id;

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
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind a(int r2) {
                    r1 = this;
                    java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.access$getEntryById$cp()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.Object r2 = r0.get(r2)
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind) r2
                    if (r2 != 0) goto L12
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN
                L12:
                    return r2
            }
        }

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] $values() {
                r0 = 6
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[r0]
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
                r2 = 2
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS
                r2 = 3
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS
                r2 = 4
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "CLASS"
                r3 = 1
                r0.<init>(r1, r3, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "FILE_FACADE"
                r3 = 2
                r0.<init>(r1, r3, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "SYNTHETIC_CLASS"
                r3 = 3
                r0.<init>(r1, r3, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "MULTIFILE_CLASS"
                r3 = 4
                r0.<init>(r1, r3, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind
                java.lang.String r1 = "MULTIFILE_CLASS_PART"
                r3 = 5
                r0.<init>(r1, r3, r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = $values()
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.$ENTRIES = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a
                r1 = 0
                r0.<init>(r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.Companion = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = values()
                int r1 = r0.length
                int r1 = kotlin.collections.i1.j(r1)
                r3 = 16
                int r1 = kotlin.ranges.t.u(r1, r3)
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>(r1)
                int r1 = r0.length
            L65:
                if (r2 >= r1) goto L75
                r4 = r0[r2]
                int r5 = r4.id
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3.put(r5, r4)
                int r2 = r2 + 1
                goto L65
            L75:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.entryById = r3
                return
        }

        Kind(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.id = r3
                return
        }

        public static final /* synthetic */ java.util.Map access$getEntryById$cp() {
                java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind> r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.entryById
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind getById(int r1) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.Companion
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r0.a(r1)
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind> r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[] values() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind[]) r0
                return r0
        }
    }

    public KotlinClassHeader(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3, @org.jetbrains.annotations.Nullable java.lang.String[] r4, @org.jetbrains.annotations.Nullable java.lang.String[] r5, @org.jetbrains.annotations.Nullable java.lang.String[] r6, @org.jetbrains.annotations.Nullable java.lang.String r7, int r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable byte[] r10) {
            r1 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            r1.h = r9
            r1.i = r10
            return
    }

    private final boolean h(int r1, int r2) {
            r0 = this;
            r1 = r1 & r2
            if (r1 == 0) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] a() {
            r1 = this;
            java.lang.String[] r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] b() {
            r1 = this;
            java.lang.String[] r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String e() {
            r3 = this;
            java.lang.String r0 = r3.f
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r3.a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
            if (r1 != r2) goto L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> f() {
            r4 = this;
            java.lang.String[] r0 = r4.c
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r4.a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS
            r3 = 0
            if (r1 != r2) goto La
            goto Lb
        La:
            r0 = r3
        Lb:
            if (r0 == 0) goto L11
            java.util.List r3 = kotlin.collections.n.t(r0)
        L11:
            if (r3 != 0) goto L18
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L18:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] g() {
            r1 = this;
            java.lang.String[] r0 = r1.e
            return r0
    }

    public final boolean i() {
            r2 = this;
            int r0 = r2.g
            r1 = 2
            boolean r0 = r2.h(r0, r1)
            return r0
    }

    public final boolean j() {
            r2 = this;
            int r0 = r2.g
            r1 = 16
            boolean r0 = r2.h(r0, r1)
            if (r0 == 0) goto L16
            int r0 = r2.g
            r1 = 32
            boolean r0 = r2.h(r0, r1)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " version="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
