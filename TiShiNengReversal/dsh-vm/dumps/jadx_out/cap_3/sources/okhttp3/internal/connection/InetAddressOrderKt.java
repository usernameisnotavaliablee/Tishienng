package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInetAddressOrder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InetAddressOrder.kt\nokhttp3/internal/connection/InetAddressOrderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n3301#2,10:47\n*S KotlinDebug\n*F\n+ 1 InetAddressOrder.kt\nokhttp3/internal/connection/InetAddressOrderKt\n*L\n38#1:47,10\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class InetAddressOrderKt {
    public InetAddressOrderKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.net.InetAddress> reorderForHappyEyeballs(@org.jetbrains.annotations.NotNull java.util.List<? extends java.net.InetAddress> r5) {
            java.lang.String r0 = "addresses"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            r1 = 2
            if (r0 >= r1) goto Ld
            goto L5d
        Ld:
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.net.InetAddress r4 = (java.net.InetAddress) r4
            boolean r4 = r4 instanceof java.net.Inet6Address
            if (r4 == 0) goto L33
            r1.add(r3)
            goto L1e
        L33:
            r2.add(r3)
            goto L1e
        L37:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            java.lang.Object r1 = r0.component1()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.component2()
            java.util.List r0 = (java.util.List) r0
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L55
            goto L5d
        L55:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r5 = okhttp3.internal._UtilCommonKt.interleave(r1, r0)
        L5d:
            return r5
    }
}
