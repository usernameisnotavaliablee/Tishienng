package com.yxcorp.kuaishou.addfp.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Orange {
    private static final int JNI_CONTROL_COMMAND_DIR_DETECT = 1114128;
    private static final int JNI_CONTROL_COMMAND_EGID = 1114139;
    private static final int JNI_CONTROL_COMMAND_GK_DETECT = 1114132;
    private static final int JNI_CONTROL_COMMAND_MANU_DETECT = 1114140;
    private static final int JNI_CONTROL_COMMAND_PROPS_DETECT = 1114131;
    private static final int JNI_CONTROL_COMMAND_RES_SOC_DETECT = 1245186;
    private static final int JNI_CONTROL_COMMAND_SERIAL_DETECT = 1179649;
    private static boolean sLibLoadFail = true;
    private static final java.lang.String sdkVersion = "1.4.4.137.dea39c19";
    private static volatile com.yxcorp.kuaishou.addfp.android.Orange singleton;
    private java.lang.String mEgidJson;

    private Orange() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.mEgidJson = r0
            r1.loadSoLib()
            return
    }

    public static java.lang.String gLs(int r0, java.lang.String r1) {
            java.lang.String r0 = com.yxcorp.kuaishou.addfp.c.a.a.a(r0, r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = ""
            return r0
    }

    private static native java.lang.String getClock(android.content.Context r0, byte[] r1, int r2);

    public static com.yxcorp.kuaishou.addfp.android.Orange getInstance() {
            com.yxcorp.kuaishou.addfp.android.Orange r0 = com.yxcorp.kuaishou.addfp.android.Orange.singleton
            if (r0 != 0) goto L19
            java.lang.Class<com.yxcorp.kuaishou.addfp.android.Orange> r0 = com.yxcorp.kuaishou.addfp.android.Orange.class
            monitor-enter(r0)
            com.yxcorp.kuaishou.addfp.android.Orange r1 = com.yxcorp.kuaishou.addfp.android.Orange.singleton     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.yxcorp.kuaishou.addfp.android.Orange r1 = new com.yxcorp.kuaishou.addfp.android.Orange     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.yxcorp.kuaishou.addfp.android.Orange.singleton = r1     // Catch: java.lang.Throwable -> L13
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
            com.yxcorp.kuaishou.addfp.android.Orange r0 = com.yxcorp.kuaishou.addfp.android.Orange.singleton
            return r0
    }

    private static native byte[] getMagic(android.content.Context r0, byte[] r1, int r2);

    public static java.lang.String getVersion() {
            java.lang.String r0 = "1.4.4.137.dea39c19"
            return r0
    }

    private boolean isReject() {
            r1 = this;
            boolean r0 = com.yxcorp.kuaishou.addfp.android.Orange.sLibLoadFail
            return r0
    }

    private static native java.lang.Object jniCommand(int r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    private void loadSoLib() {
            r1 = this;
            java.lang.String r0 = "sgcore"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L9
            r0 = 0
            com.yxcorp.kuaishou.addfp.android.Orange.sLibLoadFail = r0     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = 1
            com.yxcorp.kuaishou.addfp.android.Orange.sLibLoadFail = r0
            return
    }

    public byte[] dcc(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            r0.isReject()     // Catch: java.lang.Throwable -> L4
        L4:
            return r1
    }

    public java.lang.String gKpsd() {
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = r3.isReject()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L9
            return r0
        L9:
            r1 = 1114132(0x110014, float:1.561231E-39)
            r2 = 0
            java.lang.Object r1 = jniCommand(r1, r2, r2, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            return r0
    }

    public java.lang.String gManu(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = r3.isReject()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L19
            if (r4 == 0) goto L19
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r2 = 1114140(0x11001c, float:1.561243E-39)
            java.lang.Object r4 = jniCommand(r2, r5, r4, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            return r0
    }

    public java.lang.String gProps() {
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = r3.isReject()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L9
            return r0
        L9:
            r1 = 1114131(0x110013, float:1.56123E-39)
            r2 = 0
            java.lang.Object r1 = jniCommand(r1, r2, r2, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            return r0
    }

    public java.lang.String gRdi() {
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = r3.isReject()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L9
            return r0
        L9:
            r1 = 1114128(0x110010, float:1.561226E-39)
            r2 = 0
            java.lang.Object r1 = jniCommand(r1, r2, r2, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            return r0
    }

    public java.lang.String gSer() {
            r3 = this;
            java.lang.String r0 = ""
            boolean r1 = r3.isReject()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L9
            return r0
        L9:
            r1 = 1179649(0x120001, float:1.65304E-39)
            r2 = 0
            java.lang.Object r1 = jniCommand(r1, r2, r2, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            return r0
    }

    public synchronized java.lang.String getClockWrapper(android.content.Context r2, byte[] r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isReject()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.lang.String r2 = ""
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            goto L13
        Ld:
            java.lang.String r2 = getClock(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public synchronized byte[] getMagicWrapper(android.content.Context r2, byte[] r3, int r4) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isReject()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto La
            monitor-exit(r1)
            r2 = 0
            return r2
        La:
            byte[] r2 = getMagic(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized java.lang.String getResSoc(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isReject()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Ld
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        Lb:
            r3 = move-exception
            goto L1d
        Ld:
            r0 = 1245186(0x130002, float:1.744877E-39)
            r1 = 0
            java.lang.Object r3 = jniCommand(r0, r3, r1, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        L19:
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public synchronized java.lang.String sted(java.lang.String r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r4 = r2.isReject()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto Ld
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        Lb:
            r3 = move-exception
            goto L43
        Ld:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L1f
            java.lang.String r4 = r2.mEgidJson     // Catch: java.lang.Throwable -> L3f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L1f
            java.lang.String r3 = r2.mEgidJson     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return r3
        L1f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            r1 = 1114139(0x11001b, float:1.561241E-39)
            if (r4 != 0) goto L33
            java.lang.String r4 = ""
            java.lang.Object r3 = jniCommand(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return r3
        L33:
            java.lang.String r4 = ""
            java.lang.Object r3 = jniCommand(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3f
            r2.mEgidJson = r3     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return r3
        L3f:
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }
}
