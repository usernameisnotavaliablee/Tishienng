package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v extends com.amap.api.col.s.a3<java.lang.String, java.lang.String> {
    private java.lang.String t;

    public v(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.t = r2
            return
    }

    private static java.lang.String i(java.lang.String r3) throws com.amap.api.services.core.AMapException {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L72
            r0.<init>(r3)     // Catch: org.json.JSONException -> L72
            java.lang.String r3 = "code"
            java.lang.String r3 = com.amap.api.col.s.r4.v(r0, r3)     // Catch: org.json.JSONException -> L72
            java.lang.String r1 = "message"
            java.lang.String r1 = com.amap.api.col.s.r4.v(r0, r1)     // Catch: org.json.JSONException -> L72
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r3)     // Catch: org.json.JSONException -> L72
            if (r2 == 0) goto L20
            java.lang.String r3 = "transfer_url"
            java.lang.String r3 = com.amap.api.col.s.r4.v(r0, r3)     // Catch: org.json.JSONException -> L72
            return r3
        L20:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L72
            r2 = 0
            if (r0 != 0) goto L6a
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L72
            if (r0 != 0) goto L62
            java.lang.String r0 = "3"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L72
            if (r0 != 0) goto L5a
            java.lang.String r0 = "4"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L72
            if (r0 != 0) goto L52
            java.lang.String r0 = "5"
            boolean r3 = r0.equals(r3)     // Catch: org.json.JSONException -> L72
            if (r3 != 0) goto L4a
            goto L7a
        L4a:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L72
            java.lang.String r0 = "短串分享认证失败"
            r3.<init>(r0, r2, r1)     // Catch: org.json.JSONException -> L72
            throw r3     // Catch: org.json.JSONException -> L72
        L52:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L72
            java.lang.String r0 = "用户签名未通过"
            r3.<init>(r0, r2, r1)     // Catch: org.json.JSONException -> L72
            throw r3     // Catch: org.json.JSONException -> L72
        L5a:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L72
            java.lang.String r0 = "请求参数非法"
            r3.<init>(r0, r2, r1)     // Catch: org.json.JSONException -> L72
            throw r3     // Catch: org.json.JSONException -> L72
        L62:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L72
            java.lang.String r0 = "短串请求失败"
            r3.<init>(r0, r2, r1)     // Catch: org.json.JSONException -> L72
            throw r3     // Catch: org.json.JSONException -> L72
        L6a:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L72
            java.lang.String r0 = "其他未知错误"
            r3.<init>(r0, r2, r1)     // Catch: org.json.JSONException -> L72
            throw r3     // Catch: org.json.JSONException -> L72
        L72:
            r3 = move-exception
            java.lang.String r0 = "ShareUrlSearchHandler"
            java.lang.String r1 = "paseJSON"
            com.amap.api.col.s.j4.i(r3, r0, r1)
        L7a:
            r3 = 0
            return r3
    }

    @Override // com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.String I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            java.lang.String r1 = i(r1)
            return r1
    }

    @Override // com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r1 = this;
            java.lang.String r0 = com.amap.api.col.s.i4.h()
            return r0
    }

    @Override // com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r4 = this;
            java.lang.String r0 = "utf-8"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "channel=open_api&flag=1"
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "&address="
            r2.<init>(r3)
            java.lang.String r3 = r4.t
            java.lang.String r3 = java.net.URLEncoder.encode(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "open_api1"
            r2.append(r3)
            java.lang.String r3 = r4.t
            r2.append(r3)
            java.lang.String r3 = "@8UbJH6N2szojnTHONAWzB6K7N1kaj7Y0iUMarxac"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.amap.api.col.s.g1.a(r2)
            java.lang.String r3 = "&sign="
            r1.append(r3)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            r1.append(r2)
            java.lang.String r2 = "&output=json"
            r1.append(r2)
            java.lang.String r1 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L65
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L65
            java.lang.String r2 = "Yaynpa84IKOfasFx"
            byte[] r0 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L65
            byte[] r0 = com.amap.api.col.s.g0.a(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L65
            goto L6e
        L65:
            r0 = move-exception
            java.lang.String r1 = "ShareUrlSearchHandler"
            java.lang.String r2 = "getParams"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            r0 = 0
        L6e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "ent"
            java.lang.String r3 = "2"
            r1.put(r2, r3)
            java.lang.String r2 = "in"
            java.lang.String r0 = com.amap.api.col.s.d1.f(r0)
            r1.put(r2, r0)
            java.lang.String r0 = "keyt"
            java.lang.String r2 = "openapi"
            r1.put(r0, r2)
            return r1
    }
}
