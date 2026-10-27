package cn.jiguang.commons.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void c(java.lang.String r6) {
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> L1b
            r4.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "sm"
            r1 = 3
            r4.putInt(r0, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "ds"
            r4.putString(r0, r6)     // Catch: java.lang.Exception -> L1b
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1b
            r0 = 0
            r1 = 0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 0
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L1b
        L1b:
            return
    }

    public static java.lang.String ct(java.util.Map<java.lang.String, java.lang.String> r4) {
            r0 = 0
            if (r4 == 0) goto L36
            int r1 = r4.size()
            if (r1 > 0) goto La
            goto L36
        La:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Set r4 = r4.entrySet()     // Catch: org.json.JSONException -> L36
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> L36
        L17:
            boolean r2 = r4.hasNext()     // Catch: org.json.JSONException -> L36
            if (r2 == 0) goto L31
            java.lang.Object r2 = r4.next()     // Catch: org.json.JSONException -> L36
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L36
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L36
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L36
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L36
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L36
            goto L17
        L31:
            java.lang.String r4 = r1.toString()     // Catch: org.json.JSONException -> L36
            return r4
        L36:
            return r0
    }

    public static java.lang.Object h(java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, byte[] r9) {
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "m"
            r4.putString(r0, r6)
            java.lang.String r6 = "u"
            r4.putString(r6, r7)
            if (r8 == 0) goto L1a
            java.lang.String r6 = ct(r8)
            java.lang.String r6 = r6.toString()
            goto L1b
        L1a:
            r6 = 0
        L1b:
            java.lang.String r7 = "h"
            r4.putString(r7, r6)
            java.lang.String r6 = "b"
            r4.putByteArray(r6, r9)
            java.lang.String r6 = "sm"
            r7 = 2
            r4.putInt(r6, r7)
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r0 = 0
            r1 = 0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 0
            java.lang.Object r6 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static void r(int r6) {
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> L1b
            r4.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "sm"
            r1 = 4
            r4.putInt(r0, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "dc"
            r4.putInt(r0, r6)     // Catch: java.lang.Exception -> L1b
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1b
            r0 = 0
            r1 = 0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 0
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L1b
        L1b:
            return
    }

    public static void u(java.lang.String r6) {
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "sm"
            r1 = 1
            r4.putInt(r0, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "ds"
            r4.putString(r0, r6)     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            r1 = 0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 0
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }
}
