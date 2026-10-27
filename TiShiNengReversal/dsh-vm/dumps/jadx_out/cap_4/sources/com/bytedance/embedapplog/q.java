package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class q {
    public static final java.lang.String[] cw = null;
    public static org.json.JSONObject j;

    /* renamed from: r, reason: collision with root package name */
    private static final java.lang.String[] f2094r = null;
    private static final java.lang.String[] up = null;
    static final java.lang.String[] xt = null;

    static {
            java.lang.String r0 = "GET"
            java.lang.String r1 = "POST"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.bytedance.embedapplog.q.f2094r = r0
            java.lang.String r0 = "aid"
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "tt_data"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.bytedance.embedapplog.q.up = r0
            java.lang.String r9 = "iid"
            java.lang.String r10 = "device_platform"
            java.lang.String r3 = "aid"
            java.lang.String r4 = "version_code"
            java.lang.String r5 = "ab_client"
            java.lang.String r6 = "ab_version"
            java.lang.String r7 = "ab_feature"
            java.lang.String r8 = "ab_group"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10}
            com.bytedance.embedapplog.q.xt = r0
            java.lang.String r0 = "device_platform"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            com.bytedance.embedapplog.q.cw = r0
            return
    }

    public q() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject cw(java.lang.String r2, org.json.JSONObject r3) {
            java.lang.String r3 = r3.toString()
            byte[] r3 = com.bytedance.embedapplog.pz.j(r3)
            r0 = 1
            r1 = 0
            java.lang.String r2 = j(r0, r2, r1, r3)
            if (r2 == 0) goto L1a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r3.<init>(r2)     // Catch: org.json.JSONException -> L16
            goto L1b
        L16:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L1a:
            r3 = r1
        L1b:
            if (r3 == 0) goto L34
            java.lang.String r2 = "message"
            java.lang.String r0 = ""
            java.lang.String r2 = r3.optString(r2, r0)
            java.lang.String r0 = "success"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L34
            java.lang.String r2 = "data"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            return r2
        L34:
            return r1
    }

    public static int j(java.lang.String[] r8, byte[] r9, com.bytedance.embedapplog.rn r10) {
            java.lang.String r10 = "server_time"
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            boolean r1 = com.bytedance.embedapplog.j.ae()
            java.lang.String r2 = "Content-Type"
            if (r1 == 0) goto L16
            java.lang.String r1 = "application/octet-stream;tt-data=a"
            r0.put(r2, r1)
            goto L1b
        L16:
            java.lang.String r1 = "application/json; charset=utf-8"
            r0.put(r2, r1)
        L1b:
            int r1 = r8.length
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = 0
        L20:
            if (r4 >= r1) goto L32
            r5 = r8[r4]
            r6 = 1
            java.lang.String r5 = j(r6, r5, r0, r9)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L32
            int r4 = r4 + 1
            goto L20
        L32:
            r8 = 200(0xc8, float:2.8E-43)
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> L7e
            if (r9 != 0) goto L81
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7e
            r9.<init>(r5)     // Catch: org.json.JSONException -> L7e
            java.lang.String r0 = "http_code"
            int r0 = r9.optInt(r0)     // Catch: org.json.JSONException -> L71
            if (r0 != r8) goto L87
            java.lang.String r0 = "ss_app_log"
            java.lang.String r1 = "magic_tag"
            java.lang.String r1 = r9.optString(r1)     // Catch: org.json.JSONException -> L71
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L71
            if (r0 == 0) goto L73
            java.lang.String r0 = "success"
            java.lang.String r1 = "message"
            java.lang.String r1 = r9.optString(r1)     // Catch: org.json.JSONException -> L71
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L71
            if (r0 == 0) goto L66
            r0 = 200(0xc8, float:2.8E-43)
            goto L87
        L66:
            java.lang.String r0 = "101"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L71
            int r0 = r0.intValue()     // Catch: org.json.JSONException -> L71
            goto L87
        L71:
            r0 = move-exception
            goto L83
        L73:
            java.lang.String r0 = "102"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L71
            int r0 = r0.intValue()     // Catch: org.json.JSONException -> L71
            goto L87
        L7e:
            r0 = move-exception
            r9 = r2
            goto L83
        L81:
            r9 = r2
            goto L86
        L83:
            com.bytedance.embedapplog.uc.xt(r0)
        L86:
            r0 = 0
        L87:
            if (r0 != r8) goto L101
            long r4 = r9.optLong(r10)     // Catch: java.lang.Exception -> Laa
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lae
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            r8.<init>()     // Catch: java.lang.Exception -> Laa
            r8.put(r10, r4)     // Catch: java.lang.Exception -> Laa
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Laa
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            java.lang.String r10 = "local_time"
            r8.put(r10, r4)     // Catch: java.lang.Exception -> Laa
            com.bytedance.embedapplog.q.j = r8     // Catch: java.lang.Exception -> Laa
            goto Lae
        Laa:
            r8 = move-exception
            com.bytedance.embedapplog.uc.xt(r8)
        Lae:
            java.lang.String r8 = "blacklist"
            org.json.JSONObject r8 = r9.optJSONObject(r8)
            if (r8 == 0) goto L101
            java.lang.String r9 = "v1"
            org.json.JSONArray r9 = r8.optJSONArray(r9)
            if (r9 == 0) goto Lc3
            int r10 = r9.length()
            goto Lc4
        Lc3:
            r10 = 0
        Lc4:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r10)
            r4 = 0
        Lca:
            if (r4 >= r10) goto Ldc
            java.lang.String r5 = r9.optString(r4, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Ld9
            r1.add(r5)
        Ld9:
            int r4 = r4 + 1
            goto Lca
        Ldc:
            java.lang.String r9 = "v3"
            org.json.JSONArray r8 = r8.optJSONArray(r9)
            if (r8 == 0) goto Le9
            int r9 = r8.length()
            goto Lea
        Le9:
            r9 = 0
        Lea:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>(r9)
        Lef:
            if (r3 >= r9) goto L101
            java.lang.String r1 = r8.optString(r3, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto Lfe
            r10.add(r1)
        Lfe:
            int r3 = r3 + 1
            goto Lef
        L101:
            return r0
    }

    public static java.lang.String j(int r7, java.lang.String r8, java.util.HashMap<java.lang.String, java.lang.String> r9, byte[] r10) {
            java.lang.String r0 = "gzip"
            boolean r1 = com.bytedance.embedapplog.uc.xt
            r2 = 0
            if (r1 == 0) goto L7c
            java.lang.String r1 = "http: "
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r1 = r1.concat(r3)
            com.bytedance.embedapplog.uc.j(r1, r2)
            if (r9 == 0) goto L68
            java.util.Set r1 = r9.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L1e
            java.lang.Object r4 = r3.getValue()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L1e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "http headers key:"
            r4.<init>(r5)
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = " value:"
            r4.append(r5)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.bytedance.embedapplog.uc.j(r3, r2)
            goto L1e
        L68:
            if (r10 == 0) goto L7c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "http data length:"
            r1.<init>(r3)
            int r3 = r10.length
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.embedapplog.uc.j(r1, r2)
        L7c:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            java.net.URLConnection r8 = r1.openConnection()     // Catch: java.lang.Throwable -> L8e
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> L8e
            if (r7 != 0) goto L94
            r1 = 0
            r8.setDoOutput(r1)     // Catch: java.lang.Throwable -> L8e
            goto L9e
        L8e:
            r7 = move-exception
            r8 = r2
            r9 = r8
        L91:
            r10 = r9
            goto L1bd
        L94:
            r1 = 1
            if (r7 != r1) goto L9b
            r8.setDoOutput(r1)     // Catch: java.lang.Throwable -> L8e
            goto L9e
        L9b:
            com.bytedance.embedapplog.uc.xt(r2)     // Catch: java.lang.Throwable -> L8e
        L9e:
            java.lang.String[] r1 = com.bytedance.embedapplog.q.f2094r     // Catch: java.lang.Throwable -> L8e
            r7 = r1[r7]     // Catch: java.lang.Throwable -> L8e
            r8.setRequestMethod(r7)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto Led
            boolean r7 = r9.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r7 != 0) goto Led
            java.util.Set r7 = r9.entrySet()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L8e
        Lb5:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto Led
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L8e
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r9.getKey()     // Catch: java.lang.Throwable -> L8e
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L8e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto Le9
            java.lang.Object r1 = r9.getValue()     // Catch: java.lang.Throwable -> L8e
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L8e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto Le9
            java.lang.Object r1 = r9.getKey()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L8e
            r8.addRequestProperty(r1, r9)     // Catch: java.lang.Throwable -> L8e
            goto Lb5
        Le9:
            com.bytedance.embedapplog.uc.xt(r2)     // Catch: java.lang.Throwable -> L8e
            goto Lb5
        Led:
            java.lang.String r7 = "Accept-Encoding"
            r8.setRequestProperty(r7, r0)     // Catch: java.lang.Throwable -> L8e
            if (r10 == 0) goto L110
            int r7 = r10.length     // Catch: java.lang.Throwable -> L8e
            if (r7 <= 0) goto L110
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L8e
            java.io.OutputStream r9 = r8.getOutputStream()     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L8e
            r7.write(r10)     // Catch: java.lang.Throwable -> L10a
            r7.flush()     // Catch: java.lang.Throwable -> L10a
            r7.close()     // Catch: java.lang.Throwable -> L10a
            goto L111
        L10a:
            r8 = move-exception
            r9 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            goto L91
        L110:
            r7 = r2
        L111:
            int r9 = r8.getResponseCode()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r10 = "http_code"
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 != r1) goto L188
            int r9 = r8.getContentLength()     // Catch: java.lang.Throwable -> L10a
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r9 >= r3) goto L182
            java.io.InputStream r9 = r8.getInputStream()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = r8.getContentEncoding()     // Catch: java.lang.Throwable -> L10a
            boolean r8 = r0.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> L10a
            if (r8 == 0) goto L141
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L10a
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L10a
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L10a
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L10a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L10a
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L10a
            goto L14b
        L141:
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L10a
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L10a
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L10a
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L10a
        L14b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            int r9 = r9.available()     // Catch: java.lang.Throwable -> L163
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L163
        L154:
            java.lang.String r9 = r8.readLine()     // Catch: java.lang.Throwable -> L163
            if (r9 == 0) goto L16a
            r0.append(r9)     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = "\n"
            r0.append(r9)     // Catch: java.lang.Throwable -> L163
            goto L154
        L163:
            r9 = move-exception
            r10 = r8
            r8 = r7
            r7 = r9
            r9 = r10
            r10 = r2
            goto L1bd
        L16a:
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L163
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17b
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L17b
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L17b
            goto L1a9
        L17b:
            r10 = move-exception
            r6 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r6
            goto L1bd
        L182:
            com.bytedance.embedapplog.uc.xt(r2)     // Catch: java.lang.Throwable -> L10a
            r8 = r2
            r9 = r8
            goto L1a9
        L188:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10a
            r8.<init>()     // Catch: java.lang.Throwable -> L10a
            org.json.JSONObject r8 = r8.put(r10, r9)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L10a
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1b8
            java.lang.String r0 = "HttpCode:"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L1b8
            java.lang.String r9 = r0.concat(r9)     // Catch: java.lang.Throwable -> L1b8
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L1b8
            com.bytedance.sdk.component.utils.vl.j(r10)     // Catch: java.lang.Throwable -> L1b8
            r9 = r8
            r8 = r2
        L1a9:
            if (r7 == 0) goto L1b0
            r7.close()     // Catch: java.io.IOException -> L1af
            goto L1b0
        L1af:
        L1b0:
            if (r8 == 0) goto L1cf
            r8.close()     // Catch: java.io.IOException -> L1b6
            goto L1cf
        L1b6:
            goto L1cf
        L1b8:
            r9 = move-exception
            r10 = r8
            r8 = r7
            r7 = r9
            r9 = r2
        L1bd:
            com.bytedance.embedapplog.uc.xt(r7)     // Catch: java.lang.Throwable -> L1e1
            if (r8 == 0) goto L1c7
            r8.close()     // Catch: java.io.IOException -> L1c6
            goto L1c7
        L1c6:
        L1c7:
            if (r9 == 0) goto L1ce
            r9.close()     // Catch: java.io.IOException -> L1cd
            goto L1ce
        L1cd:
        L1ce:
            r9 = r10
        L1cf:
            boolean r7 = com.bytedance.embedapplog.uc.xt
            if (r7 == 0) goto L1e0
            java.lang.String r7 = "http response: "
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r7 = r7.concat(r8)
            com.bytedance.embedapplog.uc.j(r7, r2)
        L1e0:
            return r9
        L1e1:
            r7 = move-exception
            if (r8 == 0) goto L1e9
            r8.close()     // Catch: java.io.IOException -> L1e8
            goto L1e9
        L1e8:
        L1e9:
            if (r9 == 0) goto L1ee
            r9.close()     // Catch: java.io.IOException -> L1ee
        L1ee:
            throw r7
    }

    private static java.lang.String j(java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            goto Ld
        L7:
            boolean r0 = com.bytedance.embedapplog.j.ae()
            if (r0 != 0) goto Le
        Ld:
            return r8
        Le:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r0 = r8.getQuery()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String[] r2 = com.bytedance.embedapplog.q.up
            int r3 = r2.length
            r4 = 0
        L1f:
            if (r4 >= r3) goto L38
            r5 = r2[r4]
            java.lang.String r6 = r8.getQueryParameter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L35
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r5, r6)
            r1.add(r7)
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            android.net.Uri$Builder r8 = r8.buildUpon()
            r8.clearQuery()
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            r8.appendQueryParameter(r3, r2)
            goto L43
        L5b:
            byte[] r0 = com.bytedance.embedapplog.pz.j(r0)
            r1 = 8
            byte[] r0 = android.util.Base64.encode(r0, r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            java.lang.String r0 = "tt_info"
            r8.appendQueryParameter(r0, r1)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            return r8
    }

    public static java.lang.String j(java.lang.String r6, java.lang.String[] r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            return r6
        L7:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L27
            r3 = r7[r2]
            java.lang.String r4 = r6.getQueryParameter(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L24
            r0.put(r3, r4)
        L24:
            int r2 = r2 + 1
            goto L13
        L27:
            android.net.Uri$Builder r6 = r6.buildUpon()
            r6.clearQuery()
            java.util.Set r7 = r0.keySet()
            java.util.Iterator r7 = r7.iterator()
        L36:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r6.appendQueryParameter(r1, r2)
            goto L36
        L4c:
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            return r6
    }

    public static org.json.JSONObject j(java.lang.String r3, org.json.JSONObject r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            boolean r1 = com.bytedance.embedapplog.j.ae()
            java.lang.String r2 = "Content-Type"
            if (r1 == 0) goto L14
            java.lang.String r1 = "application/octet-stream;tt-data=a"
            r0.put(r2, r1)
            goto L19
        L14:
            java.lang.String r1 = "application/json; charset=utf-8"
            r0.put(r2, r1)
        L19:
            java.lang.String r3 = j(r3)
            java.lang.String r4 = r4.toString()
            byte[] r4 = com.bytedance.embedapplog.pz.j(r4)
            r1 = 1
            java.lang.String r3 = j(r1, r3, r0, r4)
            if (r3 == 0) goto L36
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L32
            r4.<init>(r3)     // Catch: org.json.JSONException -> L32
            return r4
        L32:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L36:
            r3 = 0
            return r3
    }

    public static boolean j(int r1) {
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto La
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static org.json.JSONObject xt(java.lang.String r3, org.json.JSONObject r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            boolean r1 = com.bytedance.embedapplog.j.ae()
            java.lang.String r2 = "Content-Type"
            if (r1 == 0) goto L14
            java.lang.String r1 = "application/octet-stream;tt-data=a"
            r0.put(r2, r1)
            goto L19
        L14:
            java.lang.String r1 = "application/json; charset=utf-8"
            r0.put(r2, r1)
        L19:
            java.lang.String r4 = r4.toString()
            byte[] r4 = com.bytedance.embedapplog.pz.j(r4)
            r1 = 1
            java.lang.String r3 = j(r1, r3, r0, r4)
            r4 = 0
            if (r3 == 0) goto L33
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r0.<init>(r3)     // Catch: org.json.JSONException -> L2f
            goto L34
        L2f:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L33:
            r0 = r4
        L34:
            if (r0 == 0) goto L4d
            java.lang.String r3 = "magic_tag"
            java.lang.String r1 = ""
            java.lang.String r3 = r0.optString(r3, r1)
            java.lang.String r1 = "ss_app_log"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L4d
            java.lang.String r3 = "config"
            org.json.JSONObject r3 = r0.optJSONObject(r3)
            return r3
        L4d:
            return r4
    }
}
