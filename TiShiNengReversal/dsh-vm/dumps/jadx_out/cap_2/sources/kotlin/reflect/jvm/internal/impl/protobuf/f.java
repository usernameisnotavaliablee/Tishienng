package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f {
    private static volatile boolean b;
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f c = null;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.f.a, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<?, ?>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private final java.lang.Object a;
        private final int b;

        a(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.protobuf.f.a
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                kotlin.reflect.jvm.internal.impl.protobuf.f$a r4 = (kotlin.reflect.jvm.internal.impl.protobuf.f.a) r4
                java.lang.Object r0 = r3.a
                java.lang.Object r2 = r4.a
                if (r0 != r2) goto L16
                int r0 = r3.b
                int r4 = r4.b
                if (r0 != r4) goto L16
                r4 = 1
                return r4
            L16:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.a
                int r0 = java.lang.System.identityHashCode(r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r0 = r0 * r1
                int r1 = r2.b
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = new kotlin.reflect.jvm.internal.impl.protobuf.f
            r1 = 1
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.f.c = r0
            return
    }

    f() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    private f(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.a = r1
            return
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.f c() {
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = kotlin.reflect.jvm.internal.impl.protobuf.f.c
            return r0
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.f d() {
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = new kotlin.reflect.jvm.internal.impl.protobuf.f
            r0.<init>()
            return r0
    }

    public final void a(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<?, ?> r5) {
            r4 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.f$a, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<?, ?>> r0 = r4.a
            kotlin.reflect.jvm.internal.impl.protobuf.f$a r1 = new kotlin.reflect.jvm.internal.impl.protobuf.f$a
            kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r5.b()
            int r3 = r5.d()
            r1.<init>(r2, r3)
            r0.put(r1, r5)
            return
    }

    public <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.n> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<ContainingType, ?> b(ContainingType r3, int r4) {
            r2 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.f$a, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<?, ?>> r0 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.f$a r1 = new kotlin.reflect.jvm.internal.impl.protobuf.f$a
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r3 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f) r3
            return r3
    }
}
