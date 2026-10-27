package cn.jpush.android.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements java.io.Serializable {
    private static final long serialVersionUID = 2310616383854860780L;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public long f1730b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1731c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1732d;

    /* renamed from: e, reason: collision with root package name */
    public long f1733e;

    /* renamed from: f, reason: collision with root package name */
    public double f1734f;

    /* renamed from: g, reason: collision with root package name */
    public double f1735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1736h;

    /* renamed from: i, reason: collision with root package name */
    public int f1737i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f1738j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f1739k;
    public int l;
    public int m;
    public int n;
    public long o;
    public java.lang.String p;
    public int q;
    public java.lang.String r;
    public int s;
    public cn.jpush.android.d.d t;

    public b() {
            r2 = this;
            r2.<init>()
            r0 = 4641240890982006784(0x4069000000000000, double:200.0)
            r2.f1734f = r0
            r2.f1735g = r0
            return
    }

    public static cn.jpush.android.b.b a(android.content.Context r6, org.json.JSONObject r7) {
            java.lang.String r0 = "Geofence"
            if (r7 == 0) goto Lda
            cn.jpush.android.b.b r1 = new cn.jpush.android.b.b     // Catch: java.lang.Throwable -> Ldf
            r1.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r2.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r3 = "geofence message:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> Ldf
            r2.append(r3)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ldf
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "op"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1739k = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "geofenceid"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.a = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "name"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1738j = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "radius"
            long r2 = r7.optLong(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1730b = r2     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "status"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1731c = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "repeat"
            boolean r0 = r7.optBoolean(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1732d = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "repeat_week_num"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.l = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "repeat_day_num"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.m = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "repeat_time"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.n = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "expiration"
            long r2 = r7.optLong(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1733e = r2     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "type"
            r2 = 1
            int r0 = r7.optInt(r0, r2)     // Catch: java.lang.Throwable -> Ldf
            r1.f1737i = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lon"
            r2 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r4 = r7.optDouble(r0, r2)     // Catch: java.lang.Throwable -> Ldf
            r1.f1734f = r4     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lat"
            double r2 = r7.optDouble(r0, r2)     // Catch: java.lang.Throwable -> Ldf
            r1.f1735g = r2     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lastTime"
            long r2 = r7.optLong(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.o = r2     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lastTimeWeek"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.p = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "weekNum"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.q = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lastTimeDay"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.r = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "dayNum"
            int r0 = r7.optInt(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.s = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "lastGeoStatus"
            java.lang.String r0 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            r1.f1736h = r0     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "entity"
            java.lang.String r7 = r7.optString(r0)     // Catch: java.lang.Throwable -> Ldf
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Ldf
            if (r0 != 0) goto Ld9
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r6 = cn.jpush.android.helper.JCoreHelper.getAppKey(r6)     // Catch: java.lang.Throwable -> Ldf
            r2 = 0
            cn.jpush.android.d.d r6 = cn.jpush.android.d.d.a(r7, r0, r6, r2)     // Catch: java.lang.Throwable -> Ldf
            r1.t = r6     // Catch: java.lang.Throwable -> Ldf
        Ld9:
            return r1
        Lda:
            java.lang.String r6 = "geofence json is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> Ldf
        Ldf:
            r6 = 0
            return r6
    }

    public static cn.jpush.android.b.b a(org.json.JSONObject r6) {
            java.lang.String r0 = "Geofence"
            if (r6 == 0) goto L95
            cn.jpush.android.b.b r1 = new cn.jpush.android.b.b     // Catch: java.lang.Throwable -> L9a
            r1.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r2.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "geofence message:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L9a
            r2.append(r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "op"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1739k = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "geofenceid"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L9a
            r1.a = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1738j = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "radius"
            long r2 = r6.optLong(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1730b = r2     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "status"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1731c = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "repeat"
            boolean r0 = r6.optBoolean(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1732d = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "repeat_week_num"
            int r0 = r6.optInt(r0)     // Catch: java.lang.Throwable -> L9a
            r1.l = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "repeat_day_num"
            int r0 = r6.optInt(r0)     // Catch: java.lang.Throwable -> L9a
            r1.m = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "repeat_time"
            int r0 = r6.optInt(r0)     // Catch: java.lang.Throwable -> L9a
            r1.n = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "expiration"
            long r2 = r6.optLong(r0)     // Catch: java.lang.Throwable -> L9a
            r1.f1733e = r2     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "type"
            r2 = 1
            int r0 = r6.optInt(r0, r2)     // Catch: java.lang.Throwable -> L9a
            r1.f1737i = r0     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "center"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L94
            java.lang.String r0 = "lon"
            r2 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r4 = r6.optDouble(r0, r2)     // Catch: java.lang.Throwable -> L9a
            r1.f1734f = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "lat"
            double r2 = r6.optDouble(r0, r2)     // Catch: java.lang.Throwable -> L9a
            r1.f1735g = r2     // Catch: java.lang.Throwable -> L9a
        L94:
            return r1
        L95:
            java.lang.String r6 = "geofence json is null"
            cn.jpush.android.helper.Logger.w(r0, r6)     // Catch: java.lang.Throwable -> L9a
        L9a:
            r6 = 0
            return r6
    }

    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "op"
            java.lang.String r2 = r4.f1739k     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "geofenceid"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "name"
            java.lang.String r2 = r4.f1738j     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "radius"
            long r2 = r4.f1730b     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "status"
            java.lang.String r2 = r4.f1731c     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "repeat"
            boolean r2 = r4.f1732d     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "repeat_week_num"
            int r2 = r4.l     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "repeat_day_num"
            int r2 = r4.m     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "repeat_time"
            int r2 = r4.n     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "expiration"
            long r2 = r4.f1733e     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "type"
            int r2 = r4.f1737i     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lon"
            double r2 = r4.f1734f     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lat"
            double r2 = r4.f1735g     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lastTime"
            long r2 = r4.o     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lastTimeWeek"
            java.lang.String r2 = r4.p     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "weekNum"
            int r2 = r4.q     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lastTimeDay"
            java.lang.String r2 = r4.r     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "dayNum"
            int r2 = r4.s     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "lastGeoStatus"
            java.lang.String r2 = r4.f1736h     // Catch: java.lang.Throwable -> L97
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L97
            cn.jpush.android.d.d r1 = r4.t     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L96
            java.lang.String r2 = "entity"
            java.lang.String r1 = r1.f1762i     // Catch: java.lang.Throwable -> L97
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L97
        L96:
            return r0
        L97:
            r0 = 0
            return r0
    }

    public void a(cn.jpush.android.b.b r3) {
            r2 = this;
            java.lang.String r0 = r3.f1736h
            r2.f1736h = r0
            long r0 = r3.o
            r2.o = r0
            java.lang.String r0 = r3.p
            r2.p = r0
            java.lang.String r0 = r3.r
            r2.r = r0
            int r0 = r3.q
            r2.q = r0
            int r3 = r3.s
            r2.s = r3
            return
    }

    public void b(org.json.JSONObject r12) {
            r11 = this;
            java.lang.String r0 = "expiration"
            java.lang.String r1 = "repeat_time"
            java.lang.String r2 = "repeat_day_num"
            java.lang.String r3 = "repeat_week_num"
            java.lang.String r4 = "repeat"
            java.lang.String r5 = "status"
            java.lang.String r6 = "name"
            boolean r7 = r12.has(r6)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto L1a
            java.lang.String r6 = r12.optString(r6)     // Catch: java.lang.Throwable -> Ld6
            r11.f1738j = r6     // Catch: java.lang.Throwable -> Ld6
        L1a:
            java.lang.String r6 = "radius"
            r7 = -1
            long r6 = r12.optLong(r6, r7)     // Catch: java.lang.Throwable -> Ld6
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L2a
            r11.f1730b = r6     // Catch: java.lang.Throwable -> Ld6
        L2a:
            boolean r6 = r12.has(r5)     // Catch: java.lang.Throwable -> Ld6
            if (r6 == 0) goto L36
            java.lang.String r5 = r12.optString(r5)     // Catch: java.lang.Throwable -> Ld6
            r11.f1731c = r5     // Catch: java.lang.Throwable -> Ld6
        L36:
            boolean r5 = r12.has(r4)     // Catch: java.lang.Throwable -> Ld6
            if (r5 == 0) goto L68
            boolean r4 = r12.optBoolean(r4)     // Catch: java.lang.Throwable -> Ld6
            r11.f1732d = r4     // Catch: java.lang.Throwable -> Ld6
            if (r4 == 0) goto L68
            boolean r4 = r12.has(r3)     // Catch: java.lang.Throwable -> Ld6
            if (r4 == 0) goto L50
            int r3 = r12.optInt(r3)     // Catch: java.lang.Throwable -> Ld6
            r11.l = r3     // Catch: java.lang.Throwable -> Ld6
        L50:
            boolean r3 = r12.has(r2)     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto L5c
            int r2 = r12.optInt(r2)     // Catch: java.lang.Throwable -> Ld6
            r11.m = r2     // Catch: java.lang.Throwable -> Ld6
        L5c:
            boolean r2 = r12.has(r1)     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L68
            int r1 = r12.optInt(r1)     // Catch: java.lang.Throwable -> Ld6
            r11.n = r1     // Catch: java.lang.Throwable -> Ld6
        L68:
            boolean r1 = r12.has(r0)     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto L74
            long r0 = r12.optLong(r0)     // Catch: java.lang.Throwable -> Ld6
            r11.f1733e = r0     // Catch: java.lang.Throwable -> Ld6
        L74:
            java.lang.String r0 = "center"
            org.json.JSONObject r12 = r12.optJSONObject(r0)     // Catch: java.lang.Throwable -> Ld6
            if (r12 == 0) goto Ld6
            java.lang.String r0 = "lon"
            r1 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r3 = r12.optDouble(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "lat"
            double r0 = r12.optDouble(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            r5 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 < 0) goto Lb3
            r5 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 > 0) goto Lb3
            r5 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 < 0) goto Lb3
            r5 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto Lb3
            r11.f1734f = r3     // Catch: java.lang.Throwable -> Ld6
            r11.f1735g = r0     // Catch: java.lang.Throwable -> Ld6
            return
        Lb3:
            java.lang.String r12 = "Geofence"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r2.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "update center failed because value invalid, ["
            r2.append(r5)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = ","
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "]"
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            cn.jpush.android.helper.Logger.w(r12, r0)     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            return
    }
}
