package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    public static android.content.Context a;
    public static java.lang.ref.WeakReference<java.util.concurrent.Future<?>> b;
    public static java.lang.ref.WeakReference<java.util.concurrent.Future<?>> c;

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.Context a() {
            android.content.Context r0 = com.uyumao.e.a
            return r0
    }

    public static java.lang.String a(android.net.NetworkInfo r3) {
            java.lang.String r0 = ""
            int r1 = r3.getSubtype()     // Catch: java.lang.Throwable -> L3f
            r2 = 20
            if (r1 == r2) goto L3c
            java.lang.String r2 = "3G"
            switch(r1) {
                case 1: goto L39;
                case 2: goto L39;
                case 3: goto L38;
                case 4: goto L39;
                case 5: goto L38;
                case 6: goto L38;
                case 7: goto L39;
                case 8: goto L38;
                case 9: goto L38;
                case 10: goto L38;
                case 11: goto L39;
                case 12: goto L38;
                case 13: goto L35;
                case 14: goto L38;
                case 15: goto L38;
                default: goto Lf;
            }
        Lf:
            java.lang.String r3 = r3.getSubtypeName()     // Catch: java.lang.Throwable -> L3f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r1 = "TD-SCDMA"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L34
            java.lang.String r1 = "WCDMA"
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L34
            java.lang.String r1 = "CDMA2000"
            boolean r0 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L33
            goto L34
        L33:
            return r3
        L34:
            return r2
        L35:
            java.lang.String r3 = "4G"
            return r3
        L38:
            return r2
        L39:
            java.lang.String r3 = "2G"
            return r3
        L3c:
            java.lang.String r3 = "5G"
            return r3
        L3f:
            return r0
    }

    public static java.lang.String a(java.lang.String r7, java.net.HttpURLConnection r8, java.lang.String r9) throws java.lang.Exception {
            byte[] r0 = r9.getBytes()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            byte[] r7 = r7.getBytes()
            r2 = 0
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            r3.write(r7)     // Catch: java.lang.Throwable -> L16
        L16:
            com.uyumao.n.a(r3)
            goto L1c
        L1a:
            r3 = r2
            goto L16
        L1c:
            byte[] r7 = r1.toByteArray()
            byte[] r7 = a(r7, r0)
            java.lang.String r3 = "POST"
            r8.setRequestMethod(r3)
            r3 = 30000(0x7530, float:4.2039E-41)
            r8.setReadTimeout(r3)
            r8.setConnectTimeout(r3)
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/octet-stream"
            r8.addRequestProperty(r3, r4)
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "xgzip"
            r8.addRequestProperty(r3, r4)
            java.lang.String r5 = "appkey"
            r8.addRequestProperty(r5, r9)
            int r9 = r7.length
            r8.setFixedLengthStreamingMode(r9)
            r9 = 1
            r8.setDoOutput(r9)
            java.io.OutputStream r2 = r8.getOutputStream()     // Catch: java.lang.Throwable -> Lcd
            r2.write(r7)     // Catch: java.lang.Throwable -> Lcd
            com.uyumao.n.a(r2)
            int r7 = r8.getResponseCode()
            r9 = 400(0x190, float:5.6E-43)
            if (r7 >= r9) goto L63
            java.io.InputStream r9 = r8.getInputStream()
            goto L67
        L63:
            java.io.InputStream r9 = r8.getErrorStream()
        L67:
            r1.reset()
            if (r9 == 0) goto L86
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
        L70:
            int r5 = r9.read(r2)     // Catch: java.lang.Throwable -> L7c
            r6 = -1
            if (r5 == r6) goto L7e
            r6 = 0
            r1.write(r2, r6, r5)     // Catch: java.lang.Throwable -> L7c
            goto L70
        L7c:
            r7 = move-exception
            goto L82
        L7e:
            com.uyumao.n.a(r9)
            goto L86
        L82:
            com.uyumao.n.a(r9)
            throw r7
        L86:
            r8.disconnect()     // Catch: java.lang.Throwable -> L8a
            goto L8b
        L8a:
        L8b:
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 != r9) goto La7
            java.lang.String r8 = r8.getHeaderField(r3)
            boolean r8 = android.text.TextUtils.equals(r4, r8)
            if (r8 == 0) goto La7
            byte[] r8 = r1.toByteArray()
            byte[] r8 = a(r8, r0)
            r1.reset()
            a(r8, r1)
        La7:
            java.lang.String r8 = r1.toString()
            if (r7 != r9) goto Lae
            return r8
        Lae:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " msg:"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            throw r9
        Lcd:
            r7 = move-exception
            com.uyumao.n.a(r2)
            throw r7
    }

    public static org.json.JSONArray a(android.content.Context r17) {
            r0 = r17
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = a(r0, r3)     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L278
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch: java.lang.Throwable -> Lae
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = r0.getNetworkOperator()     // Catch: java.lang.Throwable -> Lae
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto L2d
            r4 = 0
            r5 = 3
            r3.substring(r4, r5)     // Catch: java.lang.Throwable -> L2d
            r3.substring(r5)     // Catch: java.lang.Throwable -> L2d
        L2d:
            java.util.List r0 = r0.getAllCellInfo()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L278
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L37:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L278
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lae
            android.telephony.CellInfo r3 = (android.telephony.CellInfo) r3     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r3.isRegistered()     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L37
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae
            r5 = 29
            java.lang.String r6 = "tac"
            java.lang.String r7 = "pci"
            java.lang.String r8 = "lac"
            java.lang.String r9 = "cid"
            java.lang.String r10 = "ts"
            java.lang.String r11 = "mcc"
            java.lang.String r12 = "mnc"
            java.lang.String r13 = "nt"
            if (r4 < r5) goto Lf4
            boolean r5 = cn.jiguang.commons.L.m0.a(r3)     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto Lb2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lae
            r4.<init>()     // Catch: java.lang.Throwable -> Lae
            android.telephony.CellInfoNr r3 = cn.jiguang.commons.L.w0.a(r3)     // Catch: java.lang.Throwable -> Lae
            android.telephony.CellIdentity r3 = cn.jiguang.commons.L.y0.a(r3)     // Catch: java.lang.Throwable -> Lae
            android.telephony.CellIdentityNr r3 = cn.jiguang.commons.L.z0.a(r3)     // Catch: java.lang.Throwable -> Lae
            int r5 = com.autonavi.aps.amapapi.restruct.r.a(r3)     // Catch: java.lang.Throwable -> Lae
            long r8 = cn.jiguang.commons.L.a1.a(r3)     // Catch: java.lang.Throwable -> Lae
            int r14 = cn.jiguang.commons.L.b1.a(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r15 = cn.jiguang.commons.L.d1.a(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = cn.jiguang.commons.L.c1.a(r3)     // Catch: java.lang.Throwable -> Lae
            r16 = r2
            java.lang.String r2 = "Nr"
            r4.put(r13, r2)     // Catch: java.lang.Throwable -> L279
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L279
            java.lang.String r2 = "nci"
            r4.put(r2, r8)     // Catch: java.lang.Throwable -> L279
            r4.put(r6, r14)     // Catch: java.lang.Throwable -> L279
            r4.put(r12, r15)     // Catch: java.lang.Throwable -> L279
            r4.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r4.put(r10, r2)     // Catch: java.lang.Throwable -> L279
            r1.put(r4)     // Catch: java.lang.Throwable -> L279
            goto L274
        Lae:
            r16 = r2
            goto L279
        Lb2:
            r16 = r2
            boolean r2 = cn.jiguang.commons.L.e0.a(r3)     // Catch: java.lang.Throwable -> L279
            if (r2 == 0) goto Lf6
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L279
            r2.<init>()     // Catch: java.lang.Throwable -> L279
            android.telephony.CellInfoTdscdma r3 = cn.jiguang.commons.L.f0.a(r3)     // Catch: java.lang.Throwable -> L279
            android.telephony.CellIdentityTdscdma r3 = cn.jiguang.commons.L.h0.a(r3)     // Catch: java.lang.Throwable -> L279
            int r4 = cn.jiguang.commons.L.i0.a(r3)     // Catch: java.lang.Throwable -> L279
            int r5 = cn.jiguang.commons.L.j0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r6 = cn.jiguang.commons.L.l0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = cn.jiguang.commons.L.k0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r7 = "Tdscdma"
            r2.put(r13, r7)     // Catch: java.lang.Throwable -> L279
            r2.put(r9, r4)     // Catch: java.lang.Throwable -> L279
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L279
            r2.put(r12, r6)     // Catch: java.lang.Throwable -> L279
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L279
            r1.put(r2)     // Catch: java.lang.Throwable -> L279
            goto L274
        Lf4:
            r16 = r2
        Lf6:
            boolean r2 = r3 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Throwable -> L279
            java.lang.String r5 = "00"
            r14 = 28
            if (r2 == 0) goto L162
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L279
            r2.<init>()     // Catch: java.lang.Throwable -> L279
            android.telephony.CellInfoLte r3 = (android.telephony.CellInfoLte) r3     // Catch: java.lang.Throwable -> L279
            android.telephony.CellIdentityLte r3 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L279
            int r8 = r3.getPci()     // Catch: java.lang.Throwable -> L279
            int r9 = r3.getTac()     // Catch: java.lang.Throwable -> L279
            if (r4 < r14) goto L11c
            java.lang.String r4 = cn.jiguang.commons.L.q0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = cn.jiguang.commons.L.p0.a(r3)     // Catch: java.lang.Throwable -> L279
            goto L145
        L11c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L279
            r4.<init>()     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            int r5 = r3.getMnc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L279
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L279
            int r5 = r5 + (-2)
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L279
            int r3 = r3.getMcc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L279
        L145:
            java.lang.String r5 = "Lte"
            r2.put(r13, r5)     // Catch: java.lang.Throwable -> L279
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L279
            r2.put(r6, r9)     // Catch: java.lang.Throwable -> L279
            r2.put(r12, r4)     // Catch: java.lang.Throwable -> L279
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L279
            r1.put(r2)     // Catch: java.lang.Throwable -> L279
            goto L274
        L162:
            boolean r2 = r3 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Throwable -> L279
            if (r2 == 0) goto L1ca
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L279
            r2.<init>()     // Catch: java.lang.Throwable -> L279
            android.telephony.CellInfoWcdma r3 = (android.telephony.CellInfoWcdma) r3     // Catch: java.lang.Throwable -> L279
            android.telephony.CellIdentityWcdma r3 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L279
            int r6 = r3.getCid()     // Catch: java.lang.Throwable -> L279
            int r7 = r3.getLac()     // Catch: java.lang.Throwable -> L279
            if (r4 < r14) goto L184
            java.lang.String r4 = cn.jiguang.commons.L.t0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = cn.jiguang.commons.L.s0.a(r3)     // Catch: java.lang.Throwable -> L279
            goto L1ad
        L184:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L279
            r4.<init>()     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            int r5 = r3.getMnc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L279
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L279
            int r5 = r5 + (-2)
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L279
            int r3 = r3.getMcc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L279
        L1ad:
            java.lang.String r5 = "Wcdma"
            r2.put(r13, r5)     // Catch: java.lang.Throwable -> L279
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L279
            r2.put(r8, r7)     // Catch: java.lang.Throwable -> L279
            r2.put(r12, r4)     // Catch: java.lang.Throwable -> L279
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L279
            r1.put(r2)     // Catch: java.lang.Throwable -> L279
            goto L274
        L1ca:
            boolean r2 = r3 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Throwable -> L279
            if (r2 == 0) goto L20e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L279
            r2.<init>()     // Catch: java.lang.Throwable -> L279
            android.telephony.CellInfoCdma r3 = (android.telephony.CellInfoCdma) r3     // Catch: java.lang.Throwable -> L279
            android.telephony.CellIdentityCdma r3 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L279
            int r4 = r3.getBasestationId()     // Catch: java.lang.Throwable -> L279
            int r5 = r3.getNetworkId()     // Catch: java.lang.Throwable -> L279
            int r3 = r3.getSystemId()     // Catch: java.lang.Throwable -> L279
            java.lang.String r6 = "Cdma"
            r2.put(r13, r6)     // Catch: java.lang.Throwable -> L279
            java.lang.String r6 = "bid"
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L279
            java.lang.String r4 = "nid"
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L279
            java.lang.String r4 = "sid"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = "03"
            r2.put(r12, r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = "460"
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L279
            r1.put(r2)     // Catch: java.lang.Throwable -> L279
            goto L274
        L20e:
            boolean r2 = r3 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Throwable -> L279
            if (r2 == 0) goto L274
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L279
            r2.<init>()     // Catch: java.lang.Throwable -> L279
            android.telephony.CellInfoGsm r3 = (android.telephony.CellInfoGsm) r3     // Catch: java.lang.Throwable -> L279
            android.telephony.CellIdentityGsm r3 = r3.getCellIdentity()     // Catch: java.lang.Throwable -> L279
            int r6 = r3.getCid()     // Catch: java.lang.Throwable -> L279
            int r7 = r3.getLac()     // Catch: java.lang.Throwable -> L279
            if (r4 < r14) goto L230
            java.lang.String r4 = cn.jiguang.commons.L.d0.a(r3)     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = cn.jiguang.commons.L.b0.a(r3)     // Catch: java.lang.Throwable -> L279
            goto L259
        L230:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L279
            r4.<init>()     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            int r5 = r3.getMnc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L279
            r4.append(r5)     // Catch: java.lang.Throwable -> L279
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L279
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L279
            int r5 = r5 + (-2)
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L279
            int r3 = r3.getMcc()     // Catch: java.lang.Throwable -> L279
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L279
        L259:
            java.lang.String r5 = "Gsm"
            r2.put(r13, r5)     // Catch: java.lang.Throwable -> L279
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L279
            r2.put(r8, r7)     // Catch: java.lang.Throwable -> L279
            r2.put(r12, r4)     // Catch: java.lang.Throwable -> L279
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> L279
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L279
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L279
            r1.put(r2)     // Catch: java.lang.Throwable -> L279
        L274:
            r2 = r16
            goto L37
        L278:
            return r1
        L279:
            return r16
    }

    public static org.json.JSONArray a(org.json.JSONObject r3, org.json.JSONObject r4) {
            if (r3 == 0) goto L34
            if (r4 == 0) goto L34
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L4a
            if (r3 <= 0) goto L2b
            java.util.Iterator r3 = r4.keys()     // Catch: java.lang.Throwable -> L4a
        L17:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L4a
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4a
            goto L17
        L2b:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L4a
            r3.put(r0)     // Catch: java.lang.Throwable -> L48
            return r3
        L34:
            if (r3 == 0) goto L3f
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            r4.put(r3)     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L3f:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L4a
            r3.put(r4)     // Catch: java.lang.Throwable -> L48
            return r3
        L48:
            r4 = r3
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
    }

    public static org.json.JSONObject a(org.json.JSONObject r0, java.lang.String r1, java.lang.String r2, boolean r3) throws java.lang.Exception {
            android.os.SystemClock.elapsedRealtime()
            java.net.URL r3 = new java.net.URL
            r3.<init>(r1)
            java.lang.String r0 = r0.toString()
            java.net.URLConnection r1 = r3.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.lang.String r0 = a(r0, r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            return r1
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void a(java.io.File r4) {
            if (r4 == 0) goto L27
            boolean r0 = r4.exists()     // Catch: java.lang.Exception -> L27
            if (r0 != 0) goto L9
            goto L27
        L9:
            boolean r0 = r4.isDirectory()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L24
            java.io.File[] r0 = r4.listFiles()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L24
            int r1 = r0.length     // Catch: java.lang.Exception -> L27
            if (r1 <= 0) goto L24
            int r1 = r0.length     // Catch: java.lang.Exception -> L27
            r2 = 0
        L1a:
            if (r2 >= r1) goto L24
            r3 = r0[r2]     // Catch: java.lang.Exception -> L27
            a(r3)     // Catch: java.lang.Exception -> L27
            int r2 = r2 + 1
            goto L1a
        L24:
            r4.delete()     // Catch: java.lang.Exception -> L27
        L27:
            return
    }

    public static void a(org.json.JSONObject r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
            java.lang.String r0 = r8.toString()
            byte[] r1 = r10.getBytes()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            byte[] r0 = r0.getBytes()
            r3 = 0
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r4.write(r0)     // Catch: java.lang.Throwable -> L1a
        L1a:
            com.uyumao.n.a(r4)
            goto L20
        L1e:
            r4 = r3
            goto L1a
        L20:
            byte[] r0 = r2.toByteArray()
            byte[] r0 = a(r0, r1)
            android.os.SystemClock.elapsedRealtime()
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> Le3
            r4.<init>(r9)     // Catch: java.lang.Throwable -> Le3
            java.net.URLConnection r9 = r4.openConnection()     // Catch: java.lang.Throwable -> Le3
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> Le3
            java.lang.String r4 = "POST"
            r9.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L67
            r4 = 60000(0xea60, float:8.4078E-41)
            r9.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L67
            r9.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/octet-stream"
            r9.addRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "appkey"
            r9.addRequestProperty(r4, r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "uuid"
            java.lang.String r8 = r8.optString(r10)     // Catch: java.lang.Throwable -> L67
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L67
            r10 = 0
            r4 = 1
            if (r8 != 0) goto L6b
            java.lang.String r8 = "Rich-Resp-Code"
            java.lang.String r5 = "1"
            r9.addRequestProperty(r8, r5)     // Catch: java.lang.Throwable -> L67
            r8 = 0
            goto L6c
        L67:
            r8 = move-exception
            r4 = r3
            goto Le6
        L6b:
            r8 = 1
        L6c:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L67
            r9.setFixedLengthStreamingMode(r5)     // Catch: java.lang.Throwable -> L67
            r9.setDoOutput(r4)     // Catch: java.lang.Throwable -> L67
            java.io.OutputStream r4 = r9.getOutputStream()     // Catch: java.lang.Throwable -> L67
            r4.write(r0)     // Catch: java.lang.Throwable -> L9f
            int r0 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L9f
            r5 = 400(0x190, float:5.6E-43)
            if (r0 >= r5) goto L87
            java.io.InputStream r3 = r9.getInputStream()     // Catch: java.lang.Throwable -> L9f
            goto L8b
        L87:
            java.io.InputStream r3 = r9.getErrorStream()     // Catch: java.lang.Throwable -> L9f
        L8b:
            r2.reset()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto La1
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L9f
        L94:
            int r6 = r3.read(r5)     // Catch: java.lang.Throwable -> L9f
            r7 = -1
            if (r6 == r7) goto La1
            r2.write(r5, r10, r6)     // Catch: java.lang.Throwable -> L9f
            goto L94
        L9f:
            r8 = move-exception
            goto Le6
        La1:
            com.uyumao.n.a(r4)
            com.uyumao.n.a(r3)
            r9.disconnect()     // Catch: java.lang.Throwable -> Lab
            goto Lac
        Lab:
        Lac:
            r9 = 200(0xc8, float:2.8E-43)
            if (r0 != r9) goto Lc9
            byte[] r10 = r2.toByteArray()
            byte[] r10 = a(r10, r1)
            r2.reset()
            if (r8 == 0) goto Lc4
            a(r10, r2)
            r2.toString()
            goto Lc9
        Lc4:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10)
        Lc9:
            if (r0 != r9) goto Lcc
            return
        Lcc:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "response code "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Le3:
            r8 = move-exception
            r9 = r3
            r4 = r9
        Le6:
            com.uyumao.n.a(r4)
            com.uyumao.n.a(r3)
            if (r9 == 0) goto Lf1
            r9.disconnect()     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            throw r8
    }

    public static void a(byte[] r3, java.io.OutputStream r4) {
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L1a
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1b
        Le:
            int r1 = r0.read(r3)     // Catch: java.lang.Throwable -> L1b
            r2 = -1
            if (r1 == r2) goto L1b
            r2 = 0
            r4.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L1b
            goto Le
        L1a:
            r0 = 0
        L1b:
            com.uyumao.n.a(r0)
            return
    }

    public static boolean a(android.content.Context r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            goto L3e
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L2f
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2e
            r2[r0] = r7     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L2e
            goto L3d
        L2e:
            return r0
        L2f:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L3e
        L3d:
            return r3
        L3e:
            return r0
    }

    public static boolean a(java.io.File r1, byte[] r2, boolean r3) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L10
            r0.write(r2)     // Catch: java.lang.Throwable -> L11
            r0.flush()     // Catch: java.lang.Throwable -> L11
            a(r0)
            r1 = 1
            return r1
        L10:
            r0 = 0
        L11:
            r1.getName()     // Catch: java.lang.Throwable -> L19
            a(r0)
            r1 = 0
            return r1
        L19:
            r1 = move-exception
            a(r0)
            throw r1
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 == 0) goto L20
            if (r4 == 0) goto L20
            int r0 = r4.length
            if (r0 != 0) goto Lb
            goto L20
        Lb:
            r0 = 0
        Lc:
            int r1 = r3.length
            if (r0 >= r1) goto L20
            r1 = r3[r0]
            int r2 = r4.length
            int r2 = r0 % r2
            r2 = r4[r2]
            r1 = r1 ^ r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L20:
            return r3
    }

    public static java.lang.Boolean b() {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.umeng.commonsdk.UMConfigure"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "isInForeground"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1c
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            return r0
    }

    public static java.lang.String b(java.io.File r6) {
            boolean r0 = r6.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
        L17:
            int r3 = r0.read(r6)     // Catch: java.lang.Throwable -> L2d
            if (r3 <= 0) goto L27
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            r4.<init>(r6, r5, r3)     // Catch: java.lang.Throwable -> L2d
            r2.append(r4)     // Catch: java.lang.Throwable -> L2d
            goto L17
        L27:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            goto L2d
        L2c:
            r0 = 0
        L2d:
            a(r0)
            return r1
    }

    public static org.json.JSONObject b(android.content.Context r13) {
            java.lang.String r0 = "network"
            java.lang.String r1 = "gps"
            r2 = 0
            if (r13 != 0) goto L8
            return r2
        L8:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = a(r13, r4)     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L86
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = a(r13, r4)     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L86
            java.lang.String r4 = "location"
            java.lang.Object r13 = r13.getSystemService(r4)     // Catch: java.lang.Throwable -> L86
            android.location.LocationManager r13 = (android.location.LocationManager) r13     // Catch: java.lang.Throwable -> L86
            if (r13 != 0) goto L28
            return r2
        L28:
            r4 = 1
            java.util.List r4 = r13.getProviders(r4)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r4.contains(r1)     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L35
            r0 = r1
            goto L3b
        L35:
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L86
        L3b:
            android.location.Location r13 = r13.getLastKnownLocation(r0)     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L86
            r13.getLatitude()     // Catch: java.lang.Throwable -> L86
            r13.getLongitude()     // Catch: java.lang.Throwable -> L86
            double r0 = r13.getLatitude()     // Catch: java.lang.Throwable -> L86
            double r4 = r13.getLongitude()     // Catch: java.lang.Throwable -> L86
            boolean r6 = r13.hasAltitude()     // Catch: java.lang.Throwable -> L86
            r7 = 0
            if (r6 == 0) goto L5c
            double r9 = r13.getAltitude()     // Catch: java.lang.Throwable -> L86
            goto L5d
        L5c:
            r9 = r7
        L5d:
            boolean r6 = r13.hasSpeed()     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L68
            float r6 = r13.getSpeed()     // Catch: java.lang.Throwable -> L86
            double r7 = (double) r6     // Catch: java.lang.Throwable -> L86
        L68:
            long r11 = r13.getTime()     // Catch: java.lang.Throwable -> L86
            java.lang.String r13 = "c_lat"
            r3.put(r13, r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r13 = "c_lng"
            r3.put(r13, r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r13 = "c_alt"
            r3.put(r13, r9)     // Catch: java.lang.Throwable -> L86
            java.lang.String r13 = "c_acc"
            r3.put(r13, r7)     // Catch: java.lang.Throwable -> L86
            java.lang.String r13 = "c_lts"
            r3.put(r13, r11)     // Catch: java.lang.Throwable -> L86
            return r3
        L86:
            return r2
    }

    public static java.lang.String[] c(android.content.Context r5) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = ""
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            if (r5 != 0) goto Le
            goto L51
        Le:
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = a(r5, r4)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L19
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            return r0
        L19:
            java.lang.String r4 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r4)     // Catch: java.lang.Throwable -> L51
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L26
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            return r0
        L26:
            android.net.NetworkInfo r2 = r5.getNetworkInfo(r3)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L39
            android.net.NetworkInfo$State r2 = r2.getState()     // Catch: java.lang.Throwable -> L51
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L51
            if (r2 != r4) goto L39
            java.lang.String r5 = "Wi-Fi"
            r0[r1] = r5     // Catch: java.lang.Throwable -> L51
            return r0
        L39:
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r1)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L51
            android.net.NetworkInfo$State r2 = r5.getState()     // Catch: java.lang.Throwable -> L51
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L51
            if (r2 != r4) goto L51
            java.lang.String r2 = "mobile_network"
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.getSubtypeName()     // Catch: java.lang.Throwable -> L51
            r0[r3] = r5     // Catch: java.lang.Throwable -> L51
        L51:
            return r0
    }

    public static java.lang.String d(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> Lf
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.getNetworkOperatorName()     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            java.lang.String r1 = ""
            return r1
    }

    public static org.json.JSONArray e(android.content.Context r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = h(r7)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            boolean r3 = a(r7, r3)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L2c
            java.lang.String r3 = "wifi"
            java.lang.Object r7 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L57
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L2c
            android.net.wifi.WifiInfo r7 = r7.getConnectionInfo()     // Catch: java.lang.Throwable -> L57
            goto L2d
        L2c:
            r7 = r0
        L2d:
            if (r7 != 0) goto L30
            return r0
        L30:
            java.lang.String r3 = r7.getBSSID()     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.getSSID()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "\""
            java.lang.String r5 = ""
            java.lang.String r7 = r7.replace(r4, r5)     // Catch: java.lang.Throwable -> L57
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "bssid"
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "ssid"
            r2.put(r3, r7)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = "ts"
            r2.put(r7, r4)     // Catch: java.lang.Throwable -> L57
            r1.put(r2)     // Catch: java.lang.Throwable -> L57
            return r1
        L57:
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static org.json.JSONArray f(android.content.Context r9) {
            boolean r0 = h(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r2 = "wifi"
            java.lang.Object r2 = r9.getSystemService(r2)     // Catch: java.lang.Throwable -> L68
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L18
            return r1
        L18:
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            boolean r3 = a(r9, r3)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L68
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r9 = a(r9, r3)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L68
            java.util.List r9 = r2.getScanResults()     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L68
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L68
            r3 = 100
            if (r2 <= r3) goto L38
            r2 = 100
        L38:
            r3 = 0
        L39:
            if (r3 >= r2) goto L67
            java.lang.Object r4 = r9.get(r3)     // Catch: java.lang.Throwable -> L68
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L64
            java.lang.String r5 = r4.BSSID     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = r4.SSID     // Catch: java.lang.Throwable -> L68
            int r4 = r4.level     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L68
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68
            r7.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = "bssid"
            r7.put(r8, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "ssid"
            r7.put(r5, r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "rssi"
            r7.put(r5, r4)     // Catch: java.lang.Throwable -> L68
            r0.put(r7)     // Catch: java.lang.Throwable -> L68
        L64:
            int r3 = r3 + 1
            goto L39
        L67:
            return r0
        L68:
            return r1
    }

    public static java.lang.String[] g(android.content.Context r6) {
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = ""
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            boolean r3 = a(r6, r3)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6b
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = a(r6, r3)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6b
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = a(r6, r3)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6b
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L6b
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch: java.lang.Throwable -> L6b
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L6b
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L6b
            java.lang.String r3 = r6.getSSID()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.getBSSID()     // Catch: java.lang.Throwable -> L6b
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L6b
            if (r5 <= r0) goto L67
            char r0 = r3.charAt(r2)     // Catch: java.lang.Throwable -> L6b
            r5 = 34
            if (r0 != r5) goto L67
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 - r4
            char r0 = r3.charAt(r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r5) goto L67
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 - r4
            java.lang.String r0 = r3.substring(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r1[r2] = r0     // Catch: java.lang.Throwable -> L6b
        L67:
            if (r6 == 0) goto L6b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L6b
        L6b:
            return r1
    }

    public static boolean h(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1b
            java.lang.String r1 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L21
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1b
            int r2 = r2.getWifiState()     // Catch: java.lang.Throwable -> L21
            goto L1c
        L1b:
            r2 = -1
        L1c:
            r1 = 3
            if (r1 != r2) goto L21
            r2 = 1
            return r2
        L21:
            return r0
    }
}
