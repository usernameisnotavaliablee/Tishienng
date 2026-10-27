package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m1 extends kotlin.collections.l1 {
    public m1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> L0(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <K, V> java.util.Map.Entry<K, V> M0(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.a4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> N0(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.util.Map.Entry O0(java.util.Map r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.s4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }
}
