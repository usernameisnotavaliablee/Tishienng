package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface by {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.amap.api.col.3l.by.a> {
        public static final com.amap.api.col.3l.by.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.amap.api.col.3l.by.a f3025b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.amap.api.col.3l.by.a f3026c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.amap.api.col.3l.by.a f3027d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.amap.api.col.3l.by.a f3028e = null;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.col.3l.by.a[] f3029g = null;

        /* renamed from: f, reason: collision with root package name */
        private int f3030f;

        static {
                com.amap.api.col.3l.by$a r0 = new com.amap.api.col.3l.by$a
                java.lang.String r1 = "amap_exception"
                r2 = 0
                r3 = -1
                r0.<init>(r1, r2, r3)
                com.amap.api.col.3l.by.a.a = r0
                com.amap.api.col.3l.by$a r1 = new com.amap.api.col.3l.by$a
                java.lang.String r4 = "network_exception"
                r5 = 1
                r1.<init>(r4, r5, r3)
                com.amap.api.col.3l.by.a.f3025b = r1
                com.amap.api.col.3l.by$a r3 = new com.amap.api.col.3l.by$a
                java.lang.String r4 = "file_io_exception"
                r6 = 2
                r3.<init>(r4, r6, r2)
                com.amap.api.col.3l.by.a.f3026c = r3
                com.amap.api.col.3l.by$a r4 = new com.amap.api.col.3l.by$a
                java.lang.String r7 = "success_no_exception"
                r8 = 3
                r4.<init>(r7, r8, r5)
                com.amap.api.col.3l.by.a.f3027d = r4
                com.amap.api.col.3l.by$a r7 = new com.amap.api.col.3l.by$a
                java.lang.String r9 = "cancel_no_exception"
                r10 = 4
                r7.<init>(r9, r10, r6)
                com.amap.api.col.3l.by.a.f3028e = r7
                r9 = 5
                com.amap.api.col.3l.by$a[] r9 = new com.amap.api.col.3l.by.a[r9]
                r9[r2] = r0
                r9[r5] = r1
                r9[r6] = r3
                r9[r8] = r4
                r9[r10] = r7
                com.amap.api.col.3l.by.a.f3029g = r9
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f3030f = r3
                return
        }

        public static com.amap.api.col.3l.by.a valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.col.3l.by$a> r0 = com.amap.api.col.3l.by.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.col.3l.by$a r1 = (com.amap.api.col.3l.by.a) r1
                return r1
        }

        public static com.amap.api.col.3l.by.a[] values() {
                com.amap.api.col.3l.by$a[] r0 = com.amap.api.col.3l.by.a.f3029g
                java.lang.Object r0 = r0.clone()
                com.amap.api.col.3l.by$a[] r0 = (com.amap.api.col.3l.by.a[]) r0
                return r0
        }
    }

    void a();

    void a(long r1, long r3);

    void b(com.amap.api.col.3l.by.a r1);

    void m();

    void n();
}
