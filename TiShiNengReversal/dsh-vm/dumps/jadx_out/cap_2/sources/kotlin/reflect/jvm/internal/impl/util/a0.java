package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a0 implements kotlin.reflect.jvm.internal.impl.util.f {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.a0 {
        private final int b;

        public a(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.b = r3
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r2 = r2.g()
                int r2 = r2.size()
                int r0 = r1.b
                if (r2 < r0) goto L13
                r2 = 1
                return r2
            L13:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.util.a0 {
        private final int b;

        public b(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have exactly "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameters"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.b = r3
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r2 = r2.g()
                int r2 = r2.size()
                int r0 = r1.b
                if (r2 != r0) goto L13
                r2 = 1
                return r2
            L13:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.util.a0 {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.a0.c b = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.a0$c r0 = new kotlin.reflect.jvm.internal.impl.util.a0$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.a0.c.b = r0
                return
        }

        private c() {
                r2 = this;
                java.lang.String r0 = "must have no value parameters"
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r2 = r2.g()
                boolean r2 = r2.isEmpty()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.impl.util.a0 {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.a0.d b = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.a0$d r0 = new kotlin.reflect.jvm.internal.impl.util.a0$d
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.a0.d.b = r0
                return
        }

        private d() {
                r2 = this;
                java.lang.String r0 = "must have a single value parameter"
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
                r1 = this;
                java.lang.String r0 = "functionDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List r2 = r2.g()
                int r2 = r2.size()
                r0 = 1
                if (r2 != r0) goto L11
                return r0
            L11:
                r2 = 0
                return r2
        }
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
