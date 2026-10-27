package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AndroidLicenser {
    private static java.lang.String deviceID = "";
    private static java.util.concurrent.locks.ReentrantLock lock_instance = null;
    private static boolean mAgree = false;
    private static java.lang.String mIdFlag = "1";
    private static com.baidu.vis.unified.license.AndroidLicenser mInstance;
    private static boolean mOnline;
    private java.util.concurrent.locks.ReentrantLock lock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ErrorCode extends java.lang.Enum<com.baidu.vis.unified.license.AndroidLicenser.ErrorCode> {
        private static final /* synthetic */ com.baidu.vis.unified.license.AndroidLicenser.ErrorCode[] $VALUES = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_ALGORITHM_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_DECRYPT_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_DEVICE_ID_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_EXPIRED_TIME_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_FUNCTION_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_INFO_FORMAT_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_KEY_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_KEY_FILE_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_LOCAL_FILE_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_LOCAL_TIME_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_MD5_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_NOT_INIT_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_PACKAGE_NAME_CHECK_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_PARAM_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_REMOTE_DATA_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode LICENSE_TIME_EXPIRED = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode OTHER_ERROR = null;
        public static final com.baidu.vis.unified.license.AndroidLicenser.ErrorCode SUCCESS = null;

        static {
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r0 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r1 = "SUCCESS"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.SUCCESS = r0
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r1 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r3 = "LICENSE_NOT_INIT_ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_NOT_INIT_ERROR = r1
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r3 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r5 = "LICENSE_DECRYPT_ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_DECRYPT_ERROR = r3
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r5 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r7 = "LICENSE_INFO_FORMAT_ERROR"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_INFO_FORMAT_ERROR = r5
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r7 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r9 = "LICENSE_KEY_CHECK_ERROR"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_KEY_CHECK_ERROR = r7
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r9 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r11 = "LICENSE_ALGORITHM_CHECK_ERROR"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_ALGORITHM_CHECK_ERROR = r9
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r11 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r13 = "LICENSE_MD5_CHECK_ERROR"
                r14 = 6
                r11.<init>(r13, r14)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_MD5_CHECK_ERROR = r11
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r13 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                java.lang.String r15 = "LICENSE_DEVICE_ID_CHECK_ERROR"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_DEVICE_ID_CHECK_ERROR = r13
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r15 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r17 = 7
                java.lang.String r2 = "LICENSE_PACKAGE_NAME_CHECK_ERROR"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_PACKAGE_NAME_CHECK_ERROR = r15
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r2 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r19 = 8
                java.lang.String r4 = "LICENSE_EXPIRED_TIME_CHECK_ERROR"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_EXPIRED_TIME_CHECK_ERROR = r2
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r4 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r21 = 9
                java.lang.String r6 = "LICENSE_FUNCTION_CHECK_ERROR"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_FUNCTION_CHECK_ERROR = r4
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r6 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r23 = 10
                java.lang.String r8 = "LICENSE_TIME_EXPIRED"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_TIME_EXPIRED = r6
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r8 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r25 = 11
                java.lang.String r10 = "LICENSE_LOCAL_FILE_ERROR"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_LOCAL_FILE_ERROR = r8
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r10 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r27 = 12
                java.lang.String r12 = "LICENSE_REMOTE_DATA_ERROR"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_REMOTE_DATA_ERROR = r10
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r12 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r29 = 13
                java.lang.String r14 = "LICENSE_LOCAL_TIME_ERROR"
                r30 = r0
                r0 = 14
                r12.<init>(r14, r0)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_LOCAL_TIME_ERROR = r12
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r14 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r31 = 14
                java.lang.String r0 = "LICENSE_PARAM_ERROR"
                r32 = r1
                r1 = 15
                r14.<init>(r0, r1)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_PARAM_ERROR = r14
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r0 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r33 = 15
                java.lang.String r1 = "LICENSE_KEY_FILE_ERROR"
                r34 = r2
                r2 = 16
                r0.<init>(r1, r2)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.LICENSE_KEY_FILE_ERROR = r0
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r1 = new com.baidu.vis.unified.license.AndroidLicenser$ErrorCode
                r35 = 16
                java.lang.String r2 = "OTHER_ERROR"
                r36 = r0
                r0 = 17
                r1.<init>(r2, r0)
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR = r1
                r2 = 18
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r2 = new com.baidu.vis.unified.license.AndroidLicenser.ErrorCode[r2]
                r2[r16] = r30
                r2[r18] = r32
                r2[r20] = r3
                r2[r22] = r5
                r2[r24] = r7
                r2[r26] = r9
                r2[r28] = r11
                r2[r17] = r13
                r2[r19] = r15
                r2[r21] = r34
                r2[r23] = r4
                r2[r25] = r6
                r2[r27] = r8
                r2[r29] = r10
                r2[r31] = r12
                r2[r33] = r14
                r2[r35] = r36
                r2[r0] = r1
                com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.$VALUES = r2
                return
        }

        ErrorCode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.vis.unified.license.AndroidLicenser.ErrorCode valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.vis.unified.license.AndroidLicenser$ErrorCode> r0 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r1 = (com.baidu.vis.unified.license.AndroidLicenser.ErrorCode) r1
                return r1
        }

        public static com.baidu.vis.unified.license.AndroidLicenser.ErrorCode[] values() {
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r0 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r0 = (com.baidu.vis.unified.license.AndroidLicenser.ErrorCode[]) r0
                return r0
        }
    }

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            com.baidu.vis.unified.license.AndroidLicenser.lock_instance = r0
            return
    }

    private AndroidLicenser() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            return
    }

    public static synchronized java.lang.String getDeviceId(android.content.Context r9) {
            java.lang.Class<com.baidu.vis.unified.license.AndroidLicenser> r0 = com.baidu.vis.unified.license.AndroidLicenser.class
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = com.baidu.vis.unified.license.AndroidLicenser.deviceID     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L85
            java.lang.ClassLoader r1 = r9.getClassLoader()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r2 = "com.baidu.liantian.ac.LH"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r2 = "init"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r6 = 1
            r5[r6] = r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            boolean r5 = com.baidu.vis.unified.license.AndroidLicenser.mOnline     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r8[r7] = r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r8[r6] = r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r2.invoke(r1, r8)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r2 = "setAgreePolicy"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r5[r7] = r8     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r5[r6] = r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            boolean r3 = com.baidu.vis.unified.license.AndroidLicenser.mAgree     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r5[r7] = r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r5[r6] = r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r2.invoke(r1, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r2 = "getId"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r3[r7] = r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r6] = r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r3[r7] = r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r9 = com.baidu.vis.unified.license.AndroidLicenser.mIdFlag     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r3[r6] = r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.Object r9 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            android.util.Pair r9 = (android.util.Pair) r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r9 == 0) goto L85
            java.lang.Object r9 = r9.second     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r9 == 0) goto L85
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r9 = r9.toUpperCase()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            com.baidu.vis.unified.license.AndroidLicenser.deviceID = r9     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            goto L85
        L83:
            r9 = move-exception
            goto L89
        L85:
            java.lang.String r9 = com.baidu.vis.unified.license.AndroidLicenser.deviceID     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)
            return r9
        L89:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r9
    }

    public static synchronized com.baidu.vis.unified.license.AndroidLicenser getInstance() {
            java.lang.Class<com.baidu.vis.unified.license.AndroidLicenser> r0 = com.baidu.vis.unified.license.AndroidLicenser.class
            monitor-enter(r0)
            java.util.concurrent.locks.ReentrantLock r1 = com.baidu.vis.unified.license.AndroidLicenser.lock_instance     // Catch: java.lang.Throwable -> L19
            r1.lock()     // Catch: java.lang.Throwable -> L19
            com.baidu.vis.unified.license.AndroidLicenser r1 = com.baidu.vis.unified.license.AndroidLicenser.mInstance     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            com.baidu.vis.unified.license.AndroidLicenser r1 = new com.baidu.vis.unified.license.AndroidLicenser     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            com.baidu.vis.unified.license.AndroidLicenser.mInstance = r1     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "bd_unifylicense"
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L1b
        L19:
            r1 = move-exception
            goto L24
        L1b:
            java.util.concurrent.locks.ReentrantLock r1 = com.baidu.vis.unified.license.AndroidLicenser.lock_instance     // Catch: java.lang.Throwable -> L19
            r1.unlock()     // Catch: java.lang.Throwable -> L19
            com.baidu.vis.unified.license.AndroidLicenser r1 = com.baidu.vis.unified.license.AndroidLicenser.mInstance     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    private native void nativeDisableDeviceId(int r1);

    private native int nativeFaceAuthFromFile(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4, int r5);

    private native int nativeFaceAuthFromFolder(android.content.Context r1, java.lang.String r2, boolean r3, int r4);

    private native int nativeFaceAuthFromMemory(android.content.Context r1, java.lang.String r2, java.lang.String[] r3, java.lang.String r4, int r5);

    private native com.baidu.vis.unified.license.BDLicenseAuthInfo nativeFaceAuthGetAuthInfo(android.content.Context r1, int r2);

    private native com.baidu.vis.unified.license.BDLicenseLocalInfo nativeFaceAuthGetLocalInfo(android.content.Context r1, int r2);

    private native int nativeFaceGetAuthStatus(int r1);

    private native java.lang.String nativeFaceGetErrorMsg(int r1);

    private native int nativeFaceIsFunctionAvailable(java.lang.String r1, int r2);

    private native void nativeReleaseAuth(int r1);

    public static void setAgree(boolean r0) {
            com.baidu.vis.unified.license.AndroidLicenser.mAgree = r0
            return
    }

    public static void setIdFlag(java.lang.String r0) {
            com.baidu.vis.unified.license.AndroidLicenser.mIdFlag = r0
            return
    }

    public static void setOnline(boolean r0) {
            com.baidu.vis.unified.license.AndroidLicenser.mOnline = r0
            return
    }

    public void authDisableDeviceId(int r1) {
            r0 = this;
            r0.nativeDisableDeviceId(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public com.baidu.vis.unified.license.AndroidLicenser.ErrorCode authFromFile(android.content.Context r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            int r2 = r1.nativeFaceAuthFromFile(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lb
            r3 = r1
            goto L12
        Lb:
            r3 = r1
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r2 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR
            int r2 = r2.ordinal()
        L12:
            java.util.concurrent.locks.ReentrantLock r4 = r3.lock
            r4.unlock()
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r4 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.values()
            r2 = r4[r2]
            return r2
    }

    public com.baidu.vis.unified.license.AndroidLicenser.ErrorCode authFromFolder(android.content.Context r2, java.lang.String r3, boolean r4, int r5) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            int r2 = r1.nativeFaceAuthFromFolder(r2, r3, r4, r5)     // Catch: java.lang.Exception -> La
            goto L10
        La:
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r2 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR
            int r2 = r2.ordinal()
        L10:
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r3 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.values()
            r2 = r3[r2]
            return r2
    }

    public com.baidu.vis.unified.license.AndroidLicenser.ErrorCode authFromMemory(android.content.Context r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, int r6) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            int r2 = r1.nativeFaceAuthFromMemory(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lb
            r3 = r1
            goto L12
        Lb:
            r3 = r1
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r2 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR
            int r2 = r2.ordinal()
        L12:
            java.util.concurrent.locks.ReentrantLock r4 = r3.lock
            r4.unlock()
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r4 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.values()
            r2 = r4[r2]
            return r2
    }

    public com.baidu.vis.unified.license.BDLicenseAuthInfo authGetAuthInfo(android.content.Context r10, int r11) {
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.lock
            r0.lock()
            com.baidu.vis.unified.license.BDLicenseAuthInfo r10 = r9.nativeFaceAuthGetAuthInfo(r10, r11)     // Catch: java.lang.Exception -> La
            goto L1d
        La:
            com.baidu.vis.unified.license.BDLicenseAuthInfo r0 = new com.baidu.vis.unified.license.BDLicenseAuthInfo
            r6 = 0
            java.lang.String r8 = ""
            java.lang.String r1 = ""
            r2 = -1
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r10 = r0
        L1d:
            java.util.concurrent.locks.ReentrantLock r11 = r9.lock
            r11.unlock()
            return r10
    }

    public com.baidu.vis.unified.license.BDLicenseLocalInfo authGetLocalInfo(android.content.Context r9, int r10) {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            com.baidu.vis.unified.license.BDLicenseLocalInfo r9 = r8.nativeFaceAuthGetLocalInfo(r9, r10)     // Catch: java.lang.Exception -> La
            goto L1d
        La:
            com.baidu.vis.unified.license.BDLicenseLocalInfo r0 = new com.baidu.vis.unified.license.BDLicenseLocalInfo
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r1 = ""
            r2 = -1
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = r0
        L1d:
            java.util.concurrent.locks.ReentrantLock r10 = r8.lock
            r10.unlock()
            return r9
    }

    public com.baidu.vis.unified.license.AndroidLicenser.ErrorCode authIsFuncAvailable(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = r0.nativeFaceIsFunctionAvailable(r1, r2)     // Catch: java.lang.Exception -> L5
            goto Lb
        L5:
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r1 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR
            int r1 = r1.ordinal()
        Lb:
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r2 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.values()
            r1 = r2[r1]
            return r1
    }

    public void authReleaseAuth(int r1) {
            r0 = this;
            r0.nativeReleaseAuth(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public com.baidu.vis.unified.license.AndroidLicenser.ErrorCode getAuthStatus(int r2) {
            r1 = this;
            int r2 = r1.nativeFaceGetAuthStatus(r2)     // Catch: java.lang.Exception -> L5
            goto Lb
        L5:
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r2 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.OTHER_ERROR
            int r2 = r2.ordinal()
        Lb:
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode[] r0 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.values()
            r2 = r0[r2]
            return r2
    }

    public java.lang.String getErrorMsg(int r1) {
            r0 = this;
            java.lang.String r1 = r0.nativeFaceGetErrorMsg(r1)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            java.lang.String r1 = ""
            return r1
    }
}
