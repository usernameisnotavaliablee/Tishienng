package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NetworkError implements xyz.adscope.common.v2.conn.IHttpRequestError {
    private final int mCode;
    private final java.lang.String mError;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DEFAULT extends java.lang.Enum<xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT> implements xyz.adscope.common.v2.conn.IHttpRequestError {
        private static final /* synthetic */ xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT[] $VALUES = null;
        public static final xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT ERROR_INVALID_URL = null;
        public static final xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT ERROR_METHOD = null;
        public static final xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT ERROR_REDIRECT_LOOP = null;
        public static final xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT ERROR_UNEXPECTED = null;
        private final int mCode;
        private final java.lang.String mError;

        private static /* synthetic */ xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT[] $values() {
                r0 = 4
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT[] r0 = new xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT[r0]
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r1 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r1 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_METHOD
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r1 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_REDIRECT_LOOP
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r1 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_INVALID_URL
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = new xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT
                r1 = -99
                java.lang.String r2 = "error unexpected"
                java.lang.String r3 = "ERROR_UNEXPECTED"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_UNEXPECTED = r0
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = new xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT
                r1 = 504(0x1f8, float:7.06E-43)
                java.lang.String r2 = "request method error"
                java.lang.String r3 = "ERROR_METHOD"
                r4 = 1
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_METHOD = r0
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = new xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT
                r1 = -97
                java.lang.String r2 = "error redirect loop"
                java.lang.String r3 = "ERROR_REDIRECT_LOOP"
                r4 = 2
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_REDIRECT_LOOP = r0
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r0 = new xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT
                r1 = -98
                java.lang.String r2 = "error invalid request url"
                java.lang.String r3 = "ERROR_INVALID_URL"
                r4 = 3
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.ERROR_INVALID_URL = r0
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT[] r0 = $values()
                xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.$VALUES = r0
                return
        }

        DEFAULT(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mCode = r3
                r0.mError = r4
                return
        }

        public static xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT> r0 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT r1 = (xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT) r1
                return r1
        }

        public static xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT[] values() {
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT[] r0 = xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.conn.http.NetworkError$DEFAULT[] r0 = (xyz.adscope.common.v2.conn.http.NetworkError.DEFAULT[]) r0
                return r0
        }

        @Override // xyz.adscope.common.v2.conn.IHttpRequestError
        public int getErrorCode() {
                r1 = this;
                int r0 = r1.mCode
                return r0
        }

        @Override // xyz.adscope.common.v2.conn.IHttpRequestError
        public java.lang.String getErrorMessage() {
                r1 = this;
                java.lang.String r0 = r1.mError
                return r0
        }
    }

    public NetworkError(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.mCode = r1
            r0.mError = r2
            return
    }

    @Override // xyz.adscope.common.v2.conn.IHttpRequestError
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.mCode
            return r0
    }

    @Override // xyz.adscope.common.v2.conn.IHttpRequestError
    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.mError
            return r0
    }
}
