package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class zz extends com.bytedance.embedapplog.ya {
    long av;
    org.json.JSONArray az;
    private org.json.JSONArray f;
    org.json.JSONArray i;
    int jy;
    org.json.JSONArray kt;
    com.bytedance.embedapplog.ry mi;
    long tj;

    /* renamed from: v, reason: collision with root package name */
    private com.bytedance.embedapplog.aq f2124v;
    public byte[] vl;

    /* renamed from: w, reason: collision with root package name */
    long f2125w;
    public int ws;

    /* renamed from: x, reason: collision with root package name */
    private org.json.JSONObject f2126x;

    public zz() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.embedapplog.ya
    public int j(@androidx.annotation.NonNull android.database.Cursor r3) {
            r2 = this;
            r0 = 0
            long r0 = r3.getLong(r0)
            r2.j = r0
            r0 = 1
            long r0 = r3.getLong(r0)
            r2.xt = r0
            r0 = 2
            byte[] r0 = r3.getBlob(r0)
            r2.vl = r0
            r0 = 3
            int r0 = r3.getInt(r0)
            r2.jy = r0
            r0 = 4
            int r3 = r3.getInt(r0)
            r2.oq = r3
            java.lang.String r3 = ""
            r2.f2123r = r3
            r3 = 0
            r2.f2126x = r3
            r2.mi = r3
            r2.f2124v = r3
            r2.f = r3
            r2.az = r3
            r2.i = r3
            r2.kt = r3
            r3 = 5
            return r3
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.util.List<java.lang.String> j() {
            r10 = this;
            java.lang.String r8 = "event_type"
            java.lang.String r9 = "integer"
            java.lang.String r0 = "_id"
            java.lang.String r1 = "integer primary key autoincrement"
            java.lang.String r2 = "local_time_ms"
            java.lang.String r3 = "integer"
            java.lang.String r4 = "_data"
            java.lang.String r5 = "blob"
            java.lang.String r6 = "_fail"
            java.lang.String r7 = "integer"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull android.content.ContentValues r3) {
            r2 = this;
            long r0 = r2.xt
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "local_time_ms"
            r3.put(r1, r0)
            java.lang.String r0 = "_data"
            byte[] r1 = r2.oq()
            r3.put(r0, r1)
            int r0 = r2.oq
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "event_type"
            r3.put(r1, r0)
            return
    }

    @Override // com.bytedance.embedapplog.ya
    protected void j(@androidx.annotation.NonNull org.json.JSONObject r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return
    }

    void j(org.json.JSONObject r3, com.bytedance.embedapplog.ry r4, com.bytedance.embedapplog.aq r5, org.json.JSONArray r6, org.json.JSONArray[] r7, long[] r8, int r9) {
            r2 = this;
            r0 = 0
            r2.j(r0)
            r2.f2126x = r3
            r2.mi = r4
            r2.f2124v = r5
            r2.f = r6
            r3 = 0
            r4 = r7[r3]
            r2.az = r4
            r3 = r8[r3]
            r2.av = r3
            r3 = 1
            r4 = r7[r3]
            r2.i = r4
            r3 = r8[r3]
            r2.f2125w = r3
            r3 = 2
            r4 = r7[r3]
            r2.kt = r4
            r3 = r8[r3]
            r2.tj = r3
            r2.oq = r9
            return
    }

    public byte[] oq() {
            r5 = this;
            r0 = 0
            r5.vl = r0
            org.json.JSONObject r0 = r5.m()     // Catch: java.lang.OutOfMemoryError -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L12
            byte[] r0 = com.bytedance.embedapplog.pz.j(r0)     // Catch: java.lang.OutOfMemoryError -> L12
            r5.vl = r0     // Catch: java.lang.OutOfMemoryError -> L12
            return r0
        L12:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L19:
            com.bytedance.embedapplog.sm$xt[] r3 = com.bytedance.embedapplog.sm.cw
            int r4 = r3.length
            if (r2 >= r4) goto L31
            r3 = r3[r2]
            if (r3 == 0) goto L2e
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = ";"
            r1.append(r3)
        L2e:
            int r2 = r2 + 1
            goto L19
        L31:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
    }

    @Override // com.bytedance.embedapplog.ya
    @androidx.annotation.NonNull
    java.lang.String r() {
            r1 = this;
            java.lang.String r0 = "pack"
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected java.lang.String tl() {
            r2 = this;
            long r0 = r2.j
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // com.bytedance.embedapplog.ya
    protected com.bytedance.embedapplog.ya xt(@androidx.annotation.NonNull org.json.JSONObject r1) {
            r0 = this;
            r1 = 0
            com.bytedance.embedapplog.uc.xt(r1)
            return r1
    }

    @Override // com.bytedance.embedapplog.ya
    protected org.json.JSONObject xt() {
            r18 = this;
            r0 = r18
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "magic_tag"
            java.lang.String r3 = "ss_app_log"
            r1.put(r2, r3)
            java.lang.String r2 = "header"
            org.json.JSONObject r3 = r0.f2126x
            r1.put(r2, r3)
            java.lang.String r2 = "time_sync"
            org.json.JSONObject r3 = com.bytedance.embedapplog.q.j
            r1.put(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            java.lang.String r4 = "local_time"
            r1.put(r4, r2)
            com.bytedance.embedapplog.ry r2 = r0.mi
            if (r2 == 0) goto L3f
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            com.bytedance.embedapplog.ry r3 = r0.mi
            org.json.JSONObject r3 = r3.m()
            r2.put(r3)
            java.lang.String r3 = "launch"
            r1.put(r3, r2)
        L3f:
            com.bytedance.embedapplog.aq r2 = r0.f2124v
            r3 = 0
            if (r2 == 0) goto Ld0
            org.json.JSONObject r2 = r2.m()
            org.json.JSONArray r4 = r0.f
            if (r4 == 0) goto L51
            int r4 = r4.length()
            goto L52
        L51:
            r4 = 0
        L52:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r8 = 0
            r9 = 0
        L5a:
            if (r8 >= r4) goto Lbb
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            org.json.JSONObject r12 = new org.json.JSONObject
            org.json.JSONArray r13 = r0.f
            java.lang.String r13 = r13.optString(r8)
            r12.<init>(r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            java.lang.String r14 = "params"
            java.lang.String r14 = r12.optString(r14)
            r13.<init>(r14)
            java.lang.String r14 = "page_key"
            java.lang.String r15 = ""
            java.lang.String r6 = r13.optString(r14, r15)
            r11.put(r3, r6)
            java.lang.String r6 = "duration"
            int r6 = r13.optInt(r6, r3)
            int r6 = r6 + 999
            int r6 = r6 / 1000
            r7 = 1
            r11.put(r7, r6)
            r5.put(r11)
            java.lang.String r6 = "local_time_ms"
            r11 = r4
            r3 = 0
            long r16 = r12.optLong(r6, r3)
            int r6 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lb6
            java.lang.String r6 = "page_title"
            java.lang.String r6 = r13.optString(r6, r15)
            java.lang.String r9 = "$page_title"
            r2.put(r9, r6)
            java.lang.String r6 = "$page_key"
            java.lang.String r9 = r13.optString(r14, r15)
            r2.put(r6, r9)
            r9 = r16
        Lb6:
            int r8 = r8 + 1
            r4 = r11
            r3 = 0
            goto L5a
        Lbb:
            r11 = r4
            if (r11 <= 0) goto Lc3
            java.lang.String r3 = "activites"
            r2.put(r3, r5)
        Lc3:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r3.put(r2)
            java.lang.String r2 = "terminate"
            r1.put(r2, r3)
        Ld0:
            org.json.JSONArray r2 = r0.az
            if (r2 == 0) goto Ld9
            int r2 = r2.length()
            goto Lda
        Ld9:
            r2 = 0
        Lda:
            if (r2 <= 0) goto Le3
            java.lang.String r3 = "event"
            org.json.JSONArray r4 = r0.az
            r1.put(r3, r4)
        Le3:
            org.json.JSONArray r3 = r0.f
            if (r3 == 0) goto Lec
            int r3 = r3.length()
            goto Led
        Lec:
            r3 = 0
        Led:
            org.json.JSONArray r4 = r0.i
            if (r4 == 0) goto Lf6
            int r4 = r4.length()
            goto Lf7
        Lf6:
            r4 = 0
        Lf7:
            if (r4 <= 0) goto L100
            java.lang.String r5 = "event_v3"
            org.json.JSONArray r6 = r0.i
            r1.put(r5, r6)
        L100:
            org.json.JSONArray r5 = r0.kt
            if (r5 == 0) goto L109
            int r5 = r5.length()
            goto L10a
        L109:
            r5 = 0
        L10a:
            if (r5 <= 0) goto L113
            java.lang.String r6 = "log_data"
            org.json.JSONArray r7 = r0.kt
            r1.put(r6, r7)
        L113:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "pack {"
            r6.<init>(r7)
            java.lang.String r7 = "ts:"
            r6.append(r7)
            long r7 = r0.xt
            r6.append(r7)
            java.lang.String r7 = ", la:"
            r6.append(r7)
            com.bytedance.embedapplog.ry r7 = r0.mi
            java.lang.String r8 = "0"
            if (r7 == 0) goto L130
            goto L131
        L130:
            r7 = r8
        L131:
            r6.append(r7)
            java.lang.String r7 = ", te:"
            r6.append(r7)
            com.bytedance.embedapplog.aq r7 = r0.f2124v
            if (r7 == 0) goto L13e
            r8 = r7
        L13e:
            r6.append(r8)
            java.lang.String r7 = ", p:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", v1:"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = ", v3:"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = ", m:"
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.bytedance.embedapplog.uc.j(r2)
            return r1
    }
}
