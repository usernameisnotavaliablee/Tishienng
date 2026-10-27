package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl {
    private static volatile com.bytedance.msdk.up.tl j;
    private javax.crypto.Cipher cw;
    private java.security.Key xt;

    private tl() {
            r3 = this;
            r3.<init>()
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Exception -> L2a
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r1.z()     // Catch: java.lang.Exception -> L2a
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.lang.Exception -> L2a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch: java.lang.Exception -> L2a
            java.security.PublicKey r0 = r1.generatePublic(r0)     // Catch: java.lang.Exception -> L2a
            r3.xt = r0     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Exception -> L2a
            r3.cw = r0     // Catch: java.lang.Exception -> L2a
            return
        L2a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public static com.bytedance.msdk.up.tl j() {
            com.bytedance.msdk.up.tl r0 = com.bytedance.msdk.up.tl.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.up.tl> r0 = com.bytedance.msdk.up.tl.class
            monitor-enter(r0)
            com.bytedance.msdk.up.tl r1 = com.bytedance.msdk.up.tl.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.up.tl r1 = new com.bytedance.msdk.up.tl     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.up.tl.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.up.tl r0 = com.bytedance.msdk.up.tl.j
            return r0
    }

    public java.lang.String j(com.bytedance.msdk.xt.cw r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8b
            java.lang.String r1 = "pangle"
            java.lang.String r2 = r6.ff()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8b
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r6.zs()     // Catch: org.json.JSONException -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L28
            if (r2 != 0) goto L2a
            java.lang.String r2 = "t"
            java.lang.String r3 = r6.zs()     // Catch: org.json.JSONException -> L28
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L28
            goto L2a
        L28:
            r6 = move-exception
            goto L71
        L2a:
            java.lang.String r2 = r6.qg()     // Catch: org.json.JSONException -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L28
            if (r2 != 0) goto L3d
            java.lang.String r2 = "d"
            java.lang.String r3 = r6.qg()     // Catch: org.json.JSONException -> L28
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L28
        L3d:
            java.lang.String r2 = "e"
            double r3 = r6.t()     // Catch: org.json.JSONException -> L28
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: org.json.JSONException -> L28
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L28
            java.lang.String r2 = r6.ln()     // Catch: org.json.JSONException -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L28
            if (r2 != 0) goto L5d
            java.lang.String r2 = "an"
            java.lang.String r3 = r6.ln()     // Catch: org.json.JSONException -> L28
            r1.putOpt(r2, r3)     // Catch: org.json.JSONException -> L28
        L5d:
            java.lang.String r2 = r6.xp()     // Catch: org.json.JSONException -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "aun"
            java.lang.String r6 = r6.xp()     // Catch: org.json.JSONException -> L28
            r1.putOpt(r2, r6)     // Catch: org.json.JSONException -> L28
            goto L74
        L71:
            com.bytedance.sdk.component.utils.vl.j(r6)
        L74:
            int r6 = r1.length()
            if (r6 <= 0) goto L8b
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L87
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r5.j(r6)     // Catch: java.lang.Exception -> L87
            goto L8b
        L87:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L8b:
            return r0
    }

    public java.lang.String j(byte[] r9) throws java.lang.Exception {
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            javax.crypto.Cipher r0 = r8.cw
            r1 = 0
            if (r0 != 0) goto L2e
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r0 = r0.z()
            byte[] r0 = android.util.Base64.decode(r0, r1)
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec
            r2.<init>(r0)
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.PublicKey r0 = r0.generatePublic(r2)
            r8.xt = r0
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            r8.cw = r0
        L2e:
            javax.crypto.Cipher r0 = r8.cw
            java.security.Key r2 = r8.xt
            r3 = 1
            r0.init(r3, r2)
            int r0 = r9.length
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r4 = 0
            r5 = 0
        L3e:
            int r6 = r0 - r4
            if (r6 <= 0) goto L5b
            r7 = 117(0x75, float:1.64E-43)
            if (r6 <= r7) goto L4d
            javax.crypto.Cipher r6 = r8.cw
            byte[] r4 = r6.doFinal(r9, r4, r7)
            goto L53
        L4d:
            javax.crypto.Cipher r7 = r8.cw
            byte[] r4 = r7.doFinal(r9, r4, r6)
        L53:
            int r6 = r4.length
            r2.write(r4, r1, r6)
            int r5 = r5 + r3
            int r4 = r5 * 117
            goto L3e
        L5b:
            byte[] r9 = r2.toByteArray()
            r2.close()
            r0 = 2
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r0)
            return r9
    }
}
