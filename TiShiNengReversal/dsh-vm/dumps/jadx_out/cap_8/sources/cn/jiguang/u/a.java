package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r6) {
            java.lang.String r1 = "JCore"
            r0 = 0
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L15
            r2 = 101(0x65, float:1.42E-43)
            r3 = 0
            r4 = 0
            r0 = r6
            java.lang.Object r6 = cn.jiguang.u.f.a(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L15
            boolean r0 = r6 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L31
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Throwable -> L15
            return r6
        L15:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getDInfo exception: "
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "JDeviceHelper"
            cn.jiguang.t.b.e(r0, r6)
        L31:
            r6 = 0
            return r6
    }
}
