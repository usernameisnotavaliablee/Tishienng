package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CoordinateConverter {
    private static final java.lang.String TAG = "CoordinateConverter";
    private com.amap.api.maps.CoordinateConverter.CoordType coordType;
    private android.content.Context ctx;
    private com.amap.api.maps.model.LatLng sourceLatLng;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.amap.api.maps.CoordinateConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.maps.CoordinateConverter$CoordType[] r0 = com.amap.api.maps.CoordinateConverter.CoordType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amap.api.maps.CoordinateConverter.AnonymousClass1.a = r0
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.BAIDU     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.MAPBAR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.MAPABC     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.SOSOMAP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.ALIYUN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.GOOGLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L54
                com.amap.api.maps.CoordinateConverter$CoordType r1 = com.amap.api.maps.CoordinateConverter.CoordType.GPS     // Catch: java.lang.NoSuchFieldError -> L54
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
    public enum CoordType extends java.lang.Enum<com.amap.api.maps.CoordinateConverter.CoordType> {
        private static final /* synthetic */ com.amap.api.maps.CoordinateConverter.CoordType[] $VALUES = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType ALIYUN = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType BAIDU = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType GOOGLE = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType GPS = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType MAPABC = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType MAPBAR = null;
        public static final com.amap.api.maps.CoordinateConverter.CoordType SOSOMAP = null;

        static {
                com.amap.api.maps.CoordinateConverter$CoordType r0 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r1 = "BAIDU"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.maps.CoordinateConverter.CoordType.BAIDU = r0
                com.amap.api.maps.CoordinateConverter$CoordType r1 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r3 = "MAPBAR"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.maps.CoordinateConverter.CoordType.MAPBAR = r1
                com.amap.api.maps.CoordinateConverter$CoordType r3 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r5 = "GPS"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.maps.CoordinateConverter.CoordType.GPS = r3
                com.amap.api.maps.CoordinateConverter$CoordType r5 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r7 = "MAPABC"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.maps.CoordinateConverter.CoordType.MAPABC = r5
                com.amap.api.maps.CoordinateConverter$CoordType r7 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r9 = "SOSOMAP"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.maps.CoordinateConverter.CoordType.SOSOMAP = r7
                com.amap.api.maps.CoordinateConverter$CoordType r9 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r11 = "ALIYUN"
                r12 = 5
                r9.<init>(r11, r12)
                com.amap.api.maps.CoordinateConverter.CoordType.ALIYUN = r9
                com.amap.api.maps.CoordinateConverter$CoordType r11 = new com.amap.api.maps.CoordinateConverter$CoordType
                java.lang.String r13 = "GOOGLE"
                r14 = 6
                r11.<init>(r13, r14)
                com.amap.api.maps.CoordinateConverter.CoordType.GOOGLE = r11
                r13 = 7
                com.amap.api.maps.CoordinateConverter$CoordType[] r13 = new com.amap.api.maps.CoordinateConverter.CoordType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.amap.api.maps.CoordinateConverter.CoordType.$VALUES = r13
                return
        }

        CoordType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.maps.CoordinateConverter.CoordType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.CoordinateConverter$CoordType> r0 = com.amap.api.maps.CoordinateConverter.CoordType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.CoordinateConverter$CoordType r1 = (com.amap.api.maps.CoordinateConverter.CoordType) r1
                return r1
        }

        public static com.amap.api.maps.CoordinateConverter.CoordType[] values() {
                com.amap.api.maps.CoordinateConverter$CoordType[] r0 = com.amap.api.maps.CoordinateConverter.CoordType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.CoordinateConverter$CoordType[] r0 = (com.amap.api.maps.CoordinateConverter.CoordType[]) r0
                return r0
        }
    }

    public CoordinateConverter(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.coordType = r0
            r1.sourceLatLng = r0
            r1.ctx = r2
            return
    }

    public static boolean isAMapDataAvailable(double r0, double r2) {
            boolean r0 = com.amap.api.col.p0003l.u2.a(r0, r2)
            return r0
    }

    public com.amap.api.maps.model.LatLng convert() {
            r4 = this;
            com.amap.api.maps.CoordinateConverter$CoordType r0 = r4.coordType
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.amap.api.maps.model.LatLng r2 = r4.sourceLatLng
            if (r2 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r2 = ""
            int[] r3 = com.amap.api.maps.CoordinateConverter.AnonymousClass1.a     // Catch: java.lang.Throwable -> L24
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L24
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L24
            switch(r0) {
                case 1: goto L45;
                case 2: goto L3a;
                case 3: goto L35;
                case 4: goto L30;
                case 5: goto L2b;
                case 6: goto L26;
                case 7: goto L19;
                default: goto L18;
            }     // Catch: java.lang.Throwable -> L24
        L18:
            goto L4d
        L19:
            java.lang.String r2 = "gps"
            android.content.Context r0 = r4.ctx     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.LatLng r1 = com.amap.api.col.p0003l.q.c(r0, r1)     // Catch: java.lang.Throwable -> L24
            goto L4d
        L24:
            r0 = move-exception
            goto L53
        L26:
            java.lang.String r2 = "google"
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            goto L4d
        L2b:
            java.lang.String r2 = "aliyun"
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            goto L4d
        L30:
            java.lang.String r2 = "sosomap"
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            goto L4d
        L35:
            java.lang.String r2 = "mapabc"
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            goto L4d
        L3a:
            android.content.Context r0 = r4.ctx     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.LatLng r1 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.LatLng r1 = com.amap.api.col.p0003l.q.i(r0, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "mapbar"
            goto L4d
        L45:
            com.amap.api.maps.model.LatLng r0 = r4.sourceLatLng     // Catch: java.lang.Throwable -> L24
            com.amap.api.maps.model.LatLng r1 = com.amap.api.col.p0003l.q.d(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "baidu"
        L4d:
            android.content.Context r0 = r4.ctx     // Catch: java.lang.Throwable -> L24
            com.amap.api.col.p0003l.y2.h(r0, r2)     // Catch: java.lang.Throwable -> L24
            return r1
        L53:
            java.lang.String r1 = "CoordinateConverter"
            java.lang.String r2 = "convert"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.sourceLatLng
            return r0
    }

    public com.amap.api.maps.CoordinateConverter coord(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.sourceLatLng = r1
            return r0
    }

    public com.amap.api.maps.CoordinateConverter from(com.amap.api.maps.CoordinateConverter.CoordType r1) {
            r0 = this;
            r0.coordType = r1
            return r0
    }
}
