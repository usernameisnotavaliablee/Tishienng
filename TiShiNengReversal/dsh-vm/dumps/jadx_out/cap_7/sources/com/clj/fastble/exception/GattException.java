package com.clj.fastble.exception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class GattException extends com.clj.fastble.exception.BleException {
    private int gattStatus;

    public GattException(int r3) {
            r2 = this;
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Gatt Exception Occurred! "
            r2.<init>(r0, r1)
            r2.gattStatus = r3
            return
    }

    public int getGattStatus() {
            r1 = this;
            int r0 = r1.gattStatus
            return r0
    }

    public com.clj.fastble.exception.GattException setGattStatus(int r1) {
            r0 = this;
            r0.gattStatus = r1
            return r0
    }

    @Override // com.clj.fastble.exception.BleException
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GattException{gattStatus="
            r0.append(r1)
            int r1 = r2.gattStatus
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
