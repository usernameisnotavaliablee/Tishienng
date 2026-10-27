package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface t {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.b a;

        @org.jetbrains.annotations.Nullable
        private final byte[] b;

        @org.jetbrains.annotations.Nullable
        private final x3.g c;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.Nullable byte[] r3, @org.jetbrains.annotations.Nullable x3.g r4) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.name.b r2, byte[] r3, x3.g r4, int r5, kotlin.jvm.internal.v r6) {
                r1 = this;
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                r1.<init>(r2, r3, r4)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.t.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.load.java.t$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.t.a) r5
                kotlin.reflect.jvm.internal.impl.name.b r1 = r4.a
                kotlin.reflect.jvm.internal.impl.name.b r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                byte[] r1 = r4.b
                byte[] r3 = r5.b
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                x3.g r1 = r4.c
                x3.g r5 = r5.c
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public int hashCode() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r3.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                byte[] r1 = r3.b
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = java.util.Arrays.hashCode(r1)
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                x3.g r1 = r3.c
                if (r1 != 0) goto L1b
                goto L1f
            L1b:
                int r2 = r1.hashCode()
            L1f:
                int r0 = r0 + r2
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Request(classId="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.name.b r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", previouslyFoundClassFileContent="
                r0.append(r1)
                byte[] r1 = r2.b
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", outerClass="
                r0.append(r1)
                x3.g r1 = r2.c
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @org.jetbrains.annotations.Nullable
    java.util.Set<java.lang.String> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);

    @org.jetbrains.annotations.Nullable
    x3.g b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.t.a r1);

    @org.jetbrains.annotations.Nullable
    x3.u c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, boolean r2);
}
