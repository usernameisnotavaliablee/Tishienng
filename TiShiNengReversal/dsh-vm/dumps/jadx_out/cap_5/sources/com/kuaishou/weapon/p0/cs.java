package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cs {
    private com.kuaishou.weapon.p0.ct a;

    public cs() {
            r1 = this;
            r1.<init>()
            com.kuaishou.weapon.p0.ct r0 = new com.kuaishou.weapon.p0.ct
            r0.<init>()
            r1.a = r0
            return
    }

    public org.json.JSONObject a() {
            r8 = this;
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.Class<android.net.wifi.WifiInfo> r1 = android.net.wifi.WifiInfo.class
            java.lang.Class<android.telephony.TelephonyManager> r2 = android.telephony.TelephonyManager.class
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> La1
            r3.<init>()     // Catch: java.lang.Exception -> La1
            com.kuaishou.weapon.p0.ct r4 = new com.kuaishou.weapon.p0.ct     // Catch: java.lang.Exception -> La1
            r4.<init>()     // Catch: java.lang.Exception -> La1
            java.lang.String r5 = "getDeviceId"
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r5 = r4.a(r2, r5, r7)     // Catch: java.lang.Exception -> La1
            if (r5 <= 0) goto L20
            java.lang.String r7 = "0"
            r3.put(r7, r5)     // Catch: java.lang.Exception -> La1
        L20:
            java.lang.String r5 = "getSubscriberId"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r5 = r4.a(r2, r5, r7)     // Catch: java.lang.Exception -> La1
            if (r5 <= 0) goto L2f
            java.lang.String r7 = "1"
            r3.put(r7, r5)     // Catch: java.lang.Exception -> La1
        L2f:
            java.lang.String r5 = "getSimSerialNumber"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r2 = r4.a(r2, r5, r7)     // Catch: java.lang.Exception -> La1
            if (r2 <= 0) goto L3e
            java.lang.String r5 = "2"
            r3.put(r5, r2)     // Catch: java.lang.Exception -> La1
        L3e:
            java.lang.String r2 = "getLatitude"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r2 = r4.a(r0, r2, r5)     // Catch: java.lang.Exception -> La1
            if (r2 <= 0) goto L4d
            java.lang.String r5 = "3"
            r3.put(r5, r2)     // Catch: java.lang.Exception -> La1
        L4d:
            java.lang.String r2 = "getLongitude"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r0 = r4.a(r0, r2, r5)     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto L5c
            java.lang.String r2 = "4"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> La1
        L5c:
            java.lang.String r0 = "getMacAddress"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r0 = r4.a(r1, r0, r2)     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto L6b
            java.lang.String r2 = "6"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> La1
        L6b:
            java.lang.String r0 = "getBSSID"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r0 = r4.a(r1, r0, r2)     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto L7a
            java.lang.String r2 = "7"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> La1
        L7a:
            java.lang.String r0 = "getRssi"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r0 = r4.a(r1, r0, r2)     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto L89
            java.lang.String r1 = "8"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> La1
        L89:
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.String r1 = "toString"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> La1
            int r0 = r4.a(r0, r1, r2)     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto L9a
            java.lang.String r1 = "9"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> La1
        L9a:
            int r0 = r3.length()     // Catch: java.lang.Exception -> La1
            if (r0 <= 0) goto La1
            return r3
        La1:
            r0 = 0
            return r0
    }

    public org.json.JSONObject b() {
            r10 = this;
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.Class<android.net.wifi.WifiInfo> r1 = android.net.wifi.WifiInfo.class
            java.lang.Class<android.telephony.TelephonyManager> r2 = android.telephony.TelephonyManager.class
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb2
            r4.<init>()     // Catch: java.lang.Exception -> Lb2
            com.kuaishou.weapon.p0.ct r5 = r10.a     // Catch: java.lang.Exception -> Lb2
            int r5 = r5.a()     // Catch: java.lang.Exception -> Lb2
            if (r5 > 0) goto L15
            return r3
        L15:
            com.kuaishou.weapon.p0.ct r6 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r7 = "getDeviceId"
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r6 = r6.a(r5, r2, r7, r9)     // Catch: java.lang.Exception -> Lb2
            if (r6 <= 0) goto L27
            java.lang.String r7 = "0"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> Lb2
        L27:
            com.kuaishou.weapon.p0.ct r6 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r7 = "getSubscriberId"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r6 = r6.a(r5, r2, r7, r9)     // Catch: java.lang.Exception -> Lb2
            if (r6 <= 0) goto L38
            java.lang.String r7 = "1"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> Lb2
        L38:
            com.kuaishou.weapon.p0.ct r6 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r7 = "getSimSerialNumber"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r2 = r6.a(r5, r2, r7, r9)     // Catch: java.lang.Exception -> Lb2
            if (r2 <= 0) goto L49
            java.lang.String r6 = "2"
            r4.put(r6, r2)     // Catch: java.lang.Exception -> Lb2
        L49:
            com.kuaishou.weapon.p0.ct r2 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "getLatitude"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r2 = r2.a(r5, r0, r6, r7)     // Catch: java.lang.Exception -> Lb2
            if (r2 <= 0) goto L5a
            java.lang.String r6 = "3"
            r4.put(r6, r2)     // Catch: java.lang.Exception -> Lb2
        L5a:
            com.kuaishou.weapon.p0.ct r2 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "getLongitude"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r0 = r2.a(r5, r0, r6, r7)     // Catch: java.lang.Exception -> Lb2
            if (r0 <= 0) goto L6b
            java.lang.String r2 = "4"
            r4.put(r2, r0)     // Catch: java.lang.Exception -> Lb2
        L6b:
            com.kuaishou.weapon.p0.ct r0 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "getMacAddress"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r0 = r0.a(r5, r1, r2, r6)     // Catch: java.lang.Exception -> Lb2
            if (r0 <= 0) goto L7c
            java.lang.String r2 = "6"
            r4.put(r2, r0)     // Catch: java.lang.Exception -> Lb2
        L7c:
            com.kuaishou.weapon.p0.ct r0 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "getBSSID"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r0 = r0.a(r5, r1, r2, r6)     // Catch: java.lang.Exception -> Lb2
            if (r0 <= 0) goto L8d
            java.lang.String r2 = "7"
            r4.put(r2, r0)     // Catch: java.lang.Exception -> Lb2
        L8d:
            com.kuaishou.weapon.p0.ct r0 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = "getRssi"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r0 = r0.a(r5, r1, r2, r6)     // Catch: java.lang.Exception -> Lb2
            if (r0 <= 0) goto L9e
            java.lang.String r1 = "8"
            r4.put(r1, r0)     // Catch: java.lang.Exception -> Lb2
        L9e:
            com.kuaishou.weapon.p0.ct r0 = r10.a     // Catch: java.lang.Exception -> Lb2
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            java.lang.String r2 = "toString"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lb2
            int r0 = r0.a(r5, r1, r2, r6)     // Catch: java.lang.Exception -> Lb2
            if (r0 <= 0) goto Lb1
            java.lang.String r1 = "9"
            r4.put(r1, r0)     // Catch: java.lang.Exception -> Lb2
        Lb1:
            return r4
        Lb2:
            return r3
    }
}
