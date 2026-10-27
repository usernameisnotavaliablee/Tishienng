package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.ExperimentalStdlibApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class z implements java.lang.reflect.WildcardType, kotlin.reflect.v {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.z.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.z d = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type a;

    @org.jetbrains.annotations.Nullable
    private final java.lang.reflect.Type b;

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
        public final kotlin.reflect.z a() {
                r1 = this;
                kotlin.reflect.z r0 = kotlin.reflect.z.a()
                return r0
        }
    }

    static {
            kotlin.reflect.z$a r0 = new kotlin.reflect.z$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.z.c = r0
            kotlin.reflect.z r0 = new kotlin.reflect.z
            r0.<init>(r1, r1)
            kotlin.reflect.z.d = r0
            return
    }

    public z(@org.jetbrains.annotations.Nullable java.lang.reflect.Type r1, @org.jetbrains.annotations.Nullable java.lang.reflect.Type r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static final /* synthetic */ kotlin.reflect.z a() {
            kotlin.reflect.z r0 = kotlin.reflect.z.d
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getLowerBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // java.lang.reflect.WildcardType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getLowerBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L8
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            return r0
        L8:
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r2[r1] = r0
            return r2
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @org.jetbrains.annotations.NotNull
    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.b
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "? super "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.b
            java.lang.String r1 = kotlin.reflect.y.b(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1c:
            java.lang.reflect.Type r0 = r2.a
            if (r0 == 0) goto L40
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "? extends "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.a
            java.lang.String r1 = kotlin.reflect.y.b(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L40:
            java.lang.String r0 = "?"
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Type[] getUpperBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.a
            if (r0 != 0) goto L6
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L6:
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.reflect.Type[] r1 = r2.getLowerBounds()
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
