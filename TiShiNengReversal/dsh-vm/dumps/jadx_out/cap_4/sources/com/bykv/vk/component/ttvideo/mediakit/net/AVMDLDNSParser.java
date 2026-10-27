package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLDNSParser {
    public static final int AVMDL_DNS_BACKUP_TYPE = 1;
    public static final int AVMDL_DNS_DEFAULT_EXPIRED_TIME = 2;
    public static final int AVMDL_DNS_ENABLE_BACKUP_IP = 5;
    public static final int AVMDL_DNS_ENABLE_DNS_LOG = 7;
    public static final int AVMDL_DNS_ENABLE_PARALLEL = 4;
    public static final int AVMDL_DNS_ENABLE_REFRESH = 6;
    public static final int AVMDL_DNS_FORCE_EXPIRED_TIME = 10;
    public static final int AVMDL_DNS_GOOGLE_PARSE_HOST = 9;
    public static final int AVMDL_DNS_MAIN_DELAYED_USE_BACKUP_TIME = 3;
    public static final int AVMDL_DNS_MAIN_TYPE = 0;
    public static final int AVMDL_DNS_OWN_PARSE_HOST = 8;
    public static final int DNS_TYPE_BACKUP_IP = 11;
    public static final int DNS_TYPE_HTTP_ALI = 1;
    public static final int DNS_TYPE_HTTP_CUSTOM = 4;
    public static final int DNS_TYPE_HTTP_GOOGLE = 3;
    public static final int DNS_TYPE_HTTP_OWN = 2;
    public static final int DNS_TYPE_HTTP_SERVER = 10;
    public static final int DNS_TYPE_LOCAL = 0;
    public static final int PARSER_IS_BACKUP = 1;
    public static final int PARSER_IS_MAIN = 0;
    private static final java.lang.String TAG = "AVMDLDNSParser";
    public static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLCustomHTTPDNSParser mCustomHttpDNSParser = null;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalEnableBackUpIp = 0;
    public static int mGlobalEnableDNSLog = 0;
    public static int mGlobalEnableParallel = 0;
    public static int mGlobalEnableRefresh = 0;
    public static int mGlobalForceExpiredTime = 0;
    public static java.lang.String mGlobalGoogleDNSParseHost = "";
    public static int mGlobalMainType = 0;
    public static java.lang.String mGlobalOwnDNSParseHost = "";
    private static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser mInstance;
    public static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClientMaker mNetClientMaker;
    private android.os.Handler mHandler;
    private java.util.concurrent.locks.Lock mLock;
    private java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> mProcessors;
    private int mRefCount;
    private int mState;
    private android.os.HandlerThread mThread;
    private int mTimeOut;
    private int mType;


    static {
            return
    }

    public AVMDLDNSParser() {
            r2 = this;
            r2.<init>()
            r0 = 5
            r2.mTimeOut = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.mLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mProcessors = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "AVMDLDNSParser"
            r0.<init>(r1)
            r2.mThread = r0
            r0.start()
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser$1 r0 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser$1
            android.os.HandlerThread r1 = r2.mThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0, int r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2) {
            r0.proccessFailMsg(r1, r2)
            return
    }

    static /* synthetic */ void access$100(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0, int r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2) {
            r0.proccessSucMsg(r1, r2)
            return
    }

    static /* synthetic */ void access$200(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0, int r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2) {
            r0.proccessPreParseMsg(r1, r2)
            return
    }

    static /* synthetic */ void access$300(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0, int r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2) {
            r0.processParseMsg(r1, r2)
            return
    }

    static /* synthetic */ void access$400(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0, int r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2) {
            r0.processBatchParseMsg(r1, r2)
            return
    }

    private void addListenerInternal(java.lang.String r14, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r15) {
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r15
            r2 = 1
            r0[r2] = r14
            java.lang.String r3 = "---add listener:%s for host:%s"
            java.lang.String.format(r3, r0)
            java.util.concurrent.locks.Lock r0 = r13.mLock
            r0.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r0 = r13.mProcessors     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L49
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r0 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r0     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "get processor:%s"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L49
            r4[r1] = r0     // Catch: java.lang.Throwable -> L49
            java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L4c
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r5 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor     // Catch: java.lang.Throwable -> L49
            android.os.Handler r7 = r13.mHandler     // Catch: java.lang.Throwable -> L49
            int r8 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType     // Catch: java.lang.Throwable -> L49
            int r9 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType     // Catch: java.lang.Throwable -> L49
            int r10 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackUpDelayedTime     // Catch: java.lang.Throwable -> L49
            int r11 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableParallel     // Catch: java.lang.Throwable -> L49
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L49
            java.lang.String r14 = "create processor:%s"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L49
            r0[r1] = r5     // Catch: java.lang.Throwable -> L49
            java.lang.String.format(r14, r0)     // Catch: java.lang.Throwable -> L49
            r0 = r5
            r14 = 1
            goto L4e
        L49:
            r0 = move-exception
            r14 = r0
            goto L93
        L4c:
            r6 = r14
            r14 = 0
        L4e:
            if (r15 == 0) goto L68
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r3 = r0.mListeners     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.containsKey(r15)     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L68
            java.lang.String r3 = "add listener"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L49
            java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r3 = r0.mListeners     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            r3.put(r15, r2)     // Catch: java.lang.Throwable -> L49
        L68:
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r15 = r13.mProcessors     // Catch: java.lang.Throwable -> L49
            r15.put(r6, r0)     // Catch: java.lang.Throwable -> L49
            if (r14 == 0) goto L86
            java.lang.String r14 = "new processor implement parse"
            java.lang.Object[] r15 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L49
            java.lang.String.format(r14, r15)     // Catch: java.lang.Throwable -> L49
            r8 = r6
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r6 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo     // Catch: java.lang.Throwable -> L49
            int r7 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType     // Catch: java.lang.Throwable -> L49
            r10 = 0
            r12 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L49
            r14 = 5
            r0.processMsg(r14, r6)     // Catch: java.lang.Throwable -> L49
        L86:
            java.util.concurrent.locks.Lock r14 = r13.mLock
            r14.unlock()
            java.lang.String r14 = "****end add listener"
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String.format(r14, r15)
            return
        L93:
            java.util.concurrent.locks.Lock r15 = r13.mLock
            r15.unlock()
            throw r14
    }

    public static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser getInstance() {
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mInstance = r1     // Catch: java.lang.Throwable -> L13
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
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mInstance
            return r0
    }

    public static int getIntValue(int r6) {
            java.lang.String r0 = "----get value for key:%d"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String.format(r0, r3)
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            r1 = 10
            if (r6 == r1) goto L36
            switch(r6) {
                case 0: goto L33;
                case 1: goto L30;
                case 2: goto L2d;
                case 3: goto L2a;
                case 4: goto L27;
                case 5: goto L24;
                case 6: goto L21;
                case 7: goto L1c;
                default: goto L19;
            }
        L19:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L38
        L1c:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableDNSLog     // Catch: java.lang.Throwable -> L1f
            goto L38
        L1f:
            r6 = move-exception
            goto L4e
        L21:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableRefresh     // Catch: java.lang.Throwable -> L1f
            goto L38
        L24:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableBackUpIp     // Catch: java.lang.Throwable -> L1f
            goto L38
        L27:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableParallel     // Catch: java.lang.Throwable -> L1f
            goto L38
        L2a:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackUpDelayedTime     // Catch: java.lang.Throwable -> L1f
            goto L38
        L2d:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalDefaultExpiredTime     // Catch: java.lang.Throwable -> L1f
            goto L38
        L30:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType     // Catch: java.lang.Throwable -> L1f
            goto L38
        L33:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType     // Catch: java.lang.Throwable -> L1f
            goto L38
        L36:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime     // Catch: java.lang.Throwable -> L1f
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "****get value:%d for key:%d"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            r5[r2] = r6
            java.lang.String.format(r0, r5)
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r6
    }

    public static com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient getNetClient() {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClientMaker r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mNetClientMaker     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r1 = r1.getNetClient()     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r1 = move-exception
            goto L19
        Le:
            r1 = 0
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L18
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork r0 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork
            r0.<init>()
            return r0
        L18:
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private void proccessFailMsg(int r13, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r14) {
            r12 = this;
            r0 = 0
            if (r14 == 0) goto Lab
            java.lang.String r1 = r14.mHost
            if (r1 != 0) goto L9
            goto Lab
        L9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.String r2 = r14.mHost
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r1 = 1
            r4[r1] = r2
            java.lang.String r2 = "----proc fail msg what:%d host:%s"
            java.lang.String.format(r2, r4)
            java.util.concurrent.locks.Lock r2 = r12.mLock
            r2.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r2 = r12.mProcessors     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r14.mHost     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L81
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r2 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r2     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "get processor:%s host:%s"
            java.lang.String r5 = r14.mHost     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L81
            r3[r0] = r2     // Catch: java.lang.Throwable -> L81
            r3[r1] = r5     // Catch: java.lang.Throwable -> L81
            java.lang.String.format(r4, r3)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L98
            java.lang.String r3 = r14.mId     // Catch: java.lang.Throwable -> L81
            boolean r3 = r2.isValidSourceId(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L98
            r2.processResult(r13, r14)     // Catch: java.lang.Throwable -> L81
            boolean r13 = r2.isEnd()     // Catch: java.lang.Throwable -> L81
            if (r13 == 0) goto L91
            java.lang.String r13 = "processor end, notify result"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L81
            java.lang.String.format(r13, r3)     // Catch: java.lang.Throwable -> L81
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r13 = r2.mListeners     // Catch: java.lang.Throwable -> L81
            java.util.Set r13 = r13.keySet()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L81
        L5c:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L84
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> L81
            r4 = r3
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r4 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener) r4     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L5c
            java.lang.String r3 = "listener:%s oncompletion fail"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L81
            r5[r0] = r4     // Catch: java.lang.Throwable -> L81
            java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r14.mHost     // Catch: java.lang.Throwable -> L81
            int r11 = r14.mType     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r4.onCompletion(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L81
            goto L5c
        L81:
            r0 = move-exception
            r13 = r0
            goto La5
        L84:
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r13 = r2.mListeners     // Catch: java.lang.Throwable -> L81
            r13.clear()     // Catch: java.lang.Throwable -> L81
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r13 = r12.mProcessors     // Catch: java.lang.Throwable -> L81
            java.lang.String r14 = r14.mHost     // Catch: java.lang.Throwable -> L81
            r13.remove(r14)     // Catch: java.lang.Throwable -> L81
            goto L98
        L91:
            java.lang.String r13 = "processor is not end"
            java.lang.Object[] r14 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L81
            java.lang.String.format(r13, r14)     // Catch: java.lang.Throwable -> L81
        L98:
            java.util.concurrent.locks.Lock r13 = r12.mLock
            r13.unlock()
            java.lang.String r13 = "****end proc fail msg what"
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String.format(r13, r14)
            return
        La5:
            java.util.concurrent.locks.Lock r14 = r12.mLock
            r14.unlock()
            throw r13
        Lab:
            java.lang.String r13 = "proc fail msg  fail, info or host is null"
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String.format(r13, r14)
            return
    }

    private void proccessPreParseMsg(int r8, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r9) {
            r7 = this;
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableRefresh
            if (r0 > 0) goto L5
            goto L4d
        L5:
            r0 = 0
            if (r9 == 0) goto L55
            java.lang.String r1 = r9.mHost
            if (r1 != 0) goto Ld
            goto L55
        Ld:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r1 = r9.mHost
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r8
            r8 = 1
            r3[r8] = r1
            java.lang.String r1 = "----proc pre parse msg what:%d host:%s"
            java.lang.String.format(r1, r3)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r1 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            java.lang.String r3 = r9.mHost
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = r1.get(r3)
            long r3 = java.lang.System.currentTimeMillis()
            if (r1 != 0) goto L33
            r5 = -1
            goto L35
        L33:
            long r5 = r1.mExpiredTime
        L35:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r2[r8] = r5
            java.lang.String r8 = "cache:%s expiredT:%d"
            java.lang.String.format(r8, r2)
            if (r1 == 0) goto L4e
            long r0 = r1.mExpiredTime
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L4d
            goto L4e
        L4d:
            return
        L4e:
            java.lang.String r8 = r9.mHost
            r9 = 0
            r7.addListenerInternal(r8, r9)
            return
        L55:
            java.lang.String r8 = "proc pre msg  fail, info or host is null"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String.format(r8, r9)
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private void proccessSucMsg(int r13, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r14) {
            r12 = this;
            r0 = 0
            if (r14 == 0) goto La4
            java.lang.String r1 = r14.mHost
            if (r1 != 0) goto L9
            goto La4
        L9:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r1 = r14.mHost
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r13
            r13 = 1
            r3[r13] = r1
            java.lang.String r1 = "----proc suc msg what:%d host:%s"
            java.lang.String.format(r1, r3)
            java.util.concurrent.locks.Lock r1 = r12.mLock
            r1.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r1 = r12.mProcessors     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = r14.mHost     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L6c
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r1 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r1     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = "get processor:%s host:%s"
            java.lang.String r4 = r14.mHost     // Catch: java.lang.Throwable -> L6c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6c
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6c
            r2[r13] = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.String.format(r3, r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L82
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r2 = r1.mListeners     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L82
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6c
        L46:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6c
            r4 = r3
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r4 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener) r4     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L46
            java.lang.String r3 = "listener:%s oncompletion suc"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L6c
            r5[r0] = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.String.format(r3, r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r14.mHost     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r14.mIpList     // Catch: java.lang.Throwable -> L6c
            long r8 = r14.mExpiredTime     // Catch: java.lang.Throwable -> L6c
            int r11 = r14.mType     // Catch: java.lang.Throwable -> L6c
            r5 = 0
            r10 = 0
            r4.onCompletion(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L6c
            goto L46
        L6c:
            r0 = move-exception
            r13 = r0
            goto L9e
        L6f:
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r13 = r1.mListeners     // Catch: java.lang.Throwable -> L6c
            r13.clear()     // Catch: java.lang.Throwable -> L6c
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r13 = r12.mProcessors     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r14.mHost     // Catch: java.lang.Throwable -> L6c
            r13.remove(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r13 = "remove all listeners and remove host"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6c
            java.lang.String.format(r13, r1)     // Catch: java.lang.Throwable -> L6c
        L82:
            java.lang.String r13 = r14.mHost     // Catch: java.lang.Throwable -> L6c
            long r1 = r14.mExpiredTime     // Catch: java.lang.Throwable -> L6c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            long r1 = r1 - r3
            r12.sendPreParseMsg(r13, r1)     // Catch: java.lang.Throwable -> L6c
            r12.reportLog(r14)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.locks.Lock r13 = r12.mLock
            r13.unlock()
            java.lang.String r13 = "****end proc suc msg"
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String.format(r13, r14)
            return
        L9e:
            java.util.concurrent.locks.Lock r14 = r12.mLock
            r14.unlock()
            throw r13
        La4:
            java.lang.String r13 = "proc suc msg  fail, info or host is null"
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String.format(r13, r14)
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private void processBatchParseMsg(int r5, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r6) {
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L56
            java.lang.String[] r1 = r6.mHosts
            if (r1 == 0) goto L56
            int r1 = r1.length
            if (r1 != 0) goto Lb
            goto L56
        Lb:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "----proc batch parse msg what:%d"
            java.lang.String.format(r5, r1)
            int r5 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableParallel
            r1 = 2
            if (r5 > 0) goto L37
            int r5 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            if (r5 != r1) goto L23
            goto L37
        L23:
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts r5 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNSHosts
            java.lang.String[] r6 = r6.mHosts
            android.os.Handler r1 = r4.mHandler
            r5.<init>(r6, r1)
            r5.start()
            java.lang.String r5 = "****end proc batch parser msg"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String.format(r5, r6)
            return
        L37:
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts r5 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts     // Catch: java.lang.Exception -> L45
            java.lang.String[] r6 = r6.mHosts     // Catch: java.lang.Exception -> L45
            android.os.Handler r2 = r4.mHandler     // Catch: java.lang.Exception -> L45
            r3 = 0
            r5.<init>(r6, r3, r1, r2)     // Catch: java.lang.Exception -> L45
            r5.start()     // Catch: java.lang.Exception -> L45
            return
        L45:
            r5 = move-exception
            java.lang.String r6 = "parse end create httpdnshosts fail"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r6.concat(r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String.format(r5, r6)
            return
        L56:
            java.lang.String r5 = "proc parser msg  fail, info or host is null"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String.format(r5, r6)
            return
    }

    public static void processHijack() {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.String r1 = "----process hijack old dnsmain:%d back:%d"
            java.lang.String.format(r1, r3)
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            if (r1 != 0) goto L24
            int r3 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType = r3
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType = r1
        L24:
            int r1 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            r2[r0] = r3
            java.lang.String r0 = "****process hijack new dnsmain:%d back:%d"
            java.lang.String.format(r0, r2)
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private void processParseMsg(int r7, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L5d
            java.lang.String r1 = r8.mHost
            if (r1 != 0) goto L8
            goto L5d
        L8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r2 = r8.mHost
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r1 = 1
            r4[r1] = r2
            java.lang.String r2 = "----proc parser msg what:%d host:%s"
            java.lang.String.format(r2, r4)
            java.util.concurrent.locks.Lock r2 = r6.mLock
            r2.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r2 = r6.mProcessors     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r8.mHost     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L3d
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r2 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3f
            java.lang.String r4 = "----get processor:%s host:%s"
            java.lang.String r5 = r8.mHost     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3d
            r3[r0] = r2     // Catch: java.lang.Throwable -> L3d
            r3[r1] = r5     // Catch: java.lang.Throwable -> L3d
            java.lang.String.format(r4, r3)     // Catch: java.lang.Throwable -> L3d
            r2.processMsg(r7, r8)     // Catch: java.lang.Throwable -> L3d
            goto L4a
        L3d:
            r7 = move-exception
            goto L57
        L3f:
            java.lang.String r7 = "****get processor null for host:%s"
            java.lang.String r8 = r8.mHost     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3d
            r1[r0] = r8     // Catch: java.lang.Throwable -> L3d
            java.lang.String.format(r7, r1)     // Catch: java.lang.Throwable -> L3d
        L4a:
            java.util.concurrent.locks.Lock r7 = r6.mLock
            r7.unlock()
            java.lang.String r7 = "****end proc parser msg"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String.format(r7, r8)
            return
        L57:
            java.util.concurrent.locks.Lock r8 = r6.mLock
            r8.unlock()
            throw r7
        L5d:
            java.lang.String r7 = "proc parser msg  fail, info or host is null"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String.format(r7, r8)
            return
    }

    private void removeListenerInternal(java.lang.String r5, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L62
            if (r6 != 0) goto L9
            goto L62
        L9:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r6
            r2 = 1
            r0[r2] = r5
            java.lang.String r3 = "---remove listener:%s for host:%s"
            java.lang.String.format(r3, r0)
            java.util.concurrent.locks.Lock r0 = r4.mLock
            r0.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r0 = r4.mProcessors     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L3c
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r5 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r5     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "get processor:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            r2[r1] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L3e
            java.lang.String r0 = "remove listener"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.String.format(r0, r2)     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r0 = r5.mListeners     // Catch: java.lang.Throwable -> L3c
            r0.remove(r6)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r5 = move-exception
            goto L5c
        L3e:
            if (r5 == 0) goto L4f
            java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> r5 = r5.mListeners     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L4f
            java.lang.String r5 = "listeners empty for processors"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L3c
        L4f:
            java.util.concurrent.locks.Lock r5 = r4.mLock
            r5.unlock()
            java.lang.String r5 = "****end remove listener"
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String.format(r5, r6)
            return
        L5c:
            java.util.concurrent.locks.Lock r6 = r4.mLock
            r6.unlock()
            throw r5
        L62:
            return
    }

    private void reportLog(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r4) {
            r3 = this;
            if (r4 == 0) goto L37
            java.lang.String r0 = r4.mIpList
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            goto L37
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableDNSLog
            if (r0 <= 0) goto L37
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "log_type"
            java.lang.String r2 = "mdl_dns_log"
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "dns_type"
            int r2 = r4.mType     // Catch: java.lang.Exception -> L37
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "ip_list"
            java.lang.String r4 = r4.mIpList     // Catch: java.lang.Exception -> L37
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L37
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r4 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L37
            r1 = 15
            r2 = 0
            r4.onLogInfo(r1, r2, r0)     // Catch: java.lang.Exception -> L37
        L37:
            return
    }

    private void sendBatchParseMsg(java.lang.String[] r9) {
            r8 = this;
            if (r9 == 0) goto L29
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L29
        L6:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            r5 = 0
            r7 = 0
            r4 = 0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            android.os.Message r9 = new android.os.Message
            r9.<init>()
            r0 = 7
            r9.what = r0
            r9.obj = r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "send msg for batch parse"
            java.lang.String.format(r1, r0)
            android.os.Handler r0 = r8.mHandler
            r0.sendMessage(r9)
        L29:
            return
    }

    private void sendPreParseMsg(java.lang.String r9, long r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L43
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            goto L43
        Ld:
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableRefresh
            if (r0 <= 0) goto L43
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType
            r5 = 0
            r7 = 0
            r4 = 0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            android.os.Message r9 = new android.os.Message
            r9.<init>()
            r0 = 4
            r9.what = r0
            r9.obj = r1
            java.lang.String r0 = r1.mHost
            r1 = 3000(0xbb8, double:1.482E-320)
            long r10 = r10 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "send preparse for host:%s delayTime:%d"
            java.lang.String.format(r0, r2)
            android.os.Handler r0 = r8.mHandler
            r0.sendMessageDelayed(r9, r10)
        L43:
            return
    }

    public static void setClientMaker(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClientMaker r1) {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            if (r1 == 0) goto La
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mNetClientMaker = r1     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r1 = move-exception
            goto Lc
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public static void setCustomHttpDNSParser(com.bykv.vk.component.ttvideo.mediakit.net.AVMDLCustomHTTPDNSParser r5) {
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            java.lang.String r1 = "set custom http dns parser:%d"
            r2 = 1
            r3 = 0
            if (r5 != 0) goto Lb
            r4 = 0
            goto Lc
        Lb:
            r4 = 1
        Lc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            r2[r3] = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1e
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mCustomHttpDNSParser = r5     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    public static void setIntValue(int r5, int r6) {
            java.lang.String r0 = "****set value:%d for key:%d"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String.format(r0, r3)
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            r1 = 10
            if (r5 == r1) goto L3b
            switch(r5) {
                case 0: goto L38;
                case 1: goto L35;
                case 2: goto L32;
                case 3: goto L2f;
                case 4: goto L2c;
                case 5: goto L29;
                case 6: goto L26;
                case 7: goto L21;
                default: goto L20;
            }
        L20:
            goto L3d
        L21:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableDNSLog = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L24:
            r5 = move-exception
            goto L3f
        L26:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableRefresh = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L29:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableBackUpIp = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L2c:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalEnableParallel = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L2f:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackUpDelayedTime = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L32:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalDefaultExpiredTime = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L35:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalBackType = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L38:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalMainType = r6     // Catch: java.lang.Throwable -> L24
            goto L3d
        L3b:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime = r6     // Catch: java.lang.Throwable -> L24
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r5
    }

    public static void setStringValue(int r4, java.lang.String r5) {
            java.lang.String r0 = "****set value:%s for key:%d"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r1
            java.lang.String.format(r0, r2)
            java.lang.Class<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser> r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.class
            monitor-enter(r0)
            r1 = 8
            if (r4 == r1) goto L29
            r1 = 9
            if (r4 == r1) goto L1e
            goto L31
        L1e:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L31
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalGoogleDNSParseHost = r5     // Catch: java.lang.Throwable -> L27
            goto L31
        L27:
            r4 = move-exception
            goto L33
        L29:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L31
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalOwnDNSParseHost = r5     // Catch: java.lang.Throwable -> L27
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r4
    }

    public static void updateDNSInfo(java.lang.String r9, java.lang.String r10, long r11) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L26
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalDefaultExpiredTime
            long r0 = (long) r0
            long r11 = r11 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r11 * r0
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            r3 = 10
            r8 = 0
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r8)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r9 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            r9.put(r4, r2)
        L26:
            return
    }

    public void addHost(java.lang.String r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r2) {
            r0 = this;
            r0.addListenerInternal(r1, r2)
            return
    }

    public void doParseHosts(java.lang.String[] r8) {
            r7 = this;
            if (r8 == 0) goto L6a
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L6a
        L6:
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L9:
            int r3 = r8.length
            if (r2 >= r3) goto L64
            r3 = r8[r2]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L61
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r3 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            r4 = r8[r2]
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r3 = r3.get(r4)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            r3 = r8[r2]
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "for host:%s has dns info not need do batch parse"
            java.lang.String.format(r3, r4)
            r8[r2] = r5
            int r0 = r0 + (-1)
            goto L61
        L32:
            java.util.concurrent.locks.Lock r3 = r7.mLock
            r3.lock()
            java.util.Map<java.lang.String, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor> r3 = r7.mProcessors     // Catch: java.lang.Throwable -> L53
            r6 = r8[r2]     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L53
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor r3 = (com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHostProcessor) r3     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            java.lang.String r3 = "for host:%s has processor not need do batch parse"
            r6 = r8[r2]     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L53
            r4[r1] = r6     // Catch: java.lang.Throwable -> L53
            java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L53
            r8[r2] = r5     // Catch: java.lang.Throwable -> L53
            int r0 = r0 + (-1)
            goto L55
        L53:
            r8 = move-exception
            goto L5b
        L55:
            java.util.concurrent.locks.Lock r3 = r7.mLock
            r3.unlock()
            goto L61
        L5b:
            java.util.concurrent.locks.Lock r0 = r7.mLock
            r0.unlock()
            throw r8
        L61:
            int r2 = r2 + 1
            goto L9
        L64:
            if (r0 != 0) goto L67
            goto L6a
        L67:
            r7.sendBatchParseMsg(r8)
        L6a:
            return
    }

    public void postParseHostMsg(java.lang.String r8, int r9) {
            r7 = this;
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r0 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            r4 = 0
            r6 = 0
            r3 = 0
            r2 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            android.os.Message r8 = new android.os.Message
            r8.<init>()
            r9 = 5
            r8.what = r9
            r8.obj = r0
            android.os.Handler r9 = r7.mHandler
            r9.sendMessage(r8)
            return
    }

    public void release() {
            r0 = this;
            return
    }

    public void removeHost(java.lang.String r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener r2) {
            r0 = this;
            r0.removeListenerInternal(r1, r2)
            return
    }

    public void setBackUpIP(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L20
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Ld
            goto L20
        Ld:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            r5 = 0
            r7 = 0
            r2 = 11
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r9 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            r9.putBackUpIp(r3, r1)
        L20:
            return
    }
}
