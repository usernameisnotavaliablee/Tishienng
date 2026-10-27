package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.km.h {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        public a(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.h.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.h$a r4 = (kotlin.reflect.jvm.internal.impl.km.h.a) r4
                java.lang.String r1 = r3.a
                java.lang.String r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Class(name="
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.km.h {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;

        public b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.h.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.h$b r4 = (kotlin.reflect.jvm.internal.impl.km.h.b) r4
                java.lang.String r1 = r3.a
                java.lang.String r4 = r4.a
                boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TypeAlias(name="
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.km.h {
        private final int a;

        public c(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.a = r2
                return
        }

        public final int a() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.km.h.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.km.h$c r4 = (kotlin.reflect.jvm.internal.impl.km.h.c) r4
                int r1 = r3.a
                int r4 = r4.a
                if (r1 == r4) goto L13
                return r2
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TypeParameter(id="
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ h(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }
}
