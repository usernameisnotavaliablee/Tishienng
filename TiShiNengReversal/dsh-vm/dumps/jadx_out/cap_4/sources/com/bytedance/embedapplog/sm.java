package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class sm {
    static final com.bytedance.embedapplog.sm.xt[] cw = null;
    public static final int[] j = null;

    /* renamed from: m, reason: collision with root package name */
    private static final com.bytedance.embedapplog.ya[] f2100m = null;
    static final java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> xt = null;
    private java.lang.String ae;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.embedapplog.f f2101r;
    private final com.bytedance.embedapplog.sm.j up;

    static class j extends android.database.sqlite.SQLiteOpenHelper {
        j(@androidx.annotation.Nullable android.content.Context r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5) {
                r1 = this;
                com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
                r0.<init>(r2)
                r1.<init>(r0, r3, r4, r5)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                r3.beginTransaction()     // Catch: java.lang.Throwable -> L23
                java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r0 = com.bytedance.embedapplog.sm.xt     // Catch: java.lang.Throwable -> L23
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L23
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
            Ld:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
                com.bytedance.embedapplog.ya r1 = (com.bytedance.embedapplog.ya) r1     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = r1.cw()     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto Ld
                r3.execSQL(r1)     // Catch: java.lang.Throwable -> L23
                goto Ld
            L23:
                r0 = move-exception
                goto L2c
            L25:
                r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23
                com.bytedance.embedapplog.ri.j(r3)
                return
            L2c:
                com.bytedance.embedapplog.uc.xt(r0)     // Catch: java.lang.Throwable -> L33
                com.bytedance.embedapplog.ri.j(r3)
                return
            L33:
                r0 = move-exception
                com.bytedance.embedapplog.ri.j(r3)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
                r0 = this;
                r0.onUpgrade(r1, r2, r3)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "onUpgrade, "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r5 = 0
                com.bytedance.embedapplog.uc.r(r4, r5)
                r3.beginTransaction()     // Catch: java.lang.Throwable -> L49
                java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r4 = com.bytedance.embedapplog.sm.xt     // Catch: java.lang.Throwable -> L49
                java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L49
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L49
            L27:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L49
                if (r5 == 0) goto L4b
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L49
                com.bytedance.embedapplog.ya r5 = (com.bytedance.embedapplog.ya) r5     // Catch: java.lang.Throwable -> L49
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                java.lang.String r1 = "DROP TABLE IF EXISTS "
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L49
                java.lang.String r5 = r5.r()     // Catch: java.lang.Throwable -> L49
                r0.append(r5)     // Catch: java.lang.Throwable -> L49
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L49
                r3.execSQL(r5)     // Catch: java.lang.Throwable -> L49
                goto L27
            L49:
                r4 = move-exception
                goto L52
            L4b:
                r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L49
            L4e:
                com.bytedance.embedapplog.ri.j(r3)
                goto L58
            L52:
                java.lang.String r5 = ""
                com.bytedance.embedapplog.uc.cw(r5, r4)     // Catch: java.lang.Throwable -> L5c
                goto L4e
            L58:
                r2.onCreate(r3)
                return
            L5c:
                r4 = move-exception
                com.bytedance.embedapplog.ri.j(r3)
                throw r4
        }
    }

    static class xt {
        int cw;
        java.lang.String j;
        int xt;

        xt() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void j() {
                xt()
                return
        }

        static /* synthetic */ void j(com.bytedance.embedapplog.sm.xt r0, com.bytedance.embedapplog.ya r1) {
                r0.j(r1)
                return
        }

        private void j(com.bytedance.embedapplog.ya r4) {
                r3 = this;
                java.lang.String r0 = r4.g()
                if (r0 == 0) goto L1a
                int r1 = r0.length()
                int r2 = r3.xt
                if (r1 <= r2) goto L1a
                java.lang.String r4 = r4.tl()
                r3.j = r4
                int r4 = r0.length()
                r3.xt = r4
            L1a:
                return
        }

        private static void xt() {
                com.bytedance.embedapplog.sm$xt[] r0 = com.bytedance.embedapplog.sm.cw
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                java.lang.String r5 = ""
                r4.j = r5
                r4.xt = r2
                r4.cw = r2
                int r3 = r3 + 1
                goto L5
            L14:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.cw
                r0.<init>(r1)
                java.lang.String r1 = "-"
                r0.append(r1)
                java.lang.String r2 = r3.j
                r0.append(r2)
                r0.append(r1)
                int r1 = r3.xt
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[]{r0}
            com.bytedance.embedapplog.sm.j = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.embedapplog.sm.xt = r1
            com.bytedance.embedapplog.kc r1 = new com.bytedance.embedapplog.kc
            r1.<init>()
            j(r1)
            com.bytedance.embedapplog.ry r1 = new com.bytedance.embedapplog.ry
            r1.<init>(r0)
            j(r1)
            com.bytedance.embedapplog.aq r1 = new com.bytedance.embedapplog.aq
            r1.<init>()
            j(r1)
            com.bytedance.embedapplog.zz r1 = new com.bytedance.embedapplog.zz
            r1.<init>()
            j(r1)
            com.bytedance.embedapplog.xq r1 = new com.bytedance.embedapplog.xq
            r1.<init>()
            com.bytedance.embedapplog.ff r2 = new com.bytedance.embedapplog.ff
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4, r3)
            com.bytedance.embedapplog.k r3 = new com.bytedance.embedapplog.k
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = ""
            r3.<init>(r6, r5)
            r5 = 3
            com.bytedance.embedapplog.ya[] r6 = new com.bytedance.embedapplog.ya[r5]
            r6[r4] = r1
            r6[r0] = r2
            r1 = 2
            r6[r1] = r3
            com.bytedance.embedapplog.sm.f2100m = r6
            r2 = 0
        L53:
            if (r2 >= r5) goto L5d
            r3 = r6[r2]
            j(r3)
            int r2 = r2 + 1
            goto L53
        L5d:
            com.bytedance.embedapplog.sm$xt r2 = new com.bytedance.embedapplog.sm$xt
            r2.<init>()
            com.bytedance.embedapplog.sm$xt r3 = new com.bytedance.embedapplog.sm$xt
            r3.<init>()
            com.bytedance.embedapplog.sm$xt r6 = new com.bytedance.embedapplog.sm$xt
            r6.<init>()
            com.bytedance.embedapplog.sm$xt[] r5 = new com.bytedance.embedapplog.sm.xt[r5]
            r5[r4] = r2
            r5[r0] = r3
            r5[r1] = r6
            com.bytedance.embedapplog.sm.cw = r5
            return
    }

    public sm(com.bytedance.embedapplog.f r6) {
            r5 = this;
            r5.<init>()
            com.bytedance.embedapplog.sm$j r0 = new com.bytedance.embedapplog.sm$j
            android.content.Context r1 = r6.xt()
            r2 = 0
            r3 = 30
            java.lang.String r4 = "bd_embed_tea_agent.db"
            r0.<init>(r1, r4, r2, r3)
            r5.up = r0
            r5.f2101r = r6
            return
    }

    private int j(int r13, android.database.sqlite.SQLiteDatabase r14, java.lang.String r15, boolean r16, int r17, org.json.JSONArray[] r18, long[] r19) {
            r12 = this;
            com.bytedance.embedapplog.sm.xt.j()
            r0 = 0
        L4:
            r9 = 0
            r11 = 0
            if (r0 >= r13) goto L10
            r18[r0] = r11
            r19[r0] = r9
            int r0 = r0 + 1
            goto L4
        L10:
            r13 = 200(0xc8, float:2.8E-43)
            r4 = r0
            r3 = 200(0xc8, float:2.8E-43)
        L15:
            if (r3 <= 0) goto L3c
            com.bytedance.embedapplog.ya[] r13 = com.bytedance.embedapplog.sm.f2100m
            int r13 = r13.length
            if (r4 >= r13) goto L3c
            r0 = r12
            r1 = r14
            r2 = r15
            r5 = r16
            r8 = r17
            r6 = r18
            r7 = r19
            r0.j(r1, r2, r3, r4, r5, r6, r7, r8)
            r13 = r6[r4]
            int r13 = r13.length()
            int r3 = r3 - r13
            com.bytedance.embedapplog.sm$xt[] r0 = com.bytedance.embedapplog.sm.cw
            r0 = r0[r4]
            r0.cw = r13
            if (r3 <= 0) goto L15
            int r4 = r4 + 1
            goto L15
        L3c:
            r6 = r18
            int r13 = r4 + 1
        L40:
            int r14 = r6.length
            if (r13 >= r14) goto L4a
            r6[r13] = r11
            r19[r13] = r9
            int r13 = r13 + 1
            goto L40
        L4a:
            return r4
    }

    private java.lang.String j(long r3, int r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UPDATE pack SET _fail="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " WHERE _id="
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.lang.String j(com.bytedance.embedapplog.ya r3, java.lang.String r4, boolean r5, int r6, int r7) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT * FROM "
            r0.<init>(r1)
            java.lang.String r3 = r3.r()
            r0.append(r3)
            java.lang.String r3 = " WHERE session_id"
            r0.append(r3)
            if (r5 == 0) goto L18
            java.lang.String r3 = "='"
            goto L1a
        L18:
            java.lang.String r3 = "!='"
        L1a:
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "' AND event_type='"
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = "' ORDER BY _id LIMIT "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.lang.String j(java.lang.String r3, int r4, java.lang.String r5, boolean r6, long r7) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DELETE FROM "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " WHERE session_id"
            r0.append(r3)
            if (r6 == 0) goto L14
            java.lang.String r3 = "='"
            goto L16
        L14:
            java.lang.String r3 = "!='"
        L16:
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "' AND event_type='"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "' AND _id<="
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.lang.String j(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT * FROM page WHERE session_id"
            r0.<init>(r1)
            if (r4 == 0) goto Lc
            java.lang.String r1 = "='"
            goto Le
        Lc:
            java.lang.String r1 = "!='"
        Le:
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "' ORDER BY "
            r0.append(r3)
            if (r4 == 0) goto L1e
            java.lang.String r3 = "session_id,"
            goto L20
        L1e:
            java.lang.String r3 = ""
        L20:
            r0.append(r3)
            java.lang.String r3 = "duration DESC LIMIT 500"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private org.json.JSONArray j(com.bytedance.embedapplog.ry r22, boolean r23, com.bytedance.embedapplog.aq r24, com.bytedance.embedapplog.kc r25, android.database.sqlite.SQLiteDatabase r26) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r0 = r25
            r5 = r26
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r7 = 1000(0x3e8, double:4.94E-321)
            r11 = 0
            java.lang.String r12 = r2.f2123r     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = r1.j(r12, r3)     // Catch: java.lang.Throwable -> Ld0
            android.database.Cursor r12 = r5.rawQuery(r12, r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashMap r13 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lc8
            r14 = 8
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lc8
            r14 = 0
            r17 = r11
            r18 = r17
            r15 = 0
        L2c:
            boolean r19 = r12.moveToNext()     // Catch: java.lang.Throwable -> L47
            if (r19 == 0) goto Lb5
            r0.j(r12)     // Catch: java.lang.Throwable -> L47
            boolean r14 = com.bytedance.embedapplog.uc.xt     // Catch: java.lang.Throwable -> L47
            if (r14 == 0) goto L4a
            java.lang.String r14 = "queryPage, "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = r14.concat(r9)     // Catch: java.lang.Throwable -> L47
            com.bytedance.embedapplog.uc.j(r9, r11)     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r0 = move-exception
            goto Ld5
        L4a:
            java.lang.String r9 = r0.ws     // Catch: java.lang.Throwable -> L47
            java.lang.Object r9 = r13.get(r9)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L47
            boolean r10 = r0.oq()     // Catch: java.lang.Throwable -> L47
            r14 = 1
            if (r10 != 0) goto L90
            java.lang.String r10 = r0.ws     // Catch: java.lang.Throwable -> L47
            if (r9 == 0) goto L63
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L47
            int r9 = r9 + r14
            goto L64
        L63:
            r9 = 1
        L64:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L47
            r13.put(r10, r9)     // Catch: java.lang.Throwable -> L47
            long r9 = r0.vl     // Catch: java.lang.Throwable -> L47
            int r20 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r20 < 0) goto L73
            long r15 = r15 + r9
            goto L74
        L73:
            long r15 = r15 + r7
        L74:
            org.json.JSONObject r9 = r0.m()     // Catch: java.lang.Throwable -> L47
            r6.put(r9)     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = r0.kt     // Catch: java.lang.Throwable -> L47
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L47
            if (r9 != 0) goto L2c
            java.lang.String r9 = r0.kt     // Catch: java.lang.Throwable -> L47
            java.lang.String r10 = r0.f2122m     // Catch: java.lang.Throwable -> L8c
            r17 = r9
            r18 = r10
            goto L2c
        L8c:
            r0 = move-exception
            r17 = r9
            goto Ld5
        L90:
            if (r9 == 0) goto La9
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L47
            int r9 = r9 - r14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L47
            if (r9 <= 0) goto La3
            java.lang.String r9 = r0.ws     // Catch: java.lang.Throwable -> L47
            r13.put(r9, r10)     // Catch: java.lang.Throwable -> L47
            goto L2c
        La3:
            java.lang.String r9 = r0.ws     // Catch: java.lang.Throwable -> L47
            r13.remove(r9)     // Catch: java.lang.Throwable -> L47
            goto L2c
        La9:
            r0.vl = r7     // Catch: java.lang.Throwable -> L47
            long r15 = r15 + r7
            org.json.JSONObject r9 = r0.m()     // Catch: java.lang.Throwable -> L47
            r6.put(r9)     // Catch: java.lang.Throwable -> L47
            goto L2c
        Lb5:
            if (r14 == 0) goto Lc0
            java.lang.String r0 = r2.f2123r     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r1.xt(r0, r3)     // Catch: java.lang.Throwable -> L47
            r5.execSQL(r0)     // Catch: java.lang.Throwable -> L47
        Lc0:
            r12.close()
        Lc3:
            r0 = r17
            r5 = r18
            goto Ldb
        Lc8:
            r0 = move-exception
            r17 = r11
        Lcb:
            r18 = r17
            r15 = 0
            goto Ld5
        Ld0:
            r0 = move-exception
            r12 = r11
            r17 = r12
            goto Lcb
        Ld5:
            com.bytedance.embedapplog.uc.xt(r0)     // Catch: java.lang.Throwable -> L138
            if (r12 == 0) goto Lc3
            goto Lc0
        Ldb:
            int r9 = r6.length()
            if (r9 <= 0) goto L137
            int r9 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r9 <= 0) goto Le6
            r7 = r15
        Le6:
            r4.vl = r7
            if (r3 == 0) goto Lf5
            java.lang.String r3 = r2.f2123r
            r4.f2123r = r3
            long r9 = r2.xt
            long r9 = r9 + r7
            r4.j(r9)
            goto L104
        Lf5:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r4.f2123r = r3
            r7 = 0
            r4.j(r7)
        L104:
            long r7 = r2.up
            r4.up = r7
            java.lang.String r3 = r2.f2122m
            r4.f2122m = r3
            java.lang.String r3 = r2.ae
            r4.ae = r3
            java.lang.String r3 = r2.tl
            r4.tl = r3
            long r7 = r4.xt
            r4.jy = r7
            long r7 = com.bytedance.embedapplog.ch.r()
            r4.cw = r7
            r4.ws = r11
            java.lang.String r3 = r2.az
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L12d
            java.lang.String r0 = r2.az
            r4.ws = r0
            goto L137
        L12d:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L137
            r4.ws = r0
            r4.f2122m = r5
        L137:
            return r6
        L138:
            r0 = move-exception
            if (r12 == 0) goto L13e
            r12.close()
        L13e:
            throw r0
    }

    private org.json.JSONObject j(com.bytedance.embedapplog.ry r4, org.json.JSONObject r5) {
            r3 = this;
            java.lang.String r0 = r4.jy
            com.bytedance.embedapplog.f r1 = r3.f2101r
            com.bytedance.embedapplog.wq r1 = r1.up()
            java.lang.String r1 = r1.cw()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L20
            int r0 = r4.vl
            com.bytedance.embedapplog.f r1 = r3.f2101r
            com.bytedance.embedapplog.wq r1 = r1.up()
            int r1 = r1.xt()
            if (r0 == r1) goto L3b
        L20:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L37
            r0.<init>()     // Catch: org.json.JSONException -> L37
            com.bytedance.embedapplog.ri.xt(r0, r5)     // Catch: org.json.JSONException -> L37
            java.lang.String r1 = "app_version"
            java.lang.String r2 = r4.jy     // Catch: org.json.JSONException -> L37
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L37
            java.lang.String r1 = "version_code"
            int r4 = r4.vl     // Catch: org.json.JSONException -> L37
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L37
            return r0
        L37:
            r4 = move-exception
            com.bytedance.embedapplog.uc.xt(r4)
        L3b:
            return r5
    }

    private void j(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13, int r14, int r15, boolean r16, org.json.JSONArray[] r17, long[] r18, int r19) {
            r11 = this;
            com.bytedance.embedapplog.ya[] r0 = com.bytedance.embedapplog.sm.f2100m
            r2 = r0[r15]
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            r8 = 0
            r9 = 0
            r1 = r11
            r3 = r13
            r5 = r14
            r4 = r16
            r6 = r19
            java.lang.String r13 = r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5b
            android.database.Cursor r12 = r12.rawQuery(r13, r8)     // Catch: java.lang.Throwable -> L5b
            r13 = 0
        L1c:
            boolean r14 = r12.moveToNext()     // Catch: java.lang.Throwable -> L42
            if (r14 == 0) goto L57
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 > r14) goto L57
            r2.j(r12)     // Catch: java.lang.Throwable -> L42
            com.bytedance.embedapplog.sm$xt[] r14 = com.bytedance.embedapplog.sm.cw     // Catch: java.lang.Throwable -> L42
            r14 = r14[r15]     // Catch: java.lang.Throwable -> L42
            com.bytedance.embedapplog.sm.xt.j(r14, r2)     // Catch: java.lang.Throwable -> L42
            boolean r14 = com.bytedance.embedapplog.uc.xt     // Catch: java.lang.Throwable -> L42
            if (r14 == 0) goto L46
            java.lang.String r14 = "queryEvent, "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = r14.concat(r0)     // Catch: java.lang.Throwable -> L42
            com.bytedance.embedapplog.uc.j(r14, r8)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            r13 = r0
            r8 = r12
            goto L5d
        L46:
            org.json.JSONObject r14 = r2.m()     // Catch: java.lang.Throwable -> L42
            r7.put(r14)     // Catch: java.lang.Throwable -> L42
            long r0 = r2.j     // Catch: java.lang.Throwable -> L42
            int r14 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r14 <= 0) goto L54
            r9 = r0
        L54:
            int r13 = r13 + 1
            goto L1c
        L57:
            r12.close()
            goto L65
        L5b:
            r0 = move-exception
            r13 = r0
        L5d:
            com.bytedance.embedapplog.uc.xt(r13)     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L65
            r8.close()
        L65:
            r17[r15] = r7
            r18[r15] = r9
            return
        L6a:
            r0 = move-exception
            r12 = r0
            if (r8 == 0) goto L71
            r8.close()
        L71:
            throw r12
    }

    private static void j(com.bytedance.embedapplog.ya r2) {
            java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r0 = com.bytedance.embedapplog.sm.xt
            java.lang.String r1 = r2.r()
            r0.put(r1, r2)
            return
    }

    private void j(org.json.JSONObject r15, com.bytedance.embedapplog.ry r16, com.bytedance.embedapplog.aq r17, com.bytedance.embedapplog.kc r18, com.bytedance.embedapplog.zz r19, android.database.sqlite.SQLiteDatabase r20, java.lang.String r21, org.json.JSONArray[] r22, long[] r23) {
            r14 = this;
            r1 = r16
            r6 = r21
            java.lang.String r0 = "packLostData, "
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r0.concat(r2)
            com.bytedance.embedapplog.uc.j(r0)
            r1.f2123r = r6
            r8 = 0
            r1.kt = r8
            r9 = r19
            r9.f2123r = r6
            r2 = 0
            r0 = r14
            r3 = r17
            r4 = r18
            r5 = r20
            org.json.JSONArray r10 = r0.j(r1, r2, r3, r4, r5)
            r11 = r1
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = r20
            r7 = r23
            r3 = r6
            r6 = r22
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.length()
            r12 = 1
            if (r0 != 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r11.ws = r0
            boolean r0 = r14.j(r7)
            r13 = 0
            if (r0 != 0) goto L50
            boolean r0 = r11.ws
            if (r0 != 0) goto L4d
            goto L50
        L4d:
            r2 = r20
            goto L72
        L50:
            boolean r0 = r11.ws
            if (r0 != 0) goto L57
            r2 = r17
            goto L58
        L57:
            r2 = r13
        L58:
            if (r0 != 0) goto L5f
            r4 = r10
        L5b:
            r3 = r2
            r0 = r9
            r9 = r1
            goto L61
        L5f:
            r4 = r13
            goto L5b
        L61:
            r7 = 0
            r2 = 0
            r1 = r15
            r5 = r22
            r6 = r23
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            r2 = r20
            r14.j(r0, r8, r2, r12)
            r1 = r9
            r9 = r0
        L72:
            com.bytedance.embedapplog.ya[] r0 = com.bytedance.embedapplog.sm.f2100m
            int r0 = r0.length
            if (r1 >= r0) goto L8c
            r4 = 0
            r5 = 0
            r0 = r14
            r3 = r21
            r6 = r22
            r7 = r23
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r14.j(r7)
            if (r2 == 0) goto L4d
            r2 = r13
            goto L5f
        L8c:
            return
    }

    private void j(org.json.JSONObject r12, com.bytedance.embedapplog.ry r13, com.bytedance.embedapplog.zz r14, android.database.sqlite.SQLiteDatabase r15, org.json.JSONArray[] r16, long[] r17, java.util.ArrayList<com.bytedance.embedapplog.zz> r18) {
            r11 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "packCurrentData, "
            r1.<init>(r2)
            java.lang.String r2 = r13.f2123r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.embedapplog.uc.j(r1)
            java.lang.String r1 = r13.f2123r
            boolean r8 = r11.j(r1)
            java.lang.String r3 = r13.f2123r
            r4 = 1
            r5 = 0
            r1 = 0
            r0 = r11
            r2 = r15
            r6 = r16
            r7 = r17
            int r9 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            r10 = 0
            if (r8 != 0) goto L32
            boolean r0 = r11.j(r6)
            if (r0 == 0) goto L54
        L32:
            if (r8 == 0) goto L36
            r2 = r13
            goto L37
        L36:
            r2 = r10
        L37:
            r4 = 0
            r7 = 0
            r3 = 0
            r1 = r12
            r0 = r14
            r5 = r16
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            com.bytedance.embedapplog.ya[] r0 = com.bytedance.embedapplog.sm.f2100m
            int r0 = r0.length
            if (r9 < r0) goto L58
            com.bytedance.embedapplog.ya r0 = r14.ae()
            com.bytedance.embedapplog.zz r0 = (com.bytedance.embedapplog.zz) r0
            r0.oq()
            r1 = r18
            r1.add(r0)
        L54:
            r8 = r14
        L55:
            r2 = r15
        L56:
            r1 = r9
            goto L60
        L58:
            r0 = r14
        L59:
            r1 = 1
            r2 = r15
            r11.j(r0, r1, r15, r1)
            r8 = r0
            goto L56
        L60:
            com.bytedance.embedapplog.ya[] r0 = com.bytedance.embedapplog.sm.f2100m
            int r0 = r0.length
            if (r1 >= r0) goto L91
            java.lang.String r3 = r13.f2123r
            r4 = 1
            r5 = 0
            r0 = r11
            r6 = r16
            r7 = r17
            int r9 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            boolean r0 = r11.j(r6)
            if (r0 == 0) goto L8f
            java.lang.String r0 = r13.f2123r
            boolean r0 = r11.j(r0)
            if (r0 == 0) goto L83
            r2 = r13
            goto L84
        L83:
            r2 = r10
        L84:
            r4 = 0
            r7 = 0
            r3 = 0
            r1 = r12
            r5 = r16
            r0 = r8
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            goto L59
        L8f:
            r0 = r8
            goto L55
        L91:
            return
    }

    private void j(org.json.JSONObject r22, com.bytedance.embedapplog.ry r23, com.bytedance.embedapplog.zz r24, com.bytedance.embedapplog.kc r25, com.bytedance.embedapplog.aq r26, android.database.sqlite.SQLiteDatabase r27, org.json.JSONArray[] r28, long[] r29) {
            r21 = this;
            r1 = r23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "packHistoryData, "
            r0.<init>(r2)
            java.lang.String r2 = r1.f2123r
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.embedapplog.uc.j(r0)
            r2 = 1
            r0 = r21
            r4 = r25
            r3 = r26
            r5 = r27
            org.json.JSONArray r8 = r0.j(r1, r2, r3, r4, r5)
            r11 = r1
            int r0 = r8.length()
            r12 = 1
            if (r0 != 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r11.ws = r0
            java.lang.String r3 = r11.f2123r
            r4 = 1
            r5 = 0
            r1 = 0
            r0 = r21
            r2 = r27
            r6 = r28
            r7 = r29
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r11.ws
            if (r2 == 0) goto L62
            java.lang.String r2 = r11.f2123r
            boolean r2 = r0.j(r2)
            if (r2 == 0) goto L4e
            r15 = r11
            goto L50
        L4e:
            r2 = 0
            r15 = r2
        L50:
            r17 = 0
            r20 = 0
            r16 = 0
            r14 = r22
            r13 = r24
            r18 = r28
            r19 = r29
            r13.j(r14, r15, r16, r17, r18, r19, r20)
            goto L72
        L62:
            r5 = 0
            r10 = 0
            r4 = r22
            r3 = r24
            r6 = r26
            r9 = r29
            r7 = r8
            r8 = r28
            r3.j(r4, r5, r6, r7, r8, r9, r10)
        L72:
            r13 = r24
            r2 = r27
            r0.j(r13, r12, r2, r12)
        L79:
            com.bytedance.embedapplog.ya[] r3 = com.bytedance.embedapplog.sm.f2100m
            int r3 = r3.length
            if (r1 >= r3) goto La6
            java.lang.String r3 = r11.f2123r
            r4 = 1
            r5 = 0
            r6 = r28
            r7 = r29
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r0.j(r7)
            if (r2 == 0) goto La1
            r17 = 0
            r20 = 0
            r15 = 0
            r16 = 0
            r14 = r22
            r18 = r28
            r19 = r7
            r13.j(r14, r15, r16, r17, r18, r19, r20)
            goto L72
        La1:
            r13 = r24
            r2 = r27
            goto L79
        La6:
            return
    }

    private void j(org.json.JSONObject r14, boolean r15, com.bytedance.embedapplog.zz r16, android.database.sqlite.SQLiteDatabase r17) {
            r13 = this;
            r8 = r16
            int[] r9 = com.bytedance.embedapplog.sm.j
            int r10 = r9.length
            r0 = 0
            r11 = 0
        L7:
            if (r11 >= r10) goto L55
            r5 = r9[r11]
            r0 = 3
            org.json.JSONArray[] r6 = new org.json.JSONArray[r0]
            long[] r7 = new long[r0]
            r1 = 0
            java.lang.String r3 = r8.f2123r
            r0 = r13
            r4 = r15
            r2 = r17
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r13.j(r7)
            if (r0 == 0) goto L52
        L21:
            r12 = r1
            r3 = 0
            r4 = 0
            r2 = 0
            r0 = r7
            r7 = r5
            r5 = r6
            r6 = r0
            r1 = r14
            r0 = r8
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            r8 = r6
            r6 = r5
            r5 = r7
            r7 = r8
            r8 = r0
            r0 = 1
            r4 = r15
            r2 = r17
            r13.j(r8, r15, r2, r0)
            r1 = r12
        L3b:
            com.bytedance.embedapplog.ya[] r0 = com.bytedance.embedapplog.sm.f2100m
            int r0 = r0.length
            if (r1 >= r0) goto L52
            java.lang.String r3 = r8.f2123r
            r0 = r13
            int r1 = r0.j(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r13.j(r7)
            if (r2 == 0) goto L4e
            goto L21
        L4e:
            r4 = r15
            r2 = r17
            goto L3b
        L52:
            int r11 = r11 + 1
            goto L7
        L55:
            return
    }

    private boolean j(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "needLaunch, "
            r0.<init>(r1)
            java.lang.String r1 = r2.ae
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.bytedance.embedapplog.uc.j(r0)
            java.lang.String r0 = r2.ae
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L27
            r2.ae = r3
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    private boolean j(long[] r8) {
            r7 = this;
            r0 = 0
            r1 = r8[r0]
            r3 = 1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L19
            r1 = r8[r3]
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L19
            r1 = 2
            r1 = r8[r1]
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L18
            goto L19
        L18:
            return r0
        L19:
            return r3
    }

    private java.lang.String xt(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DELETE FROM page WHERE session_id"
            r0.<init>(r1)
            if (r4 == 0) goto Lc
            java.lang.String r4 = "='"
            goto Le
        Lc:
            java.lang.String r4 = "!='"
        Le:
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @androidx.annotation.NonNull
    public java.util.ArrayList<com.bytedance.embedapplog.zz> j() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r1 = com.bytedance.embedapplog.sm.xt
            java.lang.String r2 = "pack"
            java.lang.Object r1 = r1.get(r2)
            com.bytedance.embedapplog.zz r1 = (com.bytedance.embedapplog.zz) r1
            r2 = 0
            com.bytedance.embedapplog.sm$j r3 = r5.up     // Catch: java.lang.Throwable -> L35
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "SELECT * FROM pack ORDER BY _id DESC LIMIT 8"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L35
        L1c:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            com.bytedance.embedapplog.ya r1 = r1.ae()     // Catch: java.lang.Throwable -> L2f
            com.bytedance.embedapplog.zz r1 = (com.bytedance.embedapplog.zz) r1     // Catch: java.lang.Throwable -> L2f
            r1.j(r3)     // Catch: java.lang.Throwable -> L2f
            r0.add(r1)     // Catch: java.lang.Throwable -> L2f
            goto L1c
        L2f:
            r1 = move-exception
            goto L37
        L31:
            r3.close()
            goto L3d
        L35:
            r1 = move-exception
            r3 = r2
        L37:
            com.bytedance.embedapplog.uc.xt(r1)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L3d
            goto L31
        L3d:
            java.lang.String r1 = "queryPack, "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r3)
            com.bytedance.embedapplog.uc.j(r1, r2)
            return r0
        L4b:
            r0 = move-exception
            if (r3 == 0) goto L51
            r3.close()
        L51:
            throw r0
    }

    public synchronized java.util.ArrayList<com.bytedance.embedapplog.zz> j(org.json.JSONObject r27) {
            r26 = this;
            r1 = r26
            monitor-enter(r26)
            java.util.HashMap<java.lang.String, com.bytedance.embedapplog.ya> r0 = com.bytedance.embedapplog.sm.xt     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "launch"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L125
            r3 = r2
            com.bytedance.embedapplog.ry r3 = (com.bytedance.embedapplog.ry) r3     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "terminate"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L125
            r9 = r2
            com.bytedance.embedapplog.aq r9 = (com.bytedance.embedapplog.aq) r9     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "page"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L125
            r10 = r2
            com.bytedance.embedapplog.kc r10 = (com.bytedance.embedapplog.kc) r10     // Catch: java.lang.Throwable -> L125
            java.lang.String r2 = "pack"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L125
            r4 = r0
            com.bytedance.embedapplog.zz r4 = (com.bytedance.embedapplog.zz) r4     // Catch: java.lang.Throwable -> L125
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r8.<init>()     // Catch: java.lang.Throwable -> L125
            r0 = 3
            r2 = 0
            org.json.JSONArray[] r6 = new org.json.JSONArray[r0]     // Catch: java.lang.Throwable -> L12b
            long[] r7 = new long[r0]     // Catch: java.lang.Throwable -> L12b
            com.bytedance.embedapplog.sm$j r0 = r1.up     // Catch: java.lang.Throwable -> L12b
            android.database.sqlite.SQLiteDatabase r5 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L12b
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L127
            java.lang.String r0 = "SELECT * FROM launch ORDER BY _id LIMIT 5"
            android.database.Cursor r11 = r5.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L127
            com.bytedance.embedapplog.f r0 = r1.f2101r     // Catch: java.lang.Throwable -> Ld3
            com.bytedance.embedapplog.ch r0 = r0.ae()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r12 = r0.j()     // Catch: java.lang.Throwable -> Ld3
            boolean r0 = r0.xt()     // Catch: java.lang.Throwable -> Ld3
            r2 = r27
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = -9223372036854775808
        L5a:
            boolean r20 = r11.moveToNext()     // Catch: java.lang.Throwable -> Ld3
            if (r20 == 0) goto Ld7
            r3.j(r11)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = r3.f2123r     // Catch: java.lang.Throwable -> Ld3
            r4.f2123r = r2     // Catch: java.lang.Throwable -> Ld3
            r2 = r27
            org.json.JSONObject r20 = r1.j(r3, r2)     // Catch: java.lang.Throwable -> Ld3
            r21 = -9223372036854775808
            java.lang.String r13 = r3.f2123r     // Catch: java.lang.Throwable -> Ld3
            boolean r13 = android.text.TextUtils.equals(r13, r12)     // Catch: java.lang.Throwable -> Ld3
            r14 = 1
            if (r13 == 0) goto L9c
            r13 = r0 ^ 1
            r3.ws = r13     // Catch: java.lang.Throwable -> L94
            r2 = r20
            r1.j(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94
            r1 = r2
            r13 = r8
            r2 = r9
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r10
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r4
            r4 = r2
            r2 = r1
            r1 = r26
        L92:
            r10 = 1
            goto Lc4
        L94:
            r0 = move-exception
            r7 = r5
            r13 = r8
        L97:
            r1 = r26
        L99:
            r2 = r11
            goto L12e
        L9c:
            r13 = r8
            r2 = r9
            r1 = r20
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
            r7 = r5
            long r14 = r3.j     // Catch: java.lang.Throwable -> Ld1
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r5 >= 0) goto Laf
            r16 = r14
        Laf:
            int r5 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r5 <= 0) goto Lb5
            r18 = r14
        Lb5:
            r8 = r6
            r5 = r10
            r6 = r2
            r2 = r1
            r1 = r26
            r1.j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcf
            r25 = r6
            r6 = r4
            r4 = r25
            goto L92
        Lc4:
            r1.j(r2, r10, r6, r7)     // Catch: java.lang.Throwable -> Lcf
            r10 = r5
            r5 = r7
            r7 = r9
            r9 = r4
            r4 = r6
            r6 = r8
            r8 = r13
            goto L5a
        Lcf:
            r0 = move-exception
            goto L99
        Ld1:
            r0 = move-exception
            goto L97
        Ld3:
            r0 = move-exception
            r7 = r5
            r13 = r8
            goto L99
        Ld7:
            r13 = r8
            r21 = -9223372036854775808
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r6
            r6 = r4
            r4 = r9
            r9 = r7
            r7 = r5
            r5 = r10
            int r0 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r0 == 0) goto Lfe
            int r0 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r0 == 0) goto Lfe
            java.lang.String r0 = "DELETE FROM launch WHERE _id>=? AND _id<=?"
            java.lang.String r10 = java.lang.String.valueOf(r16)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r14 = java.lang.String.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String[] r10 = new java.lang.String[]{r10, r14}     // Catch: java.lang.Throwable -> Lcf
            r7.execSQL(r0, r10)     // Catch: java.lang.Throwable -> Lcf
        Lfe:
            int r0 = r11.getCount()     // Catch: java.lang.Throwable -> Lcf
            r10 = 5
            if (r0 >= r10) goto L116
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto L116
            r10 = r9
            r9 = r8
            r8 = r12
            r1.j(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcf
            r4 = r6
            r0 = 0
            r1.j(r2, r0, r4, r7)     // Catch: java.lang.Throwable -> Lcf
        L116:
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lcf
            r11.close()     // Catch: java.lang.Throwable -> L11d
            goto L121
        L11d:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)     // Catch: java.lang.Throwable -> L125
        L121:
            com.bytedance.embedapplog.ri.j(r7)     // Catch: java.lang.Throwable -> L125
            goto L137
        L125:
            r0 = move-exception
            goto L149
        L127:
            r0 = move-exception
            r7 = r5
            r13 = r8
            goto L12e
        L12b:
            r0 = move-exception
            r13 = r8
            r7 = r2
        L12e:
            com.bytedance.embedapplog.uc.xt(r0)     // Catch: java.lang.Throwable -> L139
            if (r2 == 0) goto L121
            r2.close()     // Catch: java.lang.Throwable -> L11d
            goto L121
        L137:
            monitor-exit(r26)
            return r13
        L139:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L145
            r2.close()     // Catch: java.lang.Throwable -> L141
            goto L145
        L141:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)     // Catch: java.lang.Throwable -> L125
        L145:
            com.bytedance.embedapplog.ri.j(r7)     // Catch: java.lang.Throwable -> L125
            throw r3     // Catch: java.lang.Throwable -> L125
        L149:
            monitor-exit(r26)     // Catch: java.lang.Throwable -> L125
            throw r0
    }

    public void j(com.bytedance.embedapplog.zz r12, boolean r13, android.database.sqlite.SQLiteDatabase r14, boolean r15) {
            r11 = this;
            if (r14 != 0) goto Lb
            com.bytedance.embedapplog.sm$j r14 = r11.up
            android.database.sqlite.SQLiteDatabase r14 = r14.getWritableDatabase()
            r0 = 1
            r1 = 1
            goto Ld
        Lb:
            r0 = 0
            r1 = 0
        Ld:
            if (r1 == 0) goto L17
            r14.beginTransaction()     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            r12 = r0
            goto L81
        L17:
            r2 = 0
            if (r15 == 0) goto L37
            java.lang.String r15 = "pack"
            r0 = 0
            android.content.ContentValues r4 = r12.xt(r0)     // Catch: java.lang.Throwable -> L13
            long r4 = r14.insert(r15, r0, r4)     // Catch: java.lang.Throwable -> L13
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 >= 0) goto L37
            com.bytedance.embedapplog.ry r12 = r12.mi     // Catch: java.lang.Throwable -> L13
            if (r12 == 0) goto L31
            r11.j(r0)     // Catch: java.lang.Throwable -> L13
        L31:
            if (r1 == 0) goto L89
            com.bytedance.embedapplog.ri.j(r14)
            return
        L37:
            long r9 = r12.av     // Catch: java.lang.Throwable -> L13
            int r15 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r15 <= 0) goto L4d
            java.lang.String r5 = "event"
            int r6 = r12.oq     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = r12.f2123r     // Catch: java.lang.Throwable -> L13
            r4 = r11
            r8 = r13
            java.lang.String r13 = r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L13
            r14.execSQL(r13)     // Catch: java.lang.Throwable -> L13
            goto L4e
        L4d:
            r8 = r13
        L4e:
            long r9 = r12.f2125w     // Catch: java.lang.Throwable -> L13
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 <= 0) goto L62
            java.lang.String r5 = "eventv3"
            int r6 = r12.oq     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = r12.f2123r     // Catch: java.lang.Throwable -> L13
            r4 = r11
            java.lang.String r13 = r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L13
            r14.execSQL(r13)     // Catch: java.lang.Throwable -> L13
        L62:
            long r9 = r12.tj     // Catch: java.lang.Throwable -> L13
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 <= 0) goto L76
            java.lang.String r5 = "event_misc"
            int r6 = r12.oq     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = r12.f2123r     // Catch: java.lang.Throwable -> L13
            r4 = r11
            java.lang.String r12 = r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L13
            r14.execSQL(r12)     // Catch: java.lang.Throwable -> L13
        L76:
            if (r1 == 0) goto L7b
            r14.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L13
        L7b:
            if (r1 == 0) goto L89
            com.bytedance.embedapplog.ri.j(r14)
            return
        L81:
            com.bytedance.embedapplog.uc.xt(r12)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            com.bytedance.embedapplog.ri.j(r14)
        L89:
            return
        L8a:
            r0 = move-exception
            r12 = r0
            if (r1 == 0) goto L91
            com.bytedance.embedapplog.ri.j(r14)
        L91:
            throw r12
    }

    public void j(@androidx.annotation.NonNull java.util.ArrayList<com.bytedance.embedapplog.ya> r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = 0
            com.bytedance.embedapplog.sm$j r3 = r8.up     // Catch: java.lang.Throwable -> L68
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L68
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L44
            r4 = r1
        L1a:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L61
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L44
            com.bytedance.embedapplog.ya r5 = (com.bytedance.embedapplog.ya) r5     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r5.r()     // Catch: java.lang.Throwable -> L44
            android.content.ContentValues r4 = r5.xt(r4)     // Catch: java.lang.Throwable -> L44
            long r6 = r3.insert(r6, r1, r4)     // Catch: java.lang.Throwable -> L44
            r5.j = r6     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "event"
            java.lang.String r7 = r5.r()     // Catch: java.lang.Throwable -> L44
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L47
            r2.add(r5)     // Catch: java.lang.Throwable -> L44
            goto L1a
        L44:
            r9 = move-exception
            r1 = r3
            goto L69
        L47:
            java.lang.String r6 = "eventv3"
            java.lang.String r7 = r5.r()     // Catch: java.lang.Throwable -> L44
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L57
            r2.add(r5)     // Catch: java.lang.Throwable -> L44
            goto L1a
        L57:
            boolean r6 = r5 instanceof com.bytedance.embedapplog.ry     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L1a
            com.bytedance.embedapplog.ry r5 = (com.bytedance.embedapplog.ry) r5     // Catch: java.lang.Throwable -> L44
            r0.add(r5)     // Catch: java.lang.Throwable -> L44
            goto L1a
        L61:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L44
            com.bytedance.embedapplog.ri.j(r3)
            return
        L68:
            r9 = move-exception
        L69:
            com.bytedance.embedapplog.uc.xt(r9)     // Catch: java.lang.Throwable -> L70
            com.bytedance.embedapplog.ri.j(r1)
            return
        L70:
            r9 = move-exception
            com.bytedance.embedapplog.ri.j(r1)
            throw r9
    }

    public void j(java.util.ArrayList<com.bytedance.embedapplog.zz> r9, java.util.ArrayList<com.bytedance.embedapplog.zz> r10, java.util.ArrayList<com.bytedance.embedapplog.zz> r11) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setResult, "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r0, r1)
            java.util.Iterator r0 = r10.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            com.bytedance.embedapplog.zz r2 = (com.bytedance.embedapplog.zz) r2
            boolean r3 = r11.contains(r2)
            if (r3 != 0) goto L1e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r2.xt
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 864000000(0x337f9800, double:4.26872718E-315)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L1e
            r9.add(r2)
            r0.remove()
            goto L1e
        L49:
            com.bytedance.embedapplog.sm$j r0 = r8.up     // Catch: java.lang.Throwable -> Lba
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> Lba
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L9b
            r2 = 1
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L6e
        L57:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L83
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L6e
            com.bytedance.embedapplog.zz r3 = (com.bytedance.embedapplog.zz) r3     // Catch: java.lang.Throwable -> L6e
            boolean r4 = r11.contains(r3)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L70
            r4 = 0
            r8.j(r3, r2, r0, r4)     // Catch: java.lang.Throwable -> L6e
            goto L57
        L6e:
            r9 = move-exception
            goto L80
        L70:
            java.lang.String r4 = "DELETE FROM pack WHERE _id=?"
            long r5 = r3.j     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L6e
            r0.execSQL(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L57
        L80:
            com.bytedance.embedapplog.uc.xt(r9)     // Catch: java.lang.Throwable -> L9b
        L83:
            java.util.Iterator r9 = r10.iterator()     // Catch: java.lang.Throwable -> L9b
        L87:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto Lb3
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L9b
            com.bytedance.embedapplog.zz r10 = (com.bytedance.embedapplog.zz) r10     // Catch: java.lang.Throwable -> L9b
            com.bytedance.embedapplog.ry r3 = r10.mi     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L9e
            r8.j(r1)     // Catch: java.lang.Throwable -> L9b
            goto L9e
        L9b:
            r9 = move-exception
            r1 = r0
            goto Lbb
        L9e:
            boolean r3 = r11.contains(r10)     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto L87
            long r3 = r10.j     // Catch: java.lang.Throwable -> L9b
            int r5 = r10.jy     // Catch: java.lang.Throwable -> L9b
            int r5 = r5 + r2
            r10.jy = r5     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = r8.j(r3, r5)     // Catch: java.lang.Throwable -> L9b
            r0.execSQL(r10)     // Catch: java.lang.Throwable -> L9b
            goto L87
        Lb3:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L9b
            com.bytedance.embedapplog.ri.j(r0)
            return
        Lba:
            r9 = move-exception
        Lbb:
            com.bytedance.embedapplog.uc.xt(r9)     // Catch: java.lang.Throwable -> Lc2
            com.bytedance.embedapplog.ri.j(r1)
            return
        Lc2:
            r9 = move-exception
            com.bytedance.embedapplog.ri.j(r1)
            throw r9
    }
}
