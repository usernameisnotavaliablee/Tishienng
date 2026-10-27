package com.oplus.omes.stdsco.urlcheck;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class UrlCheckClient {
    private static volatile com.oplus.omes.stdsco.urlcheck.UrlCheckClient c;
    private final java.util.concurrent.ExecutorService a;
    private final j2.a b;

    private UrlCheckClient(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.a = r0
            j2.a r0 = new j2.a
            java.lang.String r1 = "stdscourlcheck"
            r0.<init>(r3, r1)
            r2.b = r0
            return
    }

    public static /* synthetic */ void a(j2.b r1) {
            if (r1 == 0) goto L6
            r0 = -3
            r1.onFailure(r0)
        L6:
            return
    }

    public static /* synthetic */ void b(j2.b r0, java.util.List r1) {
            if (r0 == 0) goto L5
            r0.a(r1)
        L5:
            return
    }

    public static /* synthetic */ void c(j2.b r0, java.util.List r1) {
            if (r0 == 0) goto L5
            r0.a(r1)
        L5:
            return
    }

    public static /* synthetic */ void d(com.oplus.omes.stdsco.urlcheck.UrlCheckClient r9, java.util.List r10, j2.b r11) {
            r9.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            j2.a r3 = r9.b
            j2.c r2 = r3.d(r2)
            if (r2 == 0) goto Lc
            r0.add(r2)
            r1.remove()
            goto Lc
        L27:
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L3f
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r9.<init>(r10)
            j2.d r10 = new j2.d
            r10.<init>(r11, r0)
            r9.post(r10)
            return
        L3f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
            r1.<init>()     // Catch: org.json.JSONException -> L107
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L107
            r2.<init>()     // Catch: org.json.JSONException -> L107
            r3 = 0
            r4 = 0
        L4b:
            int r5 = r10.size()     // Catch: org.json.JSONException -> L107
            if (r4 >= r5) goto L90
            java.lang.Object r5 = r10.get(r4)     // Catch: org.json.JSONException -> L107
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L107
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
            r6.<init>()     // Catch: org.json.JSONException -> L107
            java.lang.String r7 = "id"
            r6.put(r7, r4)     // Catch: org.json.JSONException -> L107
            java.lang.String r7 = "url"
            r6.put(r7, r5)     // Catch: org.json.JSONException -> L107
            java.lang.String r7 = "deviceid"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L107
            r8.<init>()     // Catch: org.json.JSONException -> L107
            java.lang.String r5 = j2.a.h(r5)     // Catch: org.json.JSONException -> L107
            int r5 = r5.hashCode()     // Catch: org.json.JSONException -> L107
            int r5 = java.lang.Math.abs(r5)     // Catch: org.json.JSONException -> L107
            int r5 = r5 % 10
            r8.append(r5)     // Catch: org.json.JSONException -> L107
            java.lang.String r5 = ""
            r8.append(r5)     // Catch: org.json.JSONException -> L107
            java.lang.String r5 = r8.toString()     // Catch: org.json.JSONException -> L107
            r6.put(r7, r5)     // Catch: org.json.JSONException -> L107
            r2.put(r4, r6)     // Catch: org.json.JSONException -> L107
            int r4 = r4 + 1
            goto L4b
        L90:
            java.lang.String r10 = "urls"
            r1.put(r10, r2)     // Catch: org.json.JSONException -> L107
            java.lang.String r10 = r1.toString()     // Catch: org.json.JSONException -> L107
            java.lang.String r10 = nativeUrlsCheck(r10)     // Catch: org.json.JSONException -> L107
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: org.json.JSONException -> L107
            if (r1 != 0) goto L106
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L107
            r1.<init>(r10)     // Catch: org.json.JSONException -> L107
            java.lang.String r10 = "result"
            org.json.JSONArray r10 = r1.getJSONArray(r10)     // Catch: org.json.JSONException -> L107
        Lae:
            int r1 = r10.length()     // Catch: org.json.JSONException -> L107
            if (r3 >= r1) goto Lf5
            java.lang.Object r1 = r10.get(r3)     // Catch: org.json.JSONException -> L107
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: org.json.JSONException -> L107
            j2.c r2 = new j2.c     // Catch: org.json.JSONException -> L107
            r2.<init>()     // Catch: org.json.JSONException -> L107
            java.lang.String r4 = "Id"
            int r4 = r1.getInt(r4)     // Catch: org.json.JSONException -> L107
            r2.g(r4)     // Catch: org.json.JSONException -> L107
            java.lang.String r4 = "Url"
            java.lang.String r4 = r1.getString(r4)     // Catch: org.json.JSONException -> L107
            r2.i(r4)     // Catch: org.json.JSONException -> L107
            java.lang.String r4 = "Urltype"
            int r4 = r1.getInt(r4)     // Catch: org.json.JSONException -> L107
            r2.j(r4)     // Catch: org.json.JSONException -> L107
            java.lang.String r4 = "Evilclass"
            int r1 = r1.getInt(r4)     // Catch: org.json.JSONException -> L107
            r2.f(r1)     // Catch: org.json.JSONException -> L107
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L107
            r2.h(r4)     // Catch: org.json.JSONException -> L107
            j2.a r1 = r9.b     // Catch: org.json.JSONException -> L107
            r1.i(r2)     // Catch: org.json.JSONException -> L107
            r0.add(r2)     // Catch: org.json.JSONException -> L107
            int r3 = r3 + 1
            goto Lae
        Lf5:
            android.os.Handler r9 = new android.os.Handler     // Catch: org.json.JSONException -> L107
            android.os.Looper r10 = android.os.Looper.getMainLooper()     // Catch: org.json.JSONException -> L107
            r9.<init>(r10)     // Catch: org.json.JSONException -> L107
            j2.e r10 = new j2.e     // Catch: org.json.JSONException -> L107
            r10.<init>(r11, r0)     // Catch: org.json.JSONException -> L107
            r9.post(r10)     // Catch: org.json.JSONException -> L107
        L106:
            return
        L107:
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r9.<init>(r10)
            j2.f r10 = new j2.f
            r10.<init>(r11)
            r9.post(r10)
            return
    }

    public static com.oplus.omes.stdsco.urlcheck.UrlCheckClient f(android.content.Context r2) {
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient r0 = com.oplus.omes.stdsco.urlcheck.UrlCheckClient.c
            if (r0 != 0) goto L19
            java.lang.Class<com.oplus.omes.stdsco.urlcheck.UrlCheckClient> r0 = com.oplus.omes.stdsco.urlcheck.UrlCheckClient.class
            monitor-enter(r0)
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient r1 = com.oplus.omes.stdsco.urlcheck.UrlCheckClient.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient r1 = new com.oplus.omes.stdsco.urlcheck.UrlCheckClient     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.oplus.omes.stdsco.urlcheck.UrlCheckClient r2 = com.oplus.omes.stdsco.urlcheck.UrlCheckClient.c
            return r2
    }

    public static native java.lang.String nativeUrlsCheck(java.lang.String r0);

    public void e(java.util.List<java.lang.String> r3, j2.b r4) {
            r2 = this;
            if (r3 != 0) goto L9
            if (r4 == 0) goto L17
            r3 = -1
            r4.onFailure(r3)
            return
        L9:
            r0 = 20
            int r1 = r3.size()
            if (r1 <= r0) goto L18
            if (r4 == 0) goto L17
            r3 = -2
            r4.onFailure(r3)
        L17:
            return
        L18:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.concurrent.ExecutorService r3 = r2.a
            j2.g r1 = new j2.g
            r1.<init>(r2, r0, r4)
            r3.execute(r1)
            return
    }
}
