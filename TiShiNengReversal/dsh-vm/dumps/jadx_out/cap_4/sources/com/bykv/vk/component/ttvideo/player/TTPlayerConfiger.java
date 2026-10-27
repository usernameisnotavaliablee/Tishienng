package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class TTPlayerConfiger {
    private static java.lang.String APP_PATH = null;
    private static java.lang.String CRASH_FILE_NAME = "ttplayer_crash.log";
    private static java.lang.String CRASH_FILE_PATH = null;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_POOL_STACK_SIZE = 32;
    public static final int FALSE = 0;
    public static boolean IS_PRINT_INFO = false;
    public static final int IS_TIME_OUT_COUNT = 3;
    private static final android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.Value> KEYS = null;
    public static final int KEY_IS_BATTERY_INFO = 23;
    public static final int KEY_IS_CHECK_LIB = 3;
    public static final int KEY_IS_CHECK_TTPLAYER_MODEL = 0;
    public static final int KEY_IS_CRASHED = 7;
    public static final int KEY_IS_CRASH_FILE_NAME = 17;
    public static final int KEY_IS_CRASH_PATH = 19;
    public static final int KEY_IS_DEBUG_MODEL = 6;
    public static final int KEY_IS_FORBID_CREATED_OS_PLAYER = 11;
    public static final int KEY_IS_FOREGROUND = 21;
    public static final int KEY_IS_IPTTPLAYER_ON = 2;
    public static final int KEY_IS_LOG_FILE_DIR = 20;
    public static final int KEY_IS_ON_SCREEN = 22;
    public static final int KEY_IS_OPEN_DEVICE_FAIL = 8;
    public static final int KEY_IS_PORT_VERSION = 18;
    public static final int KEY_IS_PRINT_INFO = 5;
    public static final int KEY_IS_SDK_VERSION = 13;
    public static final int KEY_IS_SDK_VERSION_INFO = 15;
    public static final int KEY_IS_SDK_VERSION_NAME = 14;
    public static final int KEY_IS_START_SERVICE = 16;
    public static final int KEY_IS_STOP_SERVICE = 12;
    public static final int KEY_IS_THREAD_POOL_STACK_SIZE = 25;
    public static final int KEY_IS_THROW_CRASH = 4;
    public static final int KEY_IS_TIMEOUT_COUNT = 10;
    public static final int KEY_IS_TTPLAYER_ON = 1;
    public static final int KEY_IS_USED_THREAD_POOL = 24;
    private static java.lang.String LIBRARY_DIR = null;
    private static java.lang.String PLAYER_LIBRARY_NAME = "libttmplayer_lite.so";
    private static final int PORT_VERSION = 2;
    public static final java.lang.String TAG = "ttplayer";
    public static final int TRUE = 1;
    private static java.lang.String TTPLAYER_FILE_CACHE_DIR = null;
    private static final int VERSION = 1;
    private static final java.lang.String VERSION_INFO = "version code:1,name:999.999.999.9default sdk info 2016-12-05";
    private static final java.lang.String VERSION_NAME = "999.999.999.9";

    static final class IntValue extends com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.Value {
        private int mValue;

        public IntValue(int r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mValue = r2
                return
        }

        public int getValue() {
                r1 = this;
                int r0 = r1.mValue
                return r0
        }

        public void setValue(int r1) {
                r0 = this;
                r0.mValue = r1
                return
        }
    }

    static class LongValue extends com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.Value {
        private long mValue;

        public LongValue(int r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mValue = r2
                return
        }

        public long getValue() {
                r2 = this;
                long r0 = r2.mValue
                return r0
        }

        public void setValue(long r1) {
                r0 = this;
                r0.mValue = r1
                return
        }
    }

    static class StringValue extends com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.Value {
        private java.lang.String mValue;

        public StringValue(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mValue = r2
                return
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.mValue
                return r0
        }

        public void setValue(java.lang.String r1) {
                r0 = this;
                r0.mValue = r1
                return
        }
    }

    static class Value {
        private int mKey;

        protected Value(int r1) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                return
        }

        public int getKey() {
                r1 = this;
                int r0 = r1.mKey
                return r0
        }
    }

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS = r0
            r0 = 13
            r1 = 1
            setValue(r0, r1)
            r0 = 14
            java.lang.String r2 = "999.999.999.9"
            setValue(r0, r2)
            r0 = 15
            java.lang.String r2 = "version code:1,name:999.999.999.9default sdk info 2016-12-05"
            setValue(r0, r2)
            r0 = 0
            setValue(r0, r0)
            setValue(r1, r1)
            r2 = 2
            setValue(r2, r1)
            r1 = 3
            setValue(r1, r0)
            r1 = 4
            setValue(r1, r0)
            r1 = 5
            setValue(r1, r0)
            r1 = 6
            setValue(r1, r0)
            r1 = 7
            setValue(r1, r0)
            r1 = 8
            setValue(r1, r0)
            r1 = 10
            setValue(r1, r0)
            r1 = 11
            setValue(r1, r0)
            r0 = 18
            setValue(r0, r2)
            r0 = 25
            r1 = 32
            setValue(r0, r1)
            return
    }

    public TTPlayerConfiger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkDebugTTPlayerLib() {
            return
    }

    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto Ld
            return r1
        Ld:
            boolean r5 = r0.isFile()
            if (r5 != 0) goto L14
            return r1
        L14:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L2a
            if (r6 == 0) goto L3f
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            r6.delete()
            goto L3f
        L2a:
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L3f
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L3f
            return r1
        L3f:
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L87 java.io.FileNotFoundException -> L89
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L87 java.io.FileNotFoundException -> L89
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f java.io.FileNotFoundException -> L81
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f java.io.FileNotFoundException -> L81
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
        L4e:
            int r5 = r6.read(r4)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            r3 = -1
            if (r5 == r3) goto L5f
            r2.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            goto L4e
        L59:
            r4 = move-exception
            goto L8b
        L5b:
            goto L77
        L5d:
            goto L79
        L5f:
            r2.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
            if (r7 == 0) goto L6a
            r0.delete()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b java.io.FileNotFoundException -> L5d
        L6a:
            r2.close()     // Catch: java.io.IOException -> L71
            r6.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L75:
            r4 = 1
            return r4
        L77:
            r4 = r2
            goto L9e
        L79:
            r4 = r2
            goto Lb1
        L7b:
            r5 = move-exception
            r2 = r4
        L7d:
            r4 = r5
            goto L8b
        L7f:
            goto L9e
        L81:
            goto Lb1
        L83:
            r5 = move-exception
            r6 = r4
            r2 = r6
            goto L7d
        L87:
            goto L9d
        L89:
            goto Lb0
        L8b:
            if (r2 == 0) goto L93
            r2.close()     // Catch: java.io.IOException -> L91
            goto L93
        L91:
            r5 = move-exception
            goto L99
        L93:
            if (r6 == 0) goto L9c
            r6.close()     // Catch: java.io.IOException -> L91
            goto L9c
        L99:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L9c:
            throw r4
        L9d:
            r6 = r4
        L9e:
            if (r4 == 0) goto La6
            r4.close()     // Catch: java.io.IOException -> La4
            goto La6
        La4:
            r4 = move-exception
            goto Lac
        La6:
            if (r6 == 0) goto Laf
            r6.close()     // Catch: java.io.IOException -> La4
            goto Laf
        Lac:
            com.bytedance.sdk.component.utils.vl.j(r4)
        Laf:
            return r1
        Lb0:
            r6 = r4
        Lb1:
            if (r4 == 0) goto Lb9
            r4.close()     // Catch: java.io.IOException -> Lb7
            goto Lb9
        Lb7:
            r4 = move-exception
            goto Lbf
        Lb9:
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.io.IOException -> Lb7
            goto Lc2
        Lbf:
            com.bytedance.sdk.component.utils.vl.j(r4)
        Lc2:
            return r1
    }

    @java.lang.Deprecated
    public static final java.lang.String getAppCrashFilePath(android.content.Context r2) {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            if (r0 != 0) goto L4c
            java.lang.String r2 = getAppCrashFileStorePath(r2)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            char r0 = java.io.File.separatorChar
            r2.append(r0)
            java.lang.String r1 = "plugins"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "com.bykv.vk.component.ttvideo"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "data"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "files"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L4c:
            boolean r2 = isPrintInfo()
            if (r2 == 0) goto L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "<TTPlayerConfigure.java,getAppCrashFileStorePath,278>carsh file path:"
            r2.<init>(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "ttplayer"
            com.bytedance.sdk.component.utils.vl.j(r0, r2)
        L67:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            return r2
    }

    public static final java.lang.String getAppCrashFilePath2(android.content.Context r2) {
            if (r2 == 0) goto L18
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 != 0) goto L18
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r0
        L18:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            java.lang.String r1 = "ttplayer"
            if (r0 != 0) goto L60
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 != 0) goto L28
            java.lang.String r2 = getAppFilesPath(r2)
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r2
        L28:
            boolean r2 = isPrintInfo()
            if (r2 == 0) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "<TTPlayerConfigure.java,getAppCrashFilePath2,211>app files path:"
            r2.<init>(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
        L41:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            char r0 = java.io.File.separatorChar
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L5e:
            r2 = 0
            return r2
        L60:
            boolean r2 = isPrintInfo()
            if (r2 == 0) goto L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "<TTPlayerConfigure.java,getAppCrashFileStorePath,195>carsh file path:"
            r2.<init>(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
        L79:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            return r2
    }

    @java.lang.Deprecated
    public static final java.lang.String getAppCrashFileStorePath(android.content.Context r2) {
            if (r2 == 0) goto L18
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 != 0) goto L18
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r0
        L18:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            java.lang.String r1 = "ttplayer"
            if (r0 != 0) goto L60
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 != 0) goto L28
            java.lang.String r2 = getAppFilesPath(r2)
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r2
        L28:
            boolean r2 = isPrintInfo()
            if (r2 == 0) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "<TTPlayerConfigure.java,getAppCrashFileStorePath,245>app files path:"
            r2.<init>(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
        L41:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            char r0 = java.io.File.separatorChar
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L5e:
            r2 = 0
            return r2
        L60:
            boolean r2 = isPrintInfo()
            if (r2 == 0) goto L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "<TTPlayerConfigure.java,getAppCrashFileStorePath,253>carsh file path:"
            r2.<init>(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
        L79:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH
            return r2
    }

    public static final java.lang.String getAppFileCachePath(android.content.Context r1) {
            if (r1 == 0) goto L18
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 != 0) goto L18
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r0
        L18:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.TTPLAYER_FILE_CACHE_DIR
            if (r0 == 0) goto L1d
            return r0
        L1d:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 == 0) goto L22
            return r0
        L22:
            r0 = 0
            if (r1 != 0) goto L26
            return r0
        L26:
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L39
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L39
            java.io.File r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1)     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L39
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r1     // Catch: java.lang.Exception -> L39
            return r1
        L39:
            return r0
    }

    public static final java.lang.String getAppFilesPath(android.content.Context r1) {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            if (r1 != 0) goto L9
            return r0
        L9:
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L1c
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L1c
            java.io.File r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L1c
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r1     // Catch: java.lang.Exception -> L1c
            return r1
        L1c:
            return r0
    }

    public static final java.lang.String getExternalStorageDirectoryCrashFilePath() {
            r0 = 0
            return r0
    }

    public static java.lang.String getPlayerLibraryPath() {
            r0 = 0
            java.lang.String r0 = getPlayerLibraryPath(r0)
            return r0
    }

    public static java.lang.String getPlayerLibraryPath(android.content.Context r2) {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r0 == 0) goto L6
            if (r2 == 0) goto Lc
        L6:
            java.lang.String r2 = getAppFilesPath(r2)
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH = r2
        Lc:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            if (r2 != 0) goto L16
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            if (r2 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            if (r2 == 0) goto L51
            char r0 = java.io.File.separatorChar
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r2 = r2.endsWith(r1)
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.PLAYER_LIBRARY_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.PLAYER_LIBRARY_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            char r0 = java.io.File.separatorChar
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.PLAYER_LIBRARY_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String getPlayerLibrarysDir(android.content.Context r2) {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = getAppFilesPath(r2)
            r0.append(r2)
            char r2 = java.io.File.separatorChar
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR = r2
            return r2
        L1c:
            char r2 = java.io.File.separatorChar
            java.lang.String r1 = java.lang.String.valueOf(r2)
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2b
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            return r2
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.String getPlugerCrashFilePath(android.content.Context r2) {
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.APP_PATH
            r2.append(r0)
            char r0 = java.io.File.separatorChar
            r2.append(r0)
            java.lang.String r1 = "plugins"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "com.bykv.vk.component.ttvideo"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "data"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "files"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static final int getValue(int r1, int r2) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L13
            boolean r0 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$IntValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue) r1
            int r1 = r1.getValue()
            return r1
        L13:
            return r2
    }

    public static final long getValue(int r1, long r2) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L13
            boolean r0 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LongValue
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$LongValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LongValue) r1
            long r1 = r1.getValue()
            return r1
        L13:
            return r2
    }

    public static final java.lang.String getValue(int r1, java.lang.String r2) {
            r0 = 17
            if (r1 != r0) goto L7
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME
            return r1
        L7:
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r1)
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.Value) r1
            if (r1 == 0) goto L1c
            boolean r0 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.StringValue
            if (r0 == 0) goto L1c
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$StringValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.StringValue) r1
            java.lang.String r1 = r1.getValue()
            return r1
        L1c:
            return r2
    }

    public static final boolean getValue(int r1, boolean r2) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L18
            boolean r0 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue
            if (r0 == 0) goto L18
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$IntValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue) r1
            int r1 = r1.getValue()
            r2 = 1
            if (r1 != r2) goto L16
            return r2
        L16:
            r1 = 0
            return r1
        L18:
            return r2
    }

    public static final int getVersion() {
            r0 = 1
            return r0
    }

    public static final boolean isOnTTPlayer() {
            r0 = 6
            r1 = 0
            int r0 = getValue(r0, r1)
            r2 = 1
            if (r0 != r2) goto La
            return r2
        La:
            int r0 = getValue(r2, r1)
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 11
            int r0 = getValue(r0, r1)
            if (r0 != r2) goto L1a
            return r2
        L1a:
            r0 = 7
            int r0 = getValue(r0, r1)
            if (r0 == r2) goto L35
            r0 = 8
            int r0 = getValue(r0, r1)
            if (r0 != r2) goto L2a
            goto L35
        L2a:
            r0 = 10
            int r0 = getValue(r0, r1)
            r3 = 3
            if (r0 < r3) goto L34
            return r1
        L34:
            return r2
        L35:
            return r1
    }

    public static boolean isPrintInfo() {
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IS_PRINT_INFO
            return r0
    }

    public static final boolean moveFile(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = 1
            boolean r1 = copyFile(r1, r2, r3, r0)
            return r1
    }

    public static final void setCrashFileName(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_NAME = r0
            return
    }

    public static final void setCrashFilePath(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.CRASH_FILE_PATH = r0
            return
    }

    public static final void setLibraryName(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.PLAYER_LIBRARY_NAME = r0
            return
    }

    public static final void setLibrarysDir(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LIBRARY_DIR = r0
            return
    }

    public static final void setValue(int r3, int r4) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L21
            boolean r2 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue
            if (r2 == 0) goto L1e
            r0 = 2
            if (r3 != r0) goto L18
            r3 = 6
            r0 = 0
            boolean r3 = getValue(r3, r0)
            if (r3 == 0) goto L18
            return
        L18:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$IntValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.IntValue) r1
            r1.setValue(r4)
            return
        L1e:
            r0.remove(r3)
        L21:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$IntValue r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$IntValue
            r1.<init>(r3, r4)
            r0.append(r3, r1)
            return
    }

    public static final void setValue(int r3, long r4) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L15
            boolean r2 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LongValue
            if (r2 == 0) goto L12
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$LongValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.LongValue) r1
            r1.setValue(r4)
            return
        L12:
            r0.remove(r3)
        L15:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$LongValue r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$LongValue
            r1.<init>(r3, r4)
            r0.append(r3, r1)
            return
    }

    public static final void setValue(int r3, java.lang.String r4) {
            android.util.SparseArray<com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$Value> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.KEYS
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L15
            boolean r2 = r1 instanceof com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.StringValue
            if (r2 == 0) goto L12
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$StringValue r1 = (com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.StringValue) r1
            r1.setValue(r4)
            return
        L12:
            r0.remove(r3)
        L15:
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$StringValue r1 = new com.bykv.vk.component.ttvideo.player.TTPlayerConfiger$StringValue
            r1.<init>(r3, r4)
            r0.append(r3, r1)
            return
    }

    public static final void setValue(int r0, boolean r1) {
            setValue(r0, r1)
            return
    }
}
