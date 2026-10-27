package com.amap.api.services.poisearch;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PoiSearchV2 {
    public static final java.lang.String CHINESE = "zh-CN";
    public static final java.lang.String ENGLISH = "en";
    private com.amap.api.services.interfaces.IPoiSearchV2 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPoiSearchListener {
        void onPoiItemSearched(com.amap.api.services.core.PoiItemV2 r1, int r2);

        void onPoiSearched(com.amap.api.services.poisearch.PoiResultV2 r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum PremiumType extends java.lang.Enum<com.amap.api.services.poisearch.PoiSearchV2.PremiumType> {
        public static final com.amap.api.services.poisearch.PoiSearchV2.PremiumType DEFAULT = null;
        public static final com.amap.api.services.poisearch.PoiSearchV2.PremiumType ENTIRETY = null;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ com.amap.api.services.poisearch.PoiSearchV2.PremiumType[] f5295b = null;
        private final java.lang.String a;

        static {
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r0 = new com.amap.api.services.poisearch.PoiSearchV2$PremiumType
                java.lang.String r1 = ""
                java.lang.String r2 = "DEFAULT"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.amap.api.services.poisearch.PoiSearchV2.PremiumType.DEFAULT = r0
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r1 = new com.amap.api.services.poisearch.PoiSearchV2$PremiumType
                java.lang.String r2 = "entirety_poi"
                java.lang.String r4 = "ENTIRETY"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.amap.api.services.poisearch.PoiSearchV2.PremiumType.ENTIRETY = r1
                r2 = 2
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType[] r2 = new com.amap.api.services.poisearch.PoiSearchV2.PremiumType[r2]
                r2[r3] = r0
                r2[r5] = r1
                com.amap.api.services.poisearch.PoiSearchV2.PremiumType.f5295b = r2
                return
        }

        PremiumType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        static com.amap.api.services.poisearch.PoiSearchV2.PremiumType a(java.lang.String r3) {
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r0 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.DEFAULT
                java.lang.String r1 = r0.a()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto Ld
                goto L1a
            Ld:
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r1 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.ENTIRETY
                java.lang.String r2 = r1.a()
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L1a
                return r1
            L1a:
                return r0
        }

        public static com.amap.api.services.poisearch.PoiSearchV2.PremiumType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.services.poisearch.PoiSearchV2$PremiumType> r0 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r1 = (com.amap.api.services.poisearch.PoiSearchV2.PremiumType) r1
                return r1
        }

        public static com.amap.api.services.poisearch.PoiSearchV2.PremiumType[] values() {
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType[] r0 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.f5295b
                java.lang.Object r0 = r0.clone()
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType[] r0 = (com.amap.api.services.poisearch.PoiSearchV2.PremiumType[]) r0
                return r0
        }

        final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Query implements java.lang.Cloneable {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5296b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f5297c;

        /* renamed from: d, reason: collision with root package name */
        private int f5298d;

        /* renamed from: e, reason: collision with root package name */
        private int f5299e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f5300f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5301g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f5302h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5303i;

        /* renamed from: j, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5304j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5305k;
        private java.lang.String l;
        private java.lang.String m;
        private com.amap.api.services.poisearch.PoiSearchV2.ShowFields n;

        public Query(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public Query(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f5298d = r0
                r1 = 20
                r2.f5299e = r1
                java.lang.String r1 = "zh-CN"
                r2.f5300f = r1
                r1 = 0
                r2.f5301g = r1
                r2.f5303i = r0
                r2.f5305k = r0
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r0 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.DEFAULT
                java.lang.String r0 = r0.a()
                r2.m = r0
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r0 = new com.amap.api.services.poisearch.PoiSearchV2$ShowFields
                r0.<init>()
                r2.n = r0
                r2.a = r3
                r2.f5296b = r4
                r2.f5297c = r5
                return
        }

        private static java.lang.String a() {
                java.lang.String r0 = ""
                return r0
        }

        public com.amap.api.services.poisearch.PoiSearchV2.Query clone() {
                r4 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "PoiSearch"
                java.lang.String r2 = "queryclone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.poisearch.PoiSearchV2$Query r0 = new com.amap.api.services.poisearch.PoiSearchV2$Query
                java.lang.String r1 = r4.a
                java.lang.String r2 = r4.f5296b
                java.lang.String r3 = r4.f5297c
                r0.<init>(r1, r2, r3)
                int r1 = r4.f5298d
                r0.setPageNum(r1)
                int r1 = r4.f5299e
                r0.setPageSize(r1)
                java.lang.String r1 = r4.f5300f
                r0.setQueryLanguage(r1)
                boolean r1 = r4.f5301g
                r0.setCityLimit(r1)
                java.lang.String r1 = r4.f5302h
                r0.setBuilding(r1)
                com.amap.api.services.core.LatLonPoint r1 = r4.f5304j
                r0.setLocation(r1)
                boolean r1 = r4.f5303i
                r0.setDistanceSort(r1)
                boolean r1 = r4.f5305k
                r0.setSpecial(r1)
                java.lang.String r1 = r4.l
                r0.setChannel(r1)
                java.lang.String r1 = r4.m
                com.amap.api.services.poisearch.PoiSearchV2$PremiumType r1 = com.amap.api.services.poisearch.PoiSearchV2.PremiumType.a(r1)
                r0.setPremium(r1)
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r1 = new com.amap.api.services.poisearch.PoiSearchV2$ShowFields
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r2 = r4.n
                int r2 = r2.value
                r1.<init>(r2)
                r0.setShowFields(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m26clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r1.clone()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                com.amap.api.services.poisearch.PoiSearchV2$Query r5 = (com.amap.api.services.poisearch.PoiSearchV2.Query) r5
                java.lang.String r2 = r4.f5296b
                if (r2 != 0) goto L1e
                java.lang.String r2 = r5.f5296b
                if (r2 == 0) goto L27
                return r1
            L1e:
                java.lang.String r3 = r5.f5296b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.String r2 = r4.f5297c
                if (r2 != 0) goto L30
                java.lang.String r2 = r5.f5297c
                if (r2 == 0) goto L39
                return r1
            L30:
                java.lang.String r3 = r5.f5297c
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                java.lang.String r2 = r4.f5300f
                if (r2 != 0) goto L42
                java.lang.String r2 = r5.f5300f
                if (r2 == 0) goto L4b
                return r1
            L42:
                java.lang.String r3 = r5.f5300f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4b
                return r1
            L4b:
                int r2 = r4.f5298d
                int r3 = r5.f5298d
                if (r2 == r3) goto L52
                return r1
            L52:
                int r2 = r4.f5299e
                int r3 = r5.f5299e
                if (r2 == r3) goto L59
                return r1
            L59:
                java.lang.String r2 = r4.a
                if (r2 != 0) goto L62
                java.lang.String r2 = r5.a
                if (r2 == 0) goto L6b
                return r1
            L62:
                java.lang.String r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6b
                return r1
            L6b:
                java.lang.String r2 = r4.l
                if (r2 != 0) goto L74
                java.lang.String r2 = r5.l
                if (r2 == 0) goto L7d
                return r1
            L74:
                java.lang.String r3 = r5.l
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L7d
                return r1
            L7d:
                java.lang.String r2 = r4.m
                if (r2 != 0) goto L86
                java.lang.String r2 = r5.m
                if (r2 == 0) goto L8f
                return r1
            L86:
                java.lang.String r3 = r5.m
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L8f
                return r1
            L8f:
                java.lang.String r2 = r4.f5302h
                if (r2 != 0) goto L98
                java.lang.String r2 = r5.f5302h
                if (r2 == 0) goto La1
                return r1
            L98:
                java.lang.String r3 = r5.f5302h
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto La1
                return r1
            La1:
                boolean r2 = r4.f5301g
                boolean r3 = r5.f5301g
                if (r2 == r3) goto La8
                return r1
            La8:
                boolean r2 = r4.f5305k
                boolean r5 = r5.f5305k
                if (r2 == r5) goto Laf
                return r1
            Laf:
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r5 = r4.n
                int r5 = r5.value
                return r0
        }

        public java.lang.String getBuilding() {
                r1 = this;
                java.lang.String r0 = r1.f5302h
                return r0
        }

        public java.lang.String getCategory() {
                r2 = this;
                java.lang.String r0 = r2.f5296b
                if (r0 == 0) goto L1a
                java.lang.String r1 = "00"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1a
                java.lang.String r0 = r2.f5296b
                java.lang.String r1 = "00|"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L17
                goto L1a
            L17:
                java.lang.String r0 = r2.f5296b
                return r0
            L1a:
                java.lang.String r0 = a()
                return r0
        }

        public java.lang.String getChannel() {
                r1 = this;
                java.lang.String r0 = r1.l
                return r0
        }

        public java.lang.String getCity() {
                r1 = this;
                java.lang.String r0 = r1.f5297c
                return r0
        }

        public boolean getCityLimit() {
                r1 = this;
                boolean r0 = r1.f5301g
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLocation() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5304j
                return r0
        }

        public int getPageNum() {
                r1 = this;
                int r0 = r1.f5298d
                return r0
        }

        public int getPageSize() {
                r1 = this;
                int r0 = r1.f5299e
                return r0
        }

        public java.lang.String getPremium() {
                r1 = this;
                java.lang.String r0 = r1.m
                return r0
        }

        protected java.lang.String getQueryLanguage() {
                r1 = this;
                java.lang.String r0 = r1.f5300f
                return r0
        }

        public java.lang.String getQueryString() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public com.amap.api.services.poisearch.PoiSearchV2.ShowFields getShowFields() {
                r1 = this;
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r0 = r1.n
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f5296b
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                java.lang.String r2 = r3.l
                if (r2 != 0) goto L15
                r2 = 0
                goto L19
            L15:
                int r2 = r2.hashCode()
            L19:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.m
                if (r2 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                int r2 = r2.hashCode()
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5297c
                if (r2 != 0) goto L2f
                r2 = 0
                goto L33
            L2f:
                int r2 = r2.hashCode()
            L33:
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r2 = r3.f5301g
                if (r2 == 0) goto L3d
                r2 = 1231(0x4cf, float:1.725E-42)
                goto L3f
            L3d:
                r2 = 1237(0x4d5, float:1.733E-42)
            L3f:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5300f
                if (r2 != 0) goto L48
                r2 = 0
                goto L4c
            L48:
                int r2 = r2.hashCode()
            L4c:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5298d
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5299e
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.a
                if (r2 != 0) goto L5f
                r2 = 0
                goto L63
            L5f:
                int r2 = r2.hashCode()
            L63:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5302h
                if (r2 != 0) goto L6b
                goto L6f
            L6b:
                int r1 = r2.hashCode()
            L6f:
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r1 = r3.n
                int r1 = r1.value
                int r1 = r1 % 1024
                int r0 = r0 + r1
                return r0
        }

        public boolean isDistanceSort() {
                r1 = this;
                boolean r0 = r1.f5303i
                return r0
        }

        public boolean isSpecial() {
                r1 = this;
                boolean r0 = r1.f5305k
                return r0
        }

        public boolean queryEquals(com.amap.api.services.poisearch.PoiSearchV2.Query r5) {
                r4 = this;
                r0 = 0
                if (r5 != 0) goto L4
                return r0
            L4:
                r1 = 1
                if (r5 != r4) goto L8
                return r1
            L8:
                java.lang.String r2 = r5.a
                java.lang.String r3 = r4.a
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.f5296b
                java.lang.String r3 = r4.f5296b
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.f5300f
                java.lang.String r3 = r4.f5300f
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.f5297c
                java.lang.String r3 = r4.f5297c
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.f5302h
                java.lang.String r3 = r4.f5302h
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.l
                java.lang.String r3 = r4.l
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                java.lang.String r2 = r5.m
                java.lang.String r3 = r4.m
                boolean r2 = com.amap.api.services.poisearch.PoiSearchV2.a(r2, r3)
                if (r2 == 0) goto L71
                boolean r2 = r5.f5301g
                boolean r3 = r4.f5301g
                if (r2 != r3) goto L71
                int r2 = r5.f5299e
                int r3 = r4.f5299e
                if (r2 != r3) goto L71
                boolean r2 = r5.f5303i
                boolean r3 = r4.f5303i
                if (r2 != r3) goto L71
                boolean r2 = r5.f5305k
                boolean r3 = r4.f5305k
                if (r2 != r3) goto L71
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r5 = r5.n
                int r5 = r5.value
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r2 = r4.n
                int r2 = r2.value
                if (r5 != r2) goto L71
                return r1
            L71:
                return r0
        }

        public void setBuilding(java.lang.String r1) {
                r0 = this;
                r0.f5302h = r1
                return
        }

        public void setChannel(java.lang.String r1) {
                r0 = this;
                r0.l = r1
                return
        }

        public void setCityLimit(boolean r1) {
                r0 = this;
                r0.f5301g = r1
                return
        }

        public void setDistanceSort(boolean r1) {
                r0 = this;
                r0.f5303i = r1
                return
        }

        public void setLocation(com.amap.api.services.core.LatLonPoint r1) {
                r0 = this;
                r0.f5304j = r1
                return
        }

        public void setPageNum(int r1) {
                r0 = this;
                if (r1 > 0) goto L3
                r1 = 1
            L3:
                r0.f5298d = r1
                return
        }

        public void setPageSize(int r2) {
                r1 = this;
                if (r2 > 0) goto L7
                r2 = 20
                r1.f5299e = r2
                return
            L7:
                r0 = 30
                if (r2 <= r0) goto Le
                r1.f5299e = r0
                return
            Le:
                r1.f5299e = r2
                return
        }

        public void setPremium(com.amap.api.services.poisearch.PoiSearchV2.PremiumType r1) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                java.lang.String r1 = r1.a()
                r0.m = r1
                return
        }

        public void setQueryLanguage(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "en"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lb
                r1.f5300f = r0
                return
            Lb:
                java.lang.String r2 = "zh-CN"
                r1.f5300f = r2
                return
        }

        public void setShowFields(com.amap.api.services.poisearch.PoiSearchV2.ShowFields r1) {
                r0 = this;
                if (r1 != 0) goto La
                com.amap.api.services.poisearch.PoiSearchV2$ShowFields r1 = new com.amap.api.services.poisearch.PoiSearchV2$ShowFields
                r1.<init>()
                r0.n = r1
                return
            La:
                r0.n = r1
                return
        }

        public void setSpecial(boolean r1) {
                r0 = this;
                r0.f5305k = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SearchBound implements java.lang.Cloneable {
        public static final java.lang.String BOUND_SHAPE = "Bound";
        public static final java.lang.String ELLIPSE_SHAPE = "Ellipse";
        public static final java.lang.String POLYGON_SHAPE = "Polygon";
        public static final java.lang.String RECTANGLE_SHAPE = "Rectangle";
        private com.amap.api.services.core.LatLonPoint a;

        /* renamed from: b, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5306b;

        /* renamed from: c, reason: collision with root package name */
        private int f5307c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.services.core.LatLonPoint f5308d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f5309e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5310f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.List<com.amap.api.services.core.LatLonPoint> f5311g;

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f5310f = r0
                java.lang.String r0 = "Bound"
                r1.f5309e = r0
                r1.f5307c = r3
                r1.f5308d = r2
                return
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Bound"
                r1.f5309e = r0
                r1.f5307c = r3
                r1.f5308d = r2
                r1.f5310f = r4
                return
        }

        public SearchBound(com.amap.api.services.core.LatLonPoint r2, com.amap.api.services.core.LatLonPoint r3) {
                r1 = this;
                r1.<init>()
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.f5307c = r0
                r0 = 1
                r1.f5310f = r0
                java.lang.String r0 = "Rectangle"
                r1.f5309e = r0
                r1.a(r2, r3)
                return
        }

        private SearchBound(com.amap.api.services.core.LatLonPoint r1, com.amap.api.services.core.LatLonPoint r2, int r3, com.amap.api.services.core.LatLonPoint r4, java.lang.String r5, java.util.List<com.amap.api.services.core.LatLonPoint> r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f5306b = r2
                r0.f5307c = r3
                r0.f5308d = r4
                r0.f5309e = r5
                r0.f5311g = r6
                r0.f5310f = r7
                return
        }

        public SearchBound(java.util.List<com.amap.api.services.core.LatLonPoint> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.f5307c = r0
                r0 = 1
                r1.f5310f = r0
                java.lang.String r0 = "Polygon"
                r1.f5309e = r0
                r1.f5311g = r2
                return
        }

        private void a(com.amap.api.services.core.LatLonPoint r9, com.amap.api.services.core.LatLonPoint r10) {
                r8 = this;
                r8.a = r9
                r8.f5306b = r10
                double r9 = r9.getLatitude()
                com.amap.api.services.core.LatLonPoint r0 = r8.f5306b
                double r0 = r0.getLatitude()
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 >= 0) goto L22
                com.amap.api.services.core.LatLonPoint r9 = r8.a
                double r9 = r9.getLongitude()
                com.amap.api.services.core.LatLonPoint r0 = r8.f5306b
                double r0 = r0.getLongitude()
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L29
            L22:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r10 = "invalid rect "
                r9.<init>(r10)
            L29:
                com.amap.api.services.core.LatLonPoint r9 = new com.amap.api.services.core.LatLonPoint
                com.amap.api.services.core.LatLonPoint r10 = r8.a
                double r0 = r10.getLatitude()
                com.amap.api.services.core.LatLonPoint r10 = r8.f5306b
                double r2 = r10.getLatitude()
                double r0 = r0 + r2
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 / r2
                com.amap.api.services.core.LatLonPoint r10 = r8.a
                double r4 = r10.getLongitude()
                com.amap.api.services.core.LatLonPoint r10 = r8.f5306b
                double r6 = r10.getLongitude()
                double r4 = r4 + r6
                double r4 = r4 / r2
                r9.<init>(r0, r4)
                r8.f5308d = r9
                return
        }

        public com.amap.api.services.poisearch.PoiSearchV2.SearchBound clone() {
                r11 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto Lc
            L4:
                r0 = move-exception
                java.lang.String r1 = "PoiSearch"
                java.lang.String r2 = "SearchBoundClone"
                com.amap.api.col.s.j4.i(r0, r1, r2)
            Lc:
                com.amap.api.services.poisearch.PoiSearchV2$SearchBound r3 = new com.amap.api.services.poisearch.PoiSearchV2$SearchBound
                com.amap.api.services.core.LatLonPoint r4 = r11.a
                com.amap.api.services.core.LatLonPoint r5 = r11.f5306b
                int r6 = r11.f5307c
                com.amap.api.services.core.LatLonPoint r7 = r11.f5308d
                java.lang.String r8 = r11.f5309e
                java.util.List<com.amap.api.services.core.LatLonPoint> r9 = r11.f5311g
                boolean r10 = r11.f5310f
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r3
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m27clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r1.clone()
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                com.amap.api.services.poisearch.PoiSearchV2$SearchBound r5 = (com.amap.api.services.poisearch.PoiSearchV2.SearchBound) r5
                com.amap.api.services.core.LatLonPoint r2 = r4.f5308d
                if (r2 != 0) goto L1e
                com.amap.api.services.core.LatLonPoint r2 = r5.f5308d
                if (r2 == 0) goto L27
                return r1
            L1e:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5308d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                boolean r2 = r4.f5310f
                boolean r3 = r5.f5310f
                if (r2 == r3) goto L2e
                return r1
            L2e:
                com.amap.api.services.core.LatLonPoint r2 = r4.a
                if (r2 != 0) goto L37
                com.amap.api.services.core.LatLonPoint r2 = r5.a
                if (r2 == 0) goto L40
                return r1
            L37:
                com.amap.api.services.core.LatLonPoint r3 = r5.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L40
                return r1
            L40:
                com.amap.api.services.core.LatLonPoint r2 = r4.f5306b
                if (r2 != 0) goto L49
                com.amap.api.services.core.LatLonPoint r2 = r5.f5306b
                if (r2 == 0) goto L52
                return r1
            L49:
                com.amap.api.services.core.LatLonPoint r3 = r5.f5306b
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L52
                return r1
            L52:
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r4.f5311g
                if (r2 != 0) goto L5b
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r5.f5311g
                if (r2 == 0) goto L64
                return r1
            L5b:
                java.util.List<com.amap.api.services.core.LatLonPoint> r3 = r5.f5311g
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L64
                return r1
            L64:
                int r2 = r4.f5307c
                int r3 = r5.f5307c
                if (r2 == r3) goto L6b
                return r1
            L6b:
                java.lang.String r2 = r4.f5309e
                if (r2 != 0) goto L74
                java.lang.String r5 = r5.f5309e
                if (r5 == 0) goto L7d
                return r1
            L74:
                java.lang.String r5 = r5.f5309e
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L7d
                return r1
            L7d:
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getCenter() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5308d
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getLowerLeft() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.a
                return r0
        }

        public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyGonList() {
                r1 = this;
                java.util.List<com.amap.api.services.core.LatLonPoint> r0 = r1.f5311g
                return r0
        }

        public int getRange() {
                r1 = this;
                int r0 = r1.f5307c
                return r0
        }

        public java.lang.String getShape() {
                r1 = this;
                java.lang.String r0 = r1.f5309e
                return r0
        }

        public com.amap.api.services.core.LatLonPoint getUpperRight() {
                r1 = this;
                com.amap.api.services.core.LatLonPoint r0 = r1.f5306b
                return r0
        }

        public int hashCode() {
                r3 = this;
                com.amap.api.services.core.LatLonPoint r0 = r3.f5308d
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 + 31
                int r0 = r0 * 31
                boolean r2 = r3.f5310f
                if (r2 == 0) goto L16
                r2 = 1231(0x4cf, float:1.725E-42)
                goto L18
            L16:
                r2 = 1237(0x4d5, float:1.733E-42)
            L18:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.a
                if (r2 != 0) goto L21
                r2 = 0
                goto L25
            L21:
                int r2 = r2.hashCode()
            L25:
                int r0 = r0 + r2
                int r0 = r0 * 31
                com.amap.api.services.core.LatLonPoint r2 = r3.f5306b
                if (r2 != 0) goto L2e
                r2 = 0
                goto L32
            L2e:
                int r2 = r2.hashCode()
            L32:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<com.amap.api.services.core.LatLonPoint> r2 = r3.f5311g
                if (r2 != 0) goto L3b
                r2 = 0
                goto L3f
            L3b:
                int r2 = r2.hashCode()
            L3f:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r2 = r3.f5307c
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.f5309e
                if (r2 != 0) goto L4c
                goto L50
            L4c:
                int r1 = r2.hashCode()
            L50:
                int r0 = r0 + r1
                return r0
        }

        public boolean isDistanceSort() {
                r1 = this;
                boolean r0 = r1.f5310f
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShowFields {
        public static final int ALL = -1;
        public static final int BUSINESS = 2;
        public static final int CHILDREN = 1;
        public static final int DEFAULT = 0;
        public static final int INDOOR = 4;
        public static final int NAVI = 8;
        public static final int PHOTOS = 16;
        public int value;

        ShowFields() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.value = r0
                return
        }

        public ShowFields(int r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }

        public void setValue(int r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    public PoiSearchV2(android.content.Context r2, com.amap.api.services.poisearch.PoiSearchV2.Query r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.r0 r0 = new com.amap.api.col.s.r0     // Catch: java.lang.Exception -> Le
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> Le
            r1.a = r0     // Catch: java.lang.Exception -> Le
            return
        Le:
            r2 = move-exception
            boolean r3 = r2 instanceof com.amap.api.services.core.AMapException
            if (r3 != 0) goto L14
            return
        L14:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
    }

    static /* synthetic */ boolean a(java.lang.String r0, java.lang.String r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    private static boolean b(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L6
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            boolean r0 = r0.equals(r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiSearchV2$SearchBound r0 = r0.getBound()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiSearchV2.Query getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiSearchV2$Query r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.amap.api.services.poisearch.PoiResultV2 searchPOI() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.poisearch.PoiResultV2 r0 = r0.searchPOI()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchPOIAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPOIAsyn()
        L7:
            return
    }

    public com.amap.api.services.core.PoiItemV2 searchPOIId(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.core.PoiItemV2 r2 = r0.searchPOIId(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void searchPOIIdAsyn(java.lang.String r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchPOIIdAsyn(r2)
        L7:
            return
    }

    public void setBound(com.amap.api.services.poisearch.PoiSearchV2.SearchBound r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.setBound(r2)
        L7:
            return
    }

    public void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnPoiSearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.poisearch.PoiSearchV2.Query r2) {
            r1 = this;
            com.amap.api.services.interfaces.IPoiSearchV2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}
