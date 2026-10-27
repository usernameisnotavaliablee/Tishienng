package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DplusCacheApi {
    private static final java.lang.String a = "DplusCacheApi";
    private android.os.HandlerThread b;
    private android.os.Handler c;
    private final int d;
    private java.util.ArrayList<java.lang.Integer> e;
    private java.util.ArrayList<java.lang.Integer> f;
    private java.util.ArrayList<java.lang.Integer> g;
    private java.util.ArrayList<java.lang.Integer> h;
    private java.util.ArrayList<java.lang.Integer> i;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SingletonHolder {
        private static final com.umeng.socialize.net.dplus.cache1.DplusCacheApi a = null;

        static {
                com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi
                r1 = 0
                r0.<init>(r1)
                com.umeng.socialize.net.dplus.cache1.DplusCacheApi.SingletonHolder.a = r0
                return
        }

        private SingletonHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.socialize.net.dplus.cache1.DplusCacheApi a() {
                com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0 = com.umeng.socialize.net.dplus.cache1.DplusCacheApi.SingletonHolder.a
                return r0
        }
    }

    private DplusCacheApi() {
            r3 = this;
            r3.<init>()
            r0 = 1048576(0x100000, float:1.469368E-39)
            r3.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.i = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "DplusCacheApi"
            r2 = 10
            r0.<init>(r1, r2)
            r3.b = r0
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r3.b
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r3.c = r0
            return
    }

    /* synthetic */ DplusCacheApi(com.umeng.socialize.net.dplus.cache1.DplusCacheApi.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.ArrayList a(com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0) {
            java.util.ArrayList<java.lang.Integer> r0 = r0.e
            return r0
    }

    private static org.json.JSONObject a() throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "s_sdk_v"
            java.lang.String r2 = "7.3.2"
            r0.put(r1, r2)
            java.lang.String r1 = "s_pcv"
            java.lang.String r2 = "3.0"
            r0.put(r1, r2)
            return r0
    }

    static /* synthetic */ java.util.ArrayList b(com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0) {
            java.util.ArrayList<java.lang.Integer> r0 = r0.f
            return r0
    }

    static /* synthetic */ java.util.ArrayList c(com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0) {
            java.util.ArrayList<java.lang.Integer> r0 = r0.g
            return r0
    }

    public static double checkFile() {
            java.lang.String r0 = "share.db"
            java.io.File r0 = com.umeng.socialize.utils.ContextUtil.getDataFile(r0)
            r1 = 0
            if (r0 == 0) goto L16
            boolean r3 = r0.exists()
            if (r3 == 0) goto L16
            long r0 = r0.length()
            double r0 = (double) r0
            return r0
        L16:
            return r1
    }

    static /* synthetic */ java.util.ArrayList d(com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0) {
            java.util.ArrayList<java.lang.Integer> r0 = r0.h
            return r0
    }

    static /* synthetic */ java.util.ArrayList e(com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0) {
            java.util.ArrayList<java.lang.Integer> r0 = r0.i
            return r0
    }

    public static final com.umeng.socialize.net.dplus.cache1.DplusCacheApi getInstance() {
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0 = com.umeng.socialize.net.dplus.cache1.DplusCacheApi.SingletonHolder.a()
            return r0
    }

    public void cleanCache(android.content.Context r3) {
            r2 = this;
            android.os.Handler r0 = r2.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$2 r1 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public void closeDBConnection(android.content.Context r3) {
            r2 = this;
            android.os.Handler r0 = r2.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$1 r1 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$1
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public void deleteAll(android.content.Context r2) {
            r1 = this;
            android.os.Handler r2 = r1.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$6 r0 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$6
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    public void deleteAllAsnc(android.content.Context r2) {
            r1 = this;
            android.content.Context r2 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.net.dplus.db.DBManager r2 = com.umeng.socialize.net.dplus.db.DBManager.get(r2)
            java.lang.String r0 = "stats"
            r2.deleteTable(r0)
            return
    }

    public void deleteFile(android.content.Context r3) {
            r2 = this;
            android.os.Handler r0 = r2.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$5 r1 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$5
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public void deleteFileAsnc(android.content.Context r4) {
            r3 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r3.e
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.e
            java.lang.String r2 = "s_e"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.e
            r0.clear()
        L18:
            java.util.ArrayList<java.lang.Integer> r0 = r3.f
            int r0 = r0.size()
            if (r0 <= 0) goto L30
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.f
            java.lang.String r2 = "auth"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.f
            r0.clear()
        L30:
            java.util.ArrayList<java.lang.Integer> r0 = r3.h
            int r0 = r0.size()
            if (r0 <= 0) goto L48
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.h
            java.lang.String r2 = "dau"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.h
            r0.clear()
        L48:
            java.util.ArrayList<java.lang.Integer> r0 = r3.g
            int r0 = r0.size()
            if (r0 <= 0) goto L60
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.g
            java.lang.String r2 = "userinfo"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.g
            r0.clear()
        L60:
            java.util.ArrayList<java.lang.Integer> r0 = r3.i
            int r0 = r0.size()
            if (r0 <= 0) goto L78
            com.umeng.socialize.net.dplus.db.DBManager r4 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r0 = r3.i
            java.lang.String r1 = "stats"
            r4.delete(r0, r1)
            java.util.ArrayList<java.lang.Integer> r4 = r3.i
            r4.clear()
        L78:
            return
    }

    public void readFile(android.content.Context r3, int r4, com.umeng.socialize.net.dplus.cache1.DplusCacheListener r5) {
            r2 = this;
            android.os.Handler r0 = r2.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$4 r1 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$4
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }

    public org.json.JSONObject readFileAsnc(android.content.Context r22, int r23) {
            r21 = this;
            r1 = r21
            double r2 = checkFile()
            r4 = 4707387510509010944(0x4154000000000000, double:5242880.0)
            java.lang.String r0 = "stats"
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L1b
            android.content.Context r2 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.net.dplus.db.DBManager r2 = com.umeng.socialize.net.dplus.db.DBManager.get(r2)
            r2.deleteTable(r0)
            return r6
        L1b:
            r4 = 4672484613396889600(0x40d8000000000000, double:24576.0)
            double r2 = r2 + r4
            r4 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 <= 0) goto L27
            r2 = 0
            r12 = 0
            goto L29
        L27:
            r2 = 1
            r12 = 1
        L29:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc0
            r3.<init>()     // Catch: org.json.JSONException -> Lc0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc0
            r3.<init>()     // Catch: org.json.JSONException -> Lc0
            com.umeng.socialize.net.dplus.db.DBManager r7 = com.umeng.socialize.net.dplus.db.DBManager.get(r22)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r8 = "s_e"
            java.util.ArrayList<java.lang.Integer> r9 = r1.e     // Catch: org.json.JSONException -> Lc0
            r10 = 4697245615254405120(0x412ff80000000000, double:1047552.0)
            org.json.JSONArray r13 = r7.select(r8, r9, r10, r12)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r7 = r13.toString()     // Catch: org.json.JSONException -> Lc0
            byte[] r7 = r7.getBytes()     // Catch: org.json.JSONException -> Lc0
            int r7 = r7.length     // Catch: org.json.JSONException -> Lc0
            double r7 = (double) r7     // Catch: org.json.JSONException -> Lc0
            r9 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r14 = r7 + r9
            com.umeng.socialize.net.dplus.db.DBManager r7 = com.umeng.socialize.net.dplus.db.DBManager.get(r22)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r8 = "auth"
            java.util.ArrayList<java.lang.Integer> r9 = r1.f     // Catch: org.json.JSONException -> Lc0
            double r10 = r4 - r14
            org.json.JSONArray r7 = r7.select(r8, r9, r10, r12)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r8 = r7.toString()     // Catch: org.json.JSONException -> Lc0
            byte[] r8 = r8.getBytes()     // Catch: org.json.JSONException -> Lc0
            int r8 = r8.length     // Catch: org.json.JSONException -> Lc0
            double r8 = (double) r8     // Catch: org.json.JSONException -> Lc0
            double r14 = r14 + r8
            r8 = r7
            com.umeng.socialize.net.dplus.db.DBManager r7 = com.umeng.socialize.net.dplus.db.DBManager.get(r22)     // Catch: org.json.JSONException -> Lc0
            r9 = r8
            java.lang.String r8 = "userinfo"
            r10 = r9
            java.util.ArrayList<java.lang.Integer> r9 = r1.g     // Catch: org.json.JSONException -> Lc0
            r16 = r10
            double r10 = r4 - r14
            r17 = r16
            org.json.JSONArray r7 = r7.select(r8, r9, r10, r12)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r8 = r7.toString()     // Catch: org.json.JSONException -> Lc0
            byte[] r8 = r8.getBytes()     // Catch: org.json.JSONException -> Lc0
            int r8 = r8.length     // Catch: org.json.JSONException -> Lc0
            double r8 = (double) r8     // Catch: org.json.JSONException -> Lc0
            double r14 = r14 + r8
            r8 = r7
            com.umeng.socialize.net.dplus.db.DBManager r7 = com.umeng.socialize.net.dplus.db.DBManager.get(r22)     // Catch: org.json.JSONException -> Lc0
            r9 = r8
            java.lang.String r8 = "dau"
            r10 = r9
            java.util.ArrayList<java.lang.Integer> r9 = r1.h     // Catch: org.json.JSONException -> Lc0
            r16 = r10
            double r10 = r4 - r14
            r18 = r16
            org.json.JSONArray r7 = r7.select(r8, r9, r10, r12)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r8 = r7.toString()     // Catch: org.json.JSONException -> Lc0
            byte[] r8 = r8.getBytes()     // Catch: org.json.JSONException -> Lc0
            int r8 = r8.length     // Catch: org.json.JSONException -> Lc0
            double r8 = (double) r8     // Catch: org.json.JSONException -> Lc0
            double r14 = r14 + r8
            double r8 = checkFile()     // Catch: org.json.JSONException -> Lc0
            int r10 = r7.length()     // Catch: org.json.JSONException -> Lc0
            if (r10 == 0) goto Lc5
            java.lang.String r10 = "dau"
            r3.put(r10, r7)     // Catch: org.json.JSONException -> Lc0
            goto Lc5
        Lc0:
            r0 = move-exception
            r16 = r4
            goto L150
        Lc5:
            int r10 = r13.length()     // Catch: org.json.JSONException -> Lc0
            if (r10 == 0) goto Ld0
            java.lang.String r10 = "s_e"
            r3.put(r10, r13)     // Catch: org.json.JSONException -> Lc0
        Ld0:
            int r10 = r17.length()     // Catch: org.json.JSONException -> Lc0
            if (r10 == 0) goto Lde
            java.lang.String r10 = "auth"
            r11 = r17
            r3.put(r10, r11)     // Catch: org.json.JSONException -> Lc0
            goto Le0
        Lde:
            r11 = r17
        Le0:
            int r10 = r18.length()     // Catch: org.json.JSONException -> Lc0
            if (r10 == 0) goto Lf3
            java.lang.String r10 = "userinfo"
            r16 = r4
            r4 = r18
            r3.put(r10, r4)     // Catch: org.json.JSONException -> Lf0
            goto Lf7
        Lf0:
            r0 = move-exception
            goto L150
        Lf3:
            r16 = r4
            r4 = r18
        Lf7:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lf0
            r5.<init>()     // Catch: org.json.JSONException -> Lf0
            r18 = 4692750811720056832(0x4120000000000000, double:524288.0)
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 >= 0) goto L10d
            r8 = 24583(0x6007, float:3.4448E-41)
            r9 = r23
            if (r9 != r8) goto L109
            goto L10d
        L109:
            r14 = r7
            r7 = r5
            r5 = r11
            goto L12b
        L10d:
            com.umeng.socialize.net.dplus.db.DBManager r5 = com.umeng.socialize.net.dplus.db.DBManager.get(r22)     // Catch: org.json.JSONException -> Lf0
            java.lang.String r8 = "stats"
            java.util.ArrayList<java.lang.Integer> r9 = r1.i     // Catch: org.json.JSONException -> Lf0
            double r14 = r16 - r14
            r20 = r7
            r7 = r5
            r5 = r11
            r10 = r14
            r14 = r20
            org.json.JSONArray r7 = r7.select(r8, r9, r10, r12)     // Catch: org.json.JSONException -> Lf0
            int r8 = r7.length()     // Catch: org.json.JSONException -> Lf0
            if (r8 == 0) goto L12b
            r3.put(r0, r7)     // Catch: org.json.JSONException -> Lf0
        L12b:
            java.lang.String r0 = "share"
            r2.put(r0, r3)     // Catch: org.json.JSONException -> Lf0
            int r0 = r13.length()     // Catch: org.json.JSONException -> Lf0
            if (r0 != 0) goto L155
            int r0 = r5.length()     // Catch: org.json.JSONException -> Lf0
            if (r0 != 0) goto L155
            int r0 = r4.length()     // Catch: org.json.JSONException -> Lf0
            if (r0 != 0) goto L155
            int r0 = r14.length()     // Catch: org.json.JSONException -> Lf0
            if (r0 != 0) goto L155
            int r0 = r7.length()     // Catch: org.json.JSONException -> Lf0
            if (r0 != 0) goto L155
            r2 = r6
            goto L155
        L150:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r3, r0)
        L155:
            if (r2 == 0) goto L166
            java.lang.String r0 = r2.toString()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            double r3 = (double) r0
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L166
            return r6
        L166:
            return r2
    }

    public void saveFile(android.content.Context r8, org.json.JSONObject r9, int r10, com.umeng.socialize.net.dplus.cache1.DplusCacheListener r11) {
            r7 = this;
            android.os.Handler r0 = r7.c
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi$3 r1 = new com.umeng.socialize.net.dplus.cache1.DplusCacheApi$3
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            return
    }
}
