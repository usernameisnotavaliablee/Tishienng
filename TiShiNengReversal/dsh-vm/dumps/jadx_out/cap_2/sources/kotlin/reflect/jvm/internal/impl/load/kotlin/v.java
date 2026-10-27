package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface v extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.z {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.v$a$a, reason: collision with other inner class name */
        public static final class C0053a extends kotlin.reflect.jvm.internal.impl.load.kotlin.v.a {

            @org.jetbrains.annotations.NotNull
            private final byte[] a;

            @org.jetbrains.annotations.NotNull
            public final byte[] b() {
                    r1 = this;
                    byte[] r0 = r1.a
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class b extends kotlin.reflect.jvm.internal.impl.load.kotlin.v.a {

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.x a;

            @org.jetbrains.annotations.Nullable
            private final byte[] b;

            public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r2, @org.jetbrains.annotations.Nullable byte[] r3) {
                    r1 = this;
                    java.lang.String r0 = "kotlinJvmBinaryClass"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    r1.<init>(r0)
                    r1.a = r2
                    r1.b = r3
                    return
            }

            public /* synthetic */ b(kotlin.reflect.jvm.internal.impl.load.kotlin.x r1, byte[] r2, int r3, kotlin.jvm.internal.v r4) {
                    r0 = this;
                    r3 = r3 & 2
                    if (r3 == 0) goto L5
                    r2 = 0
                L5:
                    r0.<init>(r1, r2)
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.x b() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r1.a
                    return r0
            }
        }

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

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.x a() {
                r2 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.v.a.b
                r1 = 0
                if (r0 == 0) goto L9
                r0 = r2
                kotlin.reflect.jvm.internal.impl.load.kotlin.v$a$b r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.v.a.b) r0
                goto La
            L9:
                r0 = r1
            La:
                if (r0 == 0) goto L11
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r0.b()
                return r0
            L11:
                return r1
        }
    }

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.load.kotlin.v.a a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2);

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.load.kotlin.v.a b(@org.jetbrains.annotations.NotNull x3.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2);
}
