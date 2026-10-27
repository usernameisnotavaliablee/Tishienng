package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class i {
    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String j(int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            r2 = 0
        Lb:
            if (r2 >= r6) goto L3f
            r3 = 3
            int r3 = r1.nextInt(r3)
            if (r3 == 0) goto L33
            r4 = 25
            r5 = 1
            if (r3 == r5) goto L28
            r5 = 2
            if (r3 == r5) goto L1d
            goto L3c
        L1d:
            int r3 = r1.nextInt(r4)
            int r3 = r3 + 97
            char r3 = (char) r3
            r0.append(r3)
            goto L3c
        L28:
            int r3 = r1.nextInt(r4)
            int r3 = r3 + 65
            char r3 = (char) r3
            r0.append(r3)
            goto L3c
        L33:
            r3 = 10
            int r3 = r1.nextInt(r3)
            r0.append(r3)
        L3c:
            int r2 = r2 + 1
            goto Lb
        L3f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String j(com.bytedance.msdk.api.cw r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "adn_name"
            java.lang.String r3 = r6.g()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "custom_adn_name"
            java.lang.String r3 = r6.oq()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "slot_id"
            java.lang.String r3 = r6.qv()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "level_tag"
            java.lang.String r3 = r6.ws()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "ecpm"
            java.lang.String r3 = r6.jy()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "bidding_type"
            int r3 = r6.az()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "error_msg"
            java.lang.String r3 = r6.av()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r6.i()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "ad_rit_type"
            java.lang.String r3 = r6.xt()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "ad_sub_rit_type"
            java.lang.String r3 = r6.cw()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "segment_id"
            java.lang.String r3 = r6.r()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "abtest_id"
            java.lang.String r3 = r6.ae()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "channel"
            java.lang.String r3 = r6.up()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "sub_channel"
            java.lang.String r3 = r6.m()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L91
            java.lang.String r2 = "scenario_id"
            java.lang.String r6 = r6.tl()     // Catch: org.json.JSONException -> L91
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L91
            goto L95
        L91:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L95:
            java.lang.String r6 = r1.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto La0
            return r0
        La0:
            r1 = 16
            java.lang.String r1 = j(r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = xt(r6, r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7aAsZzOAmVVuIl0EZtpY\nPkJGdr82VIOzPBDYNEOBK0tfk/oSWyY8yZDpeYuhNuSPySmhaN8Apn3HGfL1Eq6t\nSE3OdAovRJjnilU/5ugSM/nr5yMy6WRvJUskvQ9F3PF9MLez8ZJxVDb4tgUXjq2S\n1QKSP+NwAKdY+P/H8SD5evamqCpvzO1IwpqznNI2HGAo/Kdm5OQ+Yq47A31dDUSH\nVF/TTzTfae8j6lanqgz9DmFs+kqoy253aXlz8H0z8J3VpmOGvnOUiS00Hg5SILV0\nsoXtS9JKK/V3gXmbXWyFvZhuIvLqk3C8AdyZuDdy1GAI3GjI4wjtiMd11zSTECrV\ntQIDAQAB"
            java.lang.String r1 = j(r1, r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "%04d"
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Ld7
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Ld7
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r3.<init>()     // Catch: java.lang.Throwable -> Ld7
            r3.append(r2)     // Catch: java.lang.Throwable -> Ld7
            r3.append(r1)     // Catch: java.lang.Throwable -> Ld7
            r3.append(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Ld7
            return r6
        Ld7:
            return r0
    }

    private static java.lang.String j(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L2d
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            java.security.PublicKey r4 = r1.generatePublic(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r1.init(r2, r4)     // Catch: java.lang.Throwable -> L2d
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r1.doFinal(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Throwable -> L2d
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public static boolean j() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.Map r0 = r0.gq()
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.util.Map r1 = r1.la()
            java.lang.String r2 = "eefo"
            if (r0 == 0) goto L27
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L27
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3c
            return r0
        L27:
            if (r1 == 0) goto L3c
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3c
            return r0
        L3c:
            r0 = 0
            return r0
    }

    private static java.lang.String xt(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> Lb
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = com.bytedance.msdk.tl.j.j(r1, r2)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
