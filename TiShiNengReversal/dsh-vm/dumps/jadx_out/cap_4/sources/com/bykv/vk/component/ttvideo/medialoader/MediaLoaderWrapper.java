package com.bykv.vk.component.ttvideo.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MediaLoaderWrapper implements com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener {
    public static final int DATALOADER_KEY_NOTIFY_OWNVDPLOG = 1;
    public static final int DATALOADER_KEY_NOTIFY_SPEEDINFO = 2;
    public static final int DATALOADER_KEY_NOTIFY_TASKLOG = 0;
    static final java.lang.String HTTP_PROTO_PREFIX = "http://";
    static final java.lang.String MDL_PROTO_PREFIX = "mdl://";
    static final java.lang.String TAG = "MediaLoaderWrapper";
    private volatile boolean isProxyLibraryLoaded;
    public com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure mConfigure;
    private boolean mEnableLoadLibrary;
    private boolean mIsRunning;
    private com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener mListener;
    private com.bykv.vk.component.ttvideo.log.LiveLoggerService mLogService;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer mPlayer;
    private volatile com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy mProxy;

    /* renamed from: com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class Holder {
        private static com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper instance;

        static {
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = new com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper
                r1 = 0
                r0.<init>(r1)
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.Holder.instance = r0
                return
        }

        private Holder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper access$100() {
                com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.Holder.instance
                return r0
        }
    }

    private MediaLoaderWrapper() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isProxyLibraryLoaded = r0
            r1 = 0
            r2.mProxy = r1
            r2.mIsRunning = r0
            r2.mEnableLoadLibrary = r0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure.getDefaultonfigure()
            r2.mConfigure = r0
            return
    }

    public MediaLoaderWrapper(com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isProxyLibraryLoaded = r0
            r1 = 0
            r2.mProxy = r1
            r2.mIsRunning = r0
            r2.mEnableLoadLibrary = r0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure.getDefaultonfigure()
            r2.mConfigure = r0
            r2.mListener = r3
            return
    }

    /* synthetic */ MediaLoaderWrapper(com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper getDataLoader() {
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper r0 = com.bykv.vk.component.ttvideo.medialoader.MediaLoaderWrapper.Holder.access$100()
            return r0
    }

    private boolean initInternal() {
            r5 = this;
            boolean r0 = r5.mEnableLoadLibrary
            r1 = 1
            java.lang.String r2 = "MediaLoaderWrapper"
            r3 = 0
            if (r0 == 0) goto L2f
            boolean r0 = r5.loadLibrary()
            if (r0 != 0) goto L1a
            java.lang.String r0 = "library load fail"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r0)
            return r3
        L1a:
            com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy r0 = r5.mProxy
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.init(r0)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "library has not been loaded"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String.format(r0, r1)
            return r3
        L2f:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()     // Catch: java.lang.Exception -> L39
            r4 = 107(0x6b, float:1.5E-43)
            r0.setListener(r4, r5)     // Catch: java.lang.Exception -> L39
            return r1
        L39:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "create loader failed: exception is"
            r1.<init>(r4)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r2, r0)
            return r3
    }

    private boolean loadLibrary() {
            r2 = this;
            com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy r0 = r2.mProxy
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy r0 = r2.mProxy
            if (r0 == 0) goto L18
            boolean r0 = r2.isProxyLibraryLoaded
            if (r0 != 0) goto L18
            com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy r0 = r2.mProxy
            java.lang.String r1 = "avmdl"
            boolean r0 = r0.loadLibrary(r1)
            r2.isProxyLibraryLoaded = r0
        L18:
            boolean r0 = r2.isProxyLibraryLoaded
            return r0
    }

    private boolean supportProxy(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r0 = "http://127.0.0.1"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "http://localhost"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1d
            goto L51
        L1d:
            java.lang.String r0 = "file://"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L2e
            goto L51
        L2e:
            java.lang.String r0 = ".mpd"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = ".mpd?"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = ".m3u8?"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = ".m3u8"
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r3 = 1
            return r3
        L51:
            return r1
    }

    public void close() {
            r2 = this;
            boolean r0 = r2.mIsRunning
            if (r0 != 0) goto Lc
            java.lang.String r0 = "MediaLoaderWrapper"
            java.lang.String r1 = "MediaLoader not started, not need close"
            com.bykv.vk.component.ttvideo.log.MyLog.e(r0, r1)
            return
        Lc:
            r0 = 0
            r2.mListener = r0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            r0.close()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            r0.cancelAll()
            r0 = 0
            r2.mIsRunning = r0
            return
    }

    public void enableLoadLibrary() {
            r1 = this;
            r0 = 1
            r1.mEnableLoadLibrary = r0
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public java.lang.String getCheckSumInfo(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public long getInt64Value(int r3, long r4) {
            r2 = this;
            java.lang.String r0 = "getInt64Value:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "MediaLoaderWrapper"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            r0 = 8003(0x1f43, float:1.1215E-41)
            if (r3 == r0) goto L22
            r0 = 8004(0x1f44, float:1.1216E-41)
            if (r3 == r0) goto L18
            goto L2f
        L18:
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r3 = r2.mListener
            if (r3 == 0) goto L2f
            r0 = 0
            long r3 = r3.getInt64Value(r0, r4)
            return r3
        L22:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r2.mPlayer
            if (r3 == 0) goto L2f
            r4 = 73
            r0 = 0
            long r3 = r3.getLongOption(r4, r0)
            return r3
        L2f:
            return r4
    }

    public long getLongValueFromLoader(int r6) {
            r5 = this;
            java.lang.String r0 = "MediaLoaderWrapper"
            java.lang.String r1 = "get long value from loader"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            r1 = -1
            r3 = 7218(0x1c32, float:1.0115E-41)
            if (r6 == r3) goto L3c
            switch(r6) {
                case 8100: goto L32;
                case 8101: goto L28;
                case 8102: goto L15;
                default: goto L14;
            }
        L14:
            return r1
        L15:
            if (r0 != 0) goto L18
            goto L1e
        L18:
            r6 = 8102(0x1fa6, float:1.1353E-41)
            long r1 = r0.getLongValue(r6)
        L1e:
            r3 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L25
            return r3
        L25:
            r0 = 0
            return r0
        L28:
            if (r0 != 0) goto L2b
            return r1
        L2b:
            r6 = 8101(0x1fa5, float:1.1352E-41)
            long r0 = r0.getLongValue(r6)
            return r0
        L32:
            if (r0 != 0) goto L35
            return r1
        L35:
            r6 = 8100(0x1fa4, float:1.135E-41)
            long r0 = r0.getLongValue(r6)
            return r0
        L3c:
            if (r0 != 0) goto L3f
            return r1
        L3f:
            long r0 = r0.getLongValue(r3)
            return r0
    }

    public java.lang.String getProxyUrl(java.lang.String r4, java.lang.Boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.supportProxy(r4)
            if (r1 != 0) goto Lb
            return r4
        Lb:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            java.lang.String r1 = r1.getLocalAddr()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r4, r2)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "?rk=v02004b50000bh9ajqhdli3lfv2rgsgg&k=426161df8c5ce110209a6fc6641e049ddfrfgaf&u0="
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4a
            java.lang.String r5 = "mdl://"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r5.concat(r4)
            return r4
        L4a:
            java.lang.String r5 = "http://"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r5.concat(r4)
            return r4
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public java.lang.String getStringValue(int r1, long r2, java.lang.String r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String getStringValueFromLoader(int r4) {
            r3 = this;
            java.lang.String r0 = "MediaLoaderWrapper"
            java.lang.String r1 = "get string value from loader"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            r1 = 0
            r2 = 11
            if (r4 == r2) goto L11
            return r1
        L11:
            if (r0 != 0) goto L14
            return r1
        L14:
            java.lang.String r4 = r0.getStringValue(r2)
            return r4
    }

    public boolean isRunning() {
            r1 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public void onNotify(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r5) {
            r4 = this;
            if (r5 == 0) goto L7a
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r0 = r4.mListener
            if (r0 != 0) goto L7
            goto L7a
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "what:"
            r0.<init>(r1)
            int r1 = r5.what
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MediaLoaderWrapper"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r0)
            int r0 = r5.what
            r2 = 9
            if (r0 == r2) goto L51
            r2 = 12
            if (r0 == r2) goto L27
            goto L7a
        L27:
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r0 = r4.mListener
            if (r0 == 0) goto L33
            long r2 = r5.parameter
            int r3 = (int) r2
            java.lang.String r2 = r5.logInfo
            r0.onSwitchLoaderType(r3, r2)
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "switch reason:"
            r0.<init>(r2)
            long r2 = r5.parameter
            r0.append(r2)
            java.lang.String r2 = " switchInfo:"
            r0.append(r2)
            java.lang.String r5 = r5.logInfo
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
            return
        L51:
            com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r0 = r4.mListener
            if (r0 == 0) goto L5d
            long r2 = r5.parameter
            int r3 = (int) r2
            java.lang.String r2 = r5.logInfo
            r0.onDataLoaderError(r3, r2)
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "live loader errorCode:"
            r0.<init>(r2)
            long r2 = r5.parameter
            r0.append(r2)
            java.lang.String r2 = " errorInfo:"
            r0.append(r2)
            java.lang.String r5 = r5.logInfo
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r5)
        L7a:
            return
    }

    public void setInt64ValueByStrKey(int r4, java.lang.String r5, int r6) {
            r3 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 7213(0x1c2d, float:1.0108E-41)
            if (r4 == r1) goto L17
            r1 = 7215(0x1c2f, float:1.011E-41)
            if (r4 == r1) goto L17
            long r1 = java.lang.System.currentTimeMillis()
            r0.setInt64ValueByStrKey(r4, r5, r1)
            return
        L17:
            long r1 = (long) r6
            r0.setInt64ValueByStrKey(r4, r5, r1)
            return
    }

    public void setIntValue(int r3, int r4) {
            r2 = this;
            r0 = 51
            if (r3 != r0) goto L9
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.mConfigure
            r3.mRWTimeOut = r4
            return
        L9:
            r0 = 52
            if (r3 != r0) goto L12
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.mConfigure
            r3.mOpenTimeOut = r4
            return
        L12:
            r0 = 53
            if (r3 != r0) goto L1b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.mConfigure
            r3.mTryCount = r4
            return
        L1b:
            r0 = 49
            java.lang.String r1 = "MediaLoaderWrapper"
            if (r3 != r0) goto L33
            java.lang.String r3 = "allow p2p:"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r0)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r3)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.mConfigure
            r3.mLiveP2pAllow = r4
            return
        L33:
            r0 = 50
            if (r3 != r0) goto L48
            java.lang.String r3 = "loader type:"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.concat(r0)
            com.bykv.vk.component.ttvideo.log.MyLog.i(r1, r3)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.mConfigure
            r3.mLiveLoaderType = r4
        L48:
            return
    }

    public void setListener(com.bykv.vk.component.ttvideo.medialoader.MediaLoaderListener r3) {
            r2 = this;
            r2.mListener = r3
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r3 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()     // Catch: java.lang.Exception -> Lc
            r0 = 107(0x6b, float:1.5E-43)
            r3.setListener(r0, r2)     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "create loader failed: exception is"
            r0.<init>(r1)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "MediaLoaderWrapper"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r3)
            return
    }

    public void setLoadProxy(com.bykv.vk.component.ttvideo.medialoader.LibraryLoadProxy r1) {
            r0 = this;
            r0.mProxy = r1
            return
    }

    public void setLogService(com.bykv.vk.component.ttvideo.log.LiveLoggerService r1) {
            r0 = this;
            r0.mLogService = r1
            return
    }

    public void setLongValue(int r3, long r4) {
            r2 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            r1 = 59
            if (r3 == r1) goto Lc
        Lb:
            return
        Lc:
            r3 = 1100(0x44c, float:1.541E-42)
            r0.setLongValue(r3, r4)
            return
    }

    public void setMediaPlayer(com.bykv.vk.component.ttvideo.player.MediaPlayer r1) {
            r0 = this;
            r0.mPlayer = r1
            return
    }

    public void setStringValue(int r2, java.lang.String r3) {
            r1 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            if (r0 != 0) goto L7
            return
        L7:
            r0.setStringValue(r2, r3)
            return
    }

    public void start() throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.mIsRunning
            if (r0 == 0) goto L5
            goto L5f
        L5:
            boolean r0 = r3.initInternal()
            if (r0 == 0) goto L93
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = com.bykv.vk.component.ttvideo.AppInfo.mAppChannel     // Catch: org.json.JSONException -> L22
            if (r1 == 0) goto L5d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L22
            if (r1 != 0) goto L24
            java.lang.String r1 = "app_channel"
            java.lang.String r2 = com.bykv.vk.component.ttvideo.AppInfo.mAppChannel     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L59
        L24:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.AppInfo.mAppName     // Catch: org.json.JSONException -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L22
            if (r1 != 0) goto L33
            java.lang.String r1 = "app_name"
            java.lang.String r2 = com.bykv.vk.component.ttvideo.AppInfo.mAppName     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
        L33:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.AppInfo.mDeviceId     // Catch: org.json.JSONException -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L22
            if (r1 != 0) goto L42
            java.lang.String r1 = "device_id"
            java.lang.String r2 = com.bykv.vk.component.ttvideo.AppInfo.mDeviceId     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
        L42:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.AppInfo.mAppVersion     // Catch: org.json.JSONException -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L22
            if (r1 != 0) goto L51
            java.lang.String r1 = "app_version"
            java.lang.String r2 = com.bykv.vk.component.ttvideo.AppInfo.mAppVersion     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
        L51:
            java.lang.String r1 = "app_id"
            int r2 = com.bykv.vk.component.ttvideo.AppInfo.mAppID     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
            goto L5d
        L59:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
        L5d:
            if (r0 != 0) goto L60
        L5f:
            return
        L60:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r1 = r3.mConfigure
            java.lang.String r0 = r0.toString()
            r1.mAppInfo = r0
            int r0 = com.bykv.vk.component.ttvideo.AppInfo.mAppID
            r1 = -1
            if (r0 == r1) goto L7d
            java.lang.String r0 = "MediaLoaderWrapper"
            java.lang.String r1 = "set config"
            com.bykv.vk.component.ttvideo.log.MyLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r1 = r3.mConfigure
            r0.setConfigure(r1)
        L7d:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()
            int r0 = r0.start()
            if (r0 < 0) goto L8b
            r0 = 1
            r3.mIsRunning = r0
            return
        L8b:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "start mediaLoader fail"
            r0.<init>(r1)
            throw r0
        L93:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "init mediaLoader fail"
            r0.<init>(r1)
            throw r0
    }
}
