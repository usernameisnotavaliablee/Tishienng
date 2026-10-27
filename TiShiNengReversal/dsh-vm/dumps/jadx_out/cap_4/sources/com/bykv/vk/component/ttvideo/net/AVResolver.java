package com.bykv.vk.component.ttvideo.net;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVResolver {
    public static int HOST_MAX_CACHE_TIME = 600000;
    private static final int MAX_CACHED = 128;
    private static final java.lang.String TAG = "ttmj";
    private static final java.util.Hashtable<java.lang.String, com.bykv.vk.component.ttvideo.net.AVResolver.HostInfo> mCacheHosts = null;
    private java.lang.String mError;
    private com.bykv.vk.component.ttvideo.net.AVResolver.HostInfo mHostInfo;
    private java.lang.String mHostName;
    private java.lang.String[] mIPStr;
    private boolean mRet;
    private java.lang.Thread mThread;

    static class HostInfo {
        public java.lang.String ip;
        public long time;

        HostInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static class ParserHost implements java.lang.Runnable {
        java.lang.String mHostName;
        com.bykv.vk.component.ttvideo.net.AVResolver mResolver;

        public ParserHost(com.bykv.vk.component.ttvideo.net.AVResolver r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mResolver = r1
                r0.mHostName = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "ttmj"
                java.lang.String r1 = "start ParserHost task"
                com.bytedance.sdk.component.utils.vl.j(r0, r1)
                r0 = 0
                java.lang.String r1 = r4.mHostName     // Catch: java.lang.Throwable -> L15
                java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch: java.lang.Throwable -> L15
                java.lang.String r0 = r1.getHostAddress()     // Catch: java.lang.Throwable -> L13
                goto L23
            L13:
                r2 = move-exception
                goto L17
            L15:
                r2 = move-exception
                r1 = r0
            L17:
                com.bytedance.sdk.component.utils.vl.j(r2)
                com.bykv.vk.component.ttvideo.net.AVResolver r3 = r4.mResolver
                java.lang.String r2 = r2.getMessage()
                com.bykv.vk.component.ttvideo.net.AVResolver.access$002(r3, r2)
            L23:
                com.bykv.vk.component.ttvideo.net.AVResolver r2 = r4.mResolver
                r3 = 1
                com.bykv.vk.component.ttvideo.net.AVResolver.access$102(r2, r3)
                if (r1 == 0) goto L56
                if (r0 != 0) goto L2e
                goto L56
            L2e:
                com.bykv.vk.component.ttvideo.net.AVResolver r1 = r4.mResolver
                java.lang.String[] r2 = new java.lang.String[r3]
                com.bykv.vk.component.ttvideo.net.AVResolver.access$202(r1, r2)
                com.bykv.vk.component.ttvideo.net.AVResolver r1 = r4.mResolver
                java.lang.String[] r1 = com.bykv.vk.component.ttvideo.net.AVResolver.access$200(r1)
                r2 = 0
                r1[r2] = r0
                com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo r1 = new com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo
                r1.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
                r1.ip = r0
                java.lang.String r0 = r4.mHostName
                com.bykv.vk.component.ttvideo.net.AVResolver.putHostInfo(r0, r1)
                long r2 = java.lang.System.currentTimeMillis()
                r1.time = r2
            L56:
                return
        }
    }

    static {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.bykv.vk.component.ttvideo.net.AVResolver.mCacheHosts = r0
            return
    }

    public AVResolver() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mRet = r0
            r0 = 0
            r1.mThread = r0
            return
    }

    static /* synthetic */ java.lang.String access$002(com.bykv.vk.component.ttvideo.net.AVResolver r0, java.lang.String r1) {
            r0.mError = r1
            return r1
    }

    static /* synthetic */ boolean access$102(com.bykv.vk.component.ttvideo.net.AVResolver r0, boolean r1) {
            r0.mRet = r1
            return r1
    }

    static /* synthetic */ java.lang.String[] access$200(com.bykv.vk.component.ttvideo.net.AVResolver r0) {
            java.lang.String[] r0 = r0.mIPStr
            return r0
    }

    static /* synthetic */ java.lang.String[] access$202(com.bykv.vk.component.ttvideo.net.AVResolver r0, java.lang.String[] r1) {
            r0.mIPStr = r1
            return r1
    }

    public static final boolean isIP(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 7
            if (r0 < r1) goto L1f
            int r0 = r3.length()
            r1 = 15
            if (r0 <= r1) goto L10
            goto L1f
        L10:
            java.lang.String r0 = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r3 = r3.find()
            return r3
        L1f:
            r0 = 0
            char r1 = r3.charAt(r0)
            r2 = 91
            if (r1 != r2) goto L37
            int r1 = r3.length()
            r2 = 1
            int r1 = r1 - r2
            char r3 = r3.charAt(r1)
            r1 = 93
            if (r3 != r1) goto L37
            return r2
        L37:
            return r0
    }

    static synchronized void putHostInfo(java.lang.String r10, com.bykv.vk.component.ttvideo.net.AVResolver.HostInfo r11) {
            java.lang.Class<com.bykv.vk.component.ttvideo.net.AVResolver> r0 = com.bykv.vk.component.ttvideo.net.AVResolver.class
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L46
            java.util.Hashtable<java.lang.String, com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo> r3 = com.bykv.vk.component.ttvideo.net.AVResolver.mCacheHosts     // Catch: java.lang.Throwable -> L46
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L46
            r5 = 128(0x80, float:1.8E-43)
            r6 = 0
            if (r4 <= r5) goto L4b
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L46
            r4 = r6
        L1b:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L46
            r6 = r5
            com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo r6 = (com.bykv.vk.component.ttvideo.net.AVResolver.HostInfo) r6     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L44
            long r7 = r6.time     // Catch: java.lang.Throwable -> L46
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 >= 0) goto L44
            r4 = r6
            r1 = r7
        L44:
            r6 = r5
            goto L1b
        L46:
            r10 = move-exception
            goto L5c
        L48:
            r1 = r6
            r6 = r4
            goto L4c
        L4b:
            r1 = r6
        L4c:
            if (r6 == 0) goto L55
            if (r1 == 0) goto L55
            java.util.Hashtable<java.lang.String, com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo> r2 = com.bykv.vk.component.ttvideo.net.AVResolver.mCacheHosts     // Catch: java.lang.Throwable -> L46
            r2.remove(r1)     // Catch: java.lang.Throwable -> L46
        L55:
            java.util.Hashtable<java.lang.String, com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo> r1 = com.bykv.vk.component.ttvideo.net.AVResolver.mCacheHosts     // Catch: java.lang.Throwable -> L46
            r1.put(r10, r11)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            return
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r10
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void freeAddress() {
            r1 = this;
            java.lang.Thread r0 = r1.mThread
            if (r0 == 0) goto Lc
            r0.interrupt()     // Catch: java.lang.Exception -> L8
            return
        L8:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lc:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public java.lang.String getAddress() {
            r2 = this;
            boolean r0 = r2.mRet
            if (r0 == 0) goto Le
            java.lang.String[] r0 = r2.mIPStr
            if (r0 == 0) goto Le
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parser host name: "
            r0.<init>(r1)
            java.lang.String r1 = r2.mHostName
            r0.append(r1)
            java.lang.String r1 = " error.err msg:"
            r0.append(r1)
            java.lang.String r1 = r2.mError
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void getAddressInfo(java.lang.String r10) {
            r9 = this;
            r9.mHostName = r10
            r0 = 1
            if (r10 == 0) goto L6e
            int r1 = r10.length()
            if (r1 <= 0) goto L6e
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L14
            goto L6e
        L14:
            java.lang.String r1 = r9.mHostName
            boolean r1 = isIP(r1)
            r2 = 0
            if (r1 == 0) goto L28
            java.lang.String[] r10 = new java.lang.String[r0]
            r9.mIPStr = r10
            java.lang.String r1 = r9.mHostName
            r10[r2] = r1
            r9.mRet = r0
            return
        L28:
            java.util.Hashtable<java.lang.String, com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo> r1 = com.bykv.vk.component.ttvideo.net.AVResolver.mCacheHosts
            java.lang.Object r3 = r1.get(r10)
            com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo r3 = (com.bykv.vk.component.ttvideo.net.AVResolver.HostInfo) r3
            r9.mHostInfo = r3
            if (r3 == 0) goto L59
            java.lang.String r3 = r3.ip
            if (r3 == 0) goto L53
            long r3 = java.lang.System.currentTimeMillis()
            com.bykv.vk.component.ttvideo.net.AVResolver$HostInfo r5 = r9.mHostInfo
            long r6 = r5.time
            long r3 = r3 - r6
            int r6 = com.bykv.vk.component.ttvideo.net.AVResolver.HOST_MAX_CACHE_TIME
            long r6 = (long) r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L53
            java.lang.String[] r10 = new java.lang.String[r0]
            r9.mIPStr = r10
            java.lang.String r1 = r5.ip
            r10[r2] = r1
            r9.mRet = r0
            return
        L53:
            r1.remove(r10)
            r10 = 0
            r9.mHostInfo = r10
        L59:
            com.bykv.vk.component.ttvideo.net.AVResolver$ParserHost r10 = new com.bykv.vk.component.ttvideo.net.AVResolver$ParserHost     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = r9.mHostName     // Catch: java.lang.Exception -> L64
            r10.<init>(r9, r1)     // Catch: java.lang.Exception -> L64
            com.bykv.vk.component.ttvideo.player.AVThreadPool.addTask(r10)     // Catch: java.lang.Exception -> L64
            return
        L64:
            r10 = move-exception
            r9.mRet = r0
            java.lang.String r10 = r10.getMessage()
            r9.mError = r10
            return
        L6e:
            r9.mRet = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int isSuccess() {
            r2 = this;
            boolean r0 = r2.mRet
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String[] r0 = r2.mIPStr
            if (r0 == 0) goto Lf
            r0 = r0[r1]
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = -1
            return r0
        L11:
            return r1
    }
}
