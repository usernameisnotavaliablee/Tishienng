package com.umeng.socialize.net.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SocializeRequest extends com.umeng.socialize.net.utils.URequest {
    private static final java.lang.String BASE_URL = "https://log.umsns.com/";
    public static final int REQUEST_ANALYTIC = 1;
    public static final int REQUEST_API = 2;
    public static final int REQUEST_SOCIAL = 0;
    private static final java.lang.String TAG = "SocializeRequest";
    private java.util.Map<java.lang.String, com.umeng.socialize.net.utils.URequest.FilePair> mFileMap;
    public int mOpId;
    private int mReqType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.net.base.SocializeRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod = null;

        static {
                com.umeng.socialize.net.utils.URequest$RequestMethod[] r0 = com.umeng.socialize.net.utils.URequest.RequestMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.socialize.net.base.SocializeRequest.AnonymousClass1.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod = r0
                com.umeng.socialize.net.utils.URequest$RequestMethod r1 = com.umeng.socialize.net.utils.URequest.RequestMethod.POST     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.umeng.socialize.net.base.SocializeRequest.AnonymousClass1.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod     // Catch: java.lang.NoSuchFieldError -> L1d
                com.umeng.socialize.net.utils.URequest$RequestMethod r1 = com.umeng.socialize.net.utils.URequest.RequestMethod.GET     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FILE_TYPE extends java.lang.Enum<com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE> {
        private static final /* synthetic */ com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE[] $VALUES = null;
        public static final com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE IMAGE = null;
        public static final com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE VEDIO = null;

        static {
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE r0 = new com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE
                java.lang.String r1 = "IMAGE"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.IMAGE = r0
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE r1 = new com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE
                java.lang.String r3 = "VEDIO"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.VEDIO = r1
                r3 = 2
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE[] r3 = new com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.$VALUES = r3
                return
        }

        FILE_TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE> r0 = com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE r1 = (com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE) r1
                return r1
        }

        public static com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE[] values() {
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE[] r0 = com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE[] r0 = (com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE[]) r0
                return r0
        }
    }

    public SocializeRequest(android.content.Context r1, java.lang.String r2, java.lang.Class<? extends com.umeng.socialize.net.base.SocializeReseponse> r3, int r4, com.umeng.socialize.net.utils.URequest.RequestMethod r5) {
            r0 = this;
            java.lang.String r2 = ""
            r0.<init>(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mFileMap = r2
            r2 = 1
            r0.mReqType = r2
            r0.mResponseClz = r3
            r0.mOpId = r4
            r0.mContext = r1
            r0.mMethod = r5
            java.lang.String r1 = "https://log.umsns.com/"
            r0.setBaseUrl(r1)
            return
    }

    public static java.util.Map<java.lang.String, java.lang.Object> getBaseQuery(android.content.Context r5) {
            java.lang.String r0 = "en"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = com.umeng.socialize.utils.DeviceConfig.getDeviceId(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L16
            java.lang.String r3 = "imei"
            r1.put(r3, r2)
        L16:
            java.lang.String r2 = com.umeng.socialize.utils.DeviceConfig.getMac(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L29
            java.lang.String r2 = com.umeng.socialize.utils.DefaultClass.getMac()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.NET.MACNULL
            com.umeng.socialize.utils.SLog.I(r3)
        L29:
            java.lang.String r3 = "mac"
            r1.put(r3, r2)
            java.lang.String r2 = com.umeng.socialize.common.SocializeConstants.UID
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "uid"
            java.lang.String r3 = com.umeng.socialize.common.SocializeConstants.UID
            r1.put(r2, r3)
        L3d:
            r2 = 0
            java.lang.String[] r3 = com.umeng.socialize.utils.DeviceConfig.getNetworkAccessMode(r5)     // Catch: java.lang.Exception -> L48
            r3 = r3[r2]     // Catch: java.lang.Exception -> L48
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            java.lang.String r3 = "Unknown"
            r1.put(r0, r3)
        L4d:
            java.lang.String r0 = "de"
            java.lang.String r3 = android.os.Build.MODEL
            r1.put(r0, r3)
            java.lang.String r0 = "sdkv"
            java.lang.String r3 = "7.3.2"
            r1.put(r0, r3)
            java.lang.String r0 = "os"
            java.lang.String r3 = "Android"
            r1.put(r0, r3)
            java.lang.String r0 = "android_id"
            java.lang.String r3 = com.umeng.socialize.utils.DeviceConfig.getAndroidID(r5)
            r1.put(r0, r3)
            java.lang.String r0 = "sn"
            java.lang.String r3 = com.umeng.socialize.utils.DeviceConfig.getDeviceSN()
            r1.put(r0, r3)
            java.lang.String r0 = "os_version"
            java.lang.String r3 = com.umeng.socialize.utils.DeviceConfig.getOsVersion()
            r1.put(r0, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "dt"
            r1.put(r3, r0)
            java.lang.String r5 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r5)
            java.lang.String r0 = "ak"
            r1.put(r0, r5)
            java.lang.String r5 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_VERSION
            java.lang.String r0 = "3.0"
            r1.put(r5, r0)
            java.lang.String r5 = "u_sharetype"
            java.lang.String r0 = com.umeng.socialize.Config.shareType
            r1.put(r5, r0)
            java.lang.String r5 = com.umeng.socialize.Config.EntityKey
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto Lb0
            java.lang.String r5 = "ek"
            java.lang.String r0 = com.umeng.socialize.Config.EntityKey
            r1.put(r5, r0)
        Lb0:
            java.lang.String r5 = com.umeng.socialize.Config.SessionId
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto Lbf
            java.lang.String r5 = "sid"
            java.lang.String r0 = com.umeng.socialize.Config.SessionId
            r1.put(r5, r0)
        Lbf:
            java.lang.String r5 = "tp"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lc9
            r1.put(r5, r0)     // Catch: java.lang.Exception -> Lc9
            goto Lcd
        Lc9:
            r5 = move-exception
            com.umeng.socialize.utils.SLog.error(r5)
        Lcd:
            return r1
    }

    private java.lang.String mapTostring(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.mParams
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L14
            r0.<init>(r3)     // Catch: java.lang.Exception -> L14
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            r3 = move-exception
            com.umeng.socialize.utils.SLog.error(r3)
            return r1
    }

    public void addFileParams(byte[] r3, com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE r4, java.lang.String r5) {
            r2 = this;
            com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE r5 = com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.IMAGE
            if (r5 != r4) goto L34
            java.lang.String r4 = com.umeng.socialize.c.a.a.c(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L10
            java.lang.String r4 = "png"
        L10:
            com.umeng.socialize.net.utils.URequest$FilePair r5 = new com.umeng.socialize.net.utils.URequest$FilePair
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.umeng.socialize.utils.SocializeUtils.md5(r3)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            java.util.Map<java.lang.String, com.umeng.socialize.net.utils.URequest$FilePair> r3 = r2.mFileMap
            java.lang.String r4 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_IMAGE
            r3.put(r4, r5)
        L34:
            return
    }

    public void addMediaParams(com.umeng.socialize.media.UMediaObject r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4f
        L3:
            boolean r0 = r3 instanceof com.umeng.socialize.media.BaseMediaObject
            if (r0 == 0) goto L13
            r0 = r3
            com.umeng.socialize.media.BaseMediaObject r0 = (com.umeng.socialize.media.BaseMediaObject) r0
            java.lang.String r1 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_TITLE
            java.lang.String r0 = r0.getTitle()
            r2.addStringParams(r1, r0)
        L13:
            boolean r0 = r3.isUrlMedia()
            if (r0 == 0) goto L43
            java.util.Map r3 = r3.toUrlExtraParams()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r2.addStringParams(r1, r0)
            goto L25
        L43:
            byte[] r3 = r3.toByte()
            if (r3 == 0) goto L4f
            com.umeng.socialize.net.base.SocializeRequest$FILE_TYPE r0 = com.umeng.socialize.net.base.SocializeRequest.FILE_TYPE.IMAGE
            r1 = 0
            r2.addFileParams(r3, r0, r1)
        L4f:
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.util.Map<java.lang.String, java.lang.Object> buildParams() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            java.util.Map r0 = getBaseQuery(r0)
            java.lang.String r1 = com.umeng.socialize.Config.EntityKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "ek"
            java.lang.String r2 = com.umeng.socialize.Config.EntityKey
            r0.put(r1, r2)
        L15:
            java.lang.String r1 = com.umeng.socialize.Config.SessionId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L24
            java.lang.String r1 = "sid"
            java.lang.String r2 = com.umeng.socialize.Config.SessionId
            r0.put(r1, r2)
        L24:
            int r1 = r3.mReqType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "tp"
            r0.put(r2, r1)
            int r1 = r3.mOpId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "opid"
            r0.put(r2, r1)
            android.content.Context r1 = r3.mContext
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getUMId(r1)
            java.lang.String r2 = "uid"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.mParams
            r0.putAll(r1)
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.util.Map<java.lang.String, java.lang.Object> getBodyPair() {
            r1 = this;
            java.util.Map r0 = r1.buildParams()
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.util.Map<java.lang.String, com.umeng.socialize.net.utils.URequest.FilePair> getFilePair() {
            r1 = this;
            java.util.Map<java.lang.String, com.umeng.socialize.net.utils.URequest$FilePair> r0 = r1.mFileMap
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    protected java.lang.String getHttpMethod() {
            r2 = this;
            int[] r0 = com.umeng.socialize.net.base.SocializeRequest.AnonymousClass1.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod
            com.umeng.socialize.net.utils.URequest$RequestMethod r1 = r2.mMethod
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L10
            java.lang.String r0 = com.umeng.socialize.net.utils.URequest.GET
            return r0
        L10:
            java.lang.String r0 = com.umeng.socialize.net.utils.URequest.POST
            return r0
    }

    protected abstract java.lang.String getPath();

    @Override // com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
            r2 = this;
            java.lang.String r0 = "pcv"
            java.lang.String r1 = "3.0"
            r2.addStringParams(r0, r1)
            java.lang.String r0 = "u_sharetype"
            java.lang.String r1 = com.umeng.socialize.Config.shareType
            r2.addStringParams(r0, r1)
            android.content.Context r0 = r2.mContext
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfig.getDeviceId(r0)
            java.lang.String r1 = "imei"
            r2.addStringParams(r1, r0)
            java.lang.String r0 = "de"
            java.lang.String r1 = android.os.Build.MODEL
            r2.addStringParams(r0, r1)
            android.content.Context r0 = r2.mContext
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfig.getMac(r0)
            java.lang.String r1 = "mac"
            r2.addStringParams(r1, r0)
            java.lang.String r0 = "os"
            java.lang.String r1 = "Android"
            r2.addStringParams(r0, r1)
            android.content.Context r0 = r2.mContext
            java.lang.String[] r0 = com.umeng.socialize.utils.DeviceConfig.getNetworkAccessMode(r0)
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "en"
            r2.addStringParams(r1, r0)
            java.lang.String r0 = "uid"
            r1 = 0
            r2.addStringParams(r0, r1)
            java.lang.String r0 = "sdkv"
            java.lang.String r1 = "7.3.2"
            r2.addStringParams(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "dt"
            r2.addStringParams(r1, r0)
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public void setBaseUrl(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r4.getPath()     // Catch: java.lang.Exception -> L1f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L27
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L1f
            r1.<init>(r5)     // Catch: java.lang.Exception -> L1f
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = r4.getPath()     // Catch: java.lang.Exception -> L1f
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L1f
            goto L27
        L1f:
            r1 = move-exception
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.NET.getURLERROR(r5)
            com.umeng.socialize.utils.SLog.error(r5, r1)
        L27:
            super.setBaseUrl(r0)
            return
    }

    public void setReqType(int r1) {
            r0 = this;
            r0.mReqType = r1
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.lang.String toGetUrl() {
            r2 = this;
            java.util.Map r0 = r2.buildParams()
            java.lang.String r1 = r2.getBaseUrl()
            java.lang.String r0 = r2.generateGetURL(r1, r0)
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public org.json.JSONObject toJson() {
            r1 = this;
            r0 = 0
            return r0
    }
}
