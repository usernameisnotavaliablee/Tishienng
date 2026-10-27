package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k1 {

    static class pgla implements java.util.Comparator<java.lang.Object> {
        pgla() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
                int r1 = r1.level
                int r1 = java.lang.Math.abs(r1)
                android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2
                int r2 = r2.level
                int r2 = java.lang.Math.abs(r2)
                if (r1 <= r2) goto L14
                r1 = 1
                return r1
            L14:
                if (r1 != r2) goto L18
                r1 = 0
                return r1
            L18:
                r1 = -1
                return r1
        }
    }

    public k1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 != 0) goto Lc
            java.lang.String r6 = r0.toString()
            return r6
        Lc:
            r1 = 0
            java.lang.String r2 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L31
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Throwable -> L31
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "6765745363616e526573756c7473"
            byte[] r4 = ms.bz.bd.c.Pgl.pbla.a(r4)     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r1)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            java.lang.Object r6 = r2.invoke(r6, r1)     // Catch: java.lang.Throwable -> L31
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            goto L86
        L33:
            r6 = r1
        L34:
            if (r6 == 0) goto L81
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L31
            if (r2 <= 0) goto L81
            ms.bz.bd.c.Pgl.k1$pgla r2 = new ms.bz.bd.c.Pgl.k1$pgla     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.util.Collections.sort(r6, r2)     // Catch: java.lang.Throwable -> L31
            r2 = 0
        L45:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L31
            if (r2 >= r3) goto L7c
            r3 = 10
            if (r2 >= r3) goto L7c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "ss"
            java.lang.Object r5 = r6.get(r2)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            java.lang.String r5 = r5.SSID     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            java.lang.String r5 = ms.bz.bd.c.Pgl.q1.a(r5)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            java.lang.String r4 = "bs"
            java.lang.Object r5 = r6.get(r2)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            java.lang.String r5 = r5.BSSID     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            java.lang.String r5 = ms.bz.bd.c.Pgl.q1.a(r5)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
            r0.put(r3)     // Catch: java.lang.Throwable -> L31 org.json.JSONException -> L79
        L79:
            int r2 = r2 + 1
            goto L45
        L7c:
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L31
            goto L86
        L81:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L31
            return r6
        L86:
            if (r1 != 0) goto L8b
            java.lang.String r6 = "[]"
            return r6
        L8b:
            java.lang.String r6 = r1.trim()
            return r6
    }
}
