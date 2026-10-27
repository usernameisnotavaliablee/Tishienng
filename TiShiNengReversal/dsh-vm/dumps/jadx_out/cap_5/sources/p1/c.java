package p1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private final com.huawei.hms.framework.network.grs.GrsBaseInfo a;
    private final android.content.Context b;
    private final java.util.Set<java.lang.String> c;

    public c(com.huawei.hms.framework.network.grs.GrsBaseInfo r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            r1.a = r2
            r1.b = r3
            return
    }

    private java.lang.String f() {
            r5 = this;
            android.content.Context r0 = r5.b
            java.lang.String r0 = r0.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r0 = com.huawei.hms.framework.network.grs.f.b.a(r0)
            java.util.Set r0 = r0.f()
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = ""
            if (r1 == 0) goto L17
            return r2
        L17:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            r3.put(r4)
            goto L25
        L35:
            java.lang.String r0 = "services"
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L50
            java.lang.String r0 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "GrsRequestInfo"
            java.lang.String r3 = "post service list is:%s"
            com.huawei.hms.framework.common.Logger.d(r0, r3, r2)
            java.lang.String r0 = r1.toString()
            return r0
        L50:
            return r2
    }

    private java.lang.String g() {
            r5 = this;
            java.lang.String r0 = "getGeoipService enter"
            java.lang.String r1 = "GrsRequestInfo"
            com.huawei.hms.framework.common.Logger.v(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Set<java.lang.String> r3 = r5.c
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.put(r4)
            goto L17
        L27:
            java.lang.String r3 = "services"
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L40
            java.lang.String r2 = r0.toString()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "post query service list is:%s"
            com.huawei.hms.framework.common.Logger.v(r1, r2, r3)
            java.lang.String r0 = r0.toString()
            return r0
        L40:
            java.lang.String r0 = ""
            return r0
    }

    public android.content.Context a() {
            r1 = this;
            android.content.Context r0 = r1.b
            return r0
    }

    public void b(java.lang.String r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.c
            r0.add(r2)
            return
    }

    public com.huawei.hms.framework.network.grs.GrsBaseInfo c() {
            r1 = this;
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r1.a
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.c
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            java.lang.String r0 = r1.f()
            return r0
        Ld:
            java.lang.String r0 = r1.g()
            return r0
    }

    public java.util.Set<java.lang.String> e() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.c
            return r0
    }
}
