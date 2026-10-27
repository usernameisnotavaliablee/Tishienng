package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class j implements com.huawei.agconnect.config.impl.f {
    private final org.json.JSONObject a;

    j(java.io.InputStream r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            org.json.JSONObject r1 = r0.b(r1)
            r0.a = r1
            r0.c(r2)
            return
    }

    private org.json.JSONObject b(java.io.InputStream r3) {
            r2 = this;
            if (r3 == 0) goto Le
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "UTF-8"
            java.lang.String r3 = com.huawei.agconnect.config.impl.b.g(r3, r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            return r3
    }

    private void c(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "app_id"
            org.json.JSONObject r6 = r5.e(r6)     // Catch: org.json.JSONException -> L6c
            if (r6 != 0) goto L9
            goto L6c
        L9:
            java.lang.String r1 = "/configuration_version"
            java.lang.String r2 = ""
            java.lang.String r1 = r5.a(r1, r2)     // Catch: org.json.JSONException -> L6c
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch: org.json.JSONException -> L6c
            java.lang.String r3 = "0.0"
            r2.<init>(r3)     // Catch: org.json.JSONException -> L6c
            double r3 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L20 org.json.JSONException -> L6c
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L20 org.json.JSONException -> L6c
        L20:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: org.json.JSONException -> L6c
            java.lang.String r3 = "2.0"
            r1.<init>(r3)     // Catch: org.json.JSONException -> L6c
            int r1 = r2.compareTo(r1)     // Catch: org.json.JSONException -> L6c
            if (r1 != 0) goto L3d
            org.json.JSONObject r1 = r5.a     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "client"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L6c
            java.lang.String r6 = r6.getString(r0)     // Catch: org.json.JSONException -> L6c
            r1.put(r0, r6)     // Catch: org.json.JSONException -> L6c
            goto L6c
        L3d:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: org.json.JSONException -> L6c
            java.lang.String r1 = "3.0"
            r0.<init>(r1)     // Catch: org.json.JSONException -> L6c
            int r0 = r2.compareTo(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 < 0) goto L6c
            java.util.Iterator r0 = r6.keys()     // Catch: org.json.JSONException -> L6c
        L4e:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> L6c
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L6c
            java.lang.String r2 = "package_name"
            boolean r2 = r2.equals(r1)     // Catch: org.json.JSONException -> L6c
            if (r2 != 0) goto L4e
            java.lang.Object r2 = r6.get(r1)     // Catch: org.json.JSONException -> L6c
            org.json.JSONObject r3 = r5.a     // Catch: org.json.JSONException -> L6c
            r5.d(r1, r2, r3)     // Catch: org.json.JSONException -> L6c
            goto L4e
        L6c:
            return
    }

    private void d(java.lang.String r5, java.lang.Object r6, org.json.JSONObject r7) throws org.json.JSONException {
            r4 = this;
            if (r5 == 0) goto L2c
            if (r6 == 0) goto L2c
            if (r7 != 0) goto L7
            goto L2c
        L7:
            boolean r0 = r6 instanceof org.json.JSONObject
            if (r0 == 0) goto L29
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.util.Iterator r0 = r6.keys()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            org.json.JSONObject r3 = r7.getJSONObject(r5)
            r4.d(r1, r2, r3)
            goto L11
        L29:
            r7.put(r5, r6)
        L2c:
            return
    }

    private org.json.JSONObject e(java.lang.String r5) throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = r4.a
            java.lang.String r1 = "appInfos"
            org.json.JSONArray r0 = r0.getJSONArray(r1)
            r1 = 0
        L9:
            int r2 = r0.length()
            if (r1 >= r2) goto L23
            org.json.JSONObject r2 = r0.getJSONObject(r1)
            java.lang.String r3 = "package_name"
            java.lang.String r3 = r2.getString(r3)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L20
            return r2
        L20:
            int r1 = r1 + 1
            goto L9
        L23:
            r5 = 0
            return r5
    }

    @Override // com.huawei.agconnect.config.impl.f
    public java.lang.String a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "/"
            boolean r1 = r5.endsWith(r0)
            if (r1 == 0) goto L9
            goto L2c
        L9:
            java.lang.String[] r5 = r5.split(r0)
            org.json.JSONObject r0 = r4.a     // Catch: org.json.JSONException -> L2c
            r1 = 1
            r2 = 1
        L11:
            int r3 = r5.length     // Catch: org.json.JSONException -> L2c
            if (r2 >= r3) goto L2c
            int r3 = r5.length     // Catch: org.json.JSONException -> L2c
            int r3 = r3 - r1
            if (r2 != r3) goto L23
            r5 = r5[r2]     // Catch: org.json.JSONException -> L2c
            java.lang.Object r5 = r0.get(r5)     // Catch: org.json.JSONException -> L2c
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L2c
            return r5
        L23:
            r3 = r5[r2]     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L2c
            int r2 = r2 + 1
            goto L11
        L2c:
            return r6
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InputStreamReader{config="
            r0.append(r1)
            org.json.JSONObject r1 = r2.a
            java.lang.String r1 = r1.toString()
            int r1 = r1.hashCode()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
