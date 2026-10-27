package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MMKV implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int ExpireInDay = 86400;
    public static final int ExpireInHour = 3600;
    public static final int ExpireInMinute = 60;
    public static final int ExpireInMonth = 2592000;
    public static final int ExpireInYear = 946080000;
    public static final int ExpireNever = 0;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final java.util.Set<java.lang.Long> checkedHandleSet = null;
    private static com.tencent.mmkv.MMKVHandler gCallbackHandler;
    private static com.tencent.mmkv.MMKVContentChangeNotification gContentChangeNotify;
    private static boolean gWantLogReDirecting;
    private static final com.tencent.mmkv.MMKVLogLevel[] index2LogLevel = null;
    private static boolean isProcessModeCheckerEnabled;
    private static final java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> logLevel2Index = null;
    private static final java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> mCreators = null;
    private static final java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> recoverIndex = null;
    private static java.lang.String rootDir;
    private final long nativeHandle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.mmkv.MMKV$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mmkv$MMKVLogLevel = null;

        static {
                com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel = r0
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L1d
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelWarning     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L28
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L33
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelNone     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel     // Catch: java.lang.NoSuchFieldError -> L3e
                com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface LibLoader {
        void loadLibrary(java.lang.String r1);
    }

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.tencent.mmkv.MMKVRecoverStrategic> r1 = com.tencent.mmkv.MMKVRecoverStrategic.class
            r0.<init>(r1)
            com.tencent.mmkv.MMKV.recoverIndex = r0
            com.tencent.mmkv.MMKVRecoverStrategic r1 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r3)
            com.tencent.mmkv.MMKVRecoverStrategic r1 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorRecover
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r5)
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.tencent.mmkv.MMKVLogLevel> r1 = com.tencent.mmkv.MMKVLogLevel.class
            r0.<init>(r1)
            com.tencent.mmkv.MMKV.logLevel2Index = r0
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelDebug
            r0.put(r1, r3)
            com.tencent.mmkv.MMKVLogLevel r3 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r0.put(r3, r5)
            com.tencent.mmkv.MMKVLogLevel r5 = com.tencent.mmkv.MMKVLogLevel.LevelWarning
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r7)
            com.tencent.mmkv.MMKVLogLevel r7 = com.tencent.mmkv.MMKVLogLevel.LevelError
            r8 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r9)
            com.tencent.mmkv.MMKVLogLevel r9 = com.tencent.mmkv.MMKVLogLevel.LevelNone
            r10 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0.put(r9, r11)
            r0 = 5
            com.tencent.mmkv.MMKVLogLevel[] r0 = new com.tencent.mmkv.MMKVLogLevel[r0]
            r0[r2] = r1
            r0[r4] = r3
            r0[r6] = r5
            r0[r8] = r7
            r0[r10] = r9
            com.tencent.mmkv.MMKV.index2LogLevel = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.tencent.mmkv.MMKV.checkedHandleSet = r0
            r0 = 0
            com.tencent.mmkv.MMKV.rootDir = r0
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r4
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mmkv.MMKV.mCreators = r0
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r2
            return
    }

    private MMKV(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativeHandle = r1
            return
    }

    private native long actualSize(long r1);

    private native java.lang.String[] allKeys(long r1, boolean r3);

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV backedUpMMKVWithID(java.lang.String r7, int r8, @androidx.annotation.Nullable java.lang.String r9, java.lang.String r10) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L14
            r2 = r8 | 16
            r5 = 0
            r1 = r7
            r3 = r9
            r4 = r10
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r2)
            return r7
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    public static native long backupAllToDirectory(java.lang.String r0);

    public static native boolean backupOneToDirectory(java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2);

    @androidx.annotation.NonNull
    @org.jetbrains.annotations.Contract("_, _, _ -> new")
    private static com.tencent.mmkv.MMKV checkProcessMode(long r3, java.lang.String r5, int r6) throws java.lang.RuntimeException {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L7c
            boolean r0 = com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled
            if (r0 != 0) goto L10
            com.tencent.mmkv.MMKV r5 = new com.tencent.mmkv.MMKV
            r5.<init>(r3)
            return r5
        L10:
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L73
            boolean r1 = checkProcessMode(r3)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L6c
            r3 = 1
            if (r6 != r3) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "Opening a multi-process MMKV instance ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L3d
            r3.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "] with SINGLE_PROCESS_MODE!"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3d
            goto L66
        L3d:
            r3 = move-exception
            goto L7a
        L3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "Opening an MMKV instance ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L3d
            r3.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "] with MULTI_PROCESS_MODE, "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r4.<init>()     // Catch: java.lang.Throwable -> L3d
            r4.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!"
            r4.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L3d
        L66:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L6c:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L3d
            r0.add(r5)     // Catch: java.lang.Throwable -> L3d
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            com.tencent.mmkv.MMKV r5 = new com.tencent.mmkv.MMKV
            r5.<init>(r3)
            return r5
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r3
        L7c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Fail to create an MMKV instance ["
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = "] in JNI"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private static native boolean checkProcessMode(long r0);

    private native boolean containsKey(long r1, java.lang.String r3);

    private native long count(long r1, boolean r3);

    private static native long createNB(int r0);

    @androidx.annotation.Nullable
    public static com.tencent.mmkv.NativeBuffer createNativeBuffer(int r5) {
            long r0 = createNB(r5)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lc
            r5 = 0
            return r5
        Lc:
            com.tencent.mmkv.NativeBuffer r2 = new com.tencent.mmkv.NativeBuffer
            r2.<init>(r0, r5)
            return r2
    }

    private native boolean decodeBool(long r1, java.lang.String r3, boolean r4);

    @androidx.annotation.Nullable
    private native byte[] decodeBytes(long r1, java.lang.String r3);

    private native double decodeDouble(long r1, java.lang.String r3, double r4);

    private native float decodeFloat(long r1, java.lang.String r3, float r4);

    private native int decodeInt(long r1, java.lang.String r3, int r4);

    private native long decodeLong(long r1, java.lang.String r3, long r4);

    @androidx.annotation.Nullable
    private native java.lang.String decodeString(long r1, java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4);

    @androidx.annotation.Nullable
    private native java.lang.String[] decodeStringSet(long r1, java.lang.String r3);

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV defaultMMKV() throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L11
            r0 = 0
            r1 = 1
            long r2 = getDefaultMMKV(r1, r0)
            java.lang.String r0 = "DefaultMMKV"
            com.tencent.mmkv.MMKV r0 = checkProcessMode(r2, r0, r1)
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You should Call MMKV.initialize() first."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV defaultMMKV(int r2, @androidx.annotation.Nullable java.lang.String r3) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Lf
            long r0 = getDefaultMMKV(r2, r3)
            java.lang.String r3 = "DefaultMMKV"
            com.tencent.mmkv.MMKV r2 = checkProcessMode(r0, r3, r2)
            return r2
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "You should Call MMKV.initialize() first."
            r2.<init>(r3)
            throw r2
    }

    private static native void destroyNB(long r0, int r2);

    public static void destroyNativeBuffer(@androidx.annotation.NonNull com.tencent.mmkv.NativeBuffer r2) {
            long r0 = r2.pointer
            int r2 = r2.size
            destroyNB(r0, r2)
            return
    }

    public static void disableProcessModeChecker() {
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            r1 = 0
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private static java.lang.String doInitialize(java.lang.String r1, java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4, boolean r5) {
            java.lang.String r0 = "mmkv"
            if (r3 == 0) goto L8
            r3.loadLibrary(r0)
            goto Lb
        L8:
            java.lang.System.loadLibrary(r0)
        Lb:
            int r3 = logLevel2Int(r4)
            jniInitialize(r1, r2, r3, r5)
            com.tencent.mmkv.MMKV.rootDir = r1
            return r1
    }

    public static void enableProcessModeChecker() {
            java.util.Set<java.lang.Long> r0 = com.tencent.mmkv.MMKV.checkedHandleSet
            monitor-enter(r0)
            r1 = 1
            com.tencent.mmkv.MMKV.isProcessModeCheckerEnabled = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private native boolean encodeBool(long r1, java.lang.String r3, boolean r4);

    private native boolean encodeBool_2(long r1, java.lang.String r3, boolean r4, int r5);

    private native boolean encodeBytes(long r1, java.lang.String r3, @androidx.annotation.Nullable byte[] r4);

    private native boolean encodeBytes_2(long r1, java.lang.String r3, @androidx.annotation.Nullable byte[] r4, int r5);

    private native boolean encodeDouble(long r1, java.lang.String r3, double r4);

    private native boolean encodeDouble_2(long r1, java.lang.String r3, double r4, int r6);

    private native boolean encodeFloat(long r1, java.lang.String r3, float r4);

    private native boolean encodeFloat_2(long r1, java.lang.String r3, float r4, int r5);

    private native boolean encodeInt(long r1, java.lang.String r3, int r4);

    private native boolean encodeInt_2(long r1, java.lang.String r3, int r4, int r5);

    private native boolean encodeLong(long r1, java.lang.String r3, long r4);

    private native boolean encodeLong_2(long r1, java.lang.String r3, long r4, int r6);

    private native boolean encodeSet(long r1, java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4);

    private native boolean encodeSet_2(long r1, java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4, int r5);

    private native boolean encodeString(long r1, java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4);

    private native boolean encodeString_2(long r1, java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4, int r5);

    private static native long getDefaultMMKV(int r0, @androidx.annotation.Nullable java.lang.String r1);

    private static native long getMMKVWithAshmemFD(java.lang.String r0, int r1, int r2, @androidx.annotation.Nullable java.lang.String r3);

    private static native long getMMKVWithID(java.lang.String r0, int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, long r4);

    private static native long getMMKVWithIDAndSize(java.lang.String r0, int r1, int r2, @androidx.annotation.Nullable java.lang.String r3);

    private byte[] getParcelableByte(@androidx.annotation.NonNull android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r3.writeToParcel(r0, r1)
            byte[] r3 = r0.marshall()
            r0.recycle()
            return r3
    }

    public static java.lang.String getRootDir() {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            return r0
    }

    public static java.lang.String initialize(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/mmkv"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r2 = 0
            java.lang.String r3 = initialize(r3, r0, r2, r1, r2)
            return r3
    }

    public static java.lang.String initialize(@androidx.annotation.NonNull android.content.Context r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r3.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/mmkv"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r2 = 0
            java.lang.String r3 = initialize(r3, r0, r4, r1, r2)
            return r3
    }

    public static java.lang.String initialize(@androidx.annotation.NonNull android.content.Context r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/mmkv"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = initialize(r2, r0, r3, r4, r1)
            return r2
    }

    public static java.lang.String initialize(@androidx.annotation.NonNull android.content.Context r2, com.tencent.mmkv.MMKVLogLevel r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = "/mmkv"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = initialize(r2, r0, r1, r3, r1)
            return r2
    }

    public static java.lang.String initialize(android.content.Context r2, java.lang.String r3) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r1 = 0
            java.lang.String r2 = initialize(r2, r3, r1, r0, r1)
            return r2
    }

    public static java.lang.String initialize(android.content.Context r2, java.lang.String r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            r1 = 0
            java.lang.String r2 = initialize(r2, r3, r4, r0, r1)
            return r2
    }

    public static java.lang.String initialize(android.content.Context r1, java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            r0 = 0
            java.lang.String r1 = initialize(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.String initialize(@androidx.annotation.NonNull android.content.Context r1, java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4, com.tencent.mmkv.MMKVHandler r5) {
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 != 0) goto Le
            disableProcessModeChecker()
            goto L11
        Le:
            enableProcessModeChecker()
        L11:
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r1 = r1.getAbsolutePath()
            com.tencent.mmkv.MMKV.gCallbackHandler = r5
            r0 = 1
            if (r5 == 0) goto L26
            boolean r5 = r5.wantLogRedirecting()
            if (r5 == 0) goto L26
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r0
        L26:
            boolean r5 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            java.lang.String r1 = doInitialize(r2, r1, r3, r4, r5)
            com.tencent.mmkv.MMKVHandler r2 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r2 == 0) goto L35
            boolean r2 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            setCallbackHandler(r2, r0)
        L35:
            return r1
    }

    public static java.lang.String initialize(android.content.Context r1, java.lang.String r2, com.tencent.mmkv.MMKVLogLevel r3) {
            r0 = 0
            java.lang.String r1 = initialize(r1, r2, r0, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "/.tmp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 0
            java.lang.String r4 = doInitialize(r4, r1, r2, r0, r3)
            return r4
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r3, com.tencent.mmkv.MMKV.LibLoader r4) {
            com.tencent.mmkv.MMKVLogLevel r0 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "/.tmp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = doInitialize(r3, r1, r4, r0, r2)
            return r3
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r2, com.tencent.mmkv.MMKV.LibLoader r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "/.tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = doInitialize(r2, r0, r3, r4, r1)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String initialize(java.lang.String r3, com.tencent.mmkv.MMKVLogLevel r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "/.tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
            java.lang.String r3 = doInitialize(r3, r0, r1, r4, r2)
            return r3
    }

    private native boolean isCompareBeforeSetEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isEncryptionEnabled();

    @dalvik.annotation.optimization.FastNative
    private native boolean isExpirationEnabled();

    public static boolean isFileValid(java.lang.String r1) {
            r0 = 0
            boolean r1 = isFileValid(r1, r0)
            return r1
    }

    public static native boolean isFileValid(java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1);

    private static native void jniInitialize(java.lang.String r0, java.lang.String r1, int r2, boolean r3);

    @org.jetbrains.annotations.Contract(pure = true)
    private static int logLevel2Int(@androidx.annotation.NonNull com.tencent.mmkv.MMKVLogLevel r2) {
            int[] r0 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L16
            r1 = 2
            if (r2 == r1) goto L15
            r1 = 3
            if (r2 == r1) goto L15
            r1 = 4
            if (r2 == r1) goto L15
            return r0
        L15:
            return r1
        L16:
            r2 = 0
            return r2
    }

    private static void mmkvLogImp(int r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10) {
            com.tencent.mmkv.MMKVHandler r0 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r0 == 0) goto L14
            boolean r1 = com.tencent.mmkv.MMKV.gWantLogReDirecting
            if (r1 == 0) goto L14
            com.tencent.mmkv.MMKVLogLevel[] r1 = com.tencent.mmkv.MMKV.index2LogLevel
            r1 = r1[r6]
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mmkvLog(r1, r2, r3, r4, r5)
            return
        L14:
            int[] r7 = com.tencent.mmkv.MMKV.AnonymousClass1.$SwitchMap$com$tencent$mmkv$MMKVLogLevel
            com.tencent.mmkv.MMKVLogLevel[] r8 = com.tencent.mmkv.MMKV.index2LogLevel
            r6 = r8[r6]
            int r6 = r6.ordinal()
            r6 = r7[r6]
            return
    }

    @androidx.annotation.NonNull
    @org.jetbrains.annotations.Contract("_, _, _, _ -> new")
    public static com.tencent.mmkv.MMKV mmkvWithAshmemFD(java.lang.String r2, int r3, int r4, java.lang.String r5) throws java.lang.RuntimeException {
            long r3 = getMMKVWithAshmemFD(r2, r3, r4, r5)
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L10
            com.tencent.mmkv.MMKV r2 = new com.tencent.mmkv.MMKV
            r2.<init>(r3)
            return r2
        L10:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Fail to create an ashmem MMKV instance ["
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "] in JNI"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context r4, java.lang.String r5, int r6, int r7, @androidx.annotation.Nullable java.lang.String r8) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Lee
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = com.tencent.mmkv.MMKVContentProvider.getProcessNameByPID(r4, r0)
            if (r0 == 0) goto Le1
            int r1 = r0.length()
            if (r1 == 0) goto Le1
            java.lang.String r1 = ":"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lac
            android.net.Uri r0 = com.tencent.mmkv.MMKVContentProvider.contentUri(r4)
            if (r0 == 0) goto L9f
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getting parcelable mmkv in process, Uri = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            simpleLog(r1, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "KEY_SIZE"
            r2.putInt(r3, r6)
            java.lang.String r3 = "KEY_MODE"
            r2.putInt(r3, r7)
            if (r8 == 0) goto L4e
            java.lang.String r3 = "KEY_CRYPT"
            r2.putString(r3, r8)
        L4e:
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r3 = "mmkvFromAshmemID"
            android.os.Bundle r4 = r4.call(r0, r3, r5, r2)
            if (r4 == 0) goto Lac
            java.lang.Class<com.tencent.mmkv.ParcelableMMKV> r0 = com.tencent.mmkv.ParcelableMMKV.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r0 = "KEY"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            com.tencent.mmkv.ParcelableMMKV r4 = (com.tencent.mmkv.ParcelableMMKV) r4
            if (r4 == 0) goto Lac
            com.tencent.mmkv.MMKV r4 = r4.toMMKV()
            if (r4 == 0) goto Lac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.mmapID()
            r5.append(r6)
            java.lang.String r6 = " fd = "
            r5.append(r6)
            int r6 = r4.ashmemFD()
            r5.append(r6)
            java.lang.String r6 = ", meta fd = "
            r5.append(r6)
            int r6 = r4.ashmemMetaFD()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            simpleLog(r1, r5)
            return r4
        L9f:
            com.tencent.mmkv.MMKVLogLevel r4 = com.tencent.mmkv.MMKVLogLevel.LevelError
            java.lang.String r5 = "MMKVContentProvider has invalid authority"
            simpleLog(r4, r5)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r5)
            throw r4
        Lac:
            com.tencent.mmkv.MMKVLogLevel r4 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.String r0 = "getting mmkv in main process"
            simpleLog(r4, r0)
            r4 = r7 | 8
            long r6 = getMMKVWithIDAndSize(r5, r6, r4, r8)
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto Lc5
            com.tencent.mmkv.MMKV r4 = new com.tencent.mmkv.MMKV
            r4.<init>(r6)
            return r4
        Lc5:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Fail to create an Ashmem MMKV instance ["
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "]"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Le1:
            com.tencent.mmkv.MMKVLogLevel r4 = com.tencent.mmkv.MMKVLogLevel.LevelError
            java.lang.String r5 = "process name detect fail, try again later"
            simpleLog(r4, r5)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r5)
            throw r4
        Lee:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "You should Call MMKV.initialize() first."
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L14
            r4 = 0
            r5 = 0
            r2 = 1
            r3 = 0
            r1 = r7
            long r2 = getMMKVWithID(r1, r2, r3, r4, r5)
            r7 = 1
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r2, r1, r7)
            return r7
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "You should Call MMKV.initialize() first."
            r7.<init>(r0)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r2)
            return r7
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, long r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L12
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r2)
            return r7
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, @androidx.annotation.Nullable java.lang.String r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r2)
            return r7
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, int r8, @androidx.annotation.Nullable java.lang.String r9, java.lang.String r10) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r2)
            return r7
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r1, int r2, @androidx.annotation.Nullable java.lang.String r3, java.lang.String r4, long r5) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto Ld
            long r3 = getMMKVWithID(r1, r2, r3, r4, r5)
            com.tencent.mmkv.MMKV r1 = checkProcessMode(r3, r1, r2)
            return r1
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You should Call MMKV.initialize() first."
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, java.lang.String r8) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L14
            r3 = 0
            r5 = 0
            r2 = 1
            r1 = r7
            r4 = r8
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            r0 = 1
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r0)
            return r7
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @androidx.annotation.NonNull
    public static com.tencent.mmkv.MMKV mmkvWithID(java.lang.String r7, java.lang.String r8, long r9) throws java.lang.RuntimeException {
            java.lang.String r0 = com.tencent.mmkv.MMKV.rootDir
            if (r0 == 0) goto L13
            r2 = 1
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            long r7 = getMMKVWithID(r1, r2, r3, r4, r5)
            r9 = 1
            com.tencent.mmkv.MMKV r7 = checkProcessMode(r7, r1, r9)
            return r7
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "You should Call MMKV.initialize() first."
            r7.<init>(r8)
            throw r7
    }

    @dalvik.annotation.optimization.FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(java.lang.String r1) {
            com.tencent.mmkv.MMKVContentChangeNotification r0 = com.tencent.mmkv.MMKV.gContentChangeNotify
            if (r0 == 0) goto L7
            r0.onContentChangedByOuterProcess(r1)
        L7:
            return
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(java.lang.String r4) {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r1 == 0) goto La
            com.tencent.mmkv.MMKVRecoverStrategic r0 = r1.onMMKVCRCCheckFail(r4)
        La:
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Recover strategic for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            simpleLog(r1, r4)
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r4 = com.tencent.mmkv.MMKV.recoverIndex
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L34
            r4 = 0
            return r4
        L34:
            int r4 = r4.intValue()
            return r4
    }

    private static int onMMKVFileLengthError(java.lang.String r4) {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard
            com.tencent.mmkv.MMKVHandler r1 = com.tencent.mmkv.MMKV.gCallbackHandler
            if (r1 == 0) goto La
            com.tencent.mmkv.MMKVRecoverStrategic r0 = r1.onMMKVFileLengthError(r4)
        La:
            com.tencent.mmkv.MMKVLogLevel r1 = com.tencent.mmkv.MMKVLogLevel.LevelInfo
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Recover strategic for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            simpleLog(r1, r4)
            java.util.EnumMap<com.tencent.mmkv.MMKVRecoverStrategic, java.lang.Integer> r4 = com.tencent.mmkv.MMKV.recoverIndex
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L34
            r4 = 0
            return r4
        L34:
            int r4 = r4.intValue()
            return r4
    }

    public static native int pageSize();

    public static void registerContentChangeNotify(com.tencent.mmkv.MMKVContentChangeNotification r0) {
            com.tencent.mmkv.MMKV.gContentChangeNotify = r0
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            setWantsContentChangeNotify(r0)
            return
    }

    public static void registerHandler(com.tencent.mmkv.MMKVHandler r1) {
            com.tencent.mmkv.MMKV.gCallbackHandler = r1
            boolean r1 = r1.wantLogRedirecting()
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r1
            r0 = 1
            setCallbackHandler(r1, r0)
            return
    }

    public static boolean removeStorage(java.lang.String r1) {
            r0 = 0
            boolean r1 = removeStorage(r1, r0)
            return r1
    }

    public static native boolean removeStorage(java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1);

    private native void removeValueForKey(long r1, java.lang.String r3);

    public static native long restoreAllFromDirectory(java.lang.String r0);

    public static native boolean restoreOneMMKVFromDirectory(java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2);

    private static native void setCallbackHandler(boolean r0, boolean r1);

    private static native void setLogLevel(int r0);

    public static void setLogLevel(com.tencent.mmkv.MMKVLogLevel r0) {
            int r0 = logLevel2Int(r0)
            setLogLevel(r0)
            return
    }

    private static native void setWantsContentChangeNotify(boolean r0);

    private static void simpleLog(com.tencent.mmkv.MMKVLogLevel r3, java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            java.util.EnumMap<com.tencent.mmkv.MMKVLogLevel, java.lang.Integer> r1 = com.tencent.mmkv.MMKV.logLevel2Index
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L19
            r3 = 0
            goto L1d
        L19:
            int r3 = r3.intValue()
        L1d:
            java.lang.String r1 = r0.getFileName()
            int r2 = r0.getLineNumber()
            java.lang.String r0 = r0.getMethodName()
            mmkvLogImp(r3, r1, r2, r0, r4)
            return
    }

    private native void sync(boolean r1);

    private native long totalSize(long r1);

    public static void unregisterContentChangeNotify() {
            r0 = 0
            com.tencent.mmkv.MMKV.gContentChangeNotify = r0
            r0 = 0
            setWantsContentChangeNotify(r0)
            return
    }

    public static void unregisterHandler() {
            r0 = 0
            com.tencent.mmkv.MMKV.gCallbackHandler = r0
            r0 = 0
            setCallbackHandler(r0, r0)
            com.tencent.mmkv.MMKV.gWantLogReDirecting = r0
            return
    }

    private native int valueSize(long r1, java.lang.String r3, boolean r4);

    public static native java.lang.String version();

    private native int writeValueToNB(long r1, java.lang.String r3, long r4, int r6);

    public long actualSize() {
            r2 = this;
            long r0 = r2.nativeHandle
            long r0 = r2.actualSize(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String[] allKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            java.lang.String[] r0 = r3.allKeys(r0, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String[] allNonExpireKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            java.lang.String[] r0 = r3.allKeys(r0, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public void apply() {
            r1 = this;
            r0 = 0
            r1.sync(r0)
            return
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
            r1 = this;
            r0 = 0
            r1.sync(r0)
            return
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@androidx.annotation.Nullable java.lang.String r1);

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
            r0 = this;
            r0.clearAll()
            return r0
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public boolean commit() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    public boolean containsKey(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.containsKey(r0, r3)
            return r3
    }

    public long count() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            long r0 = r3.count(r0, r2)
            return r0
    }

    public long countNonExpiredKeys() {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            long r0 = r3.count(r0, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public native java.lang.String cryptKey();

    public boolean decodeBool(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            boolean r4 = r3.decodeBool(r0, r4, r2)
            return r4
    }

    public boolean decodeBool(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.decodeBool(r0, r3, r4)
            return r3
    }

    @androidx.annotation.Nullable
    public byte[] decodeBytes(java.lang.String r2) {
            r1 = this;
            r0 = 0
            byte[] r2 = r1.decodeBytes(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public byte[] decodeBytes(java.lang.String r3, @androidx.annotation.Nullable byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            byte[] r3 = r2.decodeBytes(r0, r3)
            if (r3 == 0) goto L9
            return r3
        L9:
            return r4
    }

    public double decodeDouble(java.lang.String r7) {
            r6 = this;
            long r1 = r6.nativeHandle
            r4 = 0
            r0 = r6
            r3 = r7
            double r1 = r0.decodeDouble(r1, r3, r4)
            return r1
    }

    public double decodeDouble(java.lang.String r7, double r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            double r7 = r0.decodeDouble(r1, r3, r4)
            return r7
    }

    public float decodeFloat(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            float r4 = r3.decodeFloat(r0, r4, r2)
            return r4
    }

    public float decodeFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            float r3 = r2.decodeFloat(r0, r3, r4)
            return r3
    }

    public int decodeInt(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            int r4 = r3.decodeInt(r0, r4, r2)
            return r4
    }

    public int decodeInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            int r3 = r2.decodeInt(r0, r3, r4)
            return r3
    }

    public long decodeLong(java.lang.String r7) {
            r6 = this;
            long r1 = r6.nativeHandle
            r4 = 0
            r0 = r6
            r3 = r7
            long r1 = r0.decodeLong(r1, r3, r4)
            return r1
    }

    public long decodeLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            long r7 = r0.decodeLong(r1, r3, r4)
            return r7
    }

    @androidx.annotation.Nullable
    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            r0 = 0
            android.os.Parcelable r2 = r1.decodeParcelable(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String r4, java.lang.Class<T> r5, @androidx.annotation.Nullable T r6) {
            r3 = this;
            if (r5 != 0) goto L3
            goto Lb
        L3:
            long r0 = r3.nativeHandle
            byte[] r4 = r3.decodeBytes(r0, r4)
            if (r4 != 0) goto Lc
        Lb:
            return r6
        Lc:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r4.length
            r2 = 0
            r0.unmarshall(r4, r2, r1)
            r0.setDataPosition(r2)
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.util.HashMap<java.lang.String, android.os.Parcelable$Creator<?>> r1 = com.tencent.mmkv.MMKV.mCreators     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L3b
            android.os.Parcelable$Creator r2 = (android.os.Parcelable.Creator) r2     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L3d
            java.lang.String r2 = "CREATOR"
            java.lang.reflect.Field r5 = r5.getField(r2)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> L3b
            r2 = r5
            android.os.Parcelable$Creator r2 = (android.os.Parcelable.Creator) r2     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L3d
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r4 = move-exception
            goto L65
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L4e
            java.lang.Object r4 = r2.createFromParcel(r0)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r0.recycle()
            return r4
        L4a:
            r4 = move-exception
            goto L74
        L4c:
            r4 = move-exception
            goto L67
        L4e:
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r1.append(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            throw r5     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r4     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
        L67:
            com.tencent.mmkv.MMKVLogLevel r5 = com.tencent.mmkv.MMKVLogLevel.LevelError     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            simpleLog(r5, r4)     // Catch: java.lang.Throwable -> L4a
            r0.recycle()
            return r6
        L74:
            r0.recycle()
            throw r4
    }

    @androidx.annotation.Nullable
    public java.lang.String decodeString(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            java.lang.String r4 = r3.decodeString(r0, r4, r2)
            return r4
    }

    @androidx.annotation.Nullable
    public java.lang.String decodeString(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String r3 = r2.decodeString(r0, r3, r4)
            return r3
    }

    @androidx.annotation.Nullable
    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.util.Set r2 = r1.decodeStringSet(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r2, @androidx.annotation.Nullable java.util.Set<java.lang.String> r3) {
            r1 = this;
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            java.util.Set r2 = r1.decodeStringSet(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public java.util.Set<java.lang.String> decodeStringSet(java.lang.String r3, @androidx.annotation.Nullable java.util.Set<java.lang.String> r4, java.lang.Class<? extends java.util.Set> r5) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String[] r3 = r2.decodeStringSet(r0, r3)
            if (r3 != 0) goto L9
            goto L17
        L9:
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Throwable -> L17
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L17
            java.util.List r3 = java.util.Arrays.asList(r3)
            r5.addAll(r3)
            return r5
        L17:
            return r4
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r0 = this;
            return r0
    }

    public native boolean enableAutoKeyExpire(int r1);

    public void enableCompareBeforeSet() {
            r0 = this;
            r0.isExpirationEnabled()
            r0.isEncryptionEnabled()
            r0.nativeEnableCompareBeforeSet()
            return
    }

    public boolean encode(java.lang.String r7, double r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            boolean r7 = r0.encodeDouble(r1, r3, r4)
            return r7
    }

    public boolean encode(java.lang.String r8, double r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            boolean r8 = r0.encodeDouble_2(r1, r3, r4, r6)
            return r8
    }

    public boolean encode(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeFloat(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, float r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.encodeFloat_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeInt(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, int r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.encodeInt_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            boolean r7 = r0.encodeLong(r1, r3, r4)
            return r7
    }

    public boolean encode(java.lang.String r8, long r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            boolean r8 = r0.encodeLong_2(r1, r3, r4, r6)
            return r8
    }

    public boolean encode(java.lang.String r3, @androidx.annotation.Nullable android.os.Parcelable r4) {
            r2 = this;
            if (r4 != 0) goto La
            long r0 = r2.nativeHandle
            r4 = 0
            boolean r3 = r2.encodeBytes(r0, r3, r4)
            return r3
        La:
            byte[] r4 = r2.getParcelableByte(r4)
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeBytes(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, @androidx.annotation.Nullable android.os.Parcelable r8, int r9) {
            r6 = this;
            if (r8 != 0) goto Ld
            long r1 = r6.nativeHandle
            r4 = 0
            r0 = r6
            r3 = r7
            r5 = r9
            boolean r7 = r0.encodeBytes_2(r1, r3, r4, r5)
            return r7
        Ld:
            r0 = r6
            r3 = r7
            r5 = r9
            byte[] r4 = r6.getParcelableByte(r8)
            long r1 = r0.nativeHandle
            boolean r7 = r0.encodeBytes_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeString(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.encodeString_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r4, @androidx.annotation.Nullable java.util.Set<java.lang.String> r5) {
            r3 = this;
            long r0 = r3.nativeHandle
            if (r5 != 0) goto L6
            r5 = 0
            goto Lf
        L6:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r5 = r5.toArray(r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
        Lf:
            boolean r4 = r3.encodeSet(r0, r4, r5)
            return r4
    }

    public boolean encode(java.lang.String r7, @androidx.annotation.Nullable java.util.Set<java.lang.String> r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            if (r8 != 0) goto La
            r8 = 0
        L5:
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            goto L14
        La:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r8 = r8.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            goto L5
        L14:
            boolean r7 = r0.encodeSet_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeBool(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, boolean r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.encodeBool_2(r1, r3, r4, r5)
            return r7
    }

    public boolean encode(java.lang.String r3, @androidx.annotation.Nullable byte[] r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.encodeBytes(r0, r3, r4)
            return r3
    }

    public boolean encode(java.lang.String r7, @androidx.annotation.Nullable byte[] r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.encodeBytes_2(r1, r3, r4, r5)
            return r7
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            boolean r3 = r2.decodeBool(r0, r3, r4)
            return r3
    }

    public byte[] getBytes(java.lang.String r1, @androidx.annotation.Nullable byte[] r2) {
            r0 = this;
            byte[] r1 = r0.decodeBytes(r1, r2)
            return r1
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            float r3 = r2.decodeFloat(r0, r3, r4)
            return r3
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            int r3 = r2.decodeInt(r0, r3, r4)
            return r3
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            long r7 = r0.decodeLong(r1, r3, r4)
            return r7
    }

    @Override // android.content.SharedPreferences
    @androidx.annotation.Nullable
    public java.lang.String getString(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            java.lang.String r3 = r2.decodeString(r0, r3, r4)
            return r3
    }

    @Override // android.content.SharedPreferences
    @androidx.annotation.Nullable
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r1, @androidx.annotation.Nullable java.util.Set<java.lang.String> r2) {
            r0 = this;
            java.util.Set r1 = r0.decodeStringSet(r1, r2)
            return r1
    }

    public int getValueActualSize(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 1
            int r4 = r3.valueSize(r0, r4, r2)
            return r4
    }

    public int getValueSize(java.lang.String r4) {
            r3 = this;
            long r0 = r3.nativeHandle
            r2 = 0
            int r4 = r3.valueSize(r0, r4, r2)
            return r4
    }

    public int importFromSharedPreferences(@androidx.annotation.NonNull android.content.SharedPreferences r10) {
            r9 = this;
            java.util.Map r10 = r10.getAll()
            if (r10 == 0) goto Lc
            int r0 = r10.size()
            if (r0 > 0) goto Lf
        Lc:
            r3 = r9
            goto Lc2
        Lf:
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.getValue()
            if (r6 == 0) goto Lb9
            if (r1 != 0) goto L33
            goto L17
        L33:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L44
            long r2 = r9.nativeHandle
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r9.encodeBool(r2, r6, r1)
            goto Lb9
        L44:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L54
            long r2 = r9.nativeHandle
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.encodeInt(r2, r6, r1)
            goto Lb9
        L54:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L65
            long r4 = r9.nativeHandle
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            r3 = r9
            r3.encodeLong(r4, r6, r7)
            goto L17
        L65:
            r3 = r9
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L76
            long r4 = r3.nativeHandle
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.encodeFloat(r4, r6, r1)
            goto L17
        L76:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L86
            long r4 = r3.nativeHandle
            java.lang.Double r1 = (java.lang.Double) r1
            double r7 = r1.doubleValue()
            r3.encodeDouble(r4, r6, r7)
            goto L17
        L86:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L92
            long r4 = r3.nativeHandle
            java.lang.String r1 = (java.lang.String) r1
            r9.encodeString(r4, r6, r1)
            goto L17
        L92:
            boolean r2 = r1 instanceof java.util.Set
            if (r2 == 0) goto L9d
            java.util.Set r1 = (java.util.Set) r1
            r9.encode(r6, r1)
            goto L17
        L9d:
            com.tencent.mmkv.MMKVLogLevel r2 = com.tencent.mmkv.MMKVLogLevel.LevelError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unknown type: "
            r4.append(r5)
            java.lang.Class r1 = r1.getClass()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            simpleLog(r2, r1)
            goto L17
        Lb9:
            r3 = r9
            goto L17
        Lbc:
            r3 = r9
            int r10 = r10.size()
            return r10
        Lc2:
            r10 = 0
            return r10
    }

    public native void lock();

    public native java.lang.String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeBool(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putBoolean(java.lang.String r7, boolean r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeBool_2(r1, r3, r4, r5)
            return r0
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r1, @androidx.annotation.Nullable byte[] r2) {
            r0 = this;
            r0.encode(r1, r2)
            return r0
    }

    public android.content.SharedPreferences.Editor putBytes(java.lang.String r1, @androidx.annotation.Nullable byte[] r2, int r3) {
            r0 = this;
            r0.encode(r1, r2, r3)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeFloat(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putFloat(java.lang.String r7, float r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeFloat_2(r1, r3, r4, r5)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeInt(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putInt(java.lang.String r7, int r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeInt_2(r1, r3, r4, r5)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String r7, long r8) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r0.encodeLong(r1, r3, r4)
            return r0
    }

    public android.content.SharedPreferences.Editor putLong(java.lang.String r8, long r9, int r11) {
            r7 = this;
            long r1 = r7.nativeHandle
            r0 = r7
            r3 = r8
            r4 = r9
            r6 = r11
            r0.encodeLong_2(r1, r3, r4, r6)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.encodeString(r0, r3, r4)
            return r2
    }

    public android.content.SharedPreferences.Editor putString(java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8, int r9) {
            r6 = this;
            long r1 = r6.nativeHandle
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.encodeString_2(r1, r3, r4, r5)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, @androidx.annotation.Nullable java.util.Set<java.lang.String> r2) {
            r0 = this;
            r0.encode(r1, r2)
            return r0
    }

    public android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, @androidx.annotation.Nullable java.util.Set<java.lang.String> r2, int r3) {
            r0 = this;
            r0.encode(r1, r2, r3)
            return r0
    }

    public native boolean reKey(@androidx.annotation.Nullable java.lang.String r1);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Intentionally Not implement in MMKV"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String r1) {
            r0 = this;
            r0.removeValueForKey(r1)
            return r0
    }

    public void removeValueForKey(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativeHandle
            r2.removeValueForKey(r0, r3)
            return
    }

    public native void removeValuesForKeys(java.lang.String[] r1);

    public void sync() {
            r1 = this;
            r0 = 1
            r1.sync(r0)
            return
    }

    public long totalSize() {
            r2 = this;
            long r0 = r2.nativeHandle
            long r0 = r2.totalSize(r0)
            return r0
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Intentionally Not implement in MMKV"
            r2.<init>(r0)
            throw r2
    }

    public int writeValueToNativeBuffer(java.lang.String r8, @androidx.annotation.NonNull com.tencent.mmkv.NativeBuffer r9) {
            r7 = this;
            long r1 = r7.nativeHandle
            long r4 = r9.pointer
            int r6 = r9.size
            r0 = r7
            r3 = r8
            int r8 = r0.writeValueToNB(r1, r3, r4, r6)
            return r8
    }
}
