package com.umeng.socialize.net.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class URequest {
    protected static java.lang.String APPLICATION = "application/x-www-form-urlencoded";
    protected static java.lang.String GET = "GET";
    protected static java.lang.String MULTIPART = "multipart/form-data";
    protected static java.lang.String POST = "POST";
    protected java.lang.String mBaseUrl;
    public android.content.Context mContext;
    public java.util.Map<java.lang.String, java.lang.String> mHeaders;
    public com.umeng.socialize.net.utils.URequest.RequestMethod mMethod;
    protected com.umeng.socialize.net.utils.URequest.MIME mMimeType;
    public java.util.Map<java.lang.String, java.lang.String> mParams;
    public java.lang.Class<? extends com.umeng.socialize.net.base.SocializeReseponse> mResponseClz;
    public com.umeng.socialize.net.utils.URequest.PostStyle postStyle;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.net.utils.URequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FilePair {
        byte[] mBinaryData;
        java.lang.String mFileName;

        public FilePair(java.lang.String r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.mFileName = r1
                r0.mBinaryData = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected enum MIME extends java.lang.Enum<com.umeng.socialize.net.utils.URequest.MIME> {
        private static final /* synthetic */ com.umeng.socialize.net.utils.URequest.MIME[] $VALUES = null;
        public static final com.umeng.socialize.net.utils.URequest.MIME DEFAULT = null;
        public static final com.umeng.socialize.net.utils.URequest.MIME JSON = null;
        private java.lang.String mimeType;

        static {
                com.umeng.socialize.net.utils.URequest$MIME r0 = new com.umeng.socialize.net.utils.URequest$MIME
                java.lang.String r1 = "application/x-www-form-urlencoded;charset=utf-8"
                java.lang.String r2 = "DEFAULT"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.umeng.socialize.net.utils.URequest.MIME.DEFAULT = r0
                com.umeng.socialize.net.utils.URequest$MIME r1 = new com.umeng.socialize.net.utils.URequest$MIME
                java.lang.String r2 = "application/json;charset=utf-8"
                java.lang.String r4 = "JSON"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.umeng.socialize.net.utils.URequest.MIME.JSON = r1
                r2 = 2
                com.umeng.socialize.net.utils.URequest$MIME[] r2 = new com.umeng.socialize.net.utils.URequest.MIME[r2]
                r2[r3] = r0
                r2[r5] = r1
                com.umeng.socialize.net.utils.URequest.MIME.$VALUES = r2
                return
        }

        MIME(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mimeType = r3
                return
        }

        public static com.umeng.socialize.net.utils.URequest.MIME valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.net.utils.URequest$MIME> r0 = com.umeng.socialize.net.utils.URequest.MIME.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.net.utils.URequest$MIME r1 = (com.umeng.socialize.net.utils.URequest.MIME) r1
                return r1
        }

        public static com.umeng.socialize.net.utils.URequest.MIME[] values() {
                com.umeng.socialize.net.utils.URequest$MIME[] r0 = com.umeng.socialize.net.utils.URequest.MIME.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.net.utils.URequest$MIME[] r0 = (com.umeng.socialize.net.utils.URequest.MIME[]) r0
                return r0
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.mimeType
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum PostStyle extends java.lang.Enum<com.umeng.socialize.net.utils.URequest.PostStyle> {
        private static final /* synthetic */ com.umeng.socialize.net.utils.URequest.PostStyle[] $VALUES = null;
        public static final com.umeng.socialize.net.utils.URequest.PostStyle APPLICATION = null;
        public static final com.umeng.socialize.net.utils.URequest.PostStyle MULTIPART = null;



        static {
                com.umeng.socialize.net.utils.URequest$PostStyle$1 r0 = new com.umeng.socialize.net.utils.URequest$PostStyle$1
                java.lang.String r1 = "MULTIPART"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.net.utils.URequest.PostStyle.MULTIPART = r0
                com.umeng.socialize.net.utils.URequest$PostStyle$2 r1 = new com.umeng.socialize.net.utils.URequest$PostStyle$2
                java.lang.String r3 = "APPLICATION"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.net.utils.URequest.PostStyle.APPLICATION = r1
                r3 = 2
                com.umeng.socialize.net.utils.URequest$PostStyle[] r3 = new com.umeng.socialize.net.utils.URequest.PostStyle[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.socialize.net.utils.URequest.PostStyle.$VALUES = r3
                return
        }

        PostStyle(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ PostStyle(java.lang.String r1, int r2, com.umeng.socialize.net.utils.URequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.net.utils.URequest.PostStyle valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.net.utils.URequest$PostStyle> r0 = com.umeng.socialize.net.utils.URequest.PostStyle.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.net.utils.URequest$PostStyle r1 = (com.umeng.socialize.net.utils.URequest.PostStyle) r1
                return r1
        }

        public static com.umeng.socialize.net.utils.URequest.PostStyle[] values() {
                com.umeng.socialize.net.utils.URequest$PostStyle[] r0 = com.umeng.socialize.net.utils.URequest.PostStyle.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.net.utils.URequest$PostStyle[] r0 = (com.umeng.socialize.net.utils.URequest.PostStyle[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum RequestMethod extends java.lang.Enum<com.umeng.socialize.net.utils.URequest.RequestMethod> {
        private static final /* synthetic */ com.umeng.socialize.net.utils.URequest.RequestMethod[] $VALUES = null;
        public static final com.umeng.socialize.net.utils.URequest.RequestMethod GET = null;
        public static final com.umeng.socialize.net.utils.URequest.RequestMethod POST = null;



        static {
                com.umeng.socialize.net.utils.URequest$RequestMethod$1 r0 = new com.umeng.socialize.net.utils.URequest$RequestMethod$1
                java.lang.String r1 = "GET"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.net.utils.URequest.RequestMethod.GET = r0
                com.umeng.socialize.net.utils.URequest$RequestMethod$2 r1 = new com.umeng.socialize.net.utils.URequest$RequestMethod$2
                java.lang.String r3 = "POST"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.net.utils.URequest.RequestMethod.POST = r1
                r3 = 2
                com.umeng.socialize.net.utils.URequest$RequestMethod[] r3 = new com.umeng.socialize.net.utils.URequest.RequestMethod[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.socialize.net.utils.URequest.RequestMethod.$VALUES = r3
                return
        }

        RequestMethod(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ RequestMethod(java.lang.String r1, int r2, com.umeng.socialize.net.utils.URequest.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.net.utils.URequest.RequestMethod valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.net.utils.URequest$RequestMethod> r0 = com.umeng.socialize.net.utils.URequest.RequestMethod.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.net.utils.URequest$RequestMethod r1 = (com.umeng.socialize.net.utils.URequest.RequestMethod) r1
                return r1
        }

        public static com.umeng.socialize.net.utils.URequest.RequestMethod[] values() {
                com.umeng.socialize.net.utils.URequest$RequestMethod[] r0 = com.umeng.socialize.net.utils.URequest.RequestMethod.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.net.utils.URequest$RequestMethod[] r0 = (com.umeng.socialize.net.utils.URequest.RequestMethod[]) r0
                return r0
        }
    }

    static {
            return
    }

    public URequest(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mParams = r0
            com.umeng.socialize.net.utils.URequest$PostStyle r0 = com.umeng.socialize.net.utils.URequest.PostStyle.MULTIPART
            r1.postStyle = r0
            r1.mBaseUrl = r2
            return
    }

    public static java.lang.String buildGetParams(java.util.Map<java.lang.String, java.lang.Object> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            if (r3 != 0) goto L20
            goto Ld
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = "="
            r3.append(r4)
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.net.URLEncoder.encode(r2)
            r3.append(r2)
            java.lang.String r2 = "&"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto Ld
        L49:
            int r5 = r0.length()
            int r5 = r5 + (-1)
            r1 = 0
            java.lang.String r5 = r0.substring(r1, r5)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public void addStringParams(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lb
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mParams
            r0.put(r2, r3)
        Lb:
            return
    }

    public java.lang.String buildGetUrl(java.lang.String r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L48
            if (r4 == 0) goto L48
            int r0 = r4.size()
            if (r0 != 0) goto Lf
            goto L48
        Lf:
            java.lang.String r0 = "?"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L26:
            java.lang.String r4 = buildGetParams(r4)
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.assertURL(r3, r4)
            com.umeng.socialize.utils.SLog.debug(r0)
            java.lang.String r4 = r2.getEcryptString(r4)     // Catch: java.lang.Exception -> L36
            goto L3c
        L36:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR
            com.umeng.socialize.utils.SLog.error(r1, r0)
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L48:
            return r3
    }

    public abstract java.util.Map<java.lang.String, java.lang.Object> buildParams();

    public java.lang.String generateGetURL(java.lang.String r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = this;
            java.lang.String r1 = r0.buildGetUrl(r1, r2)
            return r1
    }

    public java.lang.String getBaseUrl() {
            r1 = this;
            java.lang.String r0 = r1.mBaseUrl
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getBodyPair() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getDecryptString(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.lang.String getEcryptString(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.util.Map<java.lang.String, com.umeng.socialize.net.utils.URequest.FilePair> getFilePair() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected java.lang.String getHttpMethod() {
            r1 = this;
            com.umeng.socialize.net.utils.URequest$RequestMethod r0 = r1.mMethod
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void onPrepareRequest() {
            r0 = this;
            return
    }

    public void setBaseUrl(java.lang.String r1) {
            r0 = this;
            r0.mBaseUrl = r1
            return
    }

    public abstract java.lang.String toGetUrl();

    public abstract org.json.JSONObject toJson();
}
