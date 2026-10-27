package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d2 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f3131d = null;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f3132b;

    /* renamed from: c, reason: collision with root package name */
    java.util.List<com.amap.api.col.p0003l.a2> f3133c;

    static {
            r0 = 1
            int[] r0 = new int[]{r0}
            com.amap.api.col.p0003l.d2.f3131d = r0
            return
    }

    public d2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = -1
            r1.f3132b = r0
            r0 = 0
            r1.f3133c = r0
            return
    }

    public static int b(java.lang.String r3) {
            java.lang.String r0 = "#"
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L14
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L19
        L14:
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            return r2
    }

    public static com.amap.api.col.p0003l.b2 c(byte[] r8) {
            r0 = 0
            com.amap.api.col.3l.b2 r1 = new com.amap.api.col.3l.b2     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "l"
            java.lang.String r2 = "utf-8"
            byte[] r0 = r0.getBytes(r2)     // Catch: java.lang.Throwable -> L21
            int r2 = r8.length     // Catch: java.lang.Throwable -> L21
            int r3 = r0.length     // Catch: java.lang.Throwable -> L21
            r4 = 0
            r5 = 0
        L12:
            if (r5 >= r2) goto L23
            int r6 = r5 % r3
            r7 = r8[r5]     // Catch: java.lang.Throwable -> L21
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L21
            r6 = r6 ^ r7
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L21
            r8[r5] = r6     // Catch: java.lang.Throwable -> L21
            int r5 = r5 + 1
            goto L12
        L21:
            r0 = r1
            goto L5c
        L23:
            r0 = 4
            java.lang.String r3 = com.autonavi.base.amap.mapcore.Convert.getString(r8, r4, r0)     // Catch: java.lang.Throwable -> L21
            r1.b(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 32
            java.lang.String r0 = com.autonavi.base.amap.mapcore.Convert.getString(r8, r0, r3)     // Catch: java.lang.Throwable -> L21
            r1.c(r0)     // Catch: java.lang.Throwable -> L21
            r0 = 36
            r3 = 10
            java.lang.String r0 = com.autonavi.base.amap.mapcore.Convert.getString(r8, r0, r3)     // Catch: java.lang.Throwable -> L21
            r1.d(r0)     // Catch: java.lang.Throwable -> L21
            r0 = 46
            r3 = 16
            byte[] r0 = com.autonavi.base.amap.mapcore.Convert.getSubBytes(r8, r0, r3)     // Catch: java.lang.Throwable -> L21
            r4 = 62
            byte[] r3 = com.autonavi.base.amap.mapcore.Convert.getSubBytes(r8, r4, r3)     // Catch: java.lang.Throwable -> L21
            r4 = 78
            int r2 = r2 - r4
            byte[] r8 = com.autonavi.base.amap.mapcore.Convert.getSubBytes(r8, r4, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r8 = g(r8, r0, r3)     // Catch: java.lang.Throwable -> L21
            r1.e(r8)     // Catch: java.lang.Throwable -> L21
            return r1
        L5c:
            return r0
    }

    private static com.autonavi.base.ae.gmap.style.StyleElement f(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r2, int r3, int r4, com.amap.api.col.p0003l.a2 r5) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.get(r0)
            com.autonavi.base.ae.gmap.style.StyleItem r0 = (com.autonavi.base.ae.gmap.style.StyleItem) r0
            if (r0 != 0) goto L22
            com.autonavi.base.ae.gmap.style.StyleItem r0 = new com.autonavi.base.ae.gmap.style.StyleItem
            int r1 = r5.f2950c
            r0.<init>(r1)
            int r1 = r5.a
            r0.mainKey = r1
            int[] r5 = r5.f2949b
            r0.subKey = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r0)
        L22:
            com.autonavi.base.ae.gmap.style.StyleElement r2 = r0.get(r4)
            if (r2 != 0) goto L32
            com.autonavi.base.ae.gmap.style.StyleElement r2 = new com.autonavi.base.ae.gmap.style.StyleElement
            r2.<init>()
            r2.styleElementType = r4
            r0.put(r4, r2)
        L32:
            return r2
    }

    private static java.lang.String g(byte[] r2, byte[] r3, byte[] r4) {
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L22
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L22
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "AES"
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Throwable -> L22
            r1 = 2
            r3.init(r1, r4, r0)     // Catch: java.lang.Throwable -> L22
            byte[] r2 = r3.doFinal(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "utf-8"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L22
            return r3
        L22:
            r2 = 0
            return r2
    }

    private java.util.List<com.amap.api.col.p0003l.a2> h(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.amap.api.col.3l.a2> r1 = r4.f3133c
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            com.amap.api.col.3l.a2 r2 = (com.amap.api.col.p0003l.a2) r2
            if (r2 == 0) goto Lb
            java.lang.String r3 = r2.f2952e
            if (r3 == 0) goto L27
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L27
            r0.add(r2)
            goto Lb
        L27:
            java.lang.String r3 = r2.f2952e
            if (r3 == 0) goto Lb
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lb
            java.lang.String r3 = r2.f2953f
            if (r3 == 0) goto Lb
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L3f:
            return r0
    }

    private void j(com.amap.api.col.p0003l.f2 r5) {
            r4 = this;
            int r0 = r4.f3132b
            r1 = -1
            if (r0 == r1) goto L42
            java.util.Map r5 = r5.a()
            java.lang.String r0 = "roads"
            java.lang.String r1 = "trafficRoadBackgroundColor"
            java.util.List r0 = r4.h(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            com.amap.api.col.3l.a2 r1 = (com.amap.api.col.p0003l.a2) r1
            int r2 = r1.f2951d
            java.lang.String r3 = "fillColor"
            int r3 = com.amap.api.col.p0003l.cx.a(r3)
            com.autonavi.base.ae.gmap.style.StyleElement r2 = f(r5, r2, r3, r1)
            int r3 = r4.f3132b
            r2.value = r3
            int r2 = r1.f2951d
            java.lang.String r3 = "strokeColor"
            int r3 = com.amap.api.col.p0003l.cx.a(r3)
            com.autonavi.base.ae.gmap.style.StyleElement r1 = f(r5, r2, r3, r1)
            int r2 = r4.f3132b
            r1.value = r2
            goto L15
        L42:
            return
    }

    private void k(com.amap.api.col.p0003l.f2 r7, byte[] r8, boolean r9) {
            r6 = this;
            java.lang.String r0 = "background"
            com.amap.api.col.3l.b2 r8 = c(r8)
            if (r8 == 0) goto L65
            java.lang.String r1 = r8.a()
            if (r1 == 0) goto L65
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = r8.a()     // Catch: java.lang.Throwable -> L65
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L65
            org.json.JSONArray r8 = r1.names()     // Catch: java.lang.Throwable -> L65
            r2 = 0
        L1c:
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L65
            if (r2 >= r3) goto L65
            java.lang.String r3 = r8.getString(r2)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L34
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "sdkTextures"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L62
        L34:
            if (r3 == 0) goto L55
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L65
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L55
            java.lang.String r3 = r1.optString(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "#"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L65
            int r3 = b(r3)     // Catch: java.lang.Throwable -> L65
            r6.a = r3     // Catch: java.lang.Throwable -> L65
            goto L62
        L55:
            org.json.JSONObject r4 = r1.optJSONObject(r3)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L62
            java.util.Map r5 = r7.a()     // Catch: java.lang.Throwable -> L65
            r6.m(r3, r5, r4, r9)     // Catch: java.lang.Throwable -> L65
        L62:
            int r2 = r2 + 1
            goto L1c
        L65:
            return
    }

    private void l(java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r10, org.json.JSONObject r11, boolean r12) throws org.json.JSONException {
            r7 = this;
            if (r11 != 0) goto L4
            goto Lb5
        L4:
            java.util.List<com.amap.api.col.3l.a2> r0 = r7.f3133c
            if (r0 != 0) goto Le
            java.util.List r0 = r7.v()
            r7.f3133c = r0
        Le:
            java.util.List r8 = r7.h(r8, r9)
            java.util.Iterator r9 = r8.iterator()
        L16:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r9.next()
            r6 = r0
            com.amap.api.col.3l.a2 r6 = (com.amap.api.col.p0003l.a2) r6
            if (r6 == 0) goto Lb5
            int r0 = r6.f2950c
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            if (r0 != r1) goto L2d
            goto Lb5
        L2d:
            int r5 = r6.f2951d
            java.lang.String r0 = "visible"
            r1 = 1
            boolean r2 = r11.optBoolean(r0, r1)
            r3 = 0
            r4 = -1
            if (r2 != 0) goto L47
            int r0 = com.amap.api.col.p0003l.cx.a(r0)
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r10, r5, r0, r6)
            r0.textureId = r4
            r0.visible = r3
            goto L16
        L47:
            java.lang.String r0 = "showIcon"
            boolean r0 = r11.optBoolean(r0, r1)
            java.lang.String r2 = "textFillColor"
            if (r0 != 0) goto L5b
            int r0 = com.amap.api.col.p0003l.cx.a(r2)
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r10, r5, r0, r6)
            r0.textureId = r4
        L5b:
            java.lang.String r0 = "showLabel"
            boolean r0 = r11.optBoolean(r0, r1)
            if (r0 != 0) goto L7e
            int r0 = com.amap.api.col.p0003l.cx.a(r2)
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r10, r5, r0, r6)
            r1 = 0
            r0.opacity = r1
            java.lang.String r0 = "textStrokeColor"
            int r0 = com.amap.api.col.p0003l.cx.a(r0)
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r10, r5, r0, r6)
            r0.opacity = r1
            r0.visible = r3
            r0.textureId = r4
        L7e:
            java.lang.String r3 = "color"
            java.lang.String r4 = "opacity"
            r1 = r10
            r2 = r11
            p(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "fillColor"
            java.lang.String r4 = "fillOpacity"
            p(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "strokeColor"
            java.lang.String r4 = "strokeOpacity"
            p(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "textFillColor"
            java.lang.String r4 = "textFillOpacity"
            p(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "textStrokeColor"
            java.lang.String r4 = "textStrokeOpacity"
            p(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "backgroundColor"
            java.lang.String r4 = "backgroundOpacity"
            p(r1, r2, r3, r4, r5, r6)
            if (r12 == 0) goto Lb1
            java.lang.String r10 = "textureName"
            o(r1, r2, r10, r5, r6)
        Lb1:
            r10 = r1
            r11 = r2
            goto L16
        Lb5:
            return
        Lb6:
            r8.clear()
            return
    }

    private void m(java.lang.String r11, java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
            r10 = this;
            if (r13 != 0) goto L3
            goto L5d
        L3:
            java.lang.String r0 = "subType"
            org.json.JSONObject r0 = r13.optJSONObject(r0)
            if (r0 != 0) goto L15
            r3 = r11
            r1 = r10
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.l(r2, r3, r4, r5, r6)
            return
        L15:
            r5 = r11
            r7 = r12
            r9 = r14
            org.json.JSONArray r11 = r0.names()
            r12 = 0
            r13 = 0
        L1e:
            int r14 = r11.length()
            if (r13 >= r14) goto L5d
            java.lang.String r6 = r11.optString(r13)
            org.json.JSONObject r8 = r0.optJSONObject(r6)
            java.lang.String r14 = "detailedType"
            boolean r1 = r8.has(r14)
            if (r1 == 0) goto L56
            org.json.JSONObject r14 = r8.optJSONObject(r14)
            if (r14 == 0) goto L5a
            org.json.JSONArray r1 = r14.names()
            r2 = 0
        L3f:
            int r3 = r1.length()
            if (r2 >= r3) goto L5a
            java.lang.String r6 = r1.optString(r2)
            org.json.JSONObject r8 = r14.optJSONObject(r6)
            if (r8 == 0) goto L53
            r4 = r10
            r4.l(r5, r6, r7, r8, r9)
        L53:
            int r2 = r2 + 1
            goto L3f
        L56:
            r4 = r10
            r4.l(r5, r6, r7, r8, r9)
        L5a:
            int r13 = r13 + 1
            goto L1e
        L5d:
            return
    }

    private static void n(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r4, org.json.JSONObject r5, int r6, int r7, com.amap.api.col.p0003l.a2 r8) throws org.json.JSONException {
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r4, r6, r7, r8)
            java.lang.String r1 = "stylers"
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            if (r5 == 0) goto L55
            java.lang.String r1 = "color"
            java.lang.String r1 = r5.optString(r1)
            int r1 = b(r1)
            if (r1 != 0) goto L19
            goto L55
        L19:
            r0.value = r1
            java.lang.String r2 = "textureName"
            r3 = 0
            int r2 = r5.optInt(r2, r3)
            r0.textureId = r2
            java.lang.String r2 = "lineWidth"
            int r5 = r5.optInt(r2, r3)
            r0.lineWidth = r5
            r5 = 30
            if (r6 < r5) goto L3f
            r5 = 38
            if (r6 > r5) goto L3f
            r5 = 4
            com.autonavi.base.ae.gmap.style.StyleElement r4 = f(r4, r6, r5, r8)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r4.opacity = r5
            return
        L3f:
            java.lang.String r5 = r8.f2952e
            if (r5 == 0) goto L55
            java.lang.String r0 = "water"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L55
            r5 = 3
            if (r7 != r5) goto L55
            r5 = 2
            com.autonavi.base.ae.gmap.style.StyleElement r4 = f(r4, r6, r5, r8)
            r4.value = r1
        L55:
            return
    }

    private static void o(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r1, org.json.JSONObject r2, java.lang.String r3, int r4, com.amap.api.col.p0003l.a2 r5) {
            r0 = 0
            int r2 = r2.optInt(r3, r0)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L8
            goto L12
        L8:
            int r3 = com.amap.api.col.p0003l.cx.a(r3)     // Catch: java.lang.Throwable -> L12
            com.autonavi.base.ae.gmap.style.StyleElement r1 = f(r1, r4, r3, r5)     // Catch: java.lang.Throwable -> L12
            r1.textureId = r2     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    private static void p(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r5, org.json.JSONObject r6, java.lang.String r7, java.lang.String r8, int r9, com.amap.api.col.p0003l.a2 r10) {
            r0 = 0
            java.lang.String r0 = r6.optString(r7, r0)     // Catch: java.lang.Throwable -> L64
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L64
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto L14
            double r0 = r6.optDouble(r8, r2)     // Catch: java.lang.Throwable -> L64
            float r6 = (float) r0     // Catch: java.lang.Throwable -> L64
            r8 = 0
            goto L24
        L14:
            java.lang.String r6 = "#"
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r6.concat(r8)     // Catch: java.lang.Throwable -> L64
            int r8 = b(r6)     // Catch: java.lang.Throwable -> L64
            r6 = 1065353216(0x3f800000, float:1.0)
        L24:
            if (r8 != 0) goto L2c
            double r0 = (double) r6     // Catch: java.lang.Throwable -> L64
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            goto L64
        L2c:
            int r7 = com.amap.api.col.p0003l.cx.a(r7)     // Catch: java.lang.Throwable -> L64
            com.autonavi.base.ae.gmap.style.StyleElement r0 = f(r5, r9, r7, r10)     // Catch: java.lang.Throwable -> L64
            r0.value = r8     // Catch: java.lang.Throwable -> L64
            r0.opacity = r6     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r10.f2953f     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L4c
            java.lang.String r1 = "China"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L4c
            com.autonavi.base.ae.gmap.style.StyleElement r5 = f(r5, r9, r7, r10)     // Catch: java.lang.Throwable -> L64
            r6 = 0
            r5.opacity = r6     // Catch: java.lang.Throwable -> L64
            return
        L4c:
            java.lang.String r0 = r10.f2952e     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L64
            java.lang.String r1 = "water"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L64
            r0 = 3
            if (r7 != r0) goto L64
            r7 = 2
            com.autonavi.base.ae.gmap.style.StyleElement r5 = f(r5, r9, r7, r10)     // Catch: java.lang.Throwable -> L64
            r5.value = r8     // Catch: java.lang.Throwable -> L64
            r5.opacity = r6     // Catch: java.lang.Throwable -> L64
        L64:
            return
    }

    private void q(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r5, org.json.JSONObject r6, java.lang.String r7, java.lang.String[] r8, int r9) throws org.json.JSONException {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r8.length
            if (r0 >= r1) goto L2d
            r1 = r8[r0]
            java.util.List<com.amap.api.col.3l.a2> r2 = r4.f3133c
            if (r2 != 0) goto L10
            java.util.List r2 = r4.v()
            r4.f3133c = r2
        L10:
            java.util.List r1 = r4.h(r7, r1)
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            com.amap.api.col.3l.a2 r2 = (com.amap.api.col.p0003l.a2) r2
            int r3 = r2.f2951d
            n(r5, r6, r3, r9, r2)
            goto L18
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            return
    }

    private static void r(org.json.JSONArray r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List<com.amap.api.col.p0003l.a2> r15) {
            if (r11 != 0) goto L3
            goto L4b
        L3:
            int r0 = r11.length()
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L4b
            org.json.JSONObject r3 = r11.optJSONObject(r2)
            if (r3 == 0) goto L42
            java.lang.String r4 = "mainkey"
            int r6 = r3.optInt(r4)
            int[] r4 = new int[r1]
            java.lang.String r5 = "subkey"
            org.json.JSONArray r3 = r3.optJSONArray(r5)
            if (r3 == 0) goto L35
            int r4 = r3.length()
            int[] r5 = new int[r4]
            r7 = 0
        L28:
            if (r7 >= r4) goto L33
            int r8 = r3.optInt(r7)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L28
        L33:
            r7 = r5
            goto L36
        L35:
            r7 = r4
        L36:
            com.amap.api.col.3l.a2 r5 = new com.amap.api.col.3l.a2
            r8 = r12
            r9 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r15.add(r5)
            goto L45
        L42:
            r8 = r12
            r9 = r13
            r10 = r14
        L45:
            int r2 = r2 + 1
            r12 = r8
            r13 = r9
            r14 = r10
            goto L9
        L4b:
            return
    }

    private boolean s(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r10, byte[] r11) {
            r9 = this;
            r0 = 0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "UTF-8"
            r1.<init>(r11, r2)     // Catch: java.lang.Throwable -> L71
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L71
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r1 = 0
        Le:
            int r2 = r11.length()     // Catch: java.lang.Throwable -> L71
            if (r1 >= r2) goto L6f
            org.json.JSONObject r5 = r11.optJSONObject(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "featureType"
            java.lang.String r2 = r5.optString(r2)     // Catch: java.lang.Throwable -> L71
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L42
            java.lang.String r3 = "background"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L44
            java.lang.String r2 = "stylers"
            org.json.JSONObject r2 = r5.optJSONObject(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L42
            java.lang.String r3 = "color"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Throwable -> L71
            int r2 = b(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L42
            r9.a = r2     // Catch: java.lang.Throwable -> L71
        L42:
            r4 = r10
            goto L6b
        L44:
            java.lang.String r6 = com.amap.api.col.p0003l.c2.b(r2)     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L42
            java.lang.String[] r7 = com.amap.api.col.p0003l.c2.a(r2)     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L42
            int r2 = r7.length     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L42
            java.lang.String r2 = "elementType"
            java.lang.String r2 = r5.optString(r2)     // Catch: java.lang.Throwable -> L71
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L42
            int r8 = com.amap.api.col.p0003l.cx.a(r2)     // Catch: java.lang.Throwable -> L71
            r2 = -1
            if (r8 == r2) goto L42
            r3 = r9
            r4 = r10
            r3.q(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71
        L6b:
            int r1 = r1 + 1
            r10 = r4
            goto Le
        L6f:
            r10 = 1
            return r10
        L71:
            return r0
    }

    private com.amap.api.col.p0003l.f2 t(java.lang.String r1, boolean r2) {
            r0 = this;
            byte[] r1 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r1)     // Catch: java.lang.Throwable -> L9
            com.amap.api.col.3l.f2 r1 = r0.u(r1, r2)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    private com.amap.api.col.p0003l.f2 u(byte[] r3, boolean r4) {
            r2 = this;
            com.amap.api.col.3l.f2 r0 = new com.amap.api.col.3l.f2
            r0.<init>()
            java.util.Map r1 = r0.a()     // Catch: java.lang.Throwable -> L18
            boolean r1 = r2.s(r1, r3)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L12
            r2.k(r0, r3, r4)     // Catch: java.lang.Throwable -> L18
        L12:
            r2.j(r0)     // Catch: java.lang.Throwable -> L18
            r0.b()     // Catch: java.lang.Throwable -> L18
        L18:
            return r0
    }

    private java.util.List<com.amap.api.col.p0003l.a2> v() {
            r31 = this;
            r0 = r31
            java.lang.String r1 = "name"
            java.lang.String r2 = "subType"
            java.lang.String r3 = "styleMap"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f3133c = r4
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L187
            java.lang.String r5 = "[{\n\t\"regions\": {\n\t\t\"name\": \"区域面\",\n\t\t\"subType\": {\n\t\t\t\"land\": {\n\t\t\t\t\"name\": \"陆地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [1, 4, 5]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"green\": {\n\t\t\t\t\"name\": \"绿地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [3, 7, 8, 9, 10, 12]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"edu\": {\n\t\t\t\t\"name\": \"教育体育\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [3, 31]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"public\": {\n\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [4, 12, 22, 32]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"traffic\": {\n\t\t\t\t\"name\": \"交通枢纽\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [6, 14, 40]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 30004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"scenicSpot\": {\n\t\t\t\t\"name\": \"景区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [5, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"culture\": {\n\t\t\t\t\"name\": \"文化\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [7, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"health\": {\n\t\t\t\t\"name\": \"医疗卫生\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [8, 36]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"sports\": {\n\t\t\t\t\"name\": \"运动场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [9, 10, 13, 19, 20, 21, 34, 37, 39]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"business\": {\n\t\t\t\t\"name\": \"商业场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [11, 23, 24, 25, 26, 27, 28, 29, 30, 38]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"parkingLot\": {\n\t\t\t\t\"name\": \"停车场\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30003\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"water\": {\n\t\t\"name\": \"水系\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 30001,\n\t\t\t\"subkey\": [2, 6, 11, 13]\n\t\t}, {\n\t\t\t\"mainkey\": 20014\n\t\t}, {\n\t\t\t\"mainkey\": 10002,\n\t\t\t\"subkey\": [13]\n\t\t}]\n\t},\n\t\"buildings\": {\n\t\t\"name\": \"建筑物\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 50001\n\t\t}, {\n\t\t\t\"mainkey\": 50002\n\t\t}, {\n\t\t\t\"mainkey\": 50003\n\t\t}, {\n\t\t\t\"mainkey\": 50004\n\t\t}, {\n\t\t\t\"mainkey\": 30002,\n\t\t\t\"subkey\": [2, 15, 16, 17, 18]\n\t\t}]\n\t},\n\t\"roads\": {\n\t\t\"name\": \"道路\",\n\t\t\"subType\": {\n\t\t\t\"highWay\": {\n\t\t\t\t\"name\": \"高速公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20001\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"ringRoad\": {\n\t\t\t\t\"name\": \"城市环线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20002\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"nationalRoad\": {\n\t\t\t\t\"name\": \"国道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20003\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincialRoad\": {\n\t\t\t\t\"name\": \"省道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"secondaryRoad\": {\n\t\t\t\t\"name\": \"二级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20007\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelThreeRoad\": {\n\t\t\t\t\"name\": \"三级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20008\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelFourRoad\": {\n\t\t\t\t\"name\": \"四级道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20009\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"roadsBeingBuilt\": {\n\t\t\t\t\"name\": \"在建道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20018\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"railway\": {\n\t\t\t\t\"name\": \"铁路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"highSpeedRailway\": {\n\t\t\t\t\"name\": \"高铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [2]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subwayBeingBuilt\": {\n\t\t\t\t\"name\": \"在建地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015,\n\t\t\t\t\t\"subkey\": [1, 2]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20019\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"overPass\": {\n\t\t\t\t\"name\": \"天桥\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20012\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"underPass\": {\n\t\t\t\t\"name\": \"地道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20013\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"other\": {\n\t\t\t\t\"name\": \"其他线条\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20011\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20017\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20020\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20024\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20028\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"guideBoards\": {\n\t\t\t\t\"name\": \"道路路牌\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 40001\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"labels\": {\n\t\t\"name\": \"标注\",\n\t\t\"subType\": {\n\t\t\t\"pois\": {\n\t\t\t\t\"name\": \"兴趣点\",\n\t\t\t\t\"subType\": {\n\t\t\t\t\t\"hotel\": {\n\t\t\t\t\t\t\"name\": \"住宿\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 0,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [9, 133, 134, 135, 136, 155, 156, 157, 158, 159, 160, 161, 162, 186]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [31, 32, 33, 34, 35, 36, 37, 38, 39, 164, 165]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"restaurant\": {\n\t\t\t\t\t\t\"name\": \"餐饮\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 1,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [19, 20, 21, 22, 114, 115, 116, 117, 118, 119, 183, 187]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 166, 167, 168, 179, 180, 181, 203, 205, 206, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"shop\": {\n\t\t\t\t\t\t\"name\": \"购物\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 2,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [7, 8, 68, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 7, 8, 9, 10, 11, 12, 13, 175, 200, 201, 202, 204]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"scenicSpot\": {\n\t\t\t\t\t\t\"name\": \"风景名胜\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 3,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [4, 12, 14, 38, 69, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 120, 167, 171, 188, 189, 190, 191, 192]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10008\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 187, 188, 190, 192, 193, 194, 195, 196, 198, 216, 217, 218, 219, 220, 221, 223, 224, 225]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"traffic\": {\n\t\t\t\t\t\t\"name\": \"交通设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 4,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [23, 24, 25, 26, 31, 36, 148, 154, 168, 172, 175, 176, 177, 178]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [11, 16]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10009\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"bank\": {\n\t\t\t\t\t\t\"name\": \"金融保险\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 5,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [42, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 144, 145, 146, 147]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"edu\": {\n\t\t\t\t\t\t\"name\": \"科教文化\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 6,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [10, 11, 13, 35, 138, 139, 140, 141, 142, 143, 163, 164, 165, 166, 170]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [43, 44, 45, 46, 47, 176, 177]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"live\": {\n\t\t\t\t\t\t\"name\": \"生活服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 7,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [58, 63, 64, 65, 66, 67, 121, 122, 123]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [28, 29, 30]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"hospital\": {\n\t\t\t\t\t\t\"name\": \"医疗保健\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 8,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [32, 33, 57, 70, 131, 132, 169, 193, 206, 207, 208, 209, 210]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [170, 209]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pe\": {\n\t\t\t\t\t\t\"name\": \"休闲体育\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 9,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [15, 16, 17, 37, 60, 61, 62, 73, 124, 125, 126, 127, 128, 129, 130, 180, 181, 182, 184, 185, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [169, 171, 172, 173, 174, 178, 197, 207]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"public\": {\n\t\t\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 10,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [59, 173, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"buidling\": {\n\t\t\t\t\t\t\"name\": \"商务住宅\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 11,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 74, 75, 76, 77, 78, 79, 80, 81, 179]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [189, 191]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"gov\": {\n\t\t\t\t\t\t\"name\": \"政府机构及社会团体\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 12,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [3, 34, 43, 137]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"moto\": {\n\t\t\t\t\t\t\"name\": \"摩托车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 13,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [113]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"vehicle\": {\n\t\t\t\t\t\t\"name\": \"汽车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 14,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [39, 40, 41, 71, 72, 151, 152, 153]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [40, 41, 42, 182, 183, 184, 185, 186]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pass\": {\n\t\t\t\t\t\t\"name\": \"通行设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 15,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [27, 28, 149, 150, 174]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [21]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"subway\": {\n\t\t\t\t\t\t\"name\": \"地铁站\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 16,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10005\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10006\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"roadFacilities\": {\n\t\t\t\t\t\t\"name\": \"道路附属设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 17,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [2, 29, 30]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10017\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"address\": {\n\t\t\t\t\t\t\"name\": \"地名\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 18,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [18]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [10, 12, 14, 15, 23, 36]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"other\": {\n\t\t\t\t\t\t\"name\": \"其他\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 19,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [1, 211, 212]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [28]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [208, 210, 211, 212, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10010\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10011\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10012\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10013\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10014\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10015\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10016\n\t\t\t\t\t\t}]\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t},\n\t\t\t\"aois\": {\n\t\t\t\t\"name\": \"区域标注\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"continent\": {\n\t\t\t\t\"name\": \"大洲\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [20]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"country\": {\n\t\t\t\t\"name\": \"国家\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [18, 19, 29]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"province\": {\n\t\t\t\t\"name\": \"省/直辖市/自治区/特别行政区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [22, 26, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"city\": {\n\t\t\t\t\"name\": \"城市\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 5, 7, 24, 25, 27, 30, 31, 32, 34, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"district\": {\n\t\t\t\t\"name\": \"区县\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [6, 8, 37]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"town\": {\n\t\t\t\t\"name\": \"乡镇\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"village\": {\n\t\t\t\t\"name\": \"村庄\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [17]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"borders\": {\n\t\t\"name\": \"行政区边界\",\n\t\t\"subType\": {\n\t\t\t\"China\": {\n\t\t\t\t\"name\": \"中国国界\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [1, 2, 9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"foreign\": {\n\t\t\t\t\"name\": \"外国国界/停火线/主张线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [3, 4, 8, 10, 11]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincial\": {\n\t\t\t\t\"name\": \"省界线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [5, 6, 7, 12]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t}\n}]"
            r4.<init>(r5)     // Catch: org.json.JSONException -> L187
            int r5 = r4.length()     // Catch: org.json.JSONException -> L187
            if (r5 != 0) goto L1f
            java.util.List<com.amap.api.col.3l.a2> r1 = r0.f3133c     // Catch: org.json.JSONException -> L187
            return r1
        L1f:
            r5 = 0
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: org.json.JSONException -> L187
            if (r4 != 0) goto L29
            java.util.List<com.amap.api.col.3l.a2> r1 = r0.f3133c     // Catch: org.json.JSONException -> L187
            return r1
        L29:
            org.json.JSONArray r6 = r4.names()     // Catch: org.json.JSONException -> L187
            int r7 = r6.length()     // Catch: org.json.JSONException -> L187
            r8 = 0
        L32:
            if (r8 >= r7) goto L187
            java.lang.String r9 = r6.optString(r8)     // Catch: org.json.JSONException -> L187
            org.json.JSONObject r10 = r4.optJSONObject(r9)     // Catch: org.json.JSONException -> L187
            if (r10 == 0) goto L155
            java.lang.String r11 = r10.optString(r1)     // Catch: org.json.JSONException -> L187
            boolean r12 = r10.has(r3)     // Catch: org.json.JSONException -> L187
            if (r12 == 0) goto L60
            org.json.JSONArray r10 = r10.optJSONArray(r3)     // Catch: org.json.JSONException -> L187
            java.util.List<com.amap.api.col.3l.a2> r12 = r0.f3133c     // Catch: org.json.JSONException -> L187
            r13 = 0
            r(r10, r9, r13, r11, r12)     // Catch: org.json.JSONException -> L187
        L52:
            r24 = r1
            r19 = r2
            r16 = r4
            r18 = r6
            r17 = r7
            r20 = r8
            goto L162
        L60:
            boolean r12 = r10.has(r2)     // Catch: org.json.JSONException -> L187
            if (r12 == 0) goto L52
            org.json.JSONObject r10 = r10.optJSONObject(r2)     // Catch: org.json.JSONException -> L187
            if (r10 == 0) goto L155
            org.json.JSONArray r12 = r10.names()     // Catch: org.json.JSONException -> L187
            int r13 = r12.length()     // Catch: org.json.JSONException -> L187
            r14 = 0
        L75:
            if (r14 >= r13) goto L52
            java.lang.String r15 = r12.optString(r14)     // Catch: org.json.JSONException -> L187
            org.json.JSONObject r5 = r10.optJSONObject(r15)     // Catch: org.json.JSONException -> L187
            if (r5 == 0) goto L138
            r16 = r4
            java.lang.String r4 = r5.optString(r1)     // Catch: org.json.JSONException -> L187
            boolean r17 = r5.has(r3)     // Catch: org.json.JSONException -> L187
            r18 = r6
            java.lang.String r6 = "-"
            if (r17 == 0) goto Lb6
            org.json.JSONArray r5 = r5.optJSONArray(r3)     // Catch: org.json.JSONException -> L187
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L187
            r7.<init>()     // Catch: org.json.JSONException -> L187
            r7.append(r11)     // Catch: org.json.JSONException -> L187
            r7.append(r6)     // Catch: org.json.JSONException -> L187
            r7.append(r4)     // Catch: org.json.JSONException -> L187
            java.lang.String r4 = r7.toString()     // Catch: org.json.JSONException -> L187
            java.util.List<com.amap.api.col.3l.a2> r6 = r0.f3133c     // Catch: org.json.JSONException -> L187
            r(r5, r9, r15, r4, r6)     // Catch: org.json.JSONException -> L187
        Lae:
            r24 = r1
            r19 = r2
        Lb2:
            r20 = r8
            goto L144
        Lb6:
            r17 = r7
            boolean r7 = r5.has(r2)     // Catch: org.json.JSONException -> L187
            if (r7 == 0) goto Lae
            org.json.JSONObject r5 = r5.optJSONObject(r2)     // Catch: org.json.JSONException -> L187
            if (r5 == 0) goto Lae
            org.json.JSONArray r7 = r5.names()     // Catch: org.json.JSONException -> L187
            r19 = r2
            int r2 = r7.length()     // Catch: org.json.JSONException -> L187
            r20 = r8
            r8 = 0
        Ld1:
            if (r8 >= r2) goto L135
            r21 = r2
            java.lang.String r2 = r7.optString(r8)     // Catch: org.json.JSONException -> L187
            r22 = r7
            org.json.JSONObject r7 = r5.optJSONObject(r2)     // Catch: org.json.JSONException -> L187
            if (r7 == 0) goto L126
            r23 = r5
            java.lang.String r5 = r7.optString(r1)     // Catch: org.json.JSONException -> L187
            boolean r24 = r7.has(r3)     // Catch: org.json.JSONException -> L187
            if (r24 == 0) goto L123
            org.json.JSONArray r7 = r7.optJSONArray(r3)     // Catch: org.json.JSONException -> L187
            r24 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L187
            r1.<init>()     // Catch: org.json.JSONException -> L187
            r1.append(r15)     // Catch: org.json.JSONException -> L187
            r1.append(r6)     // Catch: org.json.JSONException -> L187
            r1.append(r2)     // Catch: org.json.JSONException -> L187
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L187
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L187
            r2.<init>()     // Catch: org.json.JSONException -> L187
            r2.append(r11)     // Catch: org.json.JSONException -> L187
            r2.append(r6)     // Catch: org.json.JSONException -> L187
            r2.append(r4)     // Catch: org.json.JSONException -> L187
            r2.append(r6)     // Catch: org.json.JSONException -> L187
            r2.append(r5)     // Catch: org.json.JSONException -> L187
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L187
            java.util.List<com.amap.api.col.3l.a2> r5 = r0.f3133c     // Catch: org.json.JSONException -> L187
            r(r7, r9, r1, r2, r5)     // Catch: org.json.JSONException -> L187
            goto L12a
        L123:
            r24 = r1
            goto L12a
        L126:
            r24 = r1
            r23 = r5
        L12a:
            int r8 = r8 + 1
            r2 = r21
            r7 = r22
            r5 = r23
            r1 = r24
            goto Ld1
        L135:
            r24 = r1
            goto L144
        L138:
            r24 = r1
            r19 = r2
            r16 = r4
            r18 = r6
            r17 = r7
            goto Lb2
        L144:
            int r14 = r14 + 1
            r4 = r16
            r7 = r17
            r6 = r18
            r2 = r19
            r8 = r20
            r1 = r24
            r5 = 0
            goto L75
        L155:
            r24 = r1
            r19 = r2
            r16 = r4
            r18 = r6
            r17 = r7
            r20 = r8
            goto L178
        L162:
            com.amap.api.col.3l.a2 r25 = new com.amap.api.col.3l.a2     // Catch: org.json.JSONException -> L187
            int[] r27 = com.amap.api.col.p0003l.d2.f3131d     // Catch: org.json.JSONException -> L187
            java.lang.String r28 = "roads"
            java.lang.String r29 = "trafficRoadBackgroundColor"
            r30 = 0
            r26 = 20021(0x4e35, float:2.8055E-41)
            r25.<init>(r26, r27, r28, r29, r30)     // Catch: org.json.JSONException -> L187
            r1 = r25
            java.util.List<com.amap.api.col.3l.a2> r2 = r0.f3133c     // Catch: org.json.JSONException -> L187
            r2.add(r1)     // Catch: org.json.JSONException -> L187
        L178:
            int r8 = r20 + 1
            r4 = r16
            r7 = r17
            r6 = r18
            r2 = r19
            r1 = r24
            r5 = 0
            goto L32
        L187:
            java.util.List<com.amap.api.col.3l.a2> r1 = r0.f3133c
            return r1
    }

    public final int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final com.amap.api.col.p0003l.f2 d(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto L10
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            com.amap.api.col.3l.f2 r2 = r1.t(r2, r3)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final com.amap.api.col.p0003l.f2 e(byte[] r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto Lb
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lb
        L6:
            com.amap.api.col.3l.f2 r2 = r1.u(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public final void i(int r1) {
            r0 = this;
            r0.f3132b = r1
            return
    }
}
