package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class o {
    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] a(@org.jetbrains.annotations.NotNull T[] r1, int r2) {
            java.lang.String r0 = "reference"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"
            kotlin.jvm.internal.g0.n(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.jvm.JvmName(name = "contentDeepHashCode")
    public static final <T> int b(@org.jetbrains.annotations.Nullable T[] r0) {
            int r0 = java.util.Arrays.deepHashCode(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final void c(int r3, int r4) {
            if (r3 > r4) goto L3
            return
        L3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") is greater than size ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ")."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final /* synthetic */ <T> T[] d(T[] r1) {
            if (r1 != 0) goto La
            java.lang.String r1 = "T"
            r0 = 0
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        La:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String e(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    public static final /* synthetic */ <T> T[] f(java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r0 = "T?"
            r1 = 0
            kotlin.jvm.internal.g0.y(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r2.toArray(r0)
            return r2
    }
}
