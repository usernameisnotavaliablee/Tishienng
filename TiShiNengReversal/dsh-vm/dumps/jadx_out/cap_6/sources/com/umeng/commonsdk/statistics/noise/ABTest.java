package com.umeng.commonsdk.statistics.noise;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ABTest implements com.umeng.commonsdk.statistics.internal.d {
    private static com.umeng.commonsdk.statistics.noise.ABTest instance;
    private android.content.Context context;
    private boolean isInTest;
    private int mGroup;
    private int mInterval;
    private java.lang.String mPoli;
    private int mPolicy;
    private float mProb07;
    private float mProb13;

    static {
            return
    }

    private ABTest(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInTest = r0
            r0 = -1
            r1.mPolicy = r0
            r1.mInterval = r0
            r1.mGroup = r0
            r0 = 0
            r1.mProb13 = r0
            r1.mProb07 = r0
            r0 = 0
            r1.mPoli = r0
            r1.context = r2
            r1.onExperimentChanged(r3, r4)
            return
    }

    public static synchronized com.umeng.commonsdk.statistics.noise.ABTest getService(android.content.Context r4) {
            java.lang.Class<com.umeng.commonsdk.statistics.noise.ABTest> r0 = com.umeng.commonsdk.statistics.noise.ABTest.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.noise.ABTest r1 = com.umeng.commonsdk.statistics.noise.ABTest.instance     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            java.lang.String r1 = "client_test"
            r2 = 0
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r1, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "test_report_interval"
            java.lang.String r3 = "0"
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r2, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L26
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L26
            com.umeng.commonsdk.statistics.noise.ABTest r3 = new com.umeng.commonsdk.statistics.noise.ABTest     // Catch: java.lang.Throwable -> L26
            r3.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L26
            com.umeng.commonsdk.statistics.noise.ABTest.instance = r3     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r4 = move-exception
            goto L2c
        L28:
            com.umeng.commonsdk.statistics.noise.ABTest r4 = com.umeng.commonsdk.statistics.noise.ABTest.instance     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return r4
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    private void parseFIXED(java.lang.String r10) {
            r9 = this;
            if (r10 != 0) goto L4
            goto Laf
        L4:
            java.lang.String r0 = "\\|"
            java.lang.String[] r10 = r10.split(r0)
            r0 = 2
            r0 = r10[r0]
            java.lang.String r1 = "SIG13"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            r0 = 3
            r0 = r10[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            goto L22
        L21:
            r0 = 0
        L22:
            float r1 = r9.mProb13
            r2 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2c
            r9.isInTest = r2
            return
        L2c:
            r0 = r10[r2]
            java.lang.String r1 = "FIXED"
            boolean r0 = r0.equals(r1)
            r1 = -1
            r3 = 1
            if (r0 == 0) goto L43
            r0 = r10[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            goto L44
        L43:
            r0 = -1
        L44:
            r4 = 4
            r5 = r10[r4]
            java.lang.String r6 = "RPT"
            boolean r5 = r5.equals(r6)
            java.lang.String r7 = ","
            r8 = 5
            if (r5 == 0) goto L70
            r9.mPoli = r6
            r10 = r10[r8]
            java.lang.String[] r10 = r10.split(r7)
            int r4 = r10.length
            int[] r4 = new int[r4]
            r5 = 0
        L5e:
            int r6 = r10.length
            if (r5 >= r6) goto L9f
            r6 = r10[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = r6.intValue()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L5e
        L70:
            r4 = r10[r4]
            java.lang.String r5 = "DOM"
            boolean r4 = r4.equals(r5)
            r6 = 0
            if (r4 == 0) goto L9e
            r9.mPoli = r5
            r9.isInTest = r3
            r10 = r10[r8]     // Catch: java.lang.Exception -> L9d
            java.lang.String[] r10 = r10.split(r7)     // Catch: java.lang.Exception -> L9d
            int r4 = r10.length     // Catch: java.lang.Exception -> L9d
            int[] r4 = new int[r4]     // Catch: java.lang.Exception -> L9d
            r5 = 0
        L89:
            int r6 = r10.length     // Catch: java.lang.Exception -> L9b
            if (r5 >= r6) goto L9f
            r6 = r10[r5]     // Catch: java.lang.Exception -> L9b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L9b
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L9b
            r4[r5] = r6     // Catch: java.lang.Exception -> L9b
            int r5 = r5 + 1
            goto L89
        L9b:
            goto L9f
        L9d:
        L9e:
            r4 = r6
        L9f:
            if (r0 == r1) goto Lad
            r9.isInTest = r3
            r9.mGroup = r0
            if (r4 == 0) goto Laf
            int r0 = r0 - r3
            r10 = r4[r0]
            r9.mPolicy = r10
            goto Laf
        Lad:
            r9.isInTest = r2
        Laf:
            return
    }

    private void parseSig7(java.lang.String r11) {
            r10 = this;
            if (r11 != 0) goto L4
            goto Ld1
        L4:
            java.lang.String r0 = "\\|"
            java.lang.String[] r11 = r11.split(r0)
            r0 = 2
            r0 = r11[r0]
            java.lang.String r1 = "SIG13"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L22
            r0 = 3
            r0 = r11[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            goto L23
        L22:
            r0 = 0
        L23:
            float r2 = r10.mProb13
            r3 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2d
            r10.isInTest = r3
            return
        L2d:
            r0 = r11[r3]
            java.lang.String r2 = "SIG7"
            boolean r0 = r0.equals(r2)
            r2 = 0
            java.lang.String r4 = ","
            r5 = 1
            if (r0 == 0) goto L57
            r0 = r11[r5]
            java.lang.String[] r0 = r0.split(r4)
            int r6 = r0.length
            float[] r6 = new float[r6]
            r7 = 0
        L45:
            int r8 = r0.length
            if (r7 >= r8) goto L58
            r8 = r0[r7]
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            float r8 = r8.floatValue()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L45
        L57:
            r6 = r2
        L58:
            r0 = 4
            r7 = r11[r0]
            java.lang.String r8 = "RPT"
            boolean r7 = r7.equals(r8)
            r9 = 5
            if (r7 == 0) goto L82
            r10.mPoli = r8
            r11 = r11[r9]
            java.lang.String[] r11 = r11.split(r4)
            int r0 = r11.length
            int[] r2 = new int[r0]
            r0 = 0
        L70:
            int r4 = r11.length
            if (r0 >= r4) goto Lad
            r4 = r11[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r4.intValue()
            r2[r0] = r4
            int r0 = r0 + 1
            goto L70
        L82:
            r0 = r11[r0]
            java.lang.String r7 = "DOM"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lad
            r10.isInTest = r5
            r10.mPoli = r7
            r11 = r11[r9]     // Catch: java.lang.Exception -> Lac
            java.lang.String[] r11 = r11.split(r4)     // Catch: java.lang.Exception -> Lac
            int r0 = r11.length     // Catch: java.lang.Exception -> Lac
            int[] r2 = new int[r0]     // Catch: java.lang.Exception -> Lac
            r0 = 0
        L9a:
            int r4 = r11.length     // Catch: java.lang.Exception -> Lac
            if (r0 >= r4) goto Lad
            r4 = r11[r0]     // Catch: java.lang.Exception -> Lac
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Lac
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> Lac
            r2[r0] = r4     // Catch: java.lang.Exception -> Lac
            int r0 = r0 + 1
            goto L9a
        Lac:
        Lad:
            r11 = 0
        Lae:
            int r0 = r6.length
            r4 = -1
            if (r11 >= r0) goto Lbf
            r0 = r6[r11]
            float r1 = r1 + r0
            float r0 = r10.mProb07
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lbc
            goto Lc0
        Lbc:
            int r11 = r11 + 1
            goto Lae
        Lbf:
            r11 = -1
        Lc0:
            if (r11 == r4) goto Lcf
            r10.isInTest = r5
            int r0 = r11 + 1
            r10.mGroup = r0
            if (r2 == 0) goto Ld1
            r11 = r2[r11]
            r10.mPolicy = r11
            goto Ld1
        Lcf:
            r10.isInTest = r3
        Ld1:
            return
    }

    private float prob(java.lang.String r2, int r3) {
            r1 = this;
            int r3 = r3 * 2
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r0 = r3 + 5
            java.lang.String r2 = r2.substring(r3, r0)
            r3 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2, r3)
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 1233125376(0x49800000, float:1048576.0)
            float r2 = r2 / r3
            return r2
    }

    public static boolean validate(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "\\|"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r2 = 6
            if (r0 == r2) goto L13
            return r1
        L13:
            r0 = r6[r1]
            java.lang.String r2 = "SIG7"
            boolean r0 = r0.startsWith(r2)
            r2 = 5
            java.lang.String r3 = ","
            r4 = 1
            if (r0 == 0) goto L32
            r0 = r6[r4]
            java.lang.String[] r0 = r0.split(r3)
            int r0 = r0.length
            r5 = r6[r2]
            java.lang.String[] r5 = r5.split(r3)
            int r5 = r5.length
            if (r0 != r5) goto L32
            return r4
        L32:
            r0 = r6[r1]
            java.lang.String r5 = "FIXED"
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L4e
            r0 = r6[r2]
            java.lang.String[] r0 = r0.split(r3)
            int r0 = r0.length
            r6 = r6[r4]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r0 < r6) goto L4e
            if (r6 < r4) goto L4e
            return r4
        L4e:
            return r1
    }

    public int getGroup() {
            r1 = this;
            int r0 = r1.mGroup
            return r0
    }

    public java.lang.String getGroupInfo() {
            r1 = this;
            boolean r0 = r1.isInTest
            if (r0 != 0) goto L7
            java.lang.String r0 = "error"
            return r0
        L7:
            int r0 = r1.mGroup
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public int getTestInterval() {
            r1 = this;
            int r0 = r1.mInterval
            return r0
    }

    public java.lang.String getTestName() {
            r1 = this;
            java.lang.String r0 = r1.mPoli
            return r0
    }

    public int getTestPolicy() {
            r1 = this;
            int r0 = r1.mPolicy
            return r0
    }

    public boolean isInTest() {
            r1 = this;
            boolean r0 = r1.isInTest
            return r0
    }

    public void onExperimentChanged(java.lang.String r3, int r4) {
            r2 = this;
            r2.mInterval = r4
            android.content.Context r4 = r2.context
            java.lang.String r4 = com.umeng.commonsdk.statistics.idtracking.Envelope.getSignature(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L16
            goto L56
        L16:
            r0 = 12
            float r0 = r2.prob(r4, r0)     // Catch: java.lang.Exception -> L31
            r2.mProb13 = r0     // Catch: java.lang.Exception -> L31
            r0 = 6
            float r4 = r2.prob(r4, r0)     // Catch: java.lang.Exception -> L31
            r2.mProb07 = r4     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "SIG7"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L31
            if (r4 == 0) goto L33
            r2.parseSig7(r3)     // Catch: java.lang.Exception -> L31
            return
        L31:
            r4 = move-exception
            goto L3f
        L33:
            java.lang.String r4 = "FIXED"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L31
            if (r4 == 0) goto L3e
            r2.parseFIXED(r3)     // Catch: java.lang.Exception -> L31
        L3e:
            return
        L3f:
            r2.isInTest = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.umeng.commonsdk.statistics.common.MLog.e(r3, r4)
            return
        L56:
            r2.isInTest = r1
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a r4) {
            r3 = this;
            java.lang.String r0 = "client_test"
            r1 = 0
            java.lang.String r0 = r4.a(r0, r1)
            java.lang.String r1 = "test_report_interval"
            java.lang.String r2 = "0"
            java.lang.String r4 = r4.a(r1, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r4.intValue()
            r3.onExperimentChanged(r0, r4)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " p13:"
            r0.append(r1)
            float r1 = r2.mProb13
            r0.append(r1)
            java.lang.String r1 = " p07:"
            r0.append(r1)
            float r1 = r2.mProb07
            r0.append(r1)
            java.lang.String r1 = " policy:"
            r0.append(r1)
            int r1 = r2.mPolicy
            r0.append(r1)
            java.lang.String r1 = " interval:"
            r0.append(r1)
            int r1 = r2.mInterval
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
