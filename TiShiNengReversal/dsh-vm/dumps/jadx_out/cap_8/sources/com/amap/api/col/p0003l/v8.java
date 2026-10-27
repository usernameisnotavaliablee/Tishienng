package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v8 implements com.amap.api.col.3l.x1.a {
    private boolean A;
    private boolean B;
    private java.util.HashMap<java.lang.String, byte[]> C;
    private com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay D;
    private com.amap.api.maps.model.MyTrafficStyle E;
    private com.amap.api.col.3l.v8.a F;
    private final java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate f4070b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.maps.model.CustomMapStyleOptions f4071c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4072d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4073e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4074f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4075g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4076h;

    /* renamed from: i, reason: collision with root package name */
    private int f4077i;

    /* renamed from: j, reason: collision with root package name */
    private android.content.Context f4078j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f4079k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private com.amap.api.col.p0003l.x1 v;
    private com.amap.api.col.p0003l.x1 w;
    private byte[] x;
    private byte[] y;
    private byte[] z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    public v8(com.autonavi.base.amap.api.mapcore.IAMapDelegate r3, android.content.Context r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "__MACOSX"
            r2.a = r0
            r0 = 0
            r2.f4072d = r0
            r2.f4073e = r0
            r2.f4074f = r0
            r2.f4075g = r0
            r2.f4076h = r0
            r1 = -1
            r2.f4077i = r1
            r1 = 0
            r2.f4079k = r1
            r2.l = r1
            r2.m = r1
            r2.n = r1
            r2.o = r1
            r2.p = r1
            r2.q = r0
            r2.r = r0
            r2.s = r0
            r2.t = r0
            r2.u = r0
            r2.x = r1
            r2.y = r1
            r2.z = r1
            r2.A = r0
            r2.B = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.C = r1
            com.amap.api.maps.model.MyTrafficStyle r1 = new com.amap.api.maps.model.MyTrafficStyle
            r1.<init>()
            r2.E = r1
            r2.f4070b = r3
            r2.f4078j = r4
            r2.q = r0
            r2.r = r0
            r2.B = r5
            com.autonavi.base.ae.gmap.GLMapEngine r3 = r3.getGLMapEngine()
            r4 = 1
            int r3 = r3.getEngineIDWithType(r4)
            r2.f4077i = r3
            return
    }

    private void e(com.autonavi.base.amap.mapcore.MapConfig r5) {
            r4 = this;
            boolean r0 = r5.isProFunctionAuthEnable()
            if (r0 != 0) goto Lc
            java.util.HashMap<java.lang.String, byte[]> r5 = r4.C
            r5.clear()
            return
        Lc:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r4.f4071c
            java.lang.String r0 = r0.getStyleResDataPath()
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r4.f4071c
            byte[] r1 = r1.getStyleResData()
            if (r1 != 0) goto L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r0)
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r4.f4071c
            r1.setStyleResData(r0)
        L29:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r4.f4071c
            byte[] r0 = r0.getStyleResData()
            if (r0 != 0) goto L35
            byte[] r0 = r4.z
            if (r0 == 0) goto L8e
        L35:
            byte[] r0 = r4.z
            if (r0 == 0) goto L3a
            goto L40
        L3a:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r4.f4071c
            byte[] r0 = r0.getStyleResData()
        L40:
            if (r0 == 0) goto L8e
            r1 = 1
            r5.setUseProFunction(r1)
            java.util.HashMap<java.lang.String, byte[]> r5 = r4.C
            r5.clear()
            r5 = 0
            java.util.Map r5 = com.autonavi.base.amap.mapcore.FileUtil.uncompressToByteWithKeys(r0, r5)
            if (r5 == 0) goto L8e
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5a
            java.lang.String r2 = "__MACOSX"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L5a
            java.lang.Object r2 = r5.get(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L5a
            boolean r3 = com.autonavi.base.amap.mapcore.FileUtil.isGzip(r2)
            if (r3 == 0) goto L84
            java.util.HashMap<java.lang.String, byte[]> r3 = r4.C
            r3.put(r1, r2)
            goto L5a
        L84:
            java.util.HashMap<java.lang.String, byte[]> r3 = r4.C
            byte[] r2 = com.autonavi.base.amap.mapcore.FileUtil.compress(r2)
            r3.put(r1, r2)
            goto L5a
        L8e:
            return
    }

    private void f(java.lang.String r5, boolean r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto Ld
            int r5 = com.amap.api.col.p0003l.d2.b(r5)
            goto Lf
        Ld:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        Lf:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            if (r0 == 0) goto L5d
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            if (r0 == 0) goto L5d
            byte[] r0 = r4.m
            if (r0 != 0) goto L3a
            android.content.Context r0 = r4.f4078j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "map_custom"
            r2.<init>(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "custom_bktile.data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r0, r2)
            r4.m = r0
        L3a:
            byte[] r0 = r4.m
            if (r0 == 0) goto L5d
            r2 = 0
            if (r6 != 0) goto L43
            r5 = 0
            goto L47
        L43:
            if (r5 != r1) goto L47
            r6 = 1
            goto L48
        L47:
            r6 = 0
        L48:
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            byte[] r5 = com.amap.api.col.p0003l.b3.T(r0, r2, r5, r6)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r4.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r6 = r6.getGLMapEngine()
            int r0 = r4.f4077i
            r6.setBackgroundTexture(r0, r5)
        L5d:
            return
    }

    private void g(org.json.JSONObject r3) {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            int r1 = r2.f4077i
            java.lang.String r3 = r3.toString()
            r0.setCustomThirdLayerStyle(r1, r3)
            return
    }

    private void h(byte[] r6) {
            r5 = this;
            if (r6 == 0) goto Le7
            com.amap.api.col.3l.b2 r6 = com.amap.api.col.p0003l.d2.c(r6)
            if (r6 == 0) goto Le7
            java.lang.String r0 = r6.a()
            if (r0 == 0) goto Le7
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L36
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "mapStyle"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "visible"
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L39
            java.lang.String r4 = "bg"
            org.json.JSONObject r6 = r6.optJSONObject(r4)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L39
            boolean r3 = r6.optBoolean(r1, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "lineColor"
            java.lang.String r2 = r6.optString(r4, r2)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r6 = move-exception
            goto Ldd
        L39:
            r5.f(r2, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "layer"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lc0
            java.lang.String r2 = "traffic"
            org.json.JSONObject r6 = r6.optJSONObject(r2)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lc0
            java.lang.String r2 = "multiFillColors"
            org.json.JSONObject r2 = r6.optJSONObject(r2)     // Catch: java.lang.Throwable -> L36
            boolean r6 = r6.optBoolean(r1)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lc0
            if (r2 == 0) goto Lc0
            java.lang.String r6 = "smooth"
            java.lang.String r6 = r2.optString(r6)     // Catch: java.lang.Throwable -> L36
            int r6 = com.amap.api.col.p0003l.d2.b(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "slow"
            java.lang.String r1 = r2.optString(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = com.amap.api.col.p0003l.d2.b(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "congested"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Throwable -> L36
            int r3 = com.amap.api.col.p0003l.d2.b(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "seriousCongested"
            java.lang.String r2 = r2.optString(r4)     // Catch: java.lang.Throwable -> L36
            int r2 = com.amap.api.col.p0003l.d2.b(r2)     // Catch: java.lang.Throwable -> L36
            com.amap.api.maps.model.MyTrafficStyle r4 = r5.E     // Catch: java.lang.Throwable -> L36
            r4.setSmoothColor(r6)     // Catch: java.lang.Throwable -> L36
            com.amap.api.maps.model.MyTrafficStyle r6 = r5.E     // Catch: java.lang.Throwable -> L36
            r6.setSlowColor(r1)     // Catch: java.lang.Throwable -> L36
            com.amap.api.maps.model.MyTrafficStyle r6 = r5.E     // Catch: java.lang.Throwable -> L36
            r6.setCongestedColor(r3)     // Catch: java.lang.Throwable -> L36
            com.amap.api.maps.model.MyTrafficStyle r6 = r5.E     // Catch: java.lang.Throwable -> L36
            r6.setSeriousCongestedColor(r2)     // Catch: java.lang.Throwable -> L36
            byte[] r6 = r5.p     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto Lb7
            android.content.Context r6 = r5.f4078j     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "map_assets"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L36
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "tmc_allinone.data"
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            byte[] r6 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r6, r1)     // Catch: java.lang.Throwable -> L36
            r5.p = r6     // Catch: java.lang.Throwable -> L36
        Lb7:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r5.f4070b     // Catch: java.lang.Throwable -> L36
            byte[] r1 = r5.p     // Catch: java.lang.Throwable -> L36
            com.amap.api.maps.model.MyTrafficStyle r2 = r5.E     // Catch: java.lang.Throwable -> L36
            r6.setTrafficStyleWithTexture(r1, r2)     // Catch: java.lang.Throwable -> L36
        Lc0:
            java.lang.String r6 = "third_layer"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lcb
            r5.g(r6)     // Catch: java.lang.Throwable -> L36
        Lcb:
            java.lang.String r6 = "model_layer"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Le7
            java.lang.String r0 = "id"
            java.lang.String r6 = r6.optString(r0)     // Catch: java.lang.Throwable -> L36
            r5.k(r6)     // Catch: java.lang.Throwable -> L36
            return
        Ldd:
            java.lang.String r0 = "AMapCustomStyleManager"
            java.lang.String r1 = "setExtraStyle"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            com.amap.api.col.p0003l.b3.D(r6)
        Le7:
            return
    }

    private void k(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://restapi.amap.com/rest/lbs/geohub/3d/tiles?z=%d&x=%d&y=%d"
            r0.<init>(r1)
            java.lang.String r1 = "&id="
            r0.append(r1)
            r0.append(r3)
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider r3 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider
            r3.<init>()
            java.lang.String r0 = r0.toString()
            r3.setUrl(r0)
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions r0 = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions
            r0.<init>()
            r0.setTileProvider(r3)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r2.f4070b     // Catch: java.lang.Exception -> L2b
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay r3 = r3.add3DModelTileOverlay(r0)     // Catch: java.lang.Exception -> L2b
            r2.D = r3     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    private boolean l(byte[] r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r3.f4070b     // Catch: java.lang.Throwable -> L11
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()     // Catch: java.lang.Throwable -> L11
            int r2 = r3.f4077i     // Catch: java.lang.Throwable -> L11
            boolean r4 = r1.checkCustomStyleData(r2, r4)     // Catch: java.lang.Throwable -> L11
            return r4
        L11:
            r4 = move-exception
            java.lang.String r1 = "AMapCustomStyleManager"
            java.lang.String r2 = "checkData"
            com.amap.api.col.p0003l.w5.p(r4, r1, r2)
            com.amap.api.col.p0003l.b3.D(r4)
            return r0
    }

    private static java.lang.String m(java.lang.String r3) {
            if (r3 != 0) goto L3
            return r3
        L3:
            java.lang.String r0 = "99999_"
            int r1 = r3.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto Ld
            return r3
        Ld:
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
    }

    private static byte[] o(byte[] r6) {
            r0 = 0
            if (r6 == 0) goto L46
            int r1 = r6.length
            if (r1 != 0) goto L7
            goto L46
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r6)
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L35
            r3 = 256(0x100, float:3.59E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L25
        L1a:
            int r4 = r6.read(r3)     // Catch: java.lang.Throwable -> L25
            if (r4 < 0) goto L27
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L25
            goto L1a
        L25:
            r3 = move-exception
            goto L37
        L27:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L25
        L2b:
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r1)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r2)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r6)
            return r0
        L35:
            r3 = move-exception
            r6 = r0
        L37:
            com.amap.api.col.p0003l.b3.D(r3)     // Catch: java.lang.Throwable -> L3b
            goto L2b
        L3b:
            r0 = move-exception
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r1)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r2)
            com.autonavi.base.amap.mapcore.tools.GLFileUtil.closeQuietly(r6)
            throw r0
        L46:
            return r0
    }

    private void r() {
            r4 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            if (r0 == 0) goto L20
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            if (r0 == 0) goto L20
            byte[] r0 = r4.p
            if (r0 == 0) goto L20
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            int r1 = r4.f4077i
            byte[] r2 = r4.p
            com.amap.api.maps.model.MyTrafficStyle r3 = new com.amap.api.maps.model.MyTrafficStyle
            r3.<init>()
            r0.setTrafficStyleWithTexture(r1, r2, r3)
        L20:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            if (r0 == 0) goto L3b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            if (r0 == 0) goto L3b
            byte[] r0 = r4.m
            if (r0 == 0) goto L3b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            int r1 = r4.f4077i
            byte[] r2 = r4.m
            r0.setBackgroundTexture(r1, r2)
        L3b:
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay r0 = r4.D
            if (r0 == 0) goto L42
            r0.remove()
        L42:
            r0 = 0
            r4.u = r0
            return
    }

    private void s() {
            r4 = this;
            boolean r0 = r4.B
            java.lang.String r1 = "map_assets"
            if (r0 == 0) goto L2a
            byte[] r0 = r4.l
            if (r0 != 0) goto L4d
            android.content.Context r0 = r4.f4078j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r1 = "style_1_16_3569740208.data"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r0, r1)
            byte[] r0 = o(r0)
            r4.l = r0
            goto L4d
        L2a:
            byte[] r0 = r4.l
            if (r0 != 0) goto L4d
            android.content.Context r0 = r4.f4078j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r1 = "style_1_s_21_1680092748.data"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r0, r1)
            byte[] r0 = o(r0)
            r4.l = r0
        L4d:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r4.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            int r1 = r4.f4077i
            byte[] r2 = r4.l
            byte[] r3 = r4.f4079k
            r0.setCustomStyleData(r1, r2, r3)
            r0 = 0
            r4.t = r0
            java.util.HashMap<java.lang.String, byte[]> r0 = r4.C
            r0.clear()
            return
    }

    private void t() {
            r3 = this;
            boolean r0 = r3.s
            if (r0 == 0) goto L35
            byte[] r0 = r3.n
            if (r0 != 0) goto L25
            android.content.Context r0 = r3.f4078j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "map_custom"
            r1.<init>(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "icons-for-custom_5_18_1616413149.data"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r0, r1)
            r3.n = r0
        L25:
            r0 = 0
            r3.s = r0
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.f4070b
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()
            int r1 = r3.f4077i
            byte[] r2 = r3.n
            r0.setCustomStyleTexture(r1, r2)
        L35:
            return
    }

    private void u() {
            r2 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            if (r0 == 0) goto L26
            r1 = 0
            r0.setStyleId(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleDataPath(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleData(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleTexturePath(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleTextureData(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleExtraData(r1)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            r0.setStyleExtraPath(r1)
        L26:
            return
    }

    public final void a() {
            r7 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c
            if (r0 != 0) goto L5
            goto L12
        L5:
            boolean r0 = r7.r
            if (r0 == 0) goto La
            goto L12
        La:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r7.f4070b     // Catch: java.lang.Throwable -> L1e7
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()     // Catch: java.lang.Throwable -> L1e7
            if (r0 != 0) goto L13
        L12:
            return
        L13:
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L1e7
            boolean r1 = r0.isHideLogoEnable()     // Catch: java.lang.Throwable -> L48
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L62
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L62
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L62
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.isLogoEnable()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L55
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.isEnable()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L4b
            boolean r1 = r7.t     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L62
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L48
            r1.setLogoEnable(r3)     // Catch: java.lang.Throwable -> L48
            goto L62
        L48:
            r0 = move-exception
            goto L1e5
        L4b:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L48
            r1.setLogoEnable(r2)     // Catch: java.lang.Throwable -> L48
            goto L62
        L55:
            boolean r1 = r7.t     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L62
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate r1 = r1.getUiSettings()     // Catch: java.lang.Throwable -> L48
            r1.setLogoEnable(r2)     // Catch: java.lang.Throwable -> L48
        L62:
            boolean r1 = r7.f4072d     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Lba
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.isEnable()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L7f
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()     // Catch: java.lang.Throwable -> L48
            int r4 = r7.f4077i     // Catch: java.lang.Throwable -> L48
            r1.setNativeMapModeAndStyle(r4, r3, r3)     // Catch: java.lang.Throwable -> L48
            r0.setCustomStyleEnable(r2)     // Catch: java.lang.Throwable -> L48
            r7.f4072d = r3     // Catch: java.lang.Throwable -> L48
            goto Lba
        L7f:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()     // Catch: java.lang.Throwable -> L48
            int r2 = r7.f4077i     // Catch: java.lang.Throwable -> L48
            int r4 = r0.getMapStyleMode()     // Catch: java.lang.Throwable -> L48
            int r5 = r0.getMapStyleTime()     // Catch: java.lang.Throwable -> L48
            r1.setNativeMapModeAndStyle(r2, r4, r5)     // Catch: java.lang.Throwable -> L48
            r7.t = r3     // Catch: java.lang.Throwable -> L48
            boolean r1 = r0.isCustomStyleEnable()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Lb6
            int r1 = r0.getMapStyleMode()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto La9
            int r1 = r0.getMapStyleTime()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto La9
            r7.s()     // Catch: java.lang.Throwable -> L48
        La9:
            r7.t()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r7.u     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Lb3
            r7.r()     // Catch: java.lang.Throwable -> L48
        Lb3:
            r0.setCustomStyleEnable(r3)     // Catch: java.lang.Throwable -> L48
        Lb6:
            r7.f4072d = r3     // Catch: java.lang.Throwable -> L48
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L48
            return
        Lba:
            boolean r1 = r7.f4074f     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L10d
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getStyleTexturePath()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r4 = r4.getStyleTextureData()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto Ldb
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto Ldb
            byte[] r1 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            r4.setStyleTextureData(r1)     // Catch: java.lang.Throwable -> L48
        Ldb:
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r1 = r1.getStyleTextureData()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L106
            r7.A = r2     // Catch: java.lang.Throwable -> L48
            boolean r1 = r0.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L102
            r7.s = r2     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapEngine r1 = r1.getGLMapEngine()     // Catch: java.lang.Throwable -> L48
            int r4 = r7.f4077i     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r5 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r5 = r5.getStyleTextureData()     // Catch: java.lang.Throwable -> L48
            r1.setCustomStyleTexture(r4, r5)     // Catch: java.lang.Throwable -> L48
            r0.setUseProFunction(r2)     // Catch: java.lang.Throwable -> L48
            goto L10b
        L102:
            r7.t()     // Catch: java.lang.Throwable -> L48
            goto L10b
        L106:
            r7.t()     // Catch: java.lang.Throwable -> L48
            r7.A = r3     // Catch: java.lang.Throwable -> L48
        L10b:
            r7.f4074f = r3     // Catch: java.lang.Throwable -> L48
        L10d:
            boolean r1 = r7.f4073e     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L199
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getStyleDataPath()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r4 = r4.getStyleData()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L12e
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L12e
            byte[] r1 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            r4.setStyleData(r1)     // Catch: java.lang.Throwable -> L48
        L12e:
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r1 = r1.getStyleData()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L147
            byte[] r1 = r7.x     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L13b
            goto L147
        L13b:
            boolean r1 = r7.t     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L197
            r7.f4072d = r2     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            r1.setEnable(r3)     // Catch: java.lang.Throwable -> L48
            goto L197
        L147:
            byte[] r1 = r7.o     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L16c
            android.content.Context r1 = r7.f4078j     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "map_custom"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> L48
            r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "style-for-custom_0_18_1641525834.data"
            r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48
            byte[] r1 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r1, r4)     // Catch: java.lang.Throwable -> L48
            byte[] r1 = o(r1)     // Catch: java.lang.Throwable -> L48
            r7.o = r1     // Catch: java.lang.Throwable -> L48
        L16c:
            byte[] r1 = r7.x     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L171
            goto L177
        L171:
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r1 = r1.getStyleData()     // Catch: java.lang.Throwable -> L48
        L177:
            boolean r4 = r7.l(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L181
            com.amap.api.col.p0003l.i2.a()     // Catch: java.lang.Throwable -> L48
            goto L197
        L181:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.ae.gmap.GLMapEngine r4 = r4.getGLMapEngine()     // Catch: java.lang.Throwable -> L48
            int r5 = r7.f4077i     // Catch: java.lang.Throwable -> L48
            byte[] r6 = r7.o     // Catch: java.lang.Throwable -> L48
            r4.setCustomStyleData(r5, r1, r6)     // Catch: java.lang.Throwable -> L48
            r7.t = r2     // Catch: java.lang.Throwable -> L48
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f4070b     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L197
            r1.resetRenderTime()     // Catch: java.lang.Throwable -> L48
        L197:
            r7.f4073e = r3     // Catch: java.lang.Throwable -> L48
        L199:
            boolean r1 = r7.f4075g     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L1da
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getStyleExtraPath()     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r4 = r4.getStyleExtraData()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L1ba
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L1ba
            byte[] r1 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L48
            com.amap.api.maps.model.CustomMapStyleOptions r4 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            r4.setStyleExtraData(r1)     // Catch: java.lang.Throwable -> L48
        L1ba:
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r1 = r1.getStyleExtraData()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L1c6
            byte[] r1 = r7.y     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L1d8
        L1c6:
            byte[] r1 = r7.y     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L1cb
            goto L1d1
        L1cb:
            com.amap.api.maps.model.CustomMapStyleOptions r1 = r7.f4071c     // Catch: java.lang.Throwable -> L48
            byte[] r1 = r1.getStyleExtraData()     // Catch: java.lang.Throwable -> L48
        L1d1:
            if (r1 == 0) goto L1d8
            r7.h(r1)     // Catch: java.lang.Throwable -> L48
            r7.u = r2     // Catch: java.lang.Throwable -> L48
        L1d8:
            r7.f4075g = r3     // Catch: java.lang.Throwable -> L48
        L1da:
            boolean r1 = r7.f4076h     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L1e3
            r7.e(r0)     // Catch: java.lang.Throwable -> L48
            r7.f4076h = r3     // Catch: java.lang.Throwable -> L48
        L1e3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L48
            return
        L1e5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L1e7
        L1e7:
            r0 = move-exception
            java.lang.String r1 = "AMapCustomStyleManager"
            java.lang.String r2 = "updateStyle"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            com.amap.api.col.p0003l.b3.D(r0)
            return
    }

    @Override // com.amap.api.col.3l.x1.a
    public final void a(byte[] r1, int r2) {
            r0 = this;
            r0.b(r1, r2)
            return
    }

    @Override // com.amap.api.col.3l.x1.a
    public final void b(byte[] r4, int r5) {
            r3 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r3.f4071c
            if (r0 == 0) goto L83
            monitor-enter(r3)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.f4070b     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7f
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7f
            boolean r1 = r0.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L7f
            r1 = 1
            r0.setUseProFunction(r1)     // Catch: java.lang.Throwable -> L20
            if (r5 != r1) goto L22
            r3.x = r4     // Catch: java.lang.Throwable -> L20
            r3.f4073e = r1     // Catch: java.lang.Throwable -> L20
            goto L7f
        L20:
            r4 = move-exception
            goto L81
        L22:
            if (r5 != 0) goto L29
            r3.y = r4     // Catch: java.lang.Throwable -> L20
            r3.f4075g = r1     // Catch: java.lang.Throwable -> L20
            goto L7f
        L29:
            r0 = 2
            if (r5 != r0) goto L7f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r5.<init>()     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r3.f4071c     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.getStyleId()     // Catch: java.lang.Throwable -> L20
            r5.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "_sdk_1000.data"
            r5.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.CustomMapStyleOptions r2 = r3.f4071c     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r2.getStyleId()     // Catch: java.lang.Throwable -> L20
            r0.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "_abroad_sdk.json"
            r0.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L20
            java.lang.String[] r2 = new java.lang.String[]{r5, r0}     // Catch: java.lang.Throwable -> L20
            java.util.Map r4 = com.autonavi.base.amap.mapcore.FileUtil.uncompressToByteWithKeys(r4, r2)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L7f
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Throwable -> L20
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L70
            r3.x = r5     // Catch: java.lang.Throwable -> L20
            r3.f4073e = r1     // Catch: java.lang.Throwable -> L20
        L70:
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L20
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L7f
            com.amap.api.col.3l.v8$a r4 = r3.F     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L7f
            r4.a()     // Catch: java.lang.Throwable -> L20
        L7f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return
        L81:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
        L83:
            return
    }

    public final void c(com.amap.api.col.3l.v8.a r1) {
            r0 = this;
            r0.F = r1
            return
    }

    public final void d(com.amap.api.maps.model.CustomMapStyleOptions r8) {
            r7 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c
            if (r0 != 0) goto L5
            goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return
        L8:
            monitor-enter(r7)
            boolean r0 = r7.q     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 != 0) goto L1e
            r7.q = r1     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEnable()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1e
            r7.f4072d = r1     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r8 = move-exception
            goto L19c
        L1e:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEnable()     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r8.isEnable()     // Catch: java.lang.Throwable -> L1b
            if (r0 == r2) goto L3e
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r8.isEnable()     // Catch: java.lang.Throwable -> L1b
            r0.setEnable(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4072d = r1     // Catch: java.lang.Throwable -> L1b
            android.content.Context r0 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r8.isEnable()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.p0003l.y2.m(r0, r2)     // Catch: java.lang.Throwable -> L1b
        L3e:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isEnable()     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            if (r0 == 0) goto L192
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleId()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r8.getStyleId()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = android.text.TextUtils.equals(r0, r3)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lc4
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r8.getStyleId()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleId(r3)     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleId()     // Catch: java.lang.Throwable -> L1b
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto Lc4
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r7.f4070b     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lc4
            com.autonavi.base.amap.mapcore.MapConfig r3 = r3.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lc4
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r3 = r7.f4070b     // Catch: java.lang.Throwable -> L1b
            com.autonavi.base.amap.mapcore.MapConfig r3 = r3.getMapConfig()     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r3.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lc4
            com.amap.api.col.3l.x1 r3 = r7.v     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto La2
            boolean r3 = r7.B     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L97
            com.amap.api.col.3l.x1 r3 = new com.amap.api.col.3l.x1     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "abroad_sdk_json_sdk_1000_zip"
            r6 = 2
            r3.<init>(r4, r7, r6, r5)     // Catch: java.lang.Throwable -> L1b
            r7.v = r3     // Catch: java.lang.Throwable -> L1b
            goto La2
        L97:
            com.amap.api.col.3l.x1 r3 = new com.amap.api.col.3l.x1     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "sdk_1000"
            r3.<init>(r4, r7, r1, r5)     // Catch: java.lang.Throwable -> L1b
            r7.v = r3     // Catch: java.lang.Throwable -> L1b
        La2:
            com.amap.api.col.3l.x1 r3 = r7.v     // Catch: java.lang.Throwable -> L1b
            r3.b(r0)     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.x1 r3 = r7.v     // Catch: java.lang.Throwable -> L1b
            r3.b()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.x1 r3 = r7.w     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto Lba
            com.amap.api.col.3l.x1 r3 = new com.amap.api.col.3l.x1     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            r3.<init>(r4, r7, r2, r5)     // Catch: java.lang.Throwable -> L1b
            r7.w = r3     // Catch: java.lang.Throwable -> L1b
        Lba:
            com.amap.api.col.3l.x1 r2 = r7.w     // Catch: java.lang.Throwable -> L1b
            r2.b(r0)     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.x1 r0 = r7.w     // Catch: java.lang.Throwable -> L1b
            r0.b()     // Catch: java.lang.Throwable -> L1b
        Lc4:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleDataPath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleDataPath()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Ldf
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleDataPath()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleDataPath(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4073e = r1     // Catch: java.lang.Throwable -> L1b
        Ldf:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r0 = r0.getStyleData()     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleData()     // Catch: java.lang.Throwable -> L1b
            if (r0 == r2) goto Lf6
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleData()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleData(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4073e = r1     // Catch: java.lang.Throwable -> L1b
        Lf6:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleTexturePath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleTexturePath()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L111
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleTexturePath()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleTexturePath(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4074f = r1     // Catch: java.lang.Throwable -> L1b
        L111:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r0 = r0.getStyleTextureData()     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleTextureData()     // Catch: java.lang.Throwable -> L1b
            if (r0 == r2) goto L128
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleTextureData()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleTextureData(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4074f = r1     // Catch: java.lang.Throwable -> L1b
        L128:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleExtraPath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleExtraPath()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L143
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleExtraPath()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleExtraPath(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4075g = r1     // Catch: java.lang.Throwable -> L1b
        L143:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r0 = r0.getStyleExtraData()     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleExtraData()     // Catch: java.lang.Throwable -> L1b
            if (r0 == r2) goto L15a
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleExtraData()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleExtraData(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4075g = r1     // Catch: java.lang.Throwable -> L1b
        L15a:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getStyleResDataPath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleResDataPath()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L175
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r8.getStyleResDataPath()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleResDataPath(r2)     // Catch: java.lang.Throwable -> L1b
            r7.f4076h = r1     // Catch: java.lang.Throwable -> L1b
        L175:
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r0 = r0.getStyleResData()     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = r8.getStyleResData()     // Catch: java.lang.Throwable -> L1b
            if (r0 == r2) goto L18c
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r7.f4071c     // Catch: java.lang.Throwable -> L1b
            byte[] r8 = r8.getStyleResData()     // Catch: java.lang.Throwable -> L1b
            r0.setStyleResData(r8)     // Catch: java.lang.Throwable -> L1b
            r7.f4076h = r1     // Catch: java.lang.Throwable -> L1b
        L18c:
            android.content.Context r8 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.p0003l.y2.j(r8, r1)     // Catch: java.lang.Throwable -> L1b
            goto L19a
        L192:
            r7.u()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r8 = r7.f4078j     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.p0003l.y2.j(r8, r2)     // Catch: java.lang.Throwable -> L1b
        L19a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1b
            return
        L19c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1b
            throw r8
    }

    public final byte[] i(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r4.f4070b
            com.autonavi.base.amap.mapcore.MapConfig r1 = r1.getMapConfig()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            boolean r1 = r1.isProFunctionAuthEnable()
            if (r1 != 0) goto L20
            java.lang.String r5 = m(r5)
            android.content.Context r0 = r4.f4078j
            java.lang.String r1 = "map_assets"
            byte[] r5 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssetsByPreName(r0, r1, r5)
            return r5
        L20:
            java.util.HashMap<java.lang.String, byte[]> r1 = r4.C
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.contains(r2)
            if (r3 == 0) goto L2a
            java.util.HashMap<java.lang.String, byte[]> r5 = r4.C
            java.lang.Object r5 = r5.get(r2)
            byte[] r5 = (byte[]) r5
            return r5
        L45:
            return r0
    }

    public final void j() {
            r2 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c
            if (r0 != 0) goto L5
            return
        L5:
            monitor-enter(r2)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.f4070b     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.f4070b     // Catch: java.lang.Throwable -> L29
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isProFunctionAuthEnable()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L2b
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r0.setStyleId(r1)     // Catch: java.lang.Throwable -> L29
            r2.x = r1     // Catch: java.lang.Throwable -> L29
            r2.y = r1     // Catch: java.lang.Throwable -> L29
            r2.z = r1     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L3c
        L2b:
            r0 = 1
            r2.f4074f = r0     // Catch: java.lang.Throwable -> L29
            r2.f4073e = r0     // Catch: java.lang.Throwable -> L29
            boolean r1 = r2.u     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L36
            r2.f4075g = r0     // Catch: java.lang.Throwable -> L29
        L36:
            r2.f4072d = r0     // Catch: java.lang.Throwable -> L29
            r2.f4076h = r0     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            return
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    public final void n() {
            r1 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r1.f4071c
            if (r0 != 0) goto Lb
            com.amap.api.maps.model.CustomMapStyleOptions r0 = new com.amap.api.maps.model.CustomMapStyleOptions
            r0.<init>()
            r1.f4071c = r0
        Lb:
            return
    }

    public final boolean p() {
            r1 = this;
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r1.f4071c
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void q() {
            r2 = this;
            monitor-enter(r2)
            com.amap.api.maps.model.CustomMapStyleOptions r0 = r2.f4071c     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            r1 = 0
            r0.setEnable(r1)     // Catch: java.lang.Throwable -> L10
            r2.u()     // Catch: java.lang.Throwable -> L10
            r0 = 1
            r2.f4072d = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L14
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
