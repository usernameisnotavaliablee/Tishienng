package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.amap.api.col.p0003l.d4 f3135b;
    private java.util.Map<java.lang.String, com.amap.api.col.3l.d4.a> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f3136b;

        /* renamed from: c, reason: collision with root package name */
        private int f3137c;

        /* renamed from: d, reason: collision with root package name */
        private int f3138d;

        /* renamed from: e, reason: collision with root package name */
        private int f3139e;

        /* renamed from: f, reason: collision with root package name */
        private java.util.HashMap<java.lang.Integer, java.util.List<com.amap.api.maps.model.LatLng>> f3140f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.List<com.amap.api.maps.model.LatLng> f3141g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.d4 f3142h;

        public a(com.amap.api.col.p0003l.d4 r1, int r2, int r3, int r4, java.util.HashMap<java.lang.Integer, java.util.List<com.amap.api.maps.model.LatLng>> r5) {
                r0 = this;
                r0.f3142h = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                r0.f3136b = r1
                r0.f3137c = r1
                r0.f3138d = r1
                r0.f3139e = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3141g = r1
                r0.a = r3
                r0.f3140f = r5
                r0.f3136b = r2
                r0.f3138d = r4
                return
        }

        private void c(android.os.Handler r4, java.util.List<com.amap.api.maps.model.LatLng> r5) {
                r3 = this;
                android.os.Message r0 = r4.obtainMessage()
                r0.obj = r5
                r5 = 100
                r0.what = r5
                int r5 = r3.f3137c
                r0.arg1 = r5
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r1 = "lineID"
                int r2 = r3.f3136b
                r5.putInt(r1, r2)
                r0.setData(r5)
                r4.sendMessage(r0)
                int r4 = r3.f3137c
                int r4 = r4 + 1
                r3.f3137c = r4
                int r4 = r3.f3139e
                int r4 = r4 + 1
                r3.f3139e = r4
                return
        }

        private void d(android.os.Handler r5) {
                r4 = this;
                int r0 = r4.f3139e
                if (r0 <= 0) goto L2f
                java.util.List<com.amap.api.maps.model.LatLng> r0 = r4.f3141g
                int r0 = com.amap.api.col.p0003l.a4.a(r0)
                android.os.Message r1 = r5.obtainMessage()
                java.util.List<com.amap.api.maps.model.LatLng> r2 = r4.f3141g
                r1.obj = r2
                r2 = 101(0x65, float:1.42E-43)
                r1.what = r2
                r1.arg1 = r0
                int r0 = r4.f3138d
                r1.arg2 = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r2 = "lineID"
                int r3 = r4.f3136b
                r0.putInt(r2, r3)
                r1.setData(r0)
                r5.sendMessage(r1)
                return
            L2f:
                int r0 = r4.f3136b
                java.lang.String r1 = "轨迹点太少或距离太近,轨迹纠偏失败"
                com.amap.api.col.p0003l.d4.c(r5, r0, r1)
                return
        }

        public final java.util.HashMap<java.lang.Integer, java.util.List<com.amap.api.maps.model.LatLng>> a() {
                r1 = this;
                java.util.HashMap<java.lang.Integer, java.util.List<com.amap.api.maps.model.LatLng>> r0 = r1.f3140f
                return r0
        }

        public final void b(android.os.Handler r4) {
                r3 = this;
                int r0 = r3.f3137c
            L2:
                int r1 = r3.a
                if (r0 > r1) goto L1f
                java.util.HashMap<java.lang.Integer, java.util.List<com.amap.api.maps.model.LatLng>> r1 = r3.f3140f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r1.get(r2)
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L1f
                java.util.List<com.amap.api.maps.model.LatLng> r2 = r3.f3141g
                r2.addAll(r1)
                r3.c(r4, r1)
                int r0 = r0 + 1
                goto L2
            L1f:
                int r0 = r3.f3137c
                int r1 = r3.a
                int r1 = r1 + 1
                if (r0 != r1) goto L2a
                r3.d(r4)
            L2a:
                return
        }
    }

    static {
            return
    }

    public d4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.a = r0
            return
    }

    public static com.amap.api.col.p0003l.d4 b() {
            com.amap.api.col.3l.d4 r0 = com.amap.api.col.p0003l.d4.f3135b
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.3l.d4> r0 = com.amap.api.col.p0003l.d4.class
            monitor-enter(r0)
            com.amap.api.col.3l.d4 r1 = com.amap.api.col.p0003l.d4.f3135b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.3l.d4 r1 = new com.amap.api.col.3l.d4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.p0003l.d4.f3135b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.3l.d4 r0 = com.amap.api.col.p0003l.d4.f3135b
            return r0
    }

    public static void c(android.os.Handler r2, int r3, java.lang.String r4) {
            android.os.Message r0 = r2.obtainMessage()
            r0.obj = r4
            r4 = 102(0x66, float:1.43E-43)
            r0.what = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "lineID"
            r4.putInt(r1, r3)
            r0.setData(r4)
            r2.sendMessage(r0)
            return
    }

    public final synchronized com.amap.api.col.3l.d4.a a(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.amap.api.col.3l.d4$a> r0 = r1.a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.d4$a r2 = (com.amap.api.col.3l.d4.a) r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            monitor-exit(r1)
            r2 = 0
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public final synchronized void d(java.lang.String r8, int r9, int r10, int r11) {
            r7 = this;
            monitor-enter(r7)
            java.util.Map<java.lang.String, com.amap.api.col.3l.d4$a> r0 = r7.a     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1f
            com.amap.api.col.3l.d4$a r1 = new com.amap.api.col.3l.d4$a     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1c
            r2 = 16
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L19
            r0.put(r8, r1)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r0 = move-exception
        L1a:
            r8 = r0
            goto L22
        L1c:
            r0 = move-exception
            r2 = r7
            goto L1a
        L1f:
            r2 = r7
        L20:
            monitor-exit(r7)
            return
        L22:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L19
            throw r8
    }

    public final synchronized void e(java.lang.String r2, int r3, java.util.List<com.amap.api.maps.model.LatLng> r4) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.amap.api.col.3l.d4$a> r0 = r1.a     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L17
            com.amap.api.col.3l.d4$a r2 = (com.amap.api.col.3l.d4.a) r2     // Catch: java.lang.Throwable -> L17
            java.util.HashMap r2 = r2.a()     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L17
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r1)
            return
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }
}
