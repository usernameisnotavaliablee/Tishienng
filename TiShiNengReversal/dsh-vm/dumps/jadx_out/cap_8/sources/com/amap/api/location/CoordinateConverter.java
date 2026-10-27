package com.amap.api.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CoordinateConverter {

    /* renamed from: b, reason: collision with root package name */
    private static int f4954b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f4955c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static int f4956d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static int f4957e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static int f4958f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static int f4959g = 16;

    /* renamed from: h, reason: collision with root package name */
    private static int f4960h = 32;

    /* renamed from: i, reason: collision with root package name */
    private static int f4961i = 64;
    com.amap.api.location.DPoint a;

    /* renamed from: j, reason: collision with root package name */
    private android.content.Context f4962j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.location.CoordinateConverter.CoordType f4963k;
    private com.amap.api.location.DPoint l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.location.CoordinateConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.location.CoordinateConverter$CoordType[] r0 = com.amap.api.location.CoordinateConverter.CoordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amap.api.location.CoordinateConverter.AnonymousClass1.a = r0
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.BAIDU     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.MAPBAR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.MAPABC     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.SOSOMAP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.ALIYUN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.GOOGLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L54
                com.amap.api.location.CoordinateConverter$CoordType r1 = com.amap.api.location.CoordinateConverter.CoordType.GPS     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum CoordType extends java.lang.Enum<com.amap.api.location.CoordinateConverter.CoordType> {
        public static final com.amap.api.location.CoordinateConverter.CoordType ALIYUN = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType BAIDU = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType GOOGLE = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType GPS = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType MAPABC = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType MAPBAR = null;
        public static final com.amap.api.location.CoordinateConverter.CoordType SOSOMAP = null;
        private static final /* synthetic */ com.amap.api.location.CoordinateConverter.CoordType[] a = null;

        static {
                com.amap.api.location.CoordinateConverter$CoordType r0 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r1 = "BAIDU"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.location.CoordinateConverter.CoordType.BAIDU = r0
                com.amap.api.location.CoordinateConverter$CoordType r1 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r3 = "MAPBAR"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.location.CoordinateConverter.CoordType.MAPBAR = r1
                com.amap.api.location.CoordinateConverter$CoordType r3 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r5 = "MAPABC"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.location.CoordinateConverter.CoordType.MAPABC = r3
                com.amap.api.location.CoordinateConverter$CoordType r5 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r7 = "SOSOMAP"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.location.CoordinateConverter.CoordType.SOSOMAP = r5
                com.amap.api.location.CoordinateConverter$CoordType r7 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r9 = "ALIYUN"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.location.CoordinateConverter.CoordType.ALIYUN = r7
                com.amap.api.location.CoordinateConverter$CoordType r9 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r11 = "GOOGLE"
                r12 = 5
                r9.<init>(r11, r12)
                com.amap.api.location.CoordinateConverter.CoordType.GOOGLE = r9
                com.amap.api.location.CoordinateConverter$CoordType r11 = new com.amap.api.location.CoordinateConverter$CoordType
                java.lang.String r13 = "GPS"
                r14 = 6
                r11.<init>(r13, r14)
                com.amap.api.location.CoordinateConverter.CoordType.GPS = r11
                r13 = 7
                com.amap.api.location.CoordinateConverter$CoordType[] r13 = new com.amap.api.location.CoordinateConverter.CoordType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.amap.api.location.CoordinateConverter.CoordType.a = r13
                return
        }

        CoordType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.location.CoordinateConverter.CoordType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.location.CoordinateConverter$CoordType> r0 = com.amap.api.location.CoordinateConverter.CoordType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.location.CoordinateConverter$CoordType r1 = (com.amap.api.location.CoordinateConverter.CoordType) r1
                return r1
        }

        public static com.amap.api.location.CoordinateConverter.CoordType[] values() {
                com.amap.api.location.CoordinateConverter$CoordType[] r0 = com.amap.api.location.CoordinateConverter.CoordType.a
                java.lang.Object r0 = r0.clone()
                com.amap.api.location.CoordinateConverter$CoordType[] r0 = (com.amap.api.location.CoordinateConverter.CoordType[]) r0
                return r0
        }
    }

    static {
            return
    }

    public CoordinateConverter(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4963k = r0
            r1.l = r0
            r1.a = r0
            r1.f4962j = r2
            return
    }

    public static float calculateLineDistance(com.amap.api.location.DPoint r0, com.amap.api.location.DPoint r1) {
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean isAMapDataAvailable(double r0, double r2) {
            boolean r0 = com.autonavi.aps.amapapi.utils.b.a(r0, r2)
            return r0
    }

    public synchronized com.amap.api.location.DPoint convert() throws java.lang.Exception {
            r6 = this;
            monitor-enter(r6)
            com.amap.api.location.CoordinateConverter$CoordType r0 = r6.f4963k     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L128
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L120
            double r0 = r0.getLongitude()     // Catch: java.lang.Throwable -> L63
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L118
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            double r0 = r0.getLongitude()     // Catch: java.lang.Throwable -> L63
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L118
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            double r0 = r0.getLatitude()     // Catch: java.lang.Throwable -> L63
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L110
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            double r0 = r0.getLatitude()     // Catch: java.lang.Throwable -> L63
            r2 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L110
            int[] r0 = com.amap.api.location.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.CoordinateConverter$CoordType r1 = r6.f4963k     // Catch: java.lang.Throwable -> L63
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L63
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L63
            r1 = 1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 1: goto Ldc;
                case 2: goto Lc4;
                case 3: goto Lb0;
                case 4: goto L9c;
                case 5: goto L88;
                case 6: goto L73;
                case 7: goto L55;
                default: goto L53;
            }     // Catch: java.lang.Throwable -> L63
        L53:
            goto Lf2
        L55:
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4961i     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto L66
            java.lang.String r3 = "gps"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r0 = move-exception
            goto L130
        L66:
            r1 = 0
        L67:
            android.content.Context r0 = r6.f4962j     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.DPoint r2 = r6.l     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.DPoint r0 = com.autonavi.aps.amapapi.utils.e.a(r0, r2)     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        L73:
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4960h     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto L81
            java.lang.String r3 = "google"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto L82
        L81:
            r1 = 0
        L82:
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        L88:
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4959g     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto L96
            java.lang.String r3 = "aliyun"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto L97
        L96:
            r1 = 0
        L97:
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        L9c:
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4958f     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto Laa
            java.lang.String r3 = "sosomap"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto Lab
        Laa:
            r1 = 0
        Lab:
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        Lb0:
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4957e     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto Lbe
            java.lang.String r3 = "mapabc"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto Lbf
        Lbe:
            r1 = 0
        Lbf:
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        Lc4:
            android.content.Context r0 = r6.f4962j     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.DPoint r4 = r6.l     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.DPoint r0 = com.autonavi.aps.amapapi.utils.e.b(r0, r4)     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4956d     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto Lf2
            java.lang.String r3 = "mapbar"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        Ldc:
            com.amap.api.location.DPoint r0 = r6.l     // Catch: java.lang.Throwable -> L63
            com.amap.api.location.DPoint r0 = com.autonavi.aps.amapapi.utils.e.a(r0)     // Catch: java.lang.Throwable -> L63
            r6.a = r0     // Catch: java.lang.Throwable -> L63
            int r0 = com.amap.api.location.CoordinateConverter.f4954b     // Catch: java.lang.Throwable -> L63
            int r4 = com.amap.api.location.CoordinateConverter.f4955c     // Catch: java.lang.Throwable -> L63
            r5 = r0 & r4
            if (r5 != 0) goto Lf2
            java.lang.String r3 = "baidu"
            r0 = r0 | r4
            com.amap.api.location.CoordinateConverter.f4954b = r0     // Catch: java.lang.Throwable -> L63
            goto Lf3
        Lf2:
            r1 = 0
        Lf3:
            if (r1 == 0) goto L10c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L105
            java.lang.String r1 = "amap_loc_coordinate"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L63
        L105:
            android.content.Context r1 = r6.f4962j     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "O021"
            com.autonavi.aps.amapapi.utils.h.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L63
        L10c:
            com.amap.api.location.DPoint r0 = r6.a     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)
            return r0
        L110:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "请传入合理纬度"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L118:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "请传入合理经度"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "转换坐标源不能为空"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L128:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "转换坐标类型不能为空"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L130:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r0
    }

    public synchronized com.amap.api.location.CoordinateConverter coord(com.amap.api.location.DPoint r6) throws java.lang.Exception {
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L4d
            double r0 = r6.getLongitude()     // Catch: java.lang.Throwable -> L3b
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L45
            double r0 = r6.getLongitude()     // Catch: java.lang.Throwable -> L3b
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L45
            double r0 = r6.getLatitude()     // Catch: java.lang.Throwable -> L3b
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L3d
            double r0 = r6.getLatitude()     // Catch: java.lang.Throwable -> L3b
            r2 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3d
            r5.l = r6     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r5)
            return r5
        L3b:
            r6 = move-exception
            goto L55
        L3d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "请传入合理纬度"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6     // Catch: java.lang.Throwable -> L3b
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "请传入合理经度"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6     // Catch: java.lang.Throwable -> L3b
        L4d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "传入经纬度对象为空"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6     // Catch: java.lang.Throwable -> L3b
        L55:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    public synchronized com.amap.api.location.CoordinateConverter from(com.amap.api.location.CoordinateConverter.CoordType r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f4963k = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }
}
