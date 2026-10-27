package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.components.core.c.i, java.lang.Comparable<com.kwad.components.core.c.h> {
    private final java.lang.String NF;
    private final java.lang.String NN;
    private final java.lang.String NO;
    private final java.lang.String NP;
    private final long NQ;
    private final long createTime;
    private final int ecpm;

    private h(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.NN = r1
            r0.NF = r2
            r0.NO = r3
            r0.ecpm = r4
            r0.NP = r5
            r0.createTime = r6
            r0.NQ = r8
            return
    }

    public static java.util.List<com.kwad.components.core.c.h> a(android.database.Cursor r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            boolean r1 = r2.moveToNext()
            if (r1 == 0) goto L1c
            com.kwad.components.core.c.h r1 = c(r2)     // Catch: java.lang.Exception -> L17
            r0.add(r1)     // Catch: java.lang.Exception -> L17
            goto L9
        L17:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r1)
            goto L9
        L1c:
            return r0
    }

    public static java.util.List<com.kwad.components.core.c.h> a(com.kwad.components.core.c.e r20, com.kwad.sdk.core.response.model.AdResultData r21) {
            java.util.List r0 = r21.getProceedTemplateList()
            int r1 = r0.size()
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r2 / r4
            long r6 = r20.oj()
            long r16 = r4 + r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.kwad.sdk.internal.api.SceneImpl r5 = r21.getDefaultAdScene()
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r0.next()
            com.kwad.sdk.core.response.model.AdTemplate r6 = (com.kwad.sdk.core.response.model.AdTemplate) r6
            long r7 = com.kwad.sdk.core.response.b.e.ev(r6)
            long r9 = r21.getPosId()
            int r12 = com.kwad.sdk.core.response.b.e.ez(r6)
            com.kwad.sdk.internal.api.SceneImpl r11 = r21.getDefaultAdScene()
            org.json.JSONObject r11 = r11.toJson()
            java.lang.String r13 = r11.toString()
            com.kwad.sdk.core.response.model.AdResultData r11 = new com.kwad.sdk.core.response.model.AdResultData
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r14 = r21
            r11.<init>(r14, r5, r6)
            r6 = r7
            com.kwad.components.core.c.h r8 = new com.kwad.components.core.c.h
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r10 = java.lang.String.valueOf(r9)
            java.lang.String r11 = r11.getResponseJson()
            r18 = r2
            long r2 = (long) r1
            long r2 = r18 + r2
            r14 = r2
            r9 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            r4.add(r8)
            int r1 = r1 + (-1)
            r2 = r18
            goto L23
        L73:
            return r4
    }

    @android.annotation.SuppressLint({"Range"})
    private static synchronized com.kwad.components.core.c.h c(@androidx.annotation.NonNull android.database.Cursor r12) {
            java.lang.Class<com.kwad.components.core.c.h> r1 = com.kwad.components.core.c.h.class
            monitor-enter(r1)
            java.lang.String r0 = "creativeId"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r12.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "posId"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r12.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "adJson"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r12.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "ecpm"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            int r6 = r12.getInt(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "adSenseJson"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r12.getString(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "createTime"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            long r8 = r12.getLong(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "expireTime"
            int r0 = r12.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L50
            long r10 = r12.getLong(r0)     // Catch: java.lang.Throwable -> L50
            com.kwad.components.core.c.h r2 = new com.kwad.components.core.c.h     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r1)
            return r2
        L50:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r12
    }

    @androidx.annotation.Nullable
    private static com.kwad.sdk.core.response.model.AdResultData c(com.kwad.components.core.c.h r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.on()
            if (r1 == 0) goto L49
            java.lang.String r1 = r4.or()
            if (r1 != 0) goto L11
            goto L49
        L11:
            java.lang.String r1 = r4.or()     // Catch: org.json.JSONException -> L42
            com.kwad.sdk.internal.api.SceneImpl r2 = new com.kwad.sdk.internal.api.SceneImpl     // Catch: org.json.JSONException -> L42
            r2.<init>()     // Catch: org.json.JSONException -> L42
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L42
            r3.<init>(r1)     // Catch: org.json.JSONException -> L42
            r2.parseJson(r3)     // Catch: org.json.JSONException -> L42
            java.lang.String r4 = r4.on()     // Catch: org.json.JSONException -> L42
            com.kwad.sdk.core.response.model.AdResultData r4 = com.kwad.sdk.core.response.model.AdResultData.createFromResponseJson(r4, r2)     // Catch: org.json.JSONException -> L42
            java.util.List r1 = r4.getProceedTemplateList()     // Catch: org.json.JSONException -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L42
        L32:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L42
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L42
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2     // Catch: org.json.JSONException -> L42
            r3 = 1
            r2.fromCache = r3     // Catch: org.json.JSONException -> L42
            goto L32
        L42:
            r4 = move-exception
            goto L45
        L44:
            return r4
        L45:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            return r0
        L49:
            java.lang.String r4 = "CachedAd"
            java.lang.String r1 = "createAdResultData cachedAd data illegal"
            com.kwad.sdk.core.d.c.w(r4, r1)
            return r0
    }

    private int d(com.kwad.components.core.c.h r5) {
            r4 = this;
            int r0 = r5.oo()
            int r1 = r4.oo()
            if (r0 != r1) goto L15
            long r0 = r5.op()
            long r2 = r4.op()
            long r0 = r0 - r2
            int r5 = (int) r0
            return r5
        L15:
            int r5 = r5.oo()
            int r0 = r4.oo()
            int r5 = r5 - r0
            return r5
    }

    public static com.kwad.sdk.core.response.model.AdResultData k(java.util.List<com.kwad.components.core.c.h> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L3f
            int r2 = r4.size()
            if (r2 != 0) goto Lf
            goto L3f
        Lf:
            java.util.Iterator r4 = r4.iterator()
            r2 = r1
        L14:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r1 = r4.next()
            com.kwad.components.core.c.h r1 = (com.kwad.components.core.c.h) r1
            com.kwad.sdk.core.response.model.AdResultData r1 = c(r1)
            if (r1 == 0) goto L14
            if (r2 != 0) goto L2c
            com.kwad.sdk.internal.api.SceneImpl r2 = r1.getDefaultAdScene()
        L2c:
            java.util.List r3 = r1.getProceedTemplateList()
            r0.addAll(r3)
            goto L14
        L34:
            com.kwad.sdk.core.response.model.AdResultData r4 = new com.kwad.sdk.core.response.model.AdResultData
            r4.<init>(r1, r2, r0)
            java.lang.String r0 = "cache"
            r4.setAdSource(r0)
            return r4
        L3f:
            return r1
    }

    private java.lang.String on() {
            r1 = this;
            java.lang.String r0 = r1.NO
            return r0
    }

    private int oo() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    private long op() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    private java.lang.String or() {
            r1 = this;
            java.lang.String r0 = r1.NP
            return r0
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.kwad.components.core.c.h r1) {
            r0 = this;
            com.kwad.components.core.c.h r1 = (com.kwad.components.core.c.h) r1
            int r1 = r0.d(r1)
            return r1
    }

    public final java.lang.String og() {
            r1 = this;
            java.lang.String r0 = r1.NF
            return r0
    }

    @Override // com.kwad.components.core.c.i
    public final android.content.ContentValues ok() {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "creativeId"
            java.lang.String r2 = r3.NN
            r0.put(r1, r2)
            java.lang.String r1 = "posId"
            java.lang.String r2 = r3.NF
            r0.put(r1, r2)
            java.lang.String r1 = "adJson"
            java.lang.String r2 = r3.NO
            r0.put(r1, r2)
            int r1 = r3.ecpm
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ecpm"
            r0.put(r2, r1)
            java.lang.String r1 = "adSenseJson"
            java.lang.String r2 = r3.NP
            r0.put(r1, r2)
            long r1 = r3.createTime
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "createTime"
            r0.put(r2, r1)
            long r1 = r3.NQ
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "expireTime"
            r0.put(r2, r1)
            java.lang.String r1 = "playAgainJson"
            r2 = 0
            r0.put(r1, r2)
            return r0
    }

    public final long oq() {
            r2 = this;
            long r0 = r2.NQ
            return r0
    }

    public final java.lang.String os() {
            r1 = this;
            java.lang.String r0 = r1.NN
            return r0
    }
}
