package com.autonavi.base.amap.mapcore.maploader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapLoader implements com.amap.api.col.3l.v6.a {
    private static final int GET_METHOD = 0;
    private static final java.lang.String NETWORK_RESPONSE_CODE_STRING = "网络异常状态码：";
    private android.content.Context context;
    private com.amap.api.col.p0003l.v6 downloadManager;
    private volatile boolean isCanceled;
    private com.autonavi.base.amap.mapcore.maploader.AMapLoader.ADataRequestParam mDataRequestParam;
    private boolean mRequestCancel;
    private long requestMapDataPackageSize;
    private long requestMapDataTimestamp;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ADataRequestParam {
        public byte[] enCodeString;
        public long handler;
        public int nCompress;
        public int nRequestType;
        public java.lang.String requestBaseUrl;
        public java.lang.String requestUrl;

        public ADataRequestParam() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AMapGridDownloadRequest extends com.amap.api.col.p0003l.g2 {
        private final android.content.Context mContext;
        private byte[] postEntityBytes;
        private java.lang.String sUrl;
        private java.lang.String userAgent;

        public AMapGridDownloadRequest(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                r0.sUrl = r2
                r0.userAgent = r3
                return
        }

        @Override // com.amap.api.col.p0003l.Cif
        public byte[] getEntityBytes() {
                r1 = this;
                byte[] r0 = r1.postEntityBytes
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public java.lang.String getIPV6URL() {
                r1 = this;
                java.lang.String r0 = r1.getURL()
                java.lang.String r0 = com.amap.api.col.p0003l.b3.y(r0)
                return r0
        }

        @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
        public java.util.Map<java.lang.String, java.lang.String> getParams() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
                r6 = this;
                com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
                if (r0 == 0) goto Lb
                java.lang.String r0 = r0.e()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                android.content.Context r1 = r6.mContext
                java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
                java.lang.String r2 = "UTF-8"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.lang.Throwable -> L18
            L18:
                java.util.Hashtable r2 = new java.util.Hashtable
                r3 = 16
                r2.<init>(r3)
                java.lang.String r3 = "User-Agent"
                java.lang.String r4 = r6.userAgent
                r2.put(r3, r4)
                java.util.Locale r3 = java.util.Locale.US
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r0
                java.lang.String r0 = "3dmap"
                r5 = 1
                r4[r5] = r0
                java.lang.String r0 = "platform=Android&sdkversion=%s&product=%s"
                java.lang.String r0 = java.lang.String.format(r3, r0, r4)
                java.lang.String r3 = "platinfo"
                r2.put(r3, r0)
                android.content.Context r0 = r6.mContext
                java.lang.String r0 = com.amap.api.col.p0003l.h4.b(r0)
                java.lang.String r3 = "x-INFO"
                r2.put(r3, r0)
                java.lang.String r0 = "key"
                r2.put(r0, r1)
                java.lang.String r0 = "logversion"
                java.lang.String r1 = "2.1"
                r2.put(r0, r1)
                return r2
        }

        @Override // com.amap.api.col.p0003l.Cif
        public java.lang.String getURL() {
                r1 = this;
                java.lang.String r0 = r1.sUrl
                return r0
        }

        @Override // com.amap.api.col.p0003l.Cif
        public boolean isSupportIPV6() {
                r1 = this;
                r0 = 1
                return r0
        }

        public void setPostEntityBytes(byte[] r1) {
                r0 = this;
                r0.postEntityBytes = r1
                return
        }
    }

    public AMapLoader(android.content.Context r4, com.autonavi.base.amap.mapcore.maploader.AMapLoader.ADataRequestParam r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.isCanceled = r0
            r3.mRequestCancel = r0
            r1 = 0
            r3.requestMapDataTimestamp = r1
            r3.requestMapDataPackageSize = r1
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.context = r4
            r3.mDataRequestParam = r5
            r3.mRequestCancel = r0
            return
    }

    private java.lang.String generateQueryString(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r6)
            android.content.Context r6 = r4.context
            java.lang.String r6 = com.amap.api.col.p0003l.f4.j(r6)
            java.lang.String r1 = "UTF-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r1)     // Catch: java.lang.Throwable -> L11
        L11:
            java.lang.String r1 = "&key="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r4.sortReEncoderParams(r6)
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
            java.lang.String r2 = "&ts="
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r3)
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "&scode="
            r2.<init>(r3)
            java.lang.String r5 = com.amap.api.col.p0003l.h4.c(r5, r1, r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.append(r5)
            java.lang.String r5 = "&dip=16300"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    private java.lang.String getEncodeRequestParams(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    private java.lang.String getNetworkFailedReason(java.lang.String r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            boolean r0 = r0.isNetworkConnected()
            if (r0 != 0) goto Lc
            java.lang.String r2 = "无网络"
        Lc:
            return r2
    }

    private void onCancel() {
            r4 = this;
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r4.mDataRequestParam
            if (r0 == 0) goto L10
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r4.mDataRequestParam
            long r1 = r1.handler
            r3 = -1
            r0.netCancel(r1, r3)
        L10:
            return
    }

    private java.lang.String sortReEncoderParams(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "&"
            java.lang.String[] r1 = r8.split(r0)
            java.util.Arrays.sort(r1)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L11:
            if (r5 >= r3) goto L22
            r6 = r1[r5]
            java.lang.String r6 = r7.strReEncoder(r6)
            r2.append(r6)
            r2.append(r0)
            int r5 = r5 + 1
            goto L11
        L22:
            java.lang.String r0 = r2.toString()
            int r1 = r0.length()
            r2 = 1
            if (r1 <= r2) goto L38
            int r8 = r0.length()
            int r8 = r8 - r2
            java.lang.CharSequence r8 = r0.subSequence(r4, r8)
            java.lang.String r8 = (java.lang.String) r8
        L38:
            return r8
    }

    private void staticNetworkPerformance() {
            r6 = this;
            android.content.Context r0 = r6.context
            int r1 = r6.hashCode()
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.requestMapDataTimestamp
            long r2 = r2 - r4
            long r4 = r6.requestMapDataPackageSize
            com.amap.api.col.p0003l.y2.f(r0, r1, r2, r4)
            return
    }

    private java.lang.String strReEncoder(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "AbstractProtocalHandler"
            if (r3 != 0) goto L5
            return r3
        L5:
            java.lang.String r1 = "utf-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r1)     // Catch: java.lang.Exception -> Lc java.io.UnsupportedEncodingException -> Le
            return r3
        Lc:
            r3 = move-exception
            goto L10
        Le:
            r3 = move-exception
            goto L16
        L10:
            java.lang.String r1 = "strReEncoderException"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            goto L1b
        L16:
            java.lang.String r1 = "strReEncoder"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
        L1b:
            java.lang.String r3 = ""
            return r3
    }

    public void doCancel() {
            r4 = this;
            r0 = 1
            r4.mRequestCancel = r0
            com.amap.api.col.3l.v6 r1 = r4.downloadManager
            if (r1 == 0) goto L23
            boolean r1 = r4.isCanceled
            if (r1 != 0) goto L23
            com.amap.api.col.3l.v6 r1 = r4.downloadManager
            monitor-enter(r1)
            r4.isCanceled = r0     // Catch: java.lang.Throwable -> L16
            com.amap.api.col.3l.v6 r0 = r4.downloadManager     // Catch: java.lang.Throwable -> L16
            r0.a()     // Catch: java.lang.Throwable -> L16
            goto L1e
        L16:
            r0 = move-exception
            java.lang.String r2 = "AMapLoader"
            java.lang.String r3 = "doCancel"
            com.amap.api.col.p0003l.w5.p(r0, r2, r3)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r0
        L23:
            return
    }

    public void doCancelAndNotify() {
            r0 = this;
            r0.onCancel()
            r0.doCancel()
            return
    }

    public void doRequest() {
            r11 = this;
            android.content.Context r0 = r11.context
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r0, r1)
            com.amap.api.col.3l.ft$c r0 = r0.a
            com.amap.api.col.3l.ft$c r1 = com.amap.api.col.3l.ft.c.a
            r2 = -1
            if (r0 == r1) goto L21
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r11.mDataRequestParam
            if (r0 == 0) goto L34
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r11.mDataRequestParam
            long r3 = r1.handler
            r0.netError(r3, r2, r2)
            return
        L21:
            boolean r0 = r11.mRequestCancel
            if (r0 == 0) goto L35
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r11.mDataRequestParam
            if (r0 == 0) goto L34
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r11.mDataRequestParam
            long r3 = r1.handler
            r0.netError(r3, r2, r2)
        L34:
            return
        L35:
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r11.mDataRequestParam
            java.lang.String r1 = r0.requestBaseUrl
            java.lang.String r0 = r0.requestUrl
            java.lang.String r2 = "?"
            boolean r3 = r1.endsWith(r2)
            if (r3 != 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
        L52:
            java.lang.String r2 = ";"
            java.lang.String r3 = r11.getEncodeRequestParams(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.replaceAll(r2, r3)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L6e
            java.lang.String r4 = "http://m5.amap.com/"
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L6e
            r4 = 1
            goto L6f
        L6e:
            r4 = 0
        L6f:
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r5 = r11.mDataRequestParam
            int r5 = r5.nRequestType
            java.lang.String r0 = r11.getRequestParams(r0, r4, r5)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r5 = r11.mDataRequestParam
            int r5 = r5.nRequestType
            if (r5 != 0) goto L9f
            r4.append(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "&csid="
            r5.<init>(r6)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            goto Lb8
        L9f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "csid="
            r5.<init>(r6)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.append(r5)
        Lb8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            r5.<init>()     // Catch: java.lang.Throwable -> Lf8
            r5.append(r1)     // Catch: java.lang.Throwable -> Lf8
            android.content.Context r1 = r11.context     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r1 = r11.generateQueryString(r1, r4)     // Catch: java.lang.Throwable -> Lf8
            r5.append(r1)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lf8
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$AMapGridDownloadRequest r5 = new com.autonavi.base.amap.mapcore.maploader.AMapLoader$AMapGridDownloadRequest     // Catch: java.lang.Throwable -> Lf8
            android.content.Context r4 = r11.context     // Catch: java.lang.Throwable -> Lf8
            com.autonavi.base.ae.gmap.NetworkProxyManager r6 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r6 = r6.getUserAgent()     // Catch: java.lang.Throwable -> Lf8
            r5.<init>(r4, r1, r6)     // Catch: java.lang.Throwable -> Lf8
            r1 = 30000(0x7530, float:4.2039E-41)
            r5.setConnectionTimeout(r1)     // Catch: java.lang.Throwable -> Lf8
            r5.setSoTimeout(r1)     // Catch: java.lang.Throwable -> Lf8
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r11.mDataRequestParam     // Catch: java.lang.Throwable -> Lf8
            int r1 = r1.nRequestType     // Catch: java.lang.Throwable -> Lf8
            if (r1 == 0) goto Lfa
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> Lf8
            r5.setPostEntityBytes(r0)     // Catch: java.lang.Throwable -> Lf8
            goto Lfa
        Lf8:
            r0 = move-exception
            goto L12d
        Lfa:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf8
            r11.requestMapDataTimestamp = r0     // Catch: java.lang.Throwable -> Lf8
            byte[] r0 = r5.getEntityBytes()     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto L109
            r0 = 0
            goto L10f
        L109:
            byte[] r0 = r5.getEntityBytes()     // Catch: java.lang.Throwable -> Lf8
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lf8
            long r0 = (long) r0     // Catch: java.lang.Throwable -> Lf8
        L10f:
            r11.requestMapDataPackageSize = r0     // Catch: java.lang.Throwable -> Lf8
            com.amap.api.col.3l.v6 r4 = new com.amap.api.col.3l.v6     // Catch: java.lang.Throwable -> Lf8
            int r0 = com.amap.api.maps.MapsInitializer.getProtocol()     // Catch: java.lang.Throwable -> Lf8
            r1 = 2
            if (r0 != r1) goto L11c
            r10 = 1
            goto L11d
        L11c:
            r10 = 0
        L11d:
            r6 = 0
            r8 = -1
            r4.<init>(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> Lf8
            r11.downloadManager = r4     // Catch: java.lang.Throwable -> Lf8
            r4.b(r11)     // Catch: java.lang.Throwable -> Lf8
            r11.doCancel()
            return
        L12d:
            r11.onException(r0)     // Catch: java.lang.Throwable -> L134
            r11.doCancel()
            return
        L134:
            r0 = move-exception
            r11.doCancel()
            throw r0
    }

    protected java.lang.String getRequestParams(java.lang.String r1, boolean r2, int r3) {
            r0 = this;
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r1)
            if (r2 == 0) goto Ld
            java.lang.String r1 = "&channel=amap7&div=GNaviMap"
            r3.append(r1)
            goto L17
        Ld:
            java.lang.String r1 = "&channel=amapapi"
            r3.append(r1)
            java.lang.String r1 = "&div=GNaviMap"
            r3.append(r1)
        L17:
            java.lang.String r1 = r3.toString()
            return r1
    }

    @Override // com.amap.api.col.3l.v6.a
    public void onDownload(byte[] r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L12
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r4 = r2.mDataRequestParam
            if (r4 == 0) goto L12
            com.autonavi.base.ae.gmap.NetworkProxyManager r4 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r5 = r2.mDataRequestParam
            long r0 = r5.handler
            int r5 = r3.length
            r4.receiveNetData(r0, r3, r5)
        L12:
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public void onException(java.lang.Throwable r6) {
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = -1
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r6.getMessage()     // Catch: java.lang.Throwable -> L29
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L29
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L2b
            java.lang.String r0 = "网络异常状态码："
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == r1) goto L2b
            int r0 = r0 + 8
            java.lang.String r0 = r2.substring(r0)     // Catch: java.lang.Throwable -> L29
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            goto L57
        L2b:
            r0 = -1
        L2c:
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r2 = r5.mDataRequestParam
            if (r2 == 0) goto L3b
            com.autonavi.base.ae.gmap.NetworkProxyManager r2 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r3 = r5.mDataRequestParam
            long r3 = r3.handler
            r2.netError(r3, r1, r0)
        L3b:
            android.content.Context r0 = r5.context
            int r1 = r5.hashCode()
            com.autonavi.base.ae.gmap.NetworkProxyManager r2 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            boolean r2 = r2.isNetworkConnected()
            r2 = r2 ^ 1
            java.lang.String r3 = r6.getMessage()
            java.lang.String r3 = r5.getNetworkFailedReason(r3)
            com.amap.api.col.p0003l.y2.e(r0, r1, r2, r3)
            goto L67
        L57:
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r5.mDataRequestParam
            if (r0 == 0) goto L3b
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r2 = r5.mDataRequestParam
            long r2 = r2.handler
            r0.netError(r2, r1, r1)
            goto L3b
        L67:
            java.lang.String r0 = "AMapLoader"
            java.lang.String r1 = "download onException"
            com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3066e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "map loader exception "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.amap.api.col.p0003l.d3.l(r0, r6)
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public void onFinish() {
            r3 = this;
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r3.mDataRequestParam
            if (r0 == 0) goto Lf
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r3.mDataRequestParam
            long r1 = r1.handler
            r0.finishDownLoad(r1)
        Lf:
            r3.staticNetworkPerformance()
            return
    }

    @Override // com.amap.api.col.3l.v6.a
    public void onStop() {
            r4 = this;
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r0 = r4.mDataRequestParam
            if (r0 == 0) goto L10
            com.autonavi.base.ae.gmap.NetworkProxyManager r0 = com.autonavi.base.ae.gmap.NetworkProxyManager.getInstance()
            com.autonavi.base.amap.mapcore.maploader.AMapLoader$ADataRequestParam r1 = r4.mDataRequestParam
            long r1 = r1.handler
            r3 = -1
            r0.netStop(r1, r3)
        L10:
            r4.staticNetworkPerformance()
            return
    }
}
