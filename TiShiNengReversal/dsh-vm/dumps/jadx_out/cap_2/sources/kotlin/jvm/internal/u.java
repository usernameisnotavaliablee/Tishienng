package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "CollectionToArray")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object[] a = null;
    private static final int b = 2147483645;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.jvm.internal.u.a = r0
            return
    }

    @kotlin.jvm.JvmName(name = "toArray")
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.9")
    public static final java.lang.Object[] a(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto Le
            java.lang.Object[] r4 = kotlin.jvm.internal.u.a
            return r4
        Le:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L1b
            java.lang.Object[] r4 = kotlin.jvm.internal.u.a
            return r4
        L1b:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1e:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            java.lang.String r3 = "copyOf(...)"
            if (r2 < r1) goto L4f
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L32
            return r0
        L32:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L46
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L40
            goto L46
        L40:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L46:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            kotlin.jvm.internal.g0.o(r0, r3)
        L4d:
            r1 = r2
            goto L1e
        L4f:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L4d
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            kotlin.jvm.internal.g0.o(r4, r3)
            return r4
    }

    @kotlin.jvm.JvmName(name = "toArray")
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.9")
    public static final java.lang.Object[] b(@org.jetbrains.annotations.NotNull java.util.Collection<?> r5, @org.jetbrains.annotations.Nullable java.lang.Object[] r6) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r5, r0)
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L16
            int r5 = r6.length
            if (r5 <= 0) goto L25
            r6[r2] = r1
            return r6
        L16:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L26
            int r5 = r6.length
            if (r5 <= 0) goto L25
            r6[r2] = r1
        L25:
            return r6
        L26:
            int r3 = r6.length
            if (r0 > r3) goto L2b
            r0 = r6
            goto L3e
        L2b:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3e:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            java.lang.String r4 = "copyOf(...)"
            if (r3 < r2) goto L6f
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L52
            return r0
        L52:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L66
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L60
            goto L66
        L60:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L66:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            kotlin.jvm.internal.g0.o(r0, r4)
        L6d:
            r2 = r3
            goto L3e
        L6f:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L6d
            if (r0 != r6) goto L7a
            r6[r3] = r1
            return r6
        L7a:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            kotlin.jvm.internal.g0.o(r5, r4)
            return r5
    }

    private static final java.lang.Object[] c(java.util.Collection<?> r2, kotlin.jvm.functions.Function0<java.lang.Object[]> r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Object[]> r4, kotlin.jvm.functions.Function2<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
            int r0 = r2.size()
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        Ld:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1e
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L1e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L29:
            int r0 = r4 + 1
            java.lang.Object r1 = r2.next()
            r3[r4] = r1
            int r4 = r3.length
            if (r0 < r4) goto L5a
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L3b
            return r3
        L3b:
            int r4 = r0 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            if (r4 > r0) goto L4f
            r4 = 2147483645(0x7ffffffd, float:NaN)
            if (r0 >= r4) goto L49
            goto L4f
        L49:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
        L4f:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
        L58:
            r4 = r0
            goto L29
        L5a:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L58
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r3, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
    }
}
