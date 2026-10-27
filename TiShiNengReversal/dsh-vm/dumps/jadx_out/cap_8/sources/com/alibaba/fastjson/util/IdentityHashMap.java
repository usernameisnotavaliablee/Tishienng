package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IdentityHashMap<K, V> {
    private final com.alibaba.fastjson.util.IdentityHashMap.Entry<K, V>[] buckets;
    private final int indexMask;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class Entry<K, V> {
        public final int hashCode;
        public final K key;
        public final com.alibaba.fastjson.util.IdentityHashMap.Entry<K, V> next;
        public V value;

        public Entry(K r1, V r2, int r3, com.alibaba.fastjson.util.IdentityHashMap.Entry<K, V> r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                r0.next = r4
                r0.hashCode = r3
                return
        }
    }

    public IdentityHashMap() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public IdentityHashMap(int r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2 + (-1)
            r1.indexMask = r0
            com.alibaba.fastjson.util.IdentityHashMap$Entry[] r2 = new com.alibaba.fastjson.util.IdentityHashMap.Entry[r2]
            r1.buckets = r2
            return
    }

    public java.lang.Class findClass(java.lang.String r8) {
            r7 = this;
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V>[] r0 = r7.buckets
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            if (r3 != 0) goto Lb
            goto L24
        Lb:
            r4 = r3
        Lc:
            if (r4 == 0) goto L24
            K r5 = r3.key
            boolean r6 = r5 instanceof java.lang.Class
            if (r6 == 0) goto L21
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L21
            return r5
        L21:
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V> r4 = r4.next
            goto Lc
        L24:
            int r2 = r2 + 1
            goto L4
        L27:
            r8 = 0
            return r8
    }

    public final V get(K r3) {
            r2 = this;
            int r0 = java.lang.System.identityHashCode(r3)
            int r1 = r2.indexMask
            r0 = r0 & r1
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V>[] r1 = r2.buckets
            r0 = r1[r0]
        Lb:
            if (r0 == 0) goto L17
            K r1 = r0.key
            if (r3 != r1) goto L14
            V r3 = r0.value
            return r3
        L14:
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V> r0 = r0.next
            goto Lb
        L17:
            r3 = 0
            return r3
    }

    public boolean put(K r5, V r6) {
            r4 = this;
            int r0 = java.lang.System.identityHashCode(r5)
            int r1 = r4.indexMask
            r1 = r1 & r0
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V>[] r2 = r4.buckets
            r2 = r2[r1]
        Lb:
            if (r2 == 0) goto L18
            K r3 = r2.key
            if (r5 != r3) goto L15
            r2.value = r6
            r5 = 1
            return r5
        L15:
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V> r2 = r2.next
            goto Lb
        L18:
            com.alibaba.fastjson.util.IdentityHashMap$Entry r2 = new com.alibaba.fastjson.util.IdentityHashMap$Entry
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V>[] r3 = r4.buckets
            r3 = r3[r1]
            r2.<init>(r5, r6, r0, r3)
            com.alibaba.fastjson.util.IdentityHashMap$Entry<K, V>[] r5 = r4.buckets
            r5[r1] = r2
            r5 = 0
            return r5
    }
}
