package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.a h = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c i = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c j = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c k = null;
    private final boolean g;

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
    }

    static {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c$a r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.h = r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            r1 = 2
            r2 = 0
            int[] r1 = new int[]{r1, r1, r2}
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.i = r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r0.m()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.j = r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            int[] r1 = new int[r2]
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.k = r0
            return
    }

    public c(@org.jetbrains.annotations.NotNull int... r2) {
            r1 = this;
            java.lang.String r0 = "numbers"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public c(@org.jetbrains.annotations.NotNull int[] r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "versionArray"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.<init>(r2)
            r1.g = r3
            return
    }

    private final boolean i(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r4) {
            r3 = this;
            int r0 = r3.a()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lf
            int r0 = r3.b()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r0 = r3.a()
            if (r0 != 0) goto L16
            return r1
        L16:
            boolean r4 = r3.l(r4)
            r4 = r4 ^ r2
            return r4
    }

    private final boolean l(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r5) {
            r4 = this;
            int r0 = r4.a()
            int r1 = r5.a()
            r2 = 1
            if (r0 <= r1) goto Lc
            return r2
        Lc:
            int r0 = r4.a()
            int r1 = r5.a()
            r3 = 0
            if (r0 >= r1) goto L18
            return r3
        L18:
            int r0 = r4.b()
            int r5 = r5.b()
            if (r0 <= r5) goto L23
            return r2
        L23:
            return r3
    }

    public final boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2) {
            r1 = this;
            java.lang.String r0 = "metadataVersionFromLanguageVersion"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.g
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = r2.k(r0)
            boolean r2 = r1.i(r2)
            return r2
    }

    public final boolean j() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c k(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.i
            goto L7
        L5:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.j
        L7:
            boolean r0 = r2.l(r1)
            if (r0 == 0) goto Le
            return r2
        Le:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c m() {
            r5 = this;
            int r0 = r5.a()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1b
            int r0 = r5.b()
            r3 = 9
            if (r0 != r3) goto L1b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            r2 = 2
            int[] r1 = new int[]{r2, r1, r1}
            r0.<init>(r1)
            return r0
        L1b:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
            int r3 = r5.a()
            int r4 = r5.b()
            int r4 = r4 + r2
            int[] r1 = new int[]{r3, r4, r1}
            r0.<init>(r1)
            return r0
    }
}
