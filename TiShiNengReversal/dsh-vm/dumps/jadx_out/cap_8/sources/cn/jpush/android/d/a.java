package cn.jpush.android.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements java.io.Serializable {
    private static final long serialVersionUID = -942487107643335186L;
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1753b;

    /* renamed from: c, reason: collision with root package name */
    public int f1754c;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1754c = r0
            return
    }

    public a(cn.jpush.android.d.d r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1754c = r0
            java.lang.String r0 = r2.f1757d
            r1.a = r0
            java.lang.String r0 = r2.f1761h
            r1.f1753b = r0
            int r2 = r2.a
            r1.f1754c = r2
            return
    }

    public a(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1753b = r2
            r0.f1754c = r3
            return
    }

    public static cn.jpush.android.d.a a(org.json.JSONObject r4) {
            java.lang.String r0 = "msg_id"
            java.lang.String r0 = r4.optString(r0)
            java.lang.String r1 = "override_msg_id"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "msg_type"
            r3 = -1
            int r4 = r4.optInt(r2, r3)
            cn.jpush.android.d.a r2 = new cn.jpush.android.d.a
            r2.<init>(r0, r1, r4)
            return r2
    }

    private static boolean a(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            if (r1 == 0) goto Lc
        L4:
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "msg_id"
            java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "override_msg_id"
            java.lang.String r2 = r3.f1753b     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "msg_type"
            int r2 = r3.f1754c     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
        L1a:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof cn.jpush.android.d.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            cn.jpush.android.d.a r4 = (cn.jpush.android.d.a) r4
            java.lang.String r0 = r3.a
            java.lang.String r2 = r4.a
            boolean r0 = a(r0, r2)
            if (r0 != 0) goto L13
            return r1
        L13:
            int r0 = r3.f1754c
            r2 = -1
            if (r0 == r2) goto L1d
            int r2 = r4.f1754c
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.lang.String r0 = r3.f1753b
            java.lang.String r4 = r4.f1753b
            boolean r4 = a(r0, r4)
            if (r4 != 0) goto L28
            return r1
        L28:
            r4 = 1
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EntityKey{msg_id='"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", override_msg_id='"
            r0.append(r2)
            java.lang.String r2 = r3.f1753b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", msgType="
            r0.append(r1)
            int r1 = r3.f1754c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
