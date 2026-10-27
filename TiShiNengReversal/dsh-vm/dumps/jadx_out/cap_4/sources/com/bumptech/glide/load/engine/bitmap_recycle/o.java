package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class o<K, V> extends java.util.TreeMap<K, V> {
    o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "( "
            r0.append(r1)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 58
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "}, "
            r0.append(r2)
            goto L12
        L3c:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.String r3 = ""
            r0.replace(r1, r2, r3)
        L51:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
