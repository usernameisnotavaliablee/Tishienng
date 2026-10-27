package com.clj.fastble.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BleException implements java.io.Serializable {
    public static final int ERROR_CODE_GATT = 101;
    public static final int ERROR_CODE_OTHER = 102;
    public static final int ERROR_CODE_TIMEOUT = 100;
    private static final long serialVersionUID = 8004414918500865564L;
    private int code;
    private java.lang.String description;

    public BleException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.description = r2
            return
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public com.clj.fastble.exception.BleException setCode(int r1) {
            r0 = this;
            r0.code = r1
            return r0
    }

    public com.clj.fastble.exception.BleException setDescription(java.lang.String r1) {
            r0 = this;
            r0.description = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BleException { code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", description='"
            r0.append(r1)
            java.lang.String r1 = r2.description
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
