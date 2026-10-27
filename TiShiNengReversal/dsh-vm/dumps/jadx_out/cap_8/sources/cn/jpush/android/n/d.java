package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jpush.android.local.JPushResponse {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private org.json.JSONObject f1836b;

    /* renamed from: c, reason: collision with root package name */
    private org.json.JSONArray f1837c;

    public d(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r1 = r0
            r2 = -1
            r1.a = r2
            r0.parseBody()
            return
    }

    public d(cn.jpush.android.local.JPushResponse r8) {
            r7 = this;
            int r1 = r8.getCmd()
            long r2 = r8.getRid()
            long r4 = r8.rquestId
            java.nio.ByteBuffer r6 = r8.getBody()
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public org.json.JSONObject a() {
            r1 = this;
            org.json.JSONObject r0 = r1.f1836b
            return r0
    }

    public org.json.JSONArray b() {
            r1 = this;
            org.json.JSONArray r0 = r1.f1837c
            return r0
    }

    @Override // cn.jpush.android.local.JPushResponse
    protected void parseBody() {
            r5 = this;
            java.lang.String r0 = "geofence"
            java.lang.String r1 = "GeoPullResponse"
            java.nio.ByteBuffer r2 = r5.body     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto Le
            java.lang.String r0 = "geo pull response empty"
        La:
            cn.jpush.android.helper.Logger.ww(r1, r0)     // Catch: java.lang.Throwable -> L69
            return
        Le:
            short r2 = r2.getShort()     // Catch: java.lang.Throwable -> L69
            r5.a = r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "geo pull response error code :"
            r0.append(r2)     // Catch: java.lang.Throwable -> L69
            int r2 = r5.a     // Catch: java.lang.Throwable -> L69
            r0.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            goto La
        L2a:
            java.nio.ByteBuffer r2 = r5.body     // Catch: java.lang.Throwable -> L69
            short r2 = r2.getShort()     // Catch: java.lang.Throwable -> L69
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L69
            java.nio.ByteBuffer r3 = r5.body     // Catch: java.lang.Throwable -> L69
            r3.get(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "receive content："
            r2.append(r4)     // Catch: java.lang.Throwable -> L69
            r2.append(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L69
            cn.jpush.android.helper.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L69
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L68
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            org.json.JSONArray r3 = r2.getJSONArray(r0)     // Catch: java.lang.Throwable -> L69
            r5.f1837c = r3     // Catch: java.lang.Throwable -> L69
            r2.remove(r0)     // Catch: java.lang.Throwable -> L69
            r5.f1836b = r2     // Catch: java.lang.Throwable -> L69
        L68:
            return
        L69:
            java.lang.String r0 = "parse geo pull response failed"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushResponse
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[GeoPullResponse] - limit:"
            r0.append(r1)
            org.json.JSONObject r1 = r2.f1836b
            r0.append(r1)
            java.lang.String r1 = " - geoArray:"
            r0.append(r1)
            org.json.JSONArray r1 = r2.f1837c
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
