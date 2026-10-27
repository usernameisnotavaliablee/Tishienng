package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public double f5755b;

    /* renamed from: c, reason: collision with root package name */
    public double f5756c;

    /* renamed from: d, reason: collision with root package name */
    public long f5757d;

    /* renamed from: e, reason: collision with root package name */
    public int f5758e;

    /* renamed from: f, reason: collision with root package name */
    public int f5759f;

    /* renamed from: g, reason: collision with root package name */
    public int f5760g;

    /* renamed from: h, reason: collision with root package name */
    public int f5761h;

    public f() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.f5755b = r1
            r3.f5756c = r1
            r1 = 0
            r3.f5757d = r1
            r3.f5758e = r0
            r3.f5759f = r0
            r1 = 63
            r3.f5760g = r1
            r3.f5761h = r0
            return
    }

    public final java.lang.String a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "time"
            long r2 = r4.f5757d     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "lon"
            double r2 = r4.f5756c     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "lat"
            double r2 = r4.f5755b     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "radius"
            int r2 = r4.f5758e     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "locationType"
            int r2 = r4.a     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "reType"
            int r2 = r4.f5760g     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "reSubType"
            int r2 = r4.f5761h     // Catch: java.lang.Throwable -> L37
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L37
            goto L38
        L37:
            r0 = 0
        L38:
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
            return r0
        L3d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void a(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "lat"
            double r1 = r3.f5755b     // Catch: java.lang.Throwable -> L47
            double r0 = r4.optDouble(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5755b = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "lon"
            double r1 = r3.f5756c     // Catch: java.lang.Throwable -> L47
            double r0 = r4.optDouble(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5756c = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "locationType"
            int r1 = r3.a     // Catch: java.lang.Throwable -> L47
            int r0 = r4.optInt(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.a = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "reType"
            int r1 = r3.f5760g     // Catch: java.lang.Throwable -> L47
            int r0 = r4.optInt(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5760g = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "reSubType"
            int r1 = r3.f5761h     // Catch: java.lang.Throwable -> L47
            int r0 = r4.optInt(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5761h = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "radius"
            int r1 = r3.f5758e     // Catch: java.lang.Throwable -> L47
            int r0 = r4.optInt(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5758e = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "time"
            long r1 = r3.f5757d     // Catch: java.lang.Throwable -> L47
            long r0 = r4.optLong(r0, r1)     // Catch: java.lang.Throwable -> L47
            r3.f5757d = r0     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r4 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "transformLocation"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L4d
            java.lang.Class<com.autonavi.aps.amapapi.restruct.f> r2 = com.autonavi.aps.amapapi.restruct.f.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L4d
        L10:
            com.autonavi.aps.amapapi.restruct.f r8 = (com.autonavi.aps.amapapi.restruct.f) r8
            int r2 = r7.a
            int r3 = r8.a
            if (r2 != r3) goto L4d
            double r2 = r8.f5755b
            double r4 = r7.f5755b
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 != 0) goto L4d
            double r2 = r8.f5756c
            double r4 = r7.f5756c
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 != 0) goto L4d
            long r2 = r7.f5757d
            long r4 = r8.f5757d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L4d
            int r2 = r7.f5758e
            int r3 = r8.f5758e
            if (r2 != r3) goto L4d
            int r2 = r7.f5759f
            int r3 = r8.f5759f
            if (r2 != r3) goto L4d
            int r2 = r7.f5760g
            int r3 = r8.f5760g
            if (r2 != r3) goto L4d
            int r2 = r7.f5761h
            int r8 = r8.f5761h
            if (r2 != r8) goto L4d
            return r0
        L4d:
            return r1
    }

    public final int hashCode() {
            r10 = this;
            int r0 = r10.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            double r1 = r10.f5755b
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            double r2 = r10.f5756c
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            long r3 = r10.f5757d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r10.f5758e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r10.f5759f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r10.f5760g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r10.f5761h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 8
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r7
            int r0 = java.util.Objects.hash(r8)
            return r0
    }
}
