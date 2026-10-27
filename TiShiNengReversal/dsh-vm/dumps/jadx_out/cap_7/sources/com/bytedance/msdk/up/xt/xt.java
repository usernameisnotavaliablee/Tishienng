package com.bytedance.msdk.up.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt implements com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> {
    public static volatile boolean j = false;
    private static volatile boolean xt = true;
    private int cw;
    private int r;

    static {
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cw = r0
            r1.r = r0
            return
    }

    private org.json.JSONObject cw(java.util.List<com.bytedance.msdk.up.j> r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "http_user_agent"
            java.lang.String r2 = com.bytedance.msdk.tl.x.h()     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "client_ip"
            java.lang.String r2 = com.bytedance.msdk.tl.x.f()     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = "header"
            org.json.JSONObject r2 = com.bytedance.msdk.tl.v.xt()     // Catch: org.json.JSONException -> L3b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L3b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L3b
            r1.<init>()     // Catch: org.json.JSONException -> L3b
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> L3b
        L29:
            boolean r2 = r4.hasNext()     // Catch: org.json.JSONException -> L3b
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r4.next()     // Catch: org.json.JSONException -> L3b
            com.bytedance.msdk.up.j r2 = (com.bytedance.msdk.up.j) r2     // Catch: org.json.JSONException -> L3b
            org.json.JSONObject r2 = r2.xt     // Catch: org.json.JSONException -> L3b
            r1.put(r2)     // Catch: org.json.JSONException -> L3b
            goto L29
        L3b:
            r4 = move-exception
            goto L53
        L3d:
            java.lang.String r4 = "event_v3"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L3b
            java.lang.String r4 = "magic_tag"
            java.lang.String r1 = "ss_app_log"
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L3b
            java.lang.String r4 = "_gen_time"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L3b
            r0.put(r4, r1)     // Catch: org.json.JSONException -> L3b
            return r0
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "exception: "
            r1.<init>(r2)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "getAdEventV3Json"
            j(r2, r1)
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r0
    }

    private com.bytedance.msdk.up.up j(java.lang.String r5, byte[] r6) {
            r4 = this;
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j()
            com.bytedance.sdk.component.g.j r0 = r0.xt()
            com.bytedance.sdk.component.g.xt.up r0 = r0.xt()
            r0.j(r5)
            com.bytedance.msdk.core.j r5 = com.bytedance.msdk.core.j.qv()
            java.lang.String r5 = r5.tl()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L29
            java.lang.String r1 = "X-Tt-Env"
            r0.xt(r1, r5)
            java.lang.String r5 = "x-use-ppe"
            java.lang.String r1 = "1"
            r0.xt(r5, r1)
        L29:
            java.lang.String r5 = "User-Agent"
            java.lang.String r1 = com.bytedance.msdk.xt.xt.j
            r0.xt(r5, r1)
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r1 = "union_sdk_encode"
            r0.xt(r5, r1)
            java.lang.String r5 = "application/json; charset=utf-8"
            r0.j(r5, r6)
            com.bytedance.sdk.component.g.xt r5 = r0.j()
            r6 = 1
            r0 = 0
            if (r5 == 0) goto L8d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            java.lang.String r2 = r5.r()     // Catch: org.json.JSONException -> L55
            r1.<init>(r2)     // Catch: org.json.JSONException -> L55
            boolean r1 = r4.j(r1)     // Catch: org.json.JSONException -> L55
            if (r1 == 0) goto L8d
            r1 = 1
            goto L8e
        L55:
            r1 = move-exception
            int r2 = r4.r
            int r3 = r2 + 1
            r4.r = r3
            r3 = 20
            if (r2 >= r3) goto L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "exception: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "doUploadApplogAdEventV3"
            j(r3, r2)
        L73:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ignore:"
            r2.<init>(r3)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "uploadEvent"
            com.bytedance.msdk.j.up.cw.r(r3, r2)
            com.bytedance.sdk.component.utils.vl.j(r1)
        L8d:
            r1 = 0
        L8e:
            if (r5 == 0) goto L95
            int r2 = r5.j()
            goto L96
        L95:
            r2 = 0
        L96:
            if (r1 != 0) goto L9f
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L9f
            java.lang.String r5 = "server say not success"
            goto Lc6
        L9f:
            if (r5 == 0) goto Lc3
            java.lang.String r6 = r5.xt()
            if (r1 != 0) goto Lc1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = "::"
            r3.append(r6)
            java.lang.String r5 = r5.r()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
        Lbf:
            r6 = 0
            goto Lc6
        Lc1:
            r5 = r6
            goto Lbf
        Lc3:
            java.lang.String r5 = "error unknown"
            goto Lbf
        Lc6:
            com.bytedance.msdk.up.up r0 = new com.bytedance.msdk.up.up
            r0.<init>(r1, r2, r5, r6)
            return r0
    }

    private com.bytedance.msdk.up.up j(java.lang.String r4, byte[] r5, boolean r6) {
            r3 = this;
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j()
            com.bytedance.sdk.component.g.j r0 = r0.xt()
            com.bytedance.sdk.component.g.xt.up r0 = r0.xt()
            r0.j(r4)
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()
            java.lang.String r4 = r4.tl()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L29
            java.lang.String r1 = "X-Tt-Env"
            r0.xt(r1, r4)
            java.lang.String r4 = "x-use-ppe"
            java.lang.String r1 = "1"
            r0.xt(r4, r1)
        L29:
            if (r6 == 0) goto L3c
            java.lang.String r4 = "x-pglcypher"
            java.lang.String r6 = "4"
            r0.xt(r4, r6)
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "union_sdk_encode"
            r0.xt(r4, r6)
            java.lang.String r4 = "application/octet-stream"
            goto L3e
        L3c:
            java.lang.String r4 = "application/octet-stream;tt-data=a"
        L3e:
            java.lang.String r6 = "User-Agent"
            java.lang.String r1 = com.bytedance.msdk.xt.xt.j
            r0.xt(r6, r1)
            r0.j(r4, r5)
            com.bytedance.sdk.component.g.xt r4 = r0.j()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L99
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = r4.r()     // Catch: org.json.JSONException -> L61
            r0.<init>(r1)     // Catch: org.json.JSONException -> L61
            boolean r0 = r3.j(r0)     // Catch: org.json.JSONException -> L61
            if (r0 == 0) goto L99
            r0 = 1
            goto L9a
        L61:
            r0 = move-exception
            int r1 = r3.r
            int r2 = r1 + 1
            r3.r = r2
            r2 = 20
            if (r1 >= r2) goto L7f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "exception: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "doUploadApplogAdEvent"
            j(r2, r1)
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ignore:"
            r1.<init>(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "uploadEvent"
            com.bytedance.msdk.j.up.cw.r(r2, r1)
            com.bytedance.sdk.component.utils.vl.j(r0)
        L99:
            r0 = 0
        L9a:
            if (r4 == 0) goto La1
            int r1 = r4.j()
            goto La2
        La1:
            r1 = 0
        La2:
            if (r0 != 0) goto Lab
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto Lab
            java.lang.String r4 = "server say not success"
            goto Ld2
        Lab:
            if (r4 == 0) goto Lcf
            java.lang.String r5 = r4.xt()
            if (r0 != 0) goto Lcd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "::"
            r2.append(r5)
            java.lang.String r4 = r4.r()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        Lcb:
            r5 = 0
            goto Ld2
        Lcd:
            r4 = r5
            goto Lcb
        Lcf:
            java.lang.String r4 = "error unknown"
            goto Lcb
        Ld2:
            com.bytedance.msdk.up.up r6 = new com.bytedance.msdk.up.up
            r6.<init>(r0, r1, r4, r5)
            return r6
    }

    private java.lang.String j(boolean r3) {
            r2 = this;
            boolean r0 = com.bytedance.msdk.up.xt.xt.xt
            r1 = 0
            if (r0 == 0) goto La
            com.bytedance.msdk.up.xt.xt.xt = r1
            java.lang.String r3 = "1"
            return r3
        La:
            boolean r0 = com.bytedance.msdk.up.xt.xt.j
            if (r0 == 0) goto L13
            com.bytedance.msdk.up.xt.xt.j = r1
            java.lang.String r3 = "4"
            return r3
        L13:
            if (r3 == 0) goto L18
            java.lang.String r3 = "3"
            return r3
        L18:
            java.lang.String r3 = "2"
            return r3
    }

    public static void j(java.lang.String r4, java.lang.String r5) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1f
            r0.putOpt(r1, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "v3_Id"
            r0.putOpt(r1, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "v3_err_msg"
            r0.putOpt(r4, r5)     // Catch: java.lang.Throwable -> L1f
            com.bytedance.msdk.tl.l.j(r0)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    private boolean j(org.json.JSONObject r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1f
            java.lang.String r1 = "code"
            int r1 = r4.optInt(r1)     // Catch: java.lang.Throwable -> L1f
            r2 = 20000(0x4e20, float:2.8026E-41)
            if (r1 == r2) goto L1d
            java.lang.String r1 = "success"
            java.lang.String r2 = "message"
            java.lang.String r4 = r4.optString(r2)     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            r4 = 1
            return r4
        L1f:
            return r0
    }

    private byte[] j(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L6
            byte[] r3 = new byte[r0]     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r3
        L6:
            java.lang.String r1 = "utf-8"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r3
        Ld:
            byte[] r3 = new byte[r0]
            return r3
    }

    private byte[] j(java.util.List<com.bytedance.msdk.up.j> r3, boolean r4) {
            r2 = this;
            byte[] r3 = r2.xt(r3)
            java.lang.String r0 = "buildAdEventV3Body"
            if (r3 != 0) goto Le
            java.lang.String r1 = "zipData is null"
            j(r0, r1)
            goto L16
        Le:
            int r1 = r3.length
            if (r1 > 0) goto L16
            java.lang.String r1 = "zipData len 0"
            j(r0, r1)
        L16:
            if (r4 == 0) goto L21
            com.bytedance.sdk.component.panglearmor.g r4 = com.bytedance.sdk.component.panglearmor.g.j()
            byte[] r3 = r4.j(r3)
            goto L26
        L21:
            int r4 = r3.length
            byte[] r3 = r2.j(r3, r4)
        L26:
            if (r3 != 0) goto L2e
            java.lang.String r4 = "data is null"
            j(r0, r4)
            return r3
        L2e:
            int r4 = r3.length
            if (r4 > 0) goto L36
            java.lang.String r4 = "data len 0"
            j(r0, r4)
        L36:
            return r3
    }

    private byte[] j(byte[] r4, int r5) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "encrypt"
            if (r4 == 0) goto L12
            if (r5 <= 0) goto L12
            int r2 = r4.length     // Catch: java.lang.Throwable -> L10
            if (r2 == r5) goto Lb
            goto L12
        Lb:
            byte[] r4 = com.bytedance.msdk.tl.az.j(r4, r5)     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r4 = move-exception
            goto L2b
        L12:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "inputData is "
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L1e
            java.lang.String r4 = "null"
            goto L20
        L1e:
            java.lang.String r4 = "0"
        L20:
            r5.append(r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L10
            j(r1, r4)     // Catch: java.lang.Throwable -> L10
            return r0
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "exception: "
            r5.<init>(r2)
            java.lang.String r2 = r4.toString()
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            j(r1, r5)
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r0
    }

    private byte[] r(java.util.List<com.bytedance.msdk.up.j> r3) {
            r2 = this;
            org.json.JSONObject r3 = r2.cw(r3)     // Catch: java.lang.Throwable -> L11
            org.json.JSONObject r3 = com.bytedance.msdk.tl.cw.j(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11
            byte[] r3 = r2.j(r3)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "exception: "
            r0.<init>(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "buildAdEventV3Body2"
            j(r1, r0)
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = 0
            return r3
    }

    private byte[] xt(java.util.List<com.bytedance.msdk.up.j> r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L66
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto La
            goto L66
        La:
            org.json.JSONObject r6 = r5.cw(r6)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2)
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r2.write(r6)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r2.close()     // Catch: java.io.IOException -> L29
            goto L56
        L29:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            goto L56
        L2e:
            r6 = move-exception
            r0 = r2
            goto L5b
        L31:
            r6 = move-exception
            r0 = r2
            goto L37
        L34:
            r6 = move-exception
            goto L5b
        L36:
            r6 = move-exception
        L37:
            java.lang.String r2 = "buildAdEventV3BodyRaw"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "exception: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L34
            r3.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L34
            j(r2, r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L56
            r0.close()     // Catch: java.io.IOException -> L29
        L56:
            byte[] r6 = r1.toByteArray()
            return r6
        L5b:
            if (r0 == 0) goto L65
            r0.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L65:
            throw r6
        L66:
            return r0
    }

    @Override // com.bytedance.msdk.up.xt.j
    public com.bytedance.msdk.up.up j(java.util.List<com.bytedance.msdk.up.j> r14) {
            r13 = this;
            long r1 = android.os.SystemClock.elapsedRealtime()
            if (r14 == 0) goto Lda
            r3 = 0
            r4 = 1
            boolean r0 = r14.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L10
            goto Lda
        L10:
            java.lang.String r0 = "TTMediationSDK"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "--==-- v3: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            int r6 = r14.size()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.j.up.cw.xt(r0, r5)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r13.j()     // Catch: java.lang.Throwable -> L3d
            byte[] r5 = r13.j(r14, r0)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L40
            int r6 = r5.length     // Catch: java.lang.Throwable -> L3d
            if (r6 <= 0) goto L40
            java.lang.String r6 = com.bytedance.msdk.core.cw.xt()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.up.up r0 = r13.j(r6, r5, r0)     // Catch: java.lang.Throwable -> L3d
            goto L4c
        L3d:
            r0 = move-exception
            r14 = r0
            goto L88
        L40:
            byte[] r0 = r13.r(r14)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = com.bytedance.msdk.core.cw.xt()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.up.up r0 = r13.j(r5, r0)     // Catch: java.lang.Throwable -> L3d
        L4c:
            int r5 = r14.size()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.core.ws.cw r6 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L3d
            int r6 = r6.s()     // Catch: java.lang.Throwable -> L3d
            if (r5 < r6) goto L5b
            goto L5c
        L5b:
            r4 = 0
        L5c:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3d
            long r10 = r5 - r1
            boolean r7 = r0.j     // Catch: java.lang.Throwable -> L3d
            int r8 = r14.size()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = r13.j(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r14.<init>()     // Catch: java.lang.Throwable -> L3d
            int r5 = r0.xt     // Catch: java.lang.Throwable -> L3d
            r14.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "::"
            r14.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r0.cw     // Catch: java.lang.Throwable -> L3d
            r14.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r12 = r14.toString()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.msdk.tl.l.j(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L3d
            return r0
        L88:
            int r0 = r13.cw
            int r5 = r0 + 1
            r13.cw = r5
            r5 = 20
            if (r0 >= r5) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "exception: "
            r0.<init>(r5)
            java.lang.String r5 = r14.toString()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "uploadEvent"
            j(r5, r0)
        La9:
            java.lang.String r0 = "ReportNetApiImpl"
            java.lang.String r5 = "uploadEvent error:"
            com.bytedance.msdk.j.up.cw.r(r0, r5)
            com.bytedance.sdk.component.utils.vl.j(r14)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r10 = r5 - r1
            java.lang.String r9 = r13.j(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-1::"
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r12 = r0.toString()
            r7 = 0
            r8 = 0
            com.bytedance.msdk.tl.l.j(r7, r8, r9, r10, r12)
            com.bytedance.msdk.up.up r14 = new com.bytedance.msdk.up.up
            r0 = 509(0x1fd, float:7.13E-43)
            java.lang.String r1 = "service_busy"
            r14.<init>(r3, r0, r1, r3)
            return r14
        Lda:
            r14 = 0
            return r14
    }

    @Override // com.bytedance.msdk.up.xt.j
    public boolean j() {
            r1 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.xt()
            if (r0 != 0) goto L12
            boolean r0 = com.bytedance.sdk.component.panglearmor.g.xt()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
