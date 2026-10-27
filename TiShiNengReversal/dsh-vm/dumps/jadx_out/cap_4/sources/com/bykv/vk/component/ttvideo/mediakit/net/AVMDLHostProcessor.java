package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLHostProcessor {
    private static final int BACKUP_DNS = 1;
    private static final int MAIN_DNS = 0;
    public static final int STATE_IS_IDLE = 0;
    public static final int STATE_IS_PARSE_END_ERROR = 2;
    public static final int STATE_IS_PARSE_END_SUC = 3;
    public static final int STATE_IS_WAIT_RESULT = 1;
    private static final java.lang.String TAG = "AVMDLHostProcessor";
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private int mEnableParallel;
    private android.os.Handler mHandler;
    public java.lang.String mHost;
    public java.util.HashMap<com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParserListener, java.lang.Integer> mListeners;
    private int mMainType;
    private com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] mParsers;
    private int[] mStates;

    public AVMDLHostProcessor(java.lang.String r1, android.os.Handler r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.mMainType = r3
            r0.mBackUpType = r4
            r0.mHandler = r2
            r0.mHost = r1
            r0.mBackUpDelayedTime = r5
            r0.mEnableParallel = r6
            r1 = 2
            int[] r2 = new int[r1]
            r0.mStates = r2
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r2 = new com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[r1]
            r0.mParsers = r2
            r2 = 0
            r3 = 0
        L1a:
            if (r3 >= r1) goto L24
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r4 = r0.mParsers
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + 1
            goto L1a
        L24:
            r3 = 0
        L25:
            if (r3 >= r1) goto L2e
            int[] r4 = r0.mStates
            r4[r3] = r2
            int r3 = r3 + 1
            goto L25
        L2e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mListeners = r1
            return
    }

    @android.annotation.SuppressLint({"CI_DefaultLocale"})
    private com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS createDNSParser(java.lang.String r4, int r5, int r6) {
            r3 = this;
            r6 = 0
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSManager.getInstance()     // Catch: java.lang.Exception -> La
            com.bykv.vk.component.ttvideo.mediakit.net.CreateConstructor r0 = r0.getCreateConstructor(r5)     // Catch: java.lang.Exception -> La
            goto Lf
        La:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = r6
        Lf:
            if (r0 == 0) goto L18
            android.os.Handler r1 = r3.mHandler
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS r4 = r0.createDns(r4, r6, r5, r1)
            return r4
        L18:
            r6 = 4
            r0 = 1
            r1 = 0
            r2 = 2
            if (r5 != r6) goto L39
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLCustomHTTPDNSParser r6 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mCustomHttpDNSParser
            if (r6 == 0) goto L39
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            r6[r0] = r5
            java.lang.String r5 = "create custom httpdns parser for host:%s type:%d"
            java.lang.String.format(r5, r6)
            com.bykv.vk.component.ttvideo.mediakit.net.CustomHTTPDNS r5 = new com.bykv.vk.component.ttvideo.mediakit.net.CustomHTTPDNS
            android.os.Handler r6 = r3.mHandler
            r5.<init>(r4, r6)
            return r5
        L39:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            r6[r0] = r5
            java.lang.String r5 = "create local dns parser for host:%s type:%d"
            java.lang.String.format(r5, r6)
            com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS r5 = new com.bykv.vk.component.ttvideo.mediakit.net.LocalDNS
            android.os.Handler r6 = r3.mHandler
            r5.<init>(r4, r6)
            return r5
    }

    private void doParseInternal(int r7, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r8) {
            r6 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r8
            java.lang.String r4 = "----do parse internal what:%d info:%s"
            java.lang.String.format(r4, r2)
            if (r8 != 0) goto L15
            return
        L15:
            r2 = 5
            r4 = 6
            if (r7 != r2) goto L7c
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r2 = r6.mParsers
            r2 = r2[r3]
            if (r2 != 0) goto L7c
            int r7 = r6.mMainType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r2 = r8.mHost
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r3] = r7
            r5[r0] = r2
            java.lang.String r7 = "create main dns type:%d host:%s"
            java.lang.String.format(r7, r5)
            int[] r7 = r6.mStates
            r7[r3] = r0
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r6.mParsers
            java.lang.String r2 = r8.mHost
            int r5 = r6.mMainType
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS r2 = r6.createDNSParser(r2, r5, r3)
            r7[r3] = r2
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r6.mParsers
            r7 = r7[r3]
            r7.start()
            android.os.Message r7 = new android.os.Message
            r7.<init>()
            r7.what = r4
            r7.obj = r8
            int r8 = r6.mBackUpDelayedTime
            if (r8 > 0) goto L5a
            int r8 = r6.mEnableParallel
            if (r8 <= 0) goto Lae
        L5a:
            int r8 = r6.mMainType
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r2 = r6.mEnableParallel
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r0] = r2
            java.lang.String r8 = "BackUpDelayedTime:%d enableparallel:%d send backup delay first"
            java.lang.String.format(r8, r1)
            android.os.Handler r8 = r6.mHandler
            int r0 = r6.mBackUpDelayedTime
            int r0 = r0 * 1000
            long r0 = (long) r0
            r8.sendMessageDelayed(r7, r0)
            goto Lae
        L7c:
            if (r7 != r4) goto Lae
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r6.mParsers
            r7 = r7[r0]
            if (r7 != 0) goto Lae
            int r7 = r6.mBackUpType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r2 = r8.mHost
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r0] = r2
            java.lang.String r7 = "create backup dns type:%d host:%s"
            java.lang.String.format(r7, r1)
            int[] r7 = r6.mStates
            r7[r0] = r0
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r6.mParsers
            java.lang.String r8 = r8.mHost
            int r1 = r6.mBackUpType
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS r8 = r6.createDNSParser(r8, r1, r0)
            r7[r0] = r8
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r6.mParsers
            r7 = r7[r0]
            r7.start()
        Lae:
            java.lang.String r7 = "****do parse internal end"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String.format(r7, r8)
            return
    }

    public boolean isEnd() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 2
            if (r1 >= r2) goto L18
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r3 = r5.mParsers
            r3 = r3[r1]
            if (r3 == 0) goto L15
            int[] r3 = r5.mStates
            r3 = r3[r1]
            r4 = 3
            if (r3 == r4) goto L15
            if (r3 == r2) goto L15
            return r0
        L15:
            int r1 = r1 + 1
            goto L2
        L18:
            r0 = 1
            return r0
    }

    public boolean isValidSourceId(java.lang.String r6) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r6
            java.lang.String r6 = "id: %s is empty"
            java.lang.String.format(r6, r0)
            return r2
        L12:
            r0 = 0
        L13:
            r3 = 2
            if (r0 >= r3) goto L37
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r4 = r5.mParsers
            r4 = r4[r0]
            if (r4 == 0) goto L34
            java.lang.String r4 = r4.mId
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r0
            java.lang.String r6 = "id: %s is valid index: %d"
            java.lang.String.format(r6, r3)
            return r1
        L34:
            int r0 = r0 + 1
            goto L13
        L37:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r6
            java.lang.String r6 = "id: %s is valid"
            java.lang.String.format(r6, r0)
            return r2
    }

    public void processMsg(int r7, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r8) {
            r6 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = r8.mHost
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r1 = 2
            r3[r1] = r8
            java.lang.String r5 = "----processor pro msg what:%d host:%s info:%s"
            java.lang.String.format(r5, r3)
            r3 = 5
            if (r7 == r3) goto L3b
            r3 = 6
            if (r7 == r3) goto L1e
            goto L4b
        L1e:
            int[] r3 = r6.mStates
            r5 = r3[r4]
            if (r5 == r0) goto L2c
            if (r5 == r1) goto L2c
            if (r5 == r2) goto L2c
            int r5 = r6.mEnableParallel
            if (r5 <= 0) goto L4b
        L2c:
            r3 = r3[r0]
            if (r3 != 0) goto L4b
            java.lang.String r3 = "main dns is not end or enable parrallel and backup dns is idle call backup dns"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String.format(r3, r5)
            r6.doParseInternal(r7, r8)
            goto L4b
        L3b:
            int[] r3 = r6.mStates
            r3 = r3[r4]
            if (r3 != 0) goto L4b
            java.lang.String r3 = "main dns is idle call main dns"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String.format(r3, r5)
            r6.doParseInternal(r7, r8)
        L4b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = r8.mHost
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r7
            r2[r0] = r3
            r2[r1] = r8
            java.lang.String r7 = "****end processor pro msg what:%d host:%s info:%s"
            java.lang.String.format(r7, r2)
            return
    }

    public void processResult(int r14, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r15) {
            r13 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = r15.mId
            java.lang.String r2 = r15.mHost
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r1 = 2
            r4[r1] = r2
            java.lang.String r2 = "----process result what:%d id:%s host:%s"
            java.lang.String.format(r2, r4)
            r2 = 0
            if (r14 == r1) goto L20
            if (r14 == r3) goto L20
            r4 = r2
            goto L22
        L20:
            java.lang.String r4 = r15.mId
        L22:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L30
            java.lang.String r14 = "****process result err id is empty"
            java.lang.Object[] r15 = new java.lang.Object[r5]
            java.lang.String.format(r14, r15)
            return
        L30:
            r6 = 0
        L31:
            if (r6 >= r1) goto L6a
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r7 = r13.mParsers
            r7 = r7[r6]
            if (r7 == 0) goto L67
            java.lang.String r7 = r7.mId
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L67
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r4 = r13.mParsers
            r4 = r4[r6]
            r4.close()
            com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS[] r4 = r13.mParsers
            r4[r6] = r2
            if (r14 != r3) goto L53
            int[] r2 = r13.mStates
            r2[r6] = r3
            goto L59
        L53:
            if (r14 != r1) goto L59
            int[] r2 = r13.mStates
            r2[r6] = r1
        L59:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r5] = r2
            java.lang.String r2 = "****process result parser index:%d is end, be close"
            java.lang.String.format(r2, r4)
            goto L6a
        L67:
            int r6 = r6 + 1
            goto L31
        L6a:
            if (r6 != 0) goto L86
            if (r14 != r1) goto L86
            java.lang.String r2 = "mian dns parse error, try back up dns"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String.format(r2, r4)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r6 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r7 = r13.mBackUpType
            java.lang.String r8 = r15.mHost
            r10 = 0
            r12 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r12)
            r2 = 6
            r13.processMsg(r2, r6)
        L86:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r2 = r15.mId
            java.lang.String r15 = r15.mHost
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r14
            r3[r0] = r2
            r3[r1] = r15
            java.lang.String r14 = "****end process result what:%d id:%s host:%s"
            java.lang.String.format(r14, r3)
            return
    }
}
