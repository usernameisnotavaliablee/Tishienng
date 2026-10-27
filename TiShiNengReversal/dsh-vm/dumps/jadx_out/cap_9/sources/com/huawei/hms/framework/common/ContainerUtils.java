package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ContainerUtils {
    public static final java.lang.String FIELD_DELIMITER = "&";
    public static final java.lang.String KEY_VALUE_DELIMITER = "=";

    public ContainerUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> boolean equals(java.util.Map<K, V> r3, java.util.Map<K, V> r4) {
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r3 == 0) goto L36
            if (r4 == 0) goto L36
            int r1 = r3.size()
            int r2 = r4.size()
            if (r1 != r2) goto L36
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r4.get(r2)
            java.lang.Object r1 = r1.getValue()
            if (r2 == r1) goto L1a
            goto L36
        L35:
            return r0
        L36:
            r3 = 0
            return r3
    }

    public static <K, V> int hashCode(java.util.Map<K, V> r0) {
            java.lang.String r0 = toString(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public static <K> java.lang.String toString(java.util.List<K> r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 <= 0) goto L22
            java.lang.String r1 = "&"
            r0.append(r1)
        L22:
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            r1 = r3
            goto Lf
        L2b:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static <K, V> java.lang.String toString(java.util.Map<K, V> r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r3 = r1 + 1
            if (r1 <= 0) goto L28
            java.lang.String r1 = "&"
            r0.append(r1)
        L28:
            java.lang.Object r1 = r2.getKey()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = r3
            goto L13
        L45:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static <K> java.lang.String toString(java.util.Set<K> r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 <= 0) goto L22
            java.lang.String r1 = "&"
            r0.append(r1)
        L22:
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            r1 = r3
            goto Lf
        L2b:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
