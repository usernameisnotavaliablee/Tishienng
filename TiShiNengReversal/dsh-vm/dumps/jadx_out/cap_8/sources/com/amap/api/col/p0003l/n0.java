package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.amap.api.col.p0003l.hk(a = "update_item", b = true)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n0 extends com.amap.api.col.p0003l.q0 {
    private java.lang.String n;
    private android.content.Context o;

    public n0() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.n = r0
            return
    }

    public n0(com.amap.api.maps.offlinemap.OfflineMapCity r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.n = r0
            r2.o = r4
            java.lang.String r4 = r3.getCity()
            r2.a = r4
            java.lang.String r4 = r3.getAdcode()
            r2.f3799c = r4
            java.lang.String r4 = r3.getUrl()
            r2.f3798b = r4
            long r0 = r3.getSize()
            r2.f3803g = r0
            java.lang.String r4 = r3.getVersion()
            r2.f3801e = r4
            java.lang.String r4 = r3.getCode()
            r2.f3807k = r4
            r4 = 0
            r2.f3805i = r4
            int r4 = r3.getState()
            r2.l = r4
            int r4 = r3.getcompleteCode()
            r2.f3806j = r4
            java.lang.String r3 = r3.getPinyin()
            r2.m = r3
            r2.p()
            return
    }

    public n0(com.amap.api.maps.offlinemap.OfflineMapProvince r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.n = r0
            r2.o = r4
            java.lang.String r4 = r3.getProvinceName()
            r2.a = r4
            java.lang.String r4 = r3.getProvinceCode()
            r2.f3799c = r4
            java.lang.String r4 = r3.getUrl()
            r2.f3798b = r4
            long r0 = r3.getSize()
            r2.f3803g = r0
            java.lang.String r4 = r3.getVersion()
            r2.f3801e = r4
            r4 = 1
            r2.f3805i = r4
            int r4 = r3.getState()
            r2.l = r4
            int r4 = r3.getcompleteCode()
            r2.f3806j = r4
            java.lang.String r3 = r3.getPinyin()
            r2.m = r3
            r2.p()
            return
    }

    private static java.lang.String l(org.json.JSONObject r3, java.lang.String r4) throws org.json.JSONException {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r1 = r3.has(r4)
            if (r1 == 0) goto L20
            java.lang.String r1 = "[]"
            java.lang.String r2 = r3.getString(r4)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L20
            java.lang.String r3 = r3.optString(r4)
            java.lang.String r3 = r3.trim()
            return r3
        L20:
            return r0
    }

    private void p() {
            r2 = this;
            android.content.Context r0 = r2.o
            java.lang.String r0 = com.amap.api.col.p0003l.b3.f0(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r2.m
            r1.append(r0)
            java.lang.String r0 = ".zip.tmp"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.f3800d = r0
            return
    }

    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public final void m(java.lang.String r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public final void n() {
            r7 = this;
            java.lang.String r0 = "UpdateItem"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "title"
            java.lang.String r4 = r7.a     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "code"
            java.lang.String r4 = r7.f3799c     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "url"
            java.lang.String r4 = r7.f3798b     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "fileName"
            java.lang.String r4 = r7.f3800d     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "lLocalLength"
            long r4 = r7.f3802f     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "lRemoteLength"
            long r4 = r7.f3803g     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "mState"
            int r4 = r7.l     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "version"
            java.lang.String r4 = r7.f3801e     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "localPath"
            java.lang.String r4 = r7.f3804h     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r7.n     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.String r4 = "vMapFileNames"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r1 = move-exception
            goto Lc6
        L57:
            java.lang.String r3 = "isSheng"
            int r4 = r7.f3805i     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "mCompleteCode"
            int r4 = r7.f3806j     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "mCityCode"
            java.lang.String r4 = r7.f3807k     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "pinyin"
            java.lang.String r4 = r7.m     // Catch: java.lang.Throwable -> L55
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "file"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L55
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r7.f3800d     // Catch: java.lang.Throwable -> L55
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = ".dt"
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L55
            r2.delete()     // Catch: java.lang.Throwable -> L55
            r3 = 0
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb4
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb4
            r6 = 1
            r5.<init>(r2, r6)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb4
            java.lang.String r2 = "utf-8"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> Lb2 java.io.IOException -> Lb4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Laf
            r4.write(r1)     // Catch: java.lang.Throwable -> Lac java.io.IOException -> Laf
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> Lbf
            return
        Lac:
            r1 = move-exception
            r3 = r4
            goto Lc0
        Laf:
            r1 = move-exception
            r3 = r4
            goto Lb5
        Lb2:
            r1 = move-exception
            goto Lc0
        Lb4:
            r1 = move-exception
        Lb5:
            java.lang.String r2 = "saveJSONObjectToFile"
            com.amap.api.col.p0003l.w5.p(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto Lbf
            r3.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> Lbf
        Lbf:
            return
        Lc0:
            if (r3 == 0) goto Lc5
            r3.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> Lc5
        Lc5:
            throw r1     // Catch: java.lang.Throwable -> L55
        Lc6:
            java.lang.String r2 = "saveJSONObjectToFile parseJson"
            com.amap.api.col.p0003l.w5.p(r1, r0, r2)
            return
    }

    public final void o(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            if (r4 == 0) goto Lb5
            boolean r1 = r0.equals(r4)     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lc
            goto Lb5
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "file"
            org.json.JSONObject r4 = r1.getJSONObject(r4)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L1b
            goto Lb5
        L1b:
            java.lang.String r1 = "title"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.a = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "code"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3799c = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "url"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3798b = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "fileName"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3800d = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "lLocalLength"
            long r1 = r4.optLong(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3802f = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "lRemoteLength"
            long r1 = r4.optLong(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3803g = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "mState"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> Lad
            r3.l = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "version"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3801e = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "localPath"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3804h = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "vMapFileNames"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.n = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "isSheng"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3805i = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "mCompleteCode"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3806j = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "mCityCode"
            java.lang.String r1 = r4.optString(r1)     // Catch: java.lang.Throwable -> Lad
            r3.f3807k = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "pinyin"
            java.lang.String r4 = l(r4, r1)     // Catch: java.lang.Throwable -> Lad
            r3.m = r4     // Catch: java.lang.Throwable -> Lad
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto Lb5
            java.lang.String r4 = r3.f3798b     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "/"
            int r0 = r4.lastIndexOf(r0)     // Catch: java.lang.Throwable -> Lad
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "."
            int r0 = r4.lastIndexOf(r0)     // Catch: java.lang.Throwable -> Lad
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)     // Catch: java.lang.Throwable -> Lad
            r3.m = r4     // Catch: java.lang.Throwable -> Lad
            return
        Lad:
            r4 = move-exception
            java.lang.String r0 = "UpdateItem"
            java.lang.String r1 = "readFileToJSONObject"
            com.amap.api.col.p0003l.w5.p(r4, r0, r1)
        Lb5:
            return
    }
}
