package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class d<T, V> extends com.amap.api.col.s.b4<T, V> {
    public d(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    protected static java.lang.String U(com.amap.api.services.poisearch.PoiSearchV2.ShowFields r3) {
            r0 = 0
            if (r3 == 0) goto L6a
            int r1 = r3.getValue()
            if (r1 != 0) goto La
            goto L6a
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.getValue()
            r2 = r2 & 1
            if (r2 == 0) goto L1c
            java.lang.String r2 = "children,"
            r1.append(r2)
        L1c:
            int r2 = r3.getValue()
            r2 = r2 & 2
            if (r2 == 0) goto L29
            java.lang.String r2 = "business,"
            r1.append(r2)
        L29:
            int r2 = r3.getValue()
            r2 = r2 & 4
            if (r2 == 0) goto L36
            java.lang.String r2 = "indoor,"
            r1.append(r2)
        L36:
            int r2 = r3.getValue()
            r2 = r2 & 8
            if (r2 == 0) goto L43
            java.lang.String r2 = "navi,"
            r1.append(r2)
        L43:
            int r3 = r3.getValue()
            r3 = r3 & 16
            if (r3 == 0) goto L50
            java.lang.String r3 = "photos,"
            r1.append(r3)
        L50:
            int r3 = r1.length()
            if (r3 <= 0) goto L6a
            int r3 = r1.length()
            int r3 = r3 + (-1)
            int r0 = r1.length()
            java.lang.String r2 = ""
            r1.replace(r3, r0, r2)
            java.lang.String r3 = r1.toString()
            return r3
        L6a:
            return r0
    }

    protected static boolean V(java.lang.String r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "[]"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }
}
