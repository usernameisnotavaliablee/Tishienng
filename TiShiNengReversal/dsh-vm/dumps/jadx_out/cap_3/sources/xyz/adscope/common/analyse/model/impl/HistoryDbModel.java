package xyz.adscope.common.analyse.model.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class HistoryDbModel extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel {
    public static final java.lang.String COLUMN_ACCEPT_ENCRYPT = "acceptEncrypt";
    public static final java.lang.String COLUMN_API_KEY = "apiKey";
    public static final java.lang.String COLUMN_MACROS = "macros";
    public static final java.lang.String COLUMN_REPORT_URL = "reportUrl";
    public static final java.lang.String COLUMN_STORE_TIME = "storeTime";

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "apiKey")
    private java.lang.String apiKey;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "acceptEncrypt")
    private java.lang.String encrypt;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "macros")
    private java.lang.String macros;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "storeTime")
    private java.lang.String storeTime;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "reportUrl")
    private java.lang.String url;

    public HistoryDbModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.url = r0
            r1.macros = r0
            r1.storeTime = r0
            r1.apiKey = r0
            return
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = r1.apiKey
            return r0
    }

    public java.lang.String getEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.encrypt
            return r0
    }

    public java.lang.String getMacros() {
            r1 = this;
            java.lang.String r0 = r1.macros
            return r0
    }

    public long getStoreTime() {
            r2 = this;
            java.lang.String r0 = r2.storeTime
            long r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r0)
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public void setApiKey(java.lang.String r1) {
            r0 = this;
            r0.apiKey = r1
            return
    }

    public void setEncrypt(java.lang.String r1) {
            r0 = this;
            r0.encrypt = r1
            return
    }

    public void setMacros(java.lang.String r1) {
            r0 = this;
            r0.macros = r1
            return
    }

    public void setStoreTime(long r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.storeTime = r2
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }
}
