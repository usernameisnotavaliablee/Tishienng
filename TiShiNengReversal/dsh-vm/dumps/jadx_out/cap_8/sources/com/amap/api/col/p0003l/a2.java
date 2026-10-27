package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a2 {
    int a;

    /* renamed from: b, reason: collision with root package name */
    int[] f2949b;

    /* renamed from: c, reason: collision with root package name */
    int f2950c;

    /* renamed from: d, reason: collision with root package name */
    int f2951d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.String f2952e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f2953f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f2954g;

    public a2(int r1, int[] r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f2949b = r2
            r0.f2952e = r3
            r0.f2953f = r4
            r0.f2954g = r5
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L14
            r3 = r4
        L14:
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            r0.f2950c = r4
            java.lang.String r4 = "regions"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L25
            r3 = 1001(0x3e9, float:1.403E-42)
            r0.f2950c = r3
            goto L65
        L25:
            java.lang.String r4 = "water"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L32
            r3 = 1002(0x3ea, float:1.404E-42)
            r0.f2950c = r3
            goto L65
        L32:
            java.lang.String r4 = "buildings"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L3f
            r3 = 1003(0x3eb, float:1.406E-42)
            r0.f2950c = r3
            goto L65
        L3f:
            java.lang.String r4 = "roads"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L4c
            r3 = 1004(0x3ec, float:1.407E-42)
            r0.f2950c = r3
            goto L65
        L4c:
            java.lang.String r4 = "labels"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L59
            r3 = 1005(0x3ed, float:1.408E-42)
            r0.f2950c = r3
            goto L65
        L59:
            java.lang.String r4 = "borders"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L65
            r3 = 1006(0x3ee, float:1.41E-42)
            r0.f2950c = r3
        L65:
            int r1 = r1 * 1000
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            r0.f2951d = r1
            return
    }
}
