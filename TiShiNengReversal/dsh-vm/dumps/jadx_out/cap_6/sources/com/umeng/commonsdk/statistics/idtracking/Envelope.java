package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Envelope {
    private static final java.lang.String dummyID1 = "1234567890987654321";
    private static final java.lang.String dummyID2 = "02:00:00:00:00:00";
    private final int CODEX_ENCRYPT;
    private final int CODEX_NORMAL;
    private final byte[] SEED;
    private boolean encrypt;
    private byte[] identity;
    private java.lang.String mAddress;
    private byte[] mChecksum;
    private byte[] mEntity;
    private byte[] mGuid;
    private int mLength;
    private int mSerialNo;
    private byte[] mSignature;
    private int mTimestamp;
    private java.lang.String mVersion;

    private Envelope(byte[] r3, java.lang.String r4, byte[] r5) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r2.SEED = r0
            r0 = 1
            r2.CODEX_ENCRYPT = r0
            r0 = 0
            r2.CODEX_NORMAL = r0
            java.lang.String r1 = "1.0"
            r2.mVersion = r1
            r1 = 0
            r2.mAddress = r1
            r2.mSignature = r1
            r2.mGuid = r1
            r2.mChecksum = r1
            r2.mSerialNo = r0
            r2.mTimestamp = r0
            r2.mLength = r0
            r2.mEntity = r1
            r2.identity = r1
            r2.encrypt = r0
            if (r3 == 0) goto L48
            int r0 = r3.length
            if (r0 == 0) goto L48
            r2.mAddress = r4
            int r4 = r3.length
            r2.mLength = r4
            byte[] r3 = com.umeng.commonsdk.statistics.common.b.a(r3)
            r2.mEntity = r3
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            int r4 = (int) r3
            r2.mTimestamp = r4
            r2.identity = r5
            return
        L48:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "entity is null or empty"
            r3.<init>(r4)
            throw r3
    }

    private byte[] genCheckSum() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r2.mSignature
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            r0.append(r1)
            int r1 = r2.mSerialNo
            r0.append(r1)
            int r1 = r2.mTimestamp
            r0.append(r1)
            int r1 = r2.mLength
            r0.append(r1)
            byte[] r1 = r2.mGuid
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            byte[] r0 = com.umeng.commonsdk.statistics.common.DataHelper.hash(r0)
            return r0
    }

    public static com.umeng.commonsdk.statistics.idtracking.Envelope genEncryptEnvelope(android.content.Context r9, java.lang.String r10, byte[] r11) {
            java.lang.String r0 = "serial"
            java.lang.String r1 = "signature"
            r2 = 0
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r9)     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = r3.getString(r1, r2)     // Catch: java.lang.Exception -> L41
            r5 = 1
            int r6 = r3.getInt(r0, r5)     // Catch: java.lang.Exception -> L41
            com.umeng.commonsdk.statistics.idtracking.Envelope r7 = new com.umeng.commonsdk.statistics.idtracking.Envelope     // Catch: java.lang.Exception -> L41
            java.lang.String r8 = "123456789098765432102:00:00:00:00:00"
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Exception -> L41
            r7.<init>(r11, r10, r8)     // Catch: java.lang.Exception -> L41
            r7.setEncrypt(r5)     // Catch: java.lang.Exception -> L41
            r7.setSignature(r4)     // Catch: java.lang.Exception -> L41
            r7.setSerialNumber(r6)     // Catch: java.lang.Exception -> L41
            r7.seal()     // Catch: java.lang.Exception -> L41
            android.content.SharedPreferences$Editor r10 = r3.edit()     // Catch: java.lang.Exception -> L41
            int r6 = r6 + r5
            android.content.SharedPreferences$Editor r10 = r10.putInt(r0, r6)     // Catch: java.lang.Exception -> L41
            java.lang.String r11 = r7.getSignature()     // Catch: java.lang.Exception -> L41
            android.content.SharedPreferences$Editor r10 = r10.putString(r1, r11)     // Catch: java.lang.Exception -> L41
            r10.commit()     // Catch: java.lang.Exception -> L41
            r7.export(r9)     // Catch: java.lang.Exception -> L41
            return r7
        L41:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
            return r2
    }

    public static com.umeng.commonsdk.statistics.idtracking.Envelope genEnvelope(android.content.Context r9, java.lang.String r10, byte[] r11) {
            java.lang.String r0 = "serial"
            java.lang.String r1 = "signature"
            r2 = 0
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r9)     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = r3.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            r5 = 1
            int r6 = r3.getInt(r0, r5)     // Catch: java.lang.Exception -> L3e
            com.umeng.commonsdk.statistics.idtracking.Envelope r7 = new com.umeng.commonsdk.statistics.idtracking.Envelope     // Catch: java.lang.Exception -> L3e
            java.lang.String r8 = "123456789098765432102:00:00:00:00:00"
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Exception -> L3e
            r7.<init>(r11, r10, r8)     // Catch: java.lang.Exception -> L3e
            r7.setSignature(r4)     // Catch: java.lang.Exception -> L3e
            r7.setSerialNumber(r6)     // Catch: java.lang.Exception -> L3e
            r7.seal()     // Catch: java.lang.Exception -> L3e
            android.content.SharedPreferences$Editor r10 = r3.edit()     // Catch: java.lang.Exception -> L3e
            int r6 = r6 + r5
            android.content.SharedPreferences$Editor r10 = r10.putInt(r0, r6)     // Catch: java.lang.Exception -> L3e
            java.lang.String r11 = r7.getSignature()     // Catch: java.lang.Exception -> L3e
            android.content.SharedPreferences$Editor r10 = r10.putString(r1, r11)     // Catch: java.lang.Exception -> L3e
            r10.commit()     // Catch: java.lang.Exception -> L3e
            r7.export(r9)     // Catch: java.lang.Exception -> L3e
            return r7
        L3e:
            r10 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r10)
            return r2
    }

    private byte[] genGuid(byte[] r11, int r12) {
            r10 = this;
            byte[] r0 = r10.identity
            byte[] r0 = com.umeng.commonsdk.statistics.common.DataHelper.hash(r0)
            byte[] r1 = r10.mEntity
            byte[] r1 = com.umeng.commonsdk.statistics.common.DataHelper.hash(r1)
            int r2 = r0.length
            int r3 = r2 * 2
            byte[] r4 = new byte[r3]
            r5 = 0
            r6 = 0
        L13:
            r7 = 1
            if (r6 >= r2) goto L24
            int r8 = r6 * 2
            r9 = r1[r6]
            r4[r8] = r9
            int r8 = r8 + r7
            r7 = r0[r6]
            r4[r8] = r7
            int r6 = r6 + 1
            goto L13
        L24:
            r0 = 0
        L25:
            r1 = 2
            if (r0 >= r1) goto L39
            r1 = r11[r0]
            r4[r0] = r1
            int r1 = r3 - r0
            int r1 = r1 - r7
            int r2 = r11.length
            int r2 = r2 - r0
            int r2 = r2 - r7
            r2 = r11[r2]
            r4[r1] = r2
            int r0 = r0 + 1
            goto L25
        L39:
            r11 = r12 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            int r0 = r12 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r2 = r12 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            int r12 = r12 >>> 24
            byte r12 = (byte) r12
            r6 = 4
            byte[] r6 = new byte[r6]
            r6[r5] = r11
            r6[r7] = r0
            r6[r1] = r2
            r11 = 3
            r6[r11] = r12
        L55:
            if (r5 >= r3) goto L64
            r11 = r4[r5]
            int r12 = r5 % 4
            r12 = r6[r12]
            r11 = r11 ^ r12
            byte r11 = (byte) r11
            r4[r5] = r11
            int r5 = r5 + 1
            goto L55
        L64:
            return r4
    }

    private byte[] genSignature() {
            r5 = this;
            byte[] r0 = r5.SEED
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r2 = (int) r1
            byte[] r0 = r5.genGuid(r0, r2)
            return r0
    }

    public static java.lang.String getSignature(android.content.Context r2) {
            android.content.SharedPreferences r2 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "signature"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
    }

    public void export(android.content.Context r11) {
            r10 = this;
            java.lang.String r0 = "appkey"
            java.lang.String r1 = r10.mAddress
            r2 = 0
            java.lang.String r3 = "umid"
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r11, r3, r2)
            byte[] r4 = r10.mSignature
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r4)
            r5 = 16
            byte[] r6 = new byte[r5]
            byte[] r7 = r10.mSignature
            r8 = 2
            r9 = 0
            java.lang.System.arraycopy(r7, r8, r6, r9, r5)
            byte[] r5 = com.umeng.commonsdk.statistics.common.DataHelper.hash(r6)
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r5)
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L31
            r6.put(r3, r2)     // Catch: java.lang.Throwable -> L65
        L31:
            java.lang.String r7 = "signature"
            r6.put(r7, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "checksum"
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> L65
            com.umeng.analytics.pro.au r4 = com.umeng.analytics.pro.au.b()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "exp"
            java.lang.String r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L65
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L65
            java.io.File r7 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L65
            r5.<init>(r7, r4)     // Catch: java.lang.Throwable -> L65
            boolean r4 = r5.exists()     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L57
            r5.mkdir()     // Catch: java.lang.Throwable -> L65
        L57:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "exchangeIdentity.json"
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile(r4, r5)     // Catch: java.lang.Throwable -> L65
        L65:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L99
            r4.<init>()     // Catch: java.lang.Throwable -> L99
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "channel"
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getChannel(r11)     // Catch: java.lang.Throwable -> L99
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L7f
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.HelperUtils.getUmengMD5(r2)     // Catch: java.lang.Throwable -> L99
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L99
        L7f:
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "exid"
            java.lang.String r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L99
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L99
            java.io.File r11 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L99
            r1.<init>(r11, r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L99
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile(r1, r11)     // Catch: java.lang.Throwable -> L99
        L99:
            return
    }

    public java.lang.String getSignature() {
            r1 = this;
            byte[] r0 = r1.mSignature
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r0)
            return r0
    }

    public void seal() {
            r5 = this;
            byte[] r0 = r5.mSignature
            if (r0 != 0) goto La
            byte[] r0 = r5.genSignature()
            r5.mSignature = r0
        La:
            boolean r0 = r5.encrypt
            if (r0 == 0) goto L21
            r0 = 16
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.mSignature     // Catch: java.lang.Exception -> L21
            r3 = 1
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)     // Catch: java.lang.Exception -> L21
            byte[] r0 = r5.mEntity     // Catch: java.lang.Exception -> L21
            byte[] r0 = com.umeng.commonsdk.statistics.common.DataHelper.encrypt(r0, r1)     // Catch: java.lang.Exception -> L21
            r5.mEntity = r0     // Catch: java.lang.Exception -> L21
        L21:
            byte[] r0 = r5.mSignature
            int r1 = r5.mTimestamp
            byte[] r0 = r5.genGuid(r0, r1)
            r5.mGuid = r0
            byte[] r0 = r5.genCheckSum()
            r5.mChecksum = r0
            return
    }

    public void setEncrypt(boolean r1) {
            r0 = this;
            r0.encrypt = r1
            return
    }

    public void setSerialNumber(int r1) {
            r0 = this;
            r0.mSerialNo = r1
            return
    }

    public void setSignature(java.lang.String r1) {
            r0 = this;
            byte[] r1 = com.umeng.commonsdk.statistics.common.DataHelper.reverseHexString(r1)
            r0.mSignature = r1
            return
    }

    public byte[] toBinary() {
            r2 = this;
            com.umeng.analytics.pro.bj r0 = new com.umeng.analytics.pro.bj
            r0.<init>()
            java.lang.String r1 = r2.mVersion
            r0.a(r1)
            java.lang.String r1 = r2.mAddress
            r0.b(r1)
            byte[] r1 = r2.mSignature
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            r0.c(r1)
            int r1 = r2.mSerialNo
            r0.a(r1)
            int r1 = r2.mTimestamp
            r0.b(r1)
            int r1 = r2.mLength
            r0.c(r1)
            byte[] r1 = r2.mEntity
            r0.a(r1)
            boolean r1 = r2.encrypt
            r0.d(r1)
            byte[] r1 = r2.mGuid
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            r0.d(r1)
            byte[] r1 = r2.mChecksum
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            r0.e(r1)
            com.umeng.analytics.pro.ca r1 = new com.umeng.analytics.pro.ca     // Catch: java.lang.Exception -> L4d
            r1.<init>()     // Catch: java.lang.Exception -> L4d
            byte[] r0 = r1.a(r0)     // Catch: java.lang.Exception -> L4d
            return r0
        L4d:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.mVersion
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "version : %s\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            java.lang.String r1 = r5.mAddress
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "address : %s\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            byte[] r1 = r5.mSignature
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "signature : %s\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            int r1 = r5.mSerialNo
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "serial : %s\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            int r1 = r5.mTimestamp
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "timestamp : %d\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            int r1 = r5.mLength
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "length : %d\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            byte[] r1 = r5.mGuid
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "guid : %s\n"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            byte[] r1 = r5.mChecksum
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r4] = r1
            java.lang.String r1 = "checksum : %s "
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.append(r1)
            boolean r1 = r5.encrypt
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r1 = "codex : %d"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
