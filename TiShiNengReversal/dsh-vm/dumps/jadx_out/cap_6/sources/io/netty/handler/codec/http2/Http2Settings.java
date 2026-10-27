package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2Settings extends io.netty.util.collection.CharObjectHashMap<java.lang.Long> {
    private static final int DEFAULT_CAPACITY = 13;
    private static final java.lang.Long FALSE = null;
    private static final java.lang.Long TRUE = null;

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            io.netty.handler.codec.http2.Http2Settings.FALSE = r0
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            io.netty.handler.codec.http2.Http2Settings.TRUE = r0
            return
    }

    public Http2Settings() {
            r1 = this;
            r0 = 13
            r1.<init>(r0)
            return
    }

    public Http2Settings(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public Http2Settings(int r1, float r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.http2.Http2Settings defaultSettings() {
            io.netty.handler.codec.http2.Http2Settings r0 = new io.netty.handler.codec.http2.Http2Settings
            r0.<init>()
            r1 = 8192(0x2000, double:4.0474E-320)
            io.netty.handler.codec.http2.Http2Settings r0 = r0.maxHeaderListSize(r1)
            return r0
    }

    private static void verifyStandardSetting(int r6, java.lang.Long r7) {
            java.lang.String r0 = "value"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 0
            switch(r6) {
                case 1: goto Ldb;
                case 2: goto Lb1;
                case 3: goto L89;
                case 4: goto L5d;
                case 5: goto L3a;
                case 6: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Leb
        L11:
            long r4 = r7.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L23
            long r2 = r7.longValue()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L23
            goto Leb
        L23:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting MAX_HEADER_LIST_SIZE is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L3a:
            int r6 = r7.intValue()
            boolean r6 = io.netty.handler.codec.http2.Http2CodecUtil.isMaxFrameSizeValid(r6)
            if (r6 == 0) goto L46
            goto Leb
        L46:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting MAX_FRAME_SIZE is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L5d:
            long r0 = r7.longValue()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L72
            long r0 = r7.longValue()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L72
            goto Leb
        L72:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting INITIAL_WINDOW_SIZE is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L89:
            long r4 = r7.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L9a
            long r2 = r7.longValue()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L9a
            goto Leb
        L9a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting MAX_CONCURRENT_STREAMS is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        Lb1:
            long r0 = r7.longValue()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto Leb
            long r0 = r7.longValue()
            r2 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lc4
            goto Leb
        Lc4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting ENABLE_PUSH is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        Ldb:
            long r4 = r7.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto Lec
            long r2 = r7.longValue()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto Lec
        Leb:
            return
        Lec:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting HEADER_TABLE_SIZE is invalid: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    public io.netty.handler.codec.http2.Http2Settings copyFrom(io.netty.handler.codec.http2.Http2Settings r1) {
            r0 = this;
            r0.clear()
            r0.putAll(r1)
            return r0
    }

    public java.lang.Integer getIntValue(char r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    public io.netty.handler.codec.http2.Http2Settings headerTableSize(long r2) {
            r1 = this;
            r0 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r0, r2)
            return r1
    }

    public java.lang.Long headerTableSize() {
            r1 = this;
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public io.netty.handler.codec.http2.Http2Settings initialWindowSize(int r3) {
            r2 = this;
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r0 = 4
            r2.put(r0, r3)
            return r2
    }

    public java.lang.Integer initialWindowSize() {
            r1 = this;
            r0 = 4
            java.lang.Integer r0 = r1.getIntValue(r0)
            return r0
    }

    protected java.lang.String keyToString(char r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L17;
                case 2: goto L14;
                case 3: goto L11;
                case 4: goto Le;
                case 5: goto Lb;
                case 6: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = super.keyToString(r1)
            return r1
        L8:
            java.lang.String r1 = "MAX_HEADER_LIST_SIZE"
            return r1
        Lb:
            java.lang.String r1 = "MAX_FRAME_SIZE"
            return r1
        Le:
            java.lang.String r1 = "INITIAL_WINDOW_SIZE"
            return r1
        L11:
            java.lang.String r1 = "MAX_CONCURRENT_STREAMS"
            return r1
        L14:
            java.lang.String r1 = "ENABLE_PUSH"
            return r1
        L17:
            java.lang.String r1 = "HEADER_TABLE_SIZE"
            return r1
    }

    public io.netty.handler.codec.http2.Http2Settings maxConcurrentStreams(long r2) {
            r1 = this;
            r0 = 3
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r0, r2)
            return r1
    }

    public java.lang.Long maxConcurrentStreams() {
            r1 = this;
            r0 = 3
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public io.netty.handler.codec.http2.Http2Settings maxFrameSize(int r3) {
            r2 = this;
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r0 = 5
            r2.put(r0, r3)
            return r2
    }

    public java.lang.Integer maxFrameSize() {
            r1 = this;
            r0 = 5
            java.lang.Integer r0 = r1.getIntValue(r0)
            return r0
    }

    public io.netty.handler.codec.http2.Http2Settings maxHeaderListSize(long r2) {
            r1 = this;
            r0 = 6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r0, r2)
            return r1
    }

    public java.lang.Long maxHeaderListSize() {
            r1 = this;
            r0 = 6
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public io.netty.handler.codec.http2.Http2Settings pushEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            java.lang.Long r2 = io.netty.handler.codec.http2.Http2Settings.TRUE
            goto L7
        L5:
            java.lang.Long r2 = io.netty.handler.codec.http2.Http2Settings.FALSE
        L7:
            r0 = 2
            r1.put(r0, r2)
            return r1
    }

    public java.lang.Boolean pushEnabled() {
            r2 = this;
            r0 = 2
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.Long r1 = io.netty.handler.codec.http2.Http2Settings.TRUE
            boolean r0 = r1.equals(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public java.lang.Long put(char r1, java.lang.Long r2) {
            r0 = this;
            verifyStandardSetting(r1, r2)
            java.lang.Object r1 = super.put(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object put(char r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Long r1 = r0.put(r1, r2)
            return r1
    }
}
