package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class ZeusPluginStateListener {
    public static final int EVENT_DOWNLOAD_FAILED = 4;
    public static final int EVENT_DOWNLOAD_PROGRESS = 2;
    public static final int EVENT_DOWNLOAD_START = 1;
    public static final int EVENT_DOWNLOAD_SUCCESS = 3;
    public static final int EVENT_INSTALL_DEX_START = 11;
    public static final int EVENT_INSTALL_DEX_SUCCESS = 12;
    public static final int EVENT_INSTALL_FAILED = 7;
    public static final int EVENT_INSTALL_START = 5;
    public static final int EVENT_INSTALL_SUCCESS = 6;
    public static final int EVENT_LOAD_DEX_START = 13;
    public static final int EVENT_LOAD_DEX_SUCCESS = 14;
    public static final int EVENT_LOAD_FAILED = 10;
    public static final int EVENT_LOAD_START = 8;
    public static final int EVENT_LOAD_SUCCESS = 9;
    public static final int EVENT_REQUEST_FINISH = 0;
    private static final android.os.Handler mHandler = null;


    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.pangle.ZeusPluginStateListener.mHandler = r0
            return
    }

    public ZeusPluginStateListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void postStateChange(@androidx.annotation.Nullable java.lang.String r3, int r4, java.lang.Object... r5) {
            android.os.Handler r0 = com.bytedance.pangle.ZeusPluginStateListener.mHandler
            com.bytedance.pangle.ZeusPluginStateListener$1 r1 = new com.bytedance.pangle.ZeusPluginStateListener$1
            r1.<init>(r3, r4, r5)
            r0.post(r1)
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            java.util.List r0 = r0.cw()
            if (r0 == 0) goto L38
            int r1 = r0.size()
            if (r1 <= 0) goto L38
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            com.bytedance.pangle.ZeusPluginStateListener r1 = (com.bytedance.pangle.ZeusPluginStateListener) r1
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L33
            java.lang.String r2 = "UNKNOWN"
            goto L34
        L33:
            r2 = r3
        L34:
            r1.onStateChangeOnCurThread(r2, r4, r5)
            goto L1e
        L38:
            return
    }

    @java.lang.Deprecated
    public void onPluginStateChange(java.lang.String r1, int r2, java.lang.Object... r3) {
            r0 = this;
            return
    }

    public void onStateChangeOnCurThread(java.lang.String r1, int r2, java.lang.Object... r3) {
            r0 = this;
            return
    }
}
