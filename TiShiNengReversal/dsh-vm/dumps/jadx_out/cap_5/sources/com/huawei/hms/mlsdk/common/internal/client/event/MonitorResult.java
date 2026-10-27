package com.huawei.hms.mlsdk.common.internal.client.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MonitorResult {
    public static final java.lang.String SUCCESS = "SUCCESS";
    public static final java.lang.String ZOOM_NOT_SUPPORT = "ZOOM_NOT_SUPPORT";
    private java.lang.String code;
    private java.lang.Object data;
    private java.lang.String message;

    public MonitorResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult ofFailureResult(java.lang.String r1) {
            r0 = 0
            com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult r1 = ofFailureResult(r1, r0, r0)
            return r1
    }

    public static final com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult ofFailureResult(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult r1 = ofFailureResult(r1, r2, r0)
            return r1
    }

    public static final com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult ofFailureResult(java.lang.String r1, java.lang.String r2, java.lang.Object r3) {
            com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult r0 = new com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult
            r0.<init>()
            r0.setCode(r1)
            r0.setMessage(r2)
            r0.setData(r3)
            return r0
    }

    public static final com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult ofSuccessResult() {
            com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult r0 = new com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult
            r0.<init>()
            java.lang.String r1 = "SUCCESS"
            r0.setCode(r1)
            r1 = 0
            r0.setMessage(r1)
            r0.setData(r1)
            return r0
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public java.lang.Object getData() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public void setCode(java.lang.String r1) {
            r0 = this;
            r0.code = r1
            return
    }

    public void setData(java.lang.Object r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setMessage(java.lang.String r1) {
            r0 = this;
            r0.message = r1
            return
    }
}
